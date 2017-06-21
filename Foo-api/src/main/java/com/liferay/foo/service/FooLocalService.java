/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.foo.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.exportimport.kernel.lar.PortletDataContext;

import com.liferay.foo.exception.FooValidateException;
import com.liferay.foo.model.Foo;

import com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.model.SystemEventConstants;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.service.BaseLocalService;
import com.liferay.portal.kernel.service.PersistedModelLocalService;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.permission.ModelPermissions;
import com.liferay.portal.kernel.systemevent.SystemEvent;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.portlet.PortletException;
import javax.portlet.PortletRequest;

/**
 * Provides the local service interface for Foo. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author Brian Wing Shun Chan
 * @see FooLocalServiceUtil
 * @see com.liferay.foo.service.base.FooLocalServiceBaseImpl
 * @see com.liferay.foo.service.impl.FooLocalServiceImpl
 * @generated
 */
@ProviderType
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
	PortalException.class, SystemException.class})
public interface FooLocalService extends BaseLocalService,
	PersistedModelLocalService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link FooLocalServiceUtil} to access the foo local service. Add custom service methods to {@link com.liferay.foo.service.impl.FooLocalServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */

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
	public Foo addEntry(Foo orgEntry, ServiceContext serviceContext)
		throws FooValidateException, PortalException;

	/**
	* Adds the foo to the database. Also notifies the appropriate model listeners.
	*
	* @param foo the foo
	* @return the foo that was added
	*/
	@Indexable(type = IndexableType.REINDEX)
	public Foo addFoo(Foo foo);

	/**
	* Creates a new foo with the primary key. Does not add the foo to the database.
	*
	* @param fooId the primary key for the new foo
	* @return the new foo
	*/
	public Foo createFoo(long fooId);

	/**
	* Delete entry
	*
	* @param entry Foo
	* @return Foo oject
	* @exception PortalException
	*/
	@Indexable(type = IndexableType.DELETE)
	@SystemEvent(type = SystemEventConstants.TYPE_DELETE)
	public Foo deleteEntry(Foo entry) throws PortalException;

	public Foo deleteEntry(long primaryKey) throws PortalException;

	/**
	* Deletes the foo from the database. Also notifies the appropriate model listeners.
	*
	* @param foo the foo
	* @return the foo that was removed
	*/
	@Indexable(type = IndexableType.DELETE)
	public Foo deleteFoo(Foo foo);

	/**
	* Deletes the foo with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param fooId the primary key of the foo
	* @return the foo that was removed
	* @throws PortalException if a foo with the primary key could not be found
	*/
	@Indexable(type = IndexableType.DELETE)
	public Foo deleteFoo(long fooId) throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public Foo fetchFoo(long fooId);

	/**
	* Returns the foo matching the UUID and group.
	*
	* @param uuid the foo's UUID
	* @param groupId the primary key of the group
	* @return the matching foo, or <code>null</code> if a matching foo could not be found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public Foo fetchFooByUuidAndGroupId(java.lang.String uuid, long groupId);

	/**
	* Returns the foo with the primary key.
	*
	* @param fooId the primary key of the foo
	* @return the foo
	* @throws PortalException if a foo with the primary key could not be found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public Foo getFoo(long fooId) throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public Foo getFooByUrlTitle(long groupId, java.lang.String urlTitle,
		int status) throws PortalException;

	/**
	* Returns the foo matching the UUID and group.
	*
	* @param uuid the foo's UUID
	* @param groupId the primary key of the group
	* @return the matching foo
	* @throws PortalException if a matching foo could not be found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public Foo getFooByUuidAndGroupId(java.lang.String uuid, long groupId)
		throws PortalException;

	/**
	* Populate Model with values from a form
	*
	* @param request PortletRequest
	* @return Foo Object
	* @throws PortletException
	* @throws FooValidateException
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public Foo getFooFromRequest(long primaryKey, PortletRequest request)
		throws FooValidateException, PortletException;

	/**
	* Populate Model with values from a form
	*
	* @param primaryKey primaly key
	* @param request PortletRequest
	* @return Foo Object
	* @throws PortletException
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public Foo getInitializedFoo(long primaryKey, PortletRequest request)
		throws PortletException;

	/**
	* Get Record
	*
	* @param primaryKey Primary key
	* @return Foo object
	* @throws PortletException
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public Foo getNewObject(long primaryKey);

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
	public Foo moveEntryToTrash(long userId, Foo entry)
		throws PortalException;

	public Foo moveEntryToTrash(long userId, long entryId)
		throws PortalException;

	/**
	* Restores the entry with the ID from the recycle bin. Social activity
	* counters for this entry get activated.
	*
	* @param userId the primary key of the user restoring the entry
	* @param entryId the primary key of the entry to be restored
	* @return the restored entry from the recycle bin
	*/
	@Indexable(type = IndexableType.REINDEX)
	public Foo restoreEntryFromTrash(long userId, long entryId)
		throws PortalException;

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
	public Foo updateEntry(Foo orgEntry, ServiceContext serviceContext)
		throws FooValidateException, PortalException;

	/**
	* Updates the foo in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param foo the foo
	* @return the foo that was updated
	*/
	@Indexable(type = IndexableType.REINDEX)
	public Foo updateFoo(Foo foo);

	@Indexable(type = IndexableType.REINDEX)
	public Foo updateStatus(long userId, long entryId, int status,
		ServiceContext serviceContext,
		Map<java.lang.String, Serializable> workflowContext)
		throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ActionableDynamicQuery getActionableDynamicQuery();

	public DynamicQuery dynamicQuery();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ExportActionableDynamicQuery getExportActionableDynamicQuery(
		PortletDataContext portletDataContext);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public IndexableActionableDynamicQuery getIndexableActionableDynamicQuery();

	/**
	* @throws PortalException
	*/
	@Override
	public PersistedModel deletePersistedModel(PersistedModel persistedModel)
		throws PortalException;

	@Override
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException;

	public int countAllInGroup(long groupId);

	public int countAllInUser(long userId);

	public int countAllInUserAndGroup(long userId, long groupId);

	/**
	* Get Company entries counts
	*
	* @param companyId
	* @param status
	* @return
	* @throws SystemException
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getCompanyEntriesCount(long companyId, int status);

	/**
	* Returns the number of foos.
	*
	* @return the number of foos
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getFoosCount();

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public java.lang.String getOSGiServiceIdentifier();

	/**
	* Converte Date Time into Date()
	*
	* @param request PortletRequest
	* @param prefix Prefix of the parameter
	* @return Date object
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public Date getDateTimeFromRequest(PortletRequest request,
		java.lang.String prefix);

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery);

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.foo.model.impl.FooModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	*/
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery, int start,
		int end);

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.foo.model.impl.FooModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	*/
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery, int start,
		int end, OrderByComparator<T> orderByComparator);

	public List<Foo> findAllInGroup(long groupId);

	public List<Foo> findAllInGroup(long groupId,
		OrderByComparator<Foo> orderByComparator);

	public List<Foo> findAllInGroup(long groupId, int start, int end,
		OrderByComparator<Foo> orderByComparator);

	public List<Foo> findAllInUser(long userId);

	public List<Foo> findAllInUser(long userId,
		OrderByComparator<Foo> orderByComparator);

	public List<Foo> findAllInUser(long userId, int start, int end,
		OrderByComparator<Foo> orderByComparator);

	public List<Foo> findAllInUserAndGroup(long userId, long groupId);

	public List<Foo> findAllInUserAndGroup(long userId, long groupId,
		OrderByComparator<Foo> orderByComparator);

	public List<Foo> findAllInUserAndGroup(long userId, long groupId,
		int start, int end, OrderByComparator<Foo> orderByComparator);

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
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Foo> getCompanyEntries(long companyId, int status, int start,
		int end);

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
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Foo> getCompanyEntries(long companyId, int status, int start,
		int end, OrderByComparator<Foo> obc);

	/**
	* Returns a range of all the foos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.foo.model.impl.FooModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of foos
	* @param end the upper bound of the range of foos (not inclusive)
	* @return the range of foos
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Foo> getFoos(int start, int end);

	/**
	* Returns all the foos matching the UUID and company.
	*
	* @param uuid the UUID of the foos
	* @param companyId the primary key of the company
	* @return the matching foos, or an empty list if no matches were found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Foo> getFoosByUuidAndCompanyId(java.lang.String uuid,
		long companyId);

	/**
	* Returns a range of foos matching the UUID and company.
	*
	* @param uuid the UUID of the foos
	* @param companyId the primary key of the company
	* @param start the lower bound of the range of foos
	* @param end the upper bound of the range of foos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the range of matching foos, or an empty list if no matches were found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Foo> getFoosByUuidAndCompanyId(java.lang.String uuid,
		long companyId, int start, int end,
		OrderByComparator<Foo> orderByComparator);

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	public long dynamicQueryCount(DynamicQuery dynamicQuery);

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	public long dynamicQueryCount(DynamicQuery dynamicQuery,
		Projection projection);

	public void addEntryResources(Foo entry, boolean addGroupPermissions,
		boolean addGuestPermissions) throws PortalException;

	public void addEntryResources(Foo entry, ModelPermissions modelPermissions)
		throws PortalException;

	public void addEntryResources(Foo entry,
		java.lang.String[] groupPermissions, java.lang.String[] guestPermissions)
		throws PortalException;

	public void addEntryResources(long entryId, boolean addGroupPermissions,
		boolean addGuestPermissions) throws PortalException;

	public void addEntryResources(long entryId,
		java.lang.String[] groupPermissions, java.lang.String[] guestPermissions)
		throws PortalException;

	public void updateAsset(long userId, Foo entry, long[] assetCategoryIds,
		java.lang.String[] assetTagNames, long[] assetLinkEntryIds,
		java.lang.Double priority) throws PortalException;

	public void updateEntryResources(Foo entry,
		java.lang.String[] groupPermissions, java.lang.String[] guestPermissions)
		throws PortalException;
}