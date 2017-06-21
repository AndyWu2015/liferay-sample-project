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

import com.liferay.osgi.util.ServiceTrackerFactory;

import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the local service utility for Foo. This utility wraps
 * {@link com.liferay.foo.service.impl.FooLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see FooLocalService
 * @see com.liferay.foo.service.base.FooLocalServiceBaseImpl
 * @see com.liferay.foo.service.impl.FooLocalServiceImpl
 * @generated
 */
@ProviderType
public class FooLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.liferay.foo.service.impl.FooLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
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
	public static com.liferay.foo.model.Foo addEntry(
		com.liferay.foo.model.Foo orgEntry,
		com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.foo.exception.FooValidateException,
			com.liferay.portal.kernel.exception.PortalException {
		return getService().addEntry(orgEntry, serviceContext);
	}

	/**
	* Adds the foo to the database. Also notifies the appropriate model listeners.
	*
	* @param foo the foo
	* @return the foo that was added
	*/
	public static com.liferay.foo.model.Foo addFoo(
		com.liferay.foo.model.Foo foo) {
		return getService().addFoo(foo);
	}

	/**
	* Creates a new foo with the primary key. Does not add the foo to the database.
	*
	* @param fooId the primary key for the new foo
	* @return the new foo
	*/
	public static com.liferay.foo.model.Foo createFoo(long fooId) {
		return getService().createFoo(fooId);
	}

	/**
	* Delete entry
	*
	* @param entry Foo
	* @return Foo oject
	* @exception PortalException
	*/
	public static com.liferay.foo.model.Foo deleteEntry(
		com.liferay.foo.model.Foo entry)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteEntry(entry);
	}

	public static com.liferay.foo.model.Foo deleteEntry(long primaryKey)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteEntry(primaryKey);
	}

	/**
	* Deletes the foo from the database. Also notifies the appropriate model listeners.
	*
	* @param foo the foo
	* @return the foo that was removed
	*/
	public static com.liferay.foo.model.Foo deleteFoo(
		com.liferay.foo.model.Foo foo) {
		return getService().deleteFoo(foo);
	}

	/**
	* Deletes the foo with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param fooId the primary key of the foo
	* @return the foo that was removed
	* @throws PortalException if a foo with the primary key could not be found
	*/
	public static com.liferay.foo.model.Foo deleteFoo(long fooId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteFoo(fooId);
	}

	public static com.liferay.foo.model.Foo fetchFoo(long fooId) {
		return getService().fetchFoo(fooId);
	}

	/**
	* Returns the foo matching the UUID and group.
	*
	* @param uuid the foo's UUID
	* @param groupId the primary key of the group
	* @return the matching foo, or <code>null</code> if a matching foo could not be found
	*/
	public static com.liferay.foo.model.Foo fetchFooByUuidAndGroupId(
		java.lang.String uuid, long groupId) {
		return getService().fetchFooByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Returns the foo with the primary key.
	*
	* @param fooId the primary key of the foo
	* @return the foo
	* @throws PortalException if a foo with the primary key could not be found
	*/
	public static com.liferay.foo.model.Foo getFoo(long fooId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getFoo(fooId);
	}

	public static com.liferay.foo.model.Foo getFooByUrlTitle(long groupId,
		java.lang.String urlTitle, int status)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getFooByUrlTitle(groupId, urlTitle, status);
	}

	/**
	* Returns the foo matching the UUID and group.
	*
	* @param uuid the foo's UUID
	* @param groupId the primary key of the group
	* @return the matching foo
	* @throws PortalException if a matching foo could not be found
	*/
	public static com.liferay.foo.model.Foo getFooByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getFooByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Populate Model with values from a form
	*
	* @param request PortletRequest
	* @return Foo Object
	* @throws PortletException
	* @throws FooValidateException
	*/
	public static com.liferay.foo.model.Foo getFooFromRequest(long primaryKey,
		javax.portlet.PortletRequest request)
		throws com.liferay.foo.exception.FooValidateException,
			javax.portlet.PortletException {
		return getService().getFooFromRequest(primaryKey, request);
	}

	/**
	* Populate Model with values from a form
	*
	* @param primaryKey primaly key
	* @param request PortletRequest
	* @return Foo Object
	* @throws PortletException
	*/
	public static com.liferay.foo.model.Foo getInitializedFoo(long primaryKey,
		javax.portlet.PortletRequest request)
		throws javax.portlet.PortletException {
		return getService().getInitializedFoo(primaryKey, request);
	}

	/**
	* Get Record
	*
	* @param primaryKey Primary key
	* @return Foo object
	* @throws PortletException
	*/
	public static com.liferay.foo.model.Foo getNewObject(long primaryKey) {
		return getService().getNewObject(primaryKey);
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
	public static com.liferay.foo.model.Foo moveEntryToTrash(long userId,
		com.liferay.foo.model.Foo entry)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().moveEntryToTrash(userId, entry);
	}

	public static com.liferay.foo.model.Foo moveEntryToTrash(long userId,
		long entryId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().moveEntryToTrash(userId, entryId);
	}

	/**
	* Restores the entry with the ID from the recycle bin. Social activity
	* counters for this entry get activated.
	*
	* @param userId the primary key of the user restoring the entry
	* @param entryId the primary key of the entry to be restored
	* @return the restored entry from the recycle bin
	*/
	public static com.liferay.foo.model.Foo restoreEntryFromTrash(long userId,
		long entryId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().restoreEntryFromTrash(userId, entryId);
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
	public static com.liferay.foo.model.Foo updateEntry(
		com.liferay.foo.model.Foo orgEntry,
		com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.foo.exception.FooValidateException,
			com.liferay.portal.kernel.exception.PortalException {
		return getService().updateEntry(orgEntry, serviceContext);
	}

	/**
	* Updates the foo in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param foo the foo
	* @return the foo that was updated
	*/
	public static com.liferay.foo.model.Foo updateFoo(
		com.liferay.foo.model.Foo foo) {
		return getService().updateFoo(foo);
	}

	public static com.liferay.foo.model.Foo updateStatus(long userId,
		long entryId, int status,
		com.liferay.portal.kernel.service.ServiceContext serviceContext,
		java.util.Map<java.lang.String, java.io.Serializable> workflowContext)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService()
				   .updateStatus(userId, entryId, status, serviceContext,
			workflowContext);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return getService().getActionableDynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery getExportActionableDynamicQuery(
		com.liferay.exportimport.kernel.lar.PortletDataContext portletDataContext) {
		return getService().getExportActionableDynamicQuery(portletDataContext);
	}

	public static com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	public static com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deletePersistedModel(persistedModel);
	}

	public static com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	public static int countAllInGroup(long groupId) {
		return getService().countAllInGroup(groupId);
	}

	public static int countAllInUser(long userId) {
		return getService().countAllInUser(userId);
	}

	public static int countAllInUserAndGroup(long userId, long groupId) {
		return getService().countAllInUserAndGroup(userId, groupId);
	}

	/**
	* Get Company entries counts
	*
	* @param companyId
	* @param status
	* @return
	* @throws SystemException
	*/
	public static int getCompanyEntriesCount(long companyId, int status) {
		return getService().getCompanyEntriesCount(companyId, status);
	}

	/**
	* Returns the number of foos.
	*
	* @return the number of foos
	*/
	public static int getFoosCount() {
		return getService().getFoosCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public static java.lang.String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	/**
	* Converte Date Time into Date()
	*
	* @param request PortletRequest
	* @param prefix Prefix of the parameter
	* @return Date object
	*/
	public static java.util.Date getDateTimeFromRequest(
		javax.portlet.PortletRequest request, java.lang.String prefix) {
		return getService().getDateTimeFromRequest(request, prefix);
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return getService().dynamicQuery(dynamicQuery);
	}

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
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return getService().dynamicQuery(dynamicQuery, start, end);
	}

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
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	public static java.util.List<com.liferay.foo.model.Foo> findAllInGroup(
		long groupId) {
		return getService().findAllInGroup(groupId);
	}

	public static java.util.List<com.liferay.foo.model.Foo> findAllInGroup(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<com.liferay.foo.model.Foo> orderByComparator) {
		return getService().findAllInGroup(groupId, orderByComparator);
	}

	public static java.util.List<com.liferay.foo.model.Foo> findAllInGroup(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<com.liferay.foo.model.Foo> orderByComparator) {
		return getService()
				   .findAllInGroup(groupId, start, end, orderByComparator);
	}

	public static java.util.List<com.liferay.foo.model.Foo> findAllInUser(
		long userId) {
		return getService().findAllInUser(userId);
	}

	public static java.util.List<com.liferay.foo.model.Foo> findAllInUser(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator<com.liferay.foo.model.Foo> orderByComparator) {
		return getService().findAllInUser(userId, orderByComparator);
	}

	public static java.util.List<com.liferay.foo.model.Foo> findAllInUser(
		long userId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<com.liferay.foo.model.Foo> orderByComparator) {
		return getService().findAllInUser(userId, start, end, orderByComparator);
	}

	public static java.util.List<com.liferay.foo.model.Foo> findAllInUserAndGroup(
		long userId, long groupId) {
		return getService().findAllInUserAndGroup(userId, groupId);
	}

	public static java.util.List<com.liferay.foo.model.Foo> findAllInUserAndGroup(
		long userId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<com.liferay.foo.model.Foo> orderByComparator) {
		return getService()
				   .findAllInUserAndGroup(userId, groupId, orderByComparator);
	}

	public static java.util.List<com.liferay.foo.model.Foo> findAllInUserAndGroup(
		long userId, long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<com.liferay.foo.model.Foo> orderByComparator) {
		return getService()
				   .findAllInUserAndGroup(userId, groupId, start, end,
			orderByComparator);
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
	public static java.util.List<com.liferay.foo.model.Foo> getCompanyEntries(
		long companyId, int status, int start, int end) {
		return getService().getCompanyEntries(companyId, status, start, end);
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
	public static java.util.List<com.liferay.foo.model.Foo> getCompanyEntries(
		long companyId, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<com.liferay.foo.model.Foo> obc) {
		return getService().getCompanyEntries(companyId, status, start, end, obc);
	}

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
	public static java.util.List<com.liferay.foo.model.Foo> getFoos(int start,
		int end) {
		return getService().getFoos(start, end);
	}

	/**
	* Returns all the foos matching the UUID and company.
	*
	* @param uuid the UUID of the foos
	* @param companyId the primary key of the company
	* @return the matching foos, or an empty list if no matches were found
	*/
	public static java.util.List<com.liferay.foo.model.Foo> getFoosByUuidAndCompanyId(
		java.lang.String uuid, long companyId) {
		return getService().getFoosByUuidAndCompanyId(uuid, companyId);
	}

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
	public static java.util.List<com.liferay.foo.model.Foo> getFoosByUuidAndCompanyId(
		java.lang.String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<com.liferay.foo.model.Foo> orderByComparator) {
		return getService()
				   .getFoosByUuidAndCompanyId(uuid, companyId, start, end,
			orderByComparator);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static void addEntryResources(com.liferay.foo.model.Foo entry,
		boolean addGroupPermissions, boolean addGuestPermissions)
		throws com.liferay.portal.kernel.exception.PortalException {
		getService()
			.addEntryResources(entry, addGroupPermissions, addGuestPermissions);
	}

	public static void addEntryResources(com.liferay.foo.model.Foo entry,
		com.liferay.portal.kernel.service.permission.ModelPermissions modelPermissions)
		throws com.liferay.portal.kernel.exception.PortalException {
		getService().addEntryResources(entry, modelPermissions);
	}

	public static void addEntryResources(com.liferay.foo.model.Foo entry,
		java.lang.String[] groupPermissions, java.lang.String[] guestPermissions)
		throws com.liferay.portal.kernel.exception.PortalException {
		getService().addEntryResources(entry, groupPermissions, guestPermissions);
	}

	public static void addEntryResources(long entryId,
		boolean addGroupPermissions, boolean addGuestPermissions)
		throws com.liferay.portal.kernel.exception.PortalException {
		getService()
			.addEntryResources(entryId, addGroupPermissions, addGuestPermissions);
	}

	public static void addEntryResources(long entryId,
		java.lang.String[] groupPermissions, java.lang.String[] guestPermissions)
		throws com.liferay.portal.kernel.exception.PortalException {
		getService()
			.addEntryResources(entryId, groupPermissions, guestPermissions);
	}

	public static void updateAsset(long userId,
		com.liferay.foo.model.Foo entry, long[] assetCategoryIds,
		java.lang.String[] assetTagNames, long[] assetLinkEntryIds,
		java.lang.Double priority)
		throws com.liferay.portal.kernel.exception.PortalException {
		getService()
			.updateAsset(userId, entry, assetCategoryIds, assetTagNames,
			assetLinkEntryIds, priority);
	}

	public static void updateEntryResources(com.liferay.foo.model.Foo entry,
		java.lang.String[] groupPermissions, java.lang.String[] guestPermissions)
		throws com.liferay.portal.kernel.exception.PortalException {
		getService()
			.updateEntryResources(entry, groupPermissions, guestPermissions);
	}

	public static FooLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<FooLocalService, FooLocalService> _serviceTracker =
		ServiceTrackerFactory.open(FooLocalService.class);
}