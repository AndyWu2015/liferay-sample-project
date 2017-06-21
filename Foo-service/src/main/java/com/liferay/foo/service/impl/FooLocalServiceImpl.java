/**
*  Copyright (C) 2017 Yasuyuki Takeo All rights reserved.
*
*  This program is free software: you can redistribute it and/or modify
*  it under the terms of the GNU Lesser General Public License as published by
*  the Free Software Foundation, either version 3 of the License, or
*  (at your option) any later version.
*
*  This program is distributed in the hope that it will be useful,
*  but WITHOUT ANY WARRANTY; without even the implied warranty of
*  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
*  GNU Lesser General Public License for more details.
*/



package com.liferay.foo.service.impl;

import com.liferay.asset.kernel.model.AssetEntry;
import com.liferay.asset.kernel.model.AssetLinkConstants;
import com.liferay.portal.kernel.comment.CommentManagerUtil;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.model.ModelHintsUtil;
import com.liferay.portal.kernel.model.ResourceConstants;
import com.liferay.portal.kernel.model.SystemEventConstants;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.repository.model.ModelValidator;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.permission.ModelPermissions;
import com.liferay.portal.kernel.social.SocialActivityManagerUtil;
import com.liferay.portal.kernel.systemevent.SystemEvent;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.Constants;
import com.liferay.portal.kernel.util.ContentTypes;
import com.liferay.portal.kernel.util.FriendlyURLNormalizerUtil;
import com.liferay.portal.kernel.util.HtmlUtil;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.kernel.workflow.WorkflowConstants;
import com.liferay.portal.kernel.workflow.WorkflowHandlerRegistryUtil;
import com.liferay.social.kernel.model.SocialActivityConstants;
import com.liferay.foo.exception.FooValidateException;
import com.liferay.foo.model.Foo;
import com.liferay.foo.service.base.FooLocalServiceBaseImpl;
import com.liferay.foo.service.util.FooValidator;
import com.liferay.foo.social.FooActivityKeys;
import com.liferay.trash.kernel.exception.RestoreEntryException;
import com.liferay.trash.kernel.exception.TrashEntryException;
import com.liferay.trash.kernel.model.TrashEntry;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

import javax.portlet.PortletException;
import javax.portlet.PortletRequest;

/**
 * FooLocalServiceImpl
 *
 * @author Yasuyuki Takeo
 * @author liferay
 */
public class FooLocalServiceImpl
    extends FooLocalServiceBaseImpl {

    @Override
    public void addEntryResources(
        long entryId, boolean addGroupPermissions, boolean addGuestPermissions)
        throws PortalException {

        Foo entry = fooPersistence.findByPrimaryKey(entryId);

        addEntryResources(entry, addGroupPermissions, addGuestPermissions);
    }

    @Override
    public void addEntryResources(
        long entryId, String[] groupPermissions, String[] guestPermissions)
        throws PortalException {

        Foo entry = fooPersistence.findByPrimaryKey(entryId);

        addEntryResources(entry, groupPermissions, guestPermissions);
    }

    @Override
    public void addEntryResources(
        Foo entry, boolean addGroupPermissions,
        boolean addGuestPermissions) throws PortalException {

        resourceLocalService.addResources(entry.getCompanyId(),
                                          entry.getGroupId(), entry.getUserId(), Foo.class.getName(),
                                          entry.getPrimaryKey(), false, addGroupPermissions,
                                          addGuestPermissions);
    }

    @Override
    public void addEntryResources(
        Foo entry, ModelPermissions modelPermissions)
        throws PortalException {

        resourceLocalService.addModelResources(entry.getCompanyId(),
                                               entry.getGroupId(), entry.getUserId(), Foo.class.getName(),
                                               entry.getPrimaryKey(), modelPermissions);
    }

    @Override
    public void addEntryResources(
        Foo entry, String[] groupPermissions, String[] guestPermissions)
        throws PortalException {

        resourceLocalService.addModelResources(entry.getCompanyId(),
                                               entry.getGroupId(), entry.getUserId(), Foo.class.getName(),
                                               entry.getPrimaryKey(), groupPermissions, guestPermissions);
    }

    /**
     * Add Entry
     *
     * @param orgEntry Foo model
     * @param serviceContext ServiceContext
     * @exception PortalException
     * @exception FooValidateException
     * @return created Foo model.
     */
    @Indexable(type = IndexableType.REINDEX)
    @Override
    public Foo addEntry(Foo orgEntry, ServiceContext serviceContext)
        throws PortalException, FooValidateException {

        long userId = serviceContext.getUserId();

        //Validation

        ModelValidator<Foo> modelValidator = new FooValidator();
        modelValidator.validate(orgEntry);

        Foo entry = _addEntry(orgEntry, serviceContext);

        // Resources

        if (serviceContext.isAddGroupPermissions()
            || serviceContext.isAddGuestPermissions()) {

            addEntryResources(entry, serviceContext.isAddGroupPermissions(),
                              serviceContext.isAddGuestPermissions());
        } else {
            addEntryResources(entry, serviceContext.getModelPermissions());
        }

        // Asset

        updateAsset(userId, entry, serviceContext.getAssetCategoryIds(),
                    serviceContext.getAssetTagNames(),
                    serviceContext.getAssetLinkEntryIds(),
                    serviceContext.getAssetPriority());

        // Workflow

        return startWorkflowInstance(userId, entry, serviceContext);
    }

    /**
     * Start workflow
     *
     * @param userId User id of this model's owner
     * @param entry model object
     * @param serviceContext ServiceContext
     * @return model with workflow configrations.
     * @throws PortalException
     */
    protected Foo startWorkflowInstance(
        long userId, Foo entry, ServiceContext serviceContext)
        throws PortalException {

        Map<String, Serializable> workflowContext = new HashMap<String, Serializable>();

        String userPortraitURL = StringPool.BLANK;
        String userURL = StringPool.BLANK;

        if (serviceContext.getThemeDisplay() != null) {
            User user = userPersistence.findByPrimaryKey(userId);

            userPortraitURL = user
                .getPortraitURL(serviceContext.getThemeDisplay());
            userURL = user.getDisplayURL(serviceContext.getThemeDisplay());
        }

        workflowContext.put(WorkflowConstants.CONTEXT_USER_PORTRAIT_URL,
                            userPortraitURL);
        workflowContext.put(WorkflowConstants.CONTEXT_USER_URL, userURL);

        return WorkflowHandlerRegistryUtil.startWorkflowInstance(
            entry.getCompanyId(), entry.getGroupId(), userId,
            Foo.class.getName(), entry.getPrimaryKey(), entry,
            serviceContext, workflowContext);
    }

    public int countAllInGroup(long groupId) {
        int count = fooPersistence.countByG_S(groupId,
                                                   WorkflowConstants.STATUS_APPROVED);
        return count;
    }

    public int countAllInUser(long userId) {
        int count = fooPersistence.countByU_S(userId,
                                                   WorkflowConstants.STATUS_APPROVED);
        return count;
    }

    public int countAllInUserAndGroup(long userId, long groupId) {
        int count = fooPersistence.countByG_U_S(groupId, userId,
                                                     WorkflowConstants.STATUS_APPROVED);
        return count;
    }

    public Foo deleteEntry(long primaryKey) throws PortalException {
        Foo entry = getFoo(primaryKey);
        return deleteEntry(entry);
    }

    /**
     * Delete entry
     *
     * @param entry Foo
     * @return Foo oject
     * @exception PortalException
     */
    @Indexable(type = IndexableType.DELETE)
    @Override
    @SystemEvent(type = SystemEventConstants.TYPE_DELETE)
    public Foo deleteEntry(Foo entry) throws PortalException {

        // Entry

        fooPersistence.remove(entry);

        // Resources

        resourceLocalService.deleteResource(entry.getCompanyId(),
                                            Foo.class.getName(), ResourceConstants.SCOPE_INDIVIDUAL,
                                            entry.getPrimaryKey());

        // Asset

        assetEntryLocalService.deleteEntry(Foo.class.getName(),
                                           entry.getPrimaryKey());

        // Comment

        deleteDiscussion(entry);

        // Ratings

        ratingsStatsLocalService.deleteStats(Foo.class.getName(),
                                             entry.getPrimaryKey());

        // Trash

        trashEntryLocalService.deleteEntry(Foo.class.getName(),
                                           entry.getPrimaryKey());

        // Workflow

        workflowInstanceLinkLocalService.deleteWorkflowInstanceLinks(
            entry.getCompanyId(), entry.getGroupId(), Foo.class.getName(),
            entry.getPrimaryKey());

        return entry;
    }

    /**
     * Delete discussion (comments)
     *
     * @param entry
     * @throws PortalException
     */
    protected void deleteDiscussion(Foo entry) throws PortalException {
        CommentManagerUtil.deleteDiscussion(Foo.class.getName(),
                                            entry.getPrimaryKey());
    }

    public List<Foo> findAllInGroup(long groupId) {
        List<Foo> list = (List<Foo>) fooPersistence
            .findByG_S(groupId, WorkflowConstants.STATUS_APPROVED);
        return list;
    }

    public List<Foo> findAllInGroup(
        long groupId, int start, int end,
        OrderByComparator<Foo> orderByComparator) {

        List<Foo> list = (List<Foo>) fooPersistence.findByG_S(
            groupId, WorkflowConstants.STATUS_APPROVED, start, end,
            orderByComparator);
        return list;
    }

    public List<Foo> findAllInGroup(
        long groupId, OrderByComparator<Foo> orderByComparator) {

        List<Foo> list = (List<Foo>) findAllInGroup(groupId,
                                                              QueryUtil.ALL_POS, QueryUtil.ALL_POS, orderByComparator);
        return list;
    }

    public List<Foo> findAllInUser(long userId) {
        List<Foo> list = (List<Foo>) fooPersistence
            .findByU_S(userId, WorkflowConstants.STATUS_APPROVED);
        return list;
    }

    public List<Foo> findAllInUser(
        long userId, int start, int end,
        OrderByComparator<Foo> orderByComparator) {

        List<Foo> list = (List<Foo>) fooPersistence.findByU_S(
            userId, WorkflowConstants.STATUS_APPROVED, start, end,
            orderByComparator);
        return list;
    }

    public List<Foo> findAllInUser(
        long userId, OrderByComparator<Foo> orderByComparator) {

        List<Foo> list = (List<Foo>) findAllInUser(userId,
                                                             QueryUtil.ALL_POS, QueryUtil.ALL_POS, orderByComparator);
        return list;
    }

    public List<Foo> findAllInUserAndGroup(long userId, long groupId) {
        List<Foo> list = (List<Foo>) fooPersistence
            .findByG_U_S(groupId, userId, WorkflowConstants.STATUS_APPROVED);
        return list;
    }

    public List<Foo> findAllInUserAndGroup(
        long userId, long groupId, int start, int end,
        OrderByComparator<Foo> orderByComparator) {

        List<Foo> list = (List<Foo>) fooPersistence.findByG_U_S(
            groupId, userId, WorkflowConstants.STATUS_APPROVED, start, end,
            orderByComparator);
        return list;
    }

    public List<Foo> findAllInUserAndGroup(
        long userId, long groupId,
        OrderByComparator<Foo> orderByComparator) {

        List<Foo> list = (List<Foo>) findAllInUserAndGroup(groupId,
                                                                     userId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, orderByComparator);
        return list;
    }

    /**
     * Get Company entries
     *
     * @param companyId Company Id
     * @param status Workflow status
     * @param start start index of entries
     * @param end end index of entries
     * @return
     * @throws SystemException
     */
    public List<Foo> getCompanyEntries(
        long companyId, int status, int start, int end) {

        if (status == WorkflowConstants.STATUS_ANY) {
            return fooPersistence.findByCompanyId(companyId, start, end);
        } else {
            return fooPersistence.findByC_S(companyId, status, start, end);
        }
    }

    /**
     * Get Company entries
     *
     * @param companyId Company Id
     * @param status Workflow status
     * @param start start index of entries
     * @param end end index of entries
     * @param obc Comparator for the order
     * @return List of entries
     * @throws SystemException
     */
    public List<Foo> getCompanyEntries(
        long companyId, int status, int start, int end,
        OrderByComparator<Foo> obc) {

        if (status == WorkflowConstants.STATUS_ANY) {
            return fooPersistence.findByCompanyId(companyId, start, end,
                                                       obc);
        } else {
            return fooPersistence.findByC_S(companyId, status, start, end,
                                                 obc);
        }
    }

    /**
     * Get Company entries counts
     *
     * @param companyId
     * @param status
     * @return
     * @throws SystemException
     */
    public int getCompanyEntriesCount(long companyId, int status) {
        if (status == WorkflowConstants.STATUS_ANY) {
            return fooPersistence.countByCompanyId(companyId);
        } else {
            return fooPersistence.countByC_S(companyId, status);
        }
    }

    public Foo getFooByUrlTitle(
        long groupId, String urlTitle, int status) throws PortalException {

        Foo entry = null;

        if (status == WorkflowConstants.STATUS_ANY) {
            entry = fooPersistence.fetchByG_UT(groupId, urlTitle);
        } else {
            List<Foo> results = fooPersistence.findByG_UT_ST(groupId,
                                                                       urlTitle, status);

            if (results != null && results.size() > 0) {
                entry = results.get(0);
            }
        }

        return entry;
    }

    /**
     * Moves the entry to the recycle bin.
     *
     * Social activity counters for this entry get disabled.
     *
     * @param userId the primary key of the user moving the entry
     * @param entry the entry to be moved
     * @return the moved entry
     */
    @Indexable(type = IndexableType.REINDEX)
    @Override
    public Foo moveEntryToTrash(long userId, Foo entry)
        throws PortalException {

        // Entry
        if (entry.isInTrash()) {
            throw new TrashEntryException();
        }

        int oldStatus = entry.getStatus();

        if (oldStatus == WorkflowConstants.STATUS_PENDING) {
            entry.setStatus(WorkflowConstants.STATUS_DRAFT);

            fooPersistence.update(entry);
        }

        entry = updateStatus(userId, entry.getPrimaryKey(),
                             WorkflowConstants.STATUS_IN_TRASH, new ServiceContext(),
                             new HashMap<String, Serializable>());

        // Social

        JSONObject extraDataJSONObject = JSONFactoryUtil.createJSONObject();

        extraDataJSONObject.put("title", entry.getFooTitleName());

        SocialActivityManagerUtil.addActivity(userId, entry,
                                              SocialActivityConstants.TYPE_MOVE_TO_TRASH,
                                              extraDataJSONObject.toString(), 0);

        // Workflow

        if (oldStatus == WorkflowConstants.STATUS_PENDING) {
            workflowInstanceLinkLocalService.deleteWorkflowInstanceLink(
                entry.getCompanyId(), entry.getGroupId(),
                Foo.class.getName(), entry.getPrimaryKey());
        }

        return entry;
    }

    public Foo moveEntryToTrash(long userId, long entryId)
        throws PortalException {

        Foo entry = fooPersistence.findByPrimaryKey(entryId);

        return moveEntryToTrash(userId, entry);
    }

    /**
     * Restores the entry with the ID from the recycle bin. Social activity
     * counters for this entry get activated.
     *
     * @param userId the primary key of the user restoring the entry
     * @param entryId the primary key of the entry to be restored
     * @return the restored entry from the recycle bin
     */
    @Indexable(type = IndexableType.REINDEX)
    @Override
    public Foo restoreEntryFromTrash(long userId, long entryId)
        throws PortalException {

        // Entry

        Foo entry = fooPersistence.findByPrimaryKey(entryId);

        if (!entry.isInTrash()) {
            throw new RestoreEntryException(
                RestoreEntryException.INVALID_STATUS);
        }

        TrashEntry trashEntry = trashEntryLocalService
            .getEntry(Foo.class.getName(), entryId);

        updateStatus(userId, entryId, trashEntry.getStatus(),
                     new ServiceContext(), new HashMap<String, Serializable>());

        // Social

        JSONObject extraDataJSONObject = JSONFactoryUtil.createJSONObject();

        extraDataJSONObject.put("title", entry.getFooTitleName());

        SocialActivityManagerUtil.addActivity(userId, entry,
                                              SocialActivityConstants.TYPE_RESTORE_FROM_TRASH,
                                              extraDataJSONObject.toString(), 0);

        return entry;
    }

    @Override
    public void updateAsset(
        long userId, Foo entry, long[] assetCategoryIds,
        String[] assetTagNames, long[] assetLinkEntryIds, Double priority)
        throws PortalException {

        boolean visible = false;

        if (entry.isApproved()) {
            visible = true;
        }

        String summary = HtmlUtil.extractText(
            StringUtil.shorten(entry.getFooSummaryName(), 500));

        AssetEntry assetEntry = assetEntryLocalService.updateEntry(userId,
                                                                   entry.getGroupId(), entry.getCreateDate(), entry.getModifiedDate(),
                                                                   Foo.class.getName(), entry.getPrimaryKey(), entry.getUuid(), 0,
                                                                   assetCategoryIds, assetTagNames, true, visible, null, null, null,
                                                                   null, ContentTypes.TEXT_HTML, entry.getFooTitleName(), null,
                                                                   summary, null, null, 0, 0, priority);

        assetLinkLocalService.updateLinks(userId, assetEntry.getEntryId(),
                                          assetLinkEntryIds, AssetLinkConstants.TYPE_RELATED);
    }

    @Override
    public void updateEntryResources(
        Foo entry, String[] groupPermissions, String[] guestPermissions)
        throws PortalException {

        resourceLocalService.updateResources(entry.getCompanyId(),
                                             entry.getGroupId(), Foo.class.getName(), entry.getPrimaryKey(),
                                             groupPermissions, guestPermissions);
    }

    /**
     * Edit Entry
     *
     * @param orgEntry Foo model
     * @param serviceContext ServiceContext
     * @exception PortalException
     * @exception FooValidateException
     * @return updated Foo model.
     */
    @Indexable(type = IndexableType.REINDEX)
    @Override
    public Foo updateEntry(Foo orgEntry, ServiceContext serviceContext)
        throws PortalException, FooValidateException {

        User user = userPersistence.findByPrimaryKey(orgEntry.getUserId());

        //Validation

        ModelValidator<Foo> modelValidator = new FooValidator();
        modelValidator.validate(orgEntry);

        // Update entry
        Foo entry = _updateEntry(orgEntry.getPrimaryKey(), orgEntry,
                                      serviceContext);

        if (entry.isPending() || entry.isDraft()) {
        } else {
            entry.setStatus(WorkflowConstants.STATUS_DRAFT);
        }

        Foo updatedEntry = fooPersistence.update(entry);

        // Asset
        updateAsset(updatedEntry.getUserId(), updatedEntry,
                    serviceContext.getAssetCategoryIds(),
                    serviceContext.getAssetTagNames(),
                    serviceContext.getAssetLinkEntryIds(),
                    serviceContext.getAssetPriority());

        updatedEntry = startWorkflowInstance(user.getUserId(), updatedEntry,
                                             serviceContext);

        return updatedEntry;
    }

    @Indexable(type = IndexableType.REINDEX)
    public Foo updateStatus(
        long userId, long entryId, int status, ServiceContext serviceContext,
        Map<String, Serializable> workflowContext) throws PortalException {

        // Entry

        User user = userPersistence.findByPrimaryKey(userId);
        Date now = new Date();

        Foo entry = fooPersistence.findByPrimaryKey(entryId);

        int oldStatus = entry.getStatus();

        entry.setModifiedDate(serviceContext.getModifiedDate(now));
        entry.setStatus(status);
        entry.setStatusByUserId(user.getUserId());
        entry.setStatusByUserName(user.getFullName());
        entry.setStatusDate(serviceContext.getModifiedDate(now));

        fooPersistence.update(entry);

        AssetEntry assetEntry = assetEntryLocalService
            .fetchEntry(Foo.class.getName(), entryId);

        if ((assetEntry == null) || (assetEntry.getPublishDate() == null)) {
            serviceContext.setCommand(Constants.ADD);
        }

        JSONObject extraDataJSONObject = JSONFactoryUtil.createJSONObject();

        extraDataJSONObject.put("title", entry.getFooTitleName());

        if (status == WorkflowConstants.STATUS_APPROVED) {

            // Asset

            assetEntryLocalService.updateEntry(Foo.class.getName(),
                                               entryId, entry.getModifiedDate(), null, true, true);

            // Social

            if ((oldStatus != WorkflowConstants.STATUS_IN_TRASH)
                && (oldStatus != WorkflowConstants.STATUS_SCHEDULED)) {

                if (serviceContext.isCommandUpdate()) {

                    SocialActivityManagerUtil.addActivity(user.getUserId(),
                                                          entry, FooActivityKeys.UPDATE_FOO,
                                                          extraDataJSONObject.toString(), 0);
                } else {
                    SocialActivityManagerUtil.addUniqueActivity(
                        user.getUserId(), entry,
                        FooActivityKeys.ADD_FOO,
                        extraDataJSONObject.toString(), 0);
                }
            }

            // Trash

            if (oldStatus == WorkflowConstants.STATUS_IN_TRASH) {
                CommentManagerUtil.restoreDiscussionFromTrash(
                    Foo.class.getName(), entryId);

                trashEntryLocalService.deleteEntry(Foo.class.getName(),
                                                   entryId);
            }

        } else {

            // Asset

            assetEntryLocalService.updateVisible(Foo.class.getName(),
                                                 entryId, false);

            // Social

            if ((status == WorkflowConstants.STATUS_SCHEDULED)
                && (oldStatus != WorkflowConstants.STATUS_IN_TRASH)) {

                if (serviceContext.isCommandUpdate()) {

                    SocialActivityManagerUtil.addActivity(user.getUserId(),
                                                          entry, FooActivityKeys.UPDATE_FOO,
                                                          extraDataJSONObject.toString(), 0);
                } else {
                    SocialActivityManagerUtil.addUniqueActivity(
                        user.getUserId(), entry,
                        FooActivityKeys.ADD_FOO,
                        extraDataJSONObject.toString(), 0);
                }
            }

            // Trash

            if (status == WorkflowConstants.STATUS_IN_TRASH) {
                CommentManagerUtil
                    .moveDiscussionToTrash(Foo.class.getName(), entryId);

                trashEntryLocalService.addTrashEntry(userId, entry.getGroupId(),
                                                     Foo.class.getName(), entry.getPrimaryKey(),
                                                     entry.getUuid(), null, oldStatus, null, null);

            } else if (oldStatus == WorkflowConstants.STATUS_IN_TRASH) {
                CommentManagerUtil.restoreDiscussionFromTrash(
                    Foo.class.getName(), entryId);

                trashEntryLocalService.deleteEntry(Foo.class.getName(),
                                                   entryId);
            }

        }

        return entry;
    }

    /**
     * Copy models at add entry
     *
     * To process storing a record into database, copy the model passed into a
     * new model object here.
     *
     * @param entry model object
     * @param serviceContext ServiceContext
     * @return
     * @throws PortalException
     */
    protected Foo _addEntry(Foo entry, ServiceContext serviceContext)
        throws PortalException {

        Foo newEntry = fooPersistence
            .create(counterLocalService.increment(Foo.class.getName()));

        User user = userPersistence.findByPrimaryKey(entry.getUserId());

        Date now = new Date();
        newEntry.setCompanyId(entry.getCompanyId());
        newEntry.setGroupId(entry.getGroupId());
        newEntry.setUserId(user.getUserId());
        newEntry.setUserName(user.getFullName());
        newEntry.setCreateDate(now);
        newEntry.setModifiedDate(now);

        newEntry.setUuid(serviceContext.getUuid());
        newEntry.setUrlTitle(_getUniqueURLTitle(newEntry));
        newEntry.setFooTitleName(entry.getFooTitleName());
        newEntry.setFooSummaryName(entry.getFooSummaryName());

        newEntry.setTitle(entry.getTitle());
        newEntry.setFooBooleanStat(entry.getFooBooleanStat());
        newEntry.setFooDateTime(entry.getFooDateTime());
        newEntry.setFooDocumentLibrary(entry.getFooDocumentLibrary());
        newEntry.setFooDouble(entry.getFooDouble());
        newEntry.setFooInteger(entry.getFooInteger());
        newEntry.setFooRichText(entry.getFooRichText());
        newEntry.setFooText(entry.getFooText());

        return fooPersistence.update(newEntry);
    }

    /**
     * Copy models at update entry
     *
     * To process storing a record into database, copy the model passed into a
     * new model object here.
     *
     * @param primaryKey Primary key
     * @param entry model object
     * @param serviceContext ServiceContext
     * @return updated entry
     * @throws PortalException
     */
    protected Foo _updateEntry(
        long primaryKey, Foo entry, ServiceContext serviceContext)
        throws PortalException {

        Foo updateEntry = fetchFoo(primaryKey);

        User user = userPersistence.findByPrimaryKey(entry.getUserId());

        Date now = new Date();
        updateEntry.setCompanyId(entry.getCompanyId());
        updateEntry.setGroupId(entry.getGroupId());
        updateEntry.setUserId(user.getUserId());
        updateEntry.setUserName(user.getFullName());
        updateEntry.setCreateDate(entry.getCreateDate());
        updateEntry.setModifiedDate(now);

        updateEntry.setUuid(entry.getUuid());
        updateEntry.setUrlTitle(_getUniqueURLTitle(updateEntry));
        updateEntry.setFooTitleName(entry.getFooTitleName());
        updateEntry.setFooSummaryName(entry.getFooSummaryName());

        updateEntry.setFooId(entry.getFooId());
        updateEntry.setTitle(entry.getTitle());
        updateEntry.setFooBooleanStat(entry.getFooBooleanStat());
        updateEntry.setFooDateTime(entry.getFooDateTime());
        updateEntry.setFooDocumentLibrary(entry.getFooDocumentLibrary());
        updateEntry.setFooDouble(entry.getFooDouble());
        updateEntry.setFooInteger(entry.getFooInteger());
        updateEntry.setFooRichText(entry.getFooRichText());
        updateEntry.setFooText(entry.getFooText());

        return updateEntry;
    }

    /**
     * Get Record
     *
     * @param primaryKey Primary key
     * @return Foo object
     * @throws PortletException
     */
    public Foo getNewObject(long primaryKey) {

        primaryKey = (primaryKey <= 0) ? 0 : counterLocalService.increment();
        return createFoo(primaryKey);
    }

    /**
     * Generating URL Title for unique URL
     *
     * @param entryId primaryKey of the model
     * @param title title for the asset
     * @return URL title string
     */
    protected String _createUrlTitle(long entryId, String title) {
        if (title == null) {
            return String.valueOf(entryId);
        }

        title = title.trim().toLowerCase();

        if (Validator.isNull(title) || Validator.isNumber(title)) {
            title = String.valueOf(entryId);
        } else {
            title = FriendlyURLNormalizerUtil.normalize(title,
                                                        _friendlyURLPattern);
        }

        return ModelHintsUtil.trimString(Foo.class.getName(), "urlTitle",
                                         title);
    }

    /**
     * Generating a unique URL for asset
     *
     * @param entry Foo object
     * @return unique URL strings
     */
    protected String _getUniqueURLTitle(Foo entry) {
        String urlTitle = _createUrlTitle(entry.getPrimaryKey(),
                                          entry.getFooTitleName());

        long entryId = entry.getPrimaryKey();

        for (int i = 1;; i++) {
            Foo tmpEntry = fooPersistence
                .fetchByG_UT(entry.getGroupId(), urlTitle);

            if ((tmpEntry == null) || (entryId == tmpEntry.getPrimaryKey())) {
                break;
            } else {
                String suffix = StringPool.DASH + i;

                String prefix = urlTitle;

                if (urlTitle.length() > suffix.length()) {
                    prefix = urlTitle.substring(0,
                                                urlTitle.length() - suffix.length());
                }

                urlTitle = prefix + suffix;
            }
        }

        return urlTitle;
    }

    /**
     * Converte Date Time into Date()
     *
     * @param request PortletRequest
     * @param prefix Prefix of the parameter
     * @return Date object
     */
    public Date getDateTimeFromRequest(PortletRequest request, String prefix) {
        int Year = ParamUtil.getInteger(request, prefix + "Year");
        int Month = ParamUtil.getInteger(request, prefix + "Month") + 1;
        int Day = ParamUtil.getInteger(request, prefix + "Day");
        int Hour = ParamUtil.getInteger(request, prefix + "Hour");
        int Minute = ParamUtil.getInteger(request, prefix + "Minute");
        int AmPm = ParamUtil.getInteger(request, prefix + "AmPm");

        if (AmPm == Calendar.PM) {
            Hour += 12;
        }

        LocalDateTime ldt = LocalDateTime.of(Year, Month, Day, Hour, Minute, 0);
        return Date.from(ldt.atZone(ZoneId.systemDefault()).toInstant());
    }

    /**
     * Populate Model with values from a form
     *
     * @param request PortletRequest
     * @return Foo Object
     * @throws PortletException
     * @throws FooValidateException
     */
    public Foo getFooFromRequest(
        long primaryKey, PortletRequest request) throws PortletException, FooValidateException {
        ThemeDisplay themeDisplay = (ThemeDisplay) request
            .getAttribute(WebKeys.THEME_DISPLAY);

        // Create or fetch existing data
        Foo entry;
        if (primaryKey <= 0) {
            entry = getNewObject(primaryKey);
        } else {
            entry = fetchFoo(primaryKey);
        }

        try {
        entry.setFooId(primaryKey);
        entry.setTitle(ParamUtil.getString(request, "title"));
        entry.setFooBooleanStat(ParamUtil.getBoolean(request, "fooBooleanStat"));
        entry.setFooDateTime(getDateTimeFromRequest(request, "fooDateTime"));
        entry.setFooDocumentLibrary(ParamUtil.getString(request, "fooDocumentLibrary"));
        entry.setFooDouble(ParamUtil.getDouble(request, "fooDouble"));
        entry.setFooInteger(ParamUtil.getInteger(request, "fooInteger"));
        entry.setFooRichText(ParamUtil.getString(request, "fooRichText"));
        entry.setFooText(ParamUtil.getString(request, "fooText"));

            entry.setFooTitleName(
                ParamUtil.getString(request, "fooTitleName"));
            entry.setFooSummaryName(
                ParamUtil.getString(request, "fooSummaryName"));

            entry.setCompanyId(themeDisplay.getCompanyId());
            entry.setGroupId(themeDisplay.getScopeGroupId());
            entry.setUserId(themeDisplay.getUserId());
        } catch (Throwable e) {
            List<String> error = new ArrayList<>();
            error.add("value-convert-error");
            throw new FooValidateException(error);
        }

        return entry;
    }

    /**
     * Populate Model with values from a form
     *
     * @param primaryKey primaly key
     * @param request PortletRequest
     * @return Foo Object
     * @throws PortletException
     */
    public Foo getInitializedFoo(
        long primaryKey, PortletRequest request) throws PortletException {
        ThemeDisplay themeDisplay = (ThemeDisplay) request
            .getAttribute(WebKeys.THEME_DISPLAY);

        // Create or fetch existing data
        Foo entry = getNewObject(primaryKey);

                    entry.setFooId(primaryKey);
                entry.setTitle("");
                entry.setFooBooleanStat(true);
                entry.setFooDateTime(new Date());
                entry.setFooDocumentLibrary("");
                entry.setFooDouble(0.0);
                entry.setFooInteger(0);
                entry.setFooRichText("");
                entry.setFooText("");
        entry.setFooTitleName("");
        entry.setFooSummaryName("");

        entry.setCompanyId(themeDisplay.getCompanyId());
        entry.setGroupId(themeDisplay.getScopeGroupId());
        entry.setUserId(themeDisplay.getUserId());

        return entry;
    }

    private static Pattern _friendlyURLPattern = Pattern.compile("[^a-z0-9_-]");

}