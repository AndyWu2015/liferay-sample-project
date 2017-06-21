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

package com.liferay.foo.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.foo.model.Foo;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import java.util.Date;
import java.util.List;

/**
 * The persistence utility for the foo service. This utility wraps {@link com.liferay.foo.service.persistence.impl.FooPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FooPersistence
 * @see com.liferay.foo.service.persistence.impl.FooPersistenceImpl
 * @generated
 */
@ProviderType
public class FooUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(Foo foo) {
		getPersistence().clearCache(foo);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Foo> findWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Foo> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Foo> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end, OrderByComparator<Foo> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Foo update(Foo foo) {
		return getPersistence().update(foo);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Foo update(Foo foo, ServiceContext serviceContext) {
		return getPersistence().update(foo, serviceContext);
	}

	/**
	* Returns all the foos where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching foos
	*/
	public static List<Foo> findByUuid(java.lang.String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	* Returns a range of all the foos where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FooModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of foos
	* @param end the upper bound of the range of foos (not inclusive)
	* @return the range of matching foos
	*/
	public static List<Foo> findByUuid(java.lang.String uuid, int start, int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	* Returns an ordered range of all the foos where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FooModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of foos
	* @param end the upper bound of the range of foos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching foos
	*/
	public static List<Foo> findByUuid(java.lang.String uuid, int start,
		int end, OrderByComparator<Foo> orderByComparator) {
		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the foos where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FooModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of foos
	* @param end the upper bound of the range of foos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching foos
	*/
	public static List<Foo> findByUuid(java.lang.String uuid, int start,
		int end, OrderByComparator<Foo> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByUuid(uuid, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first foo in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching foo
	* @throws NoSuchFooException if a matching foo could not be found
	*/
	public static Foo findByUuid_First(java.lang.String uuid,
		OrderByComparator<Foo> orderByComparator)
		throws com.liferay.foo.exception.NoSuchFooException {
		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the first foo in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching foo, or <code>null</code> if a matching foo could not be found
	*/
	public static Foo fetchByUuid_First(java.lang.String uuid,
		OrderByComparator<Foo> orderByComparator) {
		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the last foo in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching foo
	* @throws NoSuchFooException if a matching foo could not be found
	*/
	public static Foo findByUuid_Last(java.lang.String uuid,
		OrderByComparator<Foo> orderByComparator)
		throws com.liferay.foo.exception.NoSuchFooException {
		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the last foo in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching foo, or <code>null</code> if a matching foo could not be found
	*/
	public static Foo fetchByUuid_Last(java.lang.String uuid,
		OrderByComparator<Foo> orderByComparator) {
		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the foos before and after the current foo in the ordered set where uuid = &#63;.
	*
	* @param fooId the primary key of the current foo
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next foo
	* @throws NoSuchFooException if a foo with the primary key could not be found
	*/
	public static Foo[] findByUuid_PrevAndNext(long fooId,
		java.lang.String uuid, OrderByComparator<Foo> orderByComparator)
		throws com.liferay.foo.exception.NoSuchFooException {
		return getPersistence()
				   .findByUuid_PrevAndNext(fooId, uuid, orderByComparator);
	}

	/**
	* Removes all the foos where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public static void removeByUuid(java.lang.String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	* Returns the number of foos where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching foos
	*/
	public static int countByUuid(java.lang.String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	* Returns the foo where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchFooException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching foo
	* @throws NoSuchFooException if a matching foo could not be found
	*/
	public static Foo findByUUID_G(java.lang.String uuid, long groupId)
		throws com.liferay.foo.exception.NoSuchFooException {
		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	* Returns the foo where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching foo, or <code>null</code> if a matching foo could not be found
	*/
	public static Foo fetchByUUID_G(java.lang.String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	* Returns the foo where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching foo, or <code>null</code> if a matching foo could not be found
	*/
	public static Foo fetchByUUID_G(java.lang.String uuid, long groupId,
		boolean retrieveFromCache) {
		return getPersistence().fetchByUUID_G(uuid, groupId, retrieveFromCache);
	}

	/**
	* Removes the foo where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the foo that was removed
	*/
	public static Foo removeByUUID_G(java.lang.String uuid, long groupId)
		throws com.liferay.foo.exception.NoSuchFooException {
		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	* Returns the number of foos where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching foos
	*/
	public static int countByUUID_G(java.lang.String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	* Returns all the foos where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching foos
	*/
	public static List<Foo> findByUuid_C(java.lang.String uuid, long companyId) {
		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	* Returns a range of all the foos where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FooModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of foos
	* @param end the upper bound of the range of foos (not inclusive)
	* @return the range of matching foos
	*/
	public static List<Foo> findByUuid_C(java.lang.String uuid, long companyId,
		int start, int end) {
		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	* Returns an ordered range of all the foos where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FooModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of foos
	* @param end the upper bound of the range of foos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching foos
	*/
	public static List<Foo> findByUuid_C(java.lang.String uuid, long companyId,
		int start, int end, OrderByComparator<Foo> orderByComparator) {
		return getPersistence()
				   .findByUuid_C(uuid, companyId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the foos where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FooModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of foos
	* @param end the upper bound of the range of foos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching foos
	*/
	public static List<Foo> findByUuid_C(java.lang.String uuid, long companyId,
		int start, int end, OrderByComparator<Foo> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByUuid_C(uuid, companyId, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first foo in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching foo
	* @throws NoSuchFooException if a matching foo could not be found
	*/
	public static Foo findByUuid_C_First(java.lang.String uuid, long companyId,
		OrderByComparator<Foo> orderByComparator)
		throws com.liferay.foo.exception.NoSuchFooException {
		return getPersistence()
				   .findByUuid_C_First(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the first foo in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching foo, or <code>null</code> if a matching foo could not be found
	*/
	public static Foo fetchByUuid_C_First(java.lang.String uuid,
		long companyId, OrderByComparator<Foo> orderByComparator) {
		return getPersistence()
				   .fetchByUuid_C_First(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the last foo in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching foo
	* @throws NoSuchFooException if a matching foo could not be found
	*/
	public static Foo findByUuid_C_Last(java.lang.String uuid, long companyId,
		OrderByComparator<Foo> orderByComparator)
		throws com.liferay.foo.exception.NoSuchFooException {
		return getPersistence()
				   .findByUuid_C_Last(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the last foo in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching foo, or <code>null</code> if a matching foo could not be found
	*/
	public static Foo fetchByUuid_C_Last(java.lang.String uuid, long companyId,
		OrderByComparator<Foo> orderByComparator) {
		return getPersistence()
				   .fetchByUuid_C_Last(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the foos before and after the current foo in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param fooId the primary key of the current foo
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next foo
	* @throws NoSuchFooException if a foo with the primary key could not be found
	*/
	public static Foo[] findByUuid_C_PrevAndNext(long fooId,
		java.lang.String uuid, long companyId,
		OrderByComparator<Foo> orderByComparator)
		throws com.liferay.foo.exception.NoSuchFooException {
		return getPersistence()
				   .findByUuid_C_PrevAndNext(fooId, uuid, companyId,
			orderByComparator);
	}

	/**
	* Removes all the foos where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	*/
	public static void removeByUuid_C(java.lang.String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	* Returns the number of foos where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching foos
	*/
	public static int countByUuid_C(java.lang.String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	* Returns all the foos where companyId = &#63; and status = &#63;.
	*
	* @param companyId the company ID
	* @param status the status
	* @return the matching foos
	*/
	public static List<Foo> findByC_S(long companyId, int status) {
		return getPersistence().findByC_S(companyId, status);
	}

	/**
	* Returns a range of all the foos where companyId = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FooModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param status the status
	* @param start the lower bound of the range of foos
	* @param end the upper bound of the range of foos (not inclusive)
	* @return the range of matching foos
	*/
	public static List<Foo> findByC_S(long companyId, int status, int start,
		int end) {
		return getPersistence().findByC_S(companyId, status, start, end);
	}

	/**
	* Returns an ordered range of all the foos where companyId = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FooModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param status the status
	* @param start the lower bound of the range of foos
	* @param end the upper bound of the range of foos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching foos
	*/
	public static List<Foo> findByC_S(long companyId, int status, int start,
		int end, OrderByComparator<Foo> orderByComparator) {
		return getPersistence()
				   .findByC_S(companyId, status, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the foos where companyId = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FooModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param status the status
	* @param start the lower bound of the range of foos
	* @param end the upper bound of the range of foos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching foos
	*/
	public static List<Foo> findByC_S(long companyId, int status, int start,
		int end, OrderByComparator<Foo> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByC_S(companyId, status, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first foo in the ordered set where companyId = &#63; and status = &#63;.
	*
	* @param companyId the company ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching foo
	* @throws NoSuchFooException if a matching foo could not be found
	*/
	public static Foo findByC_S_First(long companyId, int status,
		OrderByComparator<Foo> orderByComparator)
		throws com.liferay.foo.exception.NoSuchFooException {
		return getPersistence()
				   .findByC_S_First(companyId, status, orderByComparator);
	}

	/**
	* Returns the first foo in the ordered set where companyId = &#63; and status = &#63;.
	*
	* @param companyId the company ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching foo, or <code>null</code> if a matching foo could not be found
	*/
	public static Foo fetchByC_S_First(long companyId, int status,
		OrderByComparator<Foo> orderByComparator) {
		return getPersistence()
				   .fetchByC_S_First(companyId, status, orderByComparator);
	}

	/**
	* Returns the last foo in the ordered set where companyId = &#63; and status = &#63;.
	*
	* @param companyId the company ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching foo
	* @throws NoSuchFooException if a matching foo could not be found
	*/
	public static Foo findByC_S_Last(long companyId, int status,
		OrderByComparator<Foo> orderByComparator)
		throws com.liferay.foo.exception.NoSuchFooException {
		return getPersistence()
				   .findByC_S_Last(companyId, status, orderByComparator);
	}

	/**
	* Returns the last foo in the ordered set where companyId = &#63; and status = &#63;.
	*
	* @param companyId the company ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching foo, or <code>null</code> if a matching foo could not be found
	*/
	public static Foo fetchByC_S_Last(long companyId, int status,
		OrderByComparator<Foo> orderByComparator) {
		return getPersistence()
				   .fetchByC_S_Last(companyId, status, orderByComparator);
	}

	/**
	* Returns the foos before and after the current foo in the ordered set where companyId = &#63; and status = &#63;.
	*
	* @param fooId the primary key of the current foo
	* @param companyId the company ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next foo
	* @throws NoSuchFooException if a foo with the primary key could not be found
	*/
	public static Foo[] findByC_S_PrevAndNext(long fooId, long companyId,
		int status, OrderByComparator<Foo> orderByComparator)
		throws com.liferay.foo.exception.NoSuchFooException {
		return getPersistence()
				   .findByC_S_PrevAndNext(fooId, companyId, status,
			orderByComparator);
	}

	/**
	* Removes all the foos where companyId = &#63; and status = &#63; from the database.
	*
	* @param companyId the company ID
	* @param status the status
	*/
	public static void removeByC_S(long companyId, int status) {
		getPersistence().removeByC_S(companyId, status);
	}

	/**
	* Returns the number of foos where companyId = &#63; and status = &#63;.
	*
	* @param companyId the company ID
	* @param status the status
	* @return the number of matching foos
	*/
	public static int countByC_S(long companyId, int status) {
		return getPersistence().countByC_S(companyId, status);
	}

	/**
	* Returns all the foos where groupId = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param status the status
	* @return the matching foos
	*/
	public static List<Foo> findByG_S(long groupId, int status) {
		return getPersistence().findByG_S(groupId, status);
	}

	/**
	* Returns a range of all the foos where groupId = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FooModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param status the status
	* @param start the lower bound of the range of foos
	* @param end the upper bound of the range of foos (not inclusive)
	* @return the range of matching foos
	*/
	public static List<Foo> findByG_S(long groupId, int status, int start,
		int end) {
		return getPersistence().findByG_S(groupId, status, start, end);
	}

	/**
	* Returns an ordered range of all the foos where groupId = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FooModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param status the status
	* @param start the lower bound of the range of foos
	* @param end the upper bound of the range of foos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching foos
	*/
	public static List<Foo> findByG_S(long groupId, int status, int start,
		int end, OrderByComparator<Foo> orderByComparator) {
		return getPersistence()
				   .findByG_S(groupId, status, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the foos where groupId = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FooModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param status the status
	* @param start the lower bound of the range of foos
	* @param end the upper bound of the range of foos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching foos
	*/
	public static List<Foo> findByG_S(long groupId, int status, int start,
		int end, OrderByComparator<Foo> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByG_S(groupId, status, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first foo in the ordered set where groupId = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching foo
	* @throws NoSuchFooException if a matching foo could not be found
	*/
	public static Foo findByG_S_First(long groupId, int status,
		OrderByComparator<Foo> orderByComparator)
		throws com.liferay.foo.exception.NoSuchFooException {
		return getPersistence()
				   .findByG_S_First(groupId, status, orderByComparator);
	}

	/**
	* Returns the first foo in the ordered set where groupId = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching foo, or <code>null</code> if a matching foo could not be found
	*/
	public static Foo fetchByG_S_First(long groupId, int status,
		OrderByComparator<Foo> orderByComparator) {
		return getPersistence()
				   .fetchByG_S_First(groupId, status, orderByComparator);
	}

	/**
	* Returns the last foo in the ordered set where groupId = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching foo
	* @throws NoSuchFooException if a matching foo could not be found
	*/
	public static Foo findByG_S_Last(long groupId, int status,
		OrderByComparator<Foo> orderByComparator)
		throws com.liferay.foo.exception.NoSuchFooException {
		return getPersistence()
				   .findByG_S_Last(groupId, status, orderByComparator);
	}

	/**
	* Returns the last foo in the ordered set where groupId = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching foo, or <code>null</code> if a matching foo could not be found
	*/
	public static Foo fetchByG_S_Last(long groupId, int status,
		OrderByComparator<Foo> orderByComparator) {
		return getPersistence()
				   .fetchByG_S_Last(groupId, status, orderByComparator);
	}

	/**
	* Returns the foos before and after the current foo in the ordered set where groupId = &#63; and status = &#63;.
	*
	* @param fooId the primary key of the current foo
	* @param groupId the group ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next foo
	* @throws NoSuchFooException if a foo with the primary key could not be found
	*/
	public static Foo[] findByG_S_PrevAndNext(long fooId, long groupId,
		int status, OrderByComparator<Foo> orderByComparator)
		throws com.liferay.foo.exception.NoSuchFooException {
		return getPersistence()
				   .findByG_S_PrevAndNext(fooId, groupId, status,
			orderByComparator);
	}

	/**
	* Returns all the foos that the user has permission to view where groupId = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param status the status
	* @return the matching foos that the user has permission to view
	*/
	public static List<Foo> filterFindByG_S(long groupId, int status) {
		return getPersistence().filterFindByG_S(groupId, status);
	}

	/**
	* Returns a range of all the foos that the user has permission to view where groupId = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FooModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param status the status
	* @param start the lower bound of the range of foos
	* @param end the upper bound of the range of foos (not inclusive)
	* @return the range of matching foos that the user has permission to view
	*/
	public static List<Foo> filterFindByG_S(long groupId, int status,
		int start, int end) {
		return getPersistence().filterFindByG_S(groupId, status, start, end);
	}

	/**
	* Returns an ordered range of all the foos that the user has permissions to view where groupId = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FooModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param status the status
	* @param start the lower bound of the range of foos
	* @param end the upper bound of the range of foos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching foos that the user has permission to view
	*/
	public static List<Foo> filterFindByG_S(long groupId, int status,
		int start, int end, OrderByComparator<Foo> orderByComparator) {
		return getPersistence()
				   .filterFindByG_S(groupId, status, start, end,
			orderByComparator);
	}

	/**
	* Returns the foos before and after the current foo in the ordered set of foos that the user has permission to view where groupId = &#63; and status = &#63;.
	*
	* @param fooId the primary key of the current foo
	* @param groupId the group ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next foo
	* @throws NoSuchFooException if a foo with the primary key could not be found
	*/
	public static Foo[] filterFindByG_S_PrevAndNext(long fooId, long groupId,
		int status, OrderByComparator<Foo> orderByComparator)
		throws com.liferay.foo.exception.NoSuchFooException {
		return getPersistence()
				   .filterFindByG_S_PrevAndNext(fooId, groupId, status,
			orderByComparator);
	}

	/**
	* Removes all the foos where groupId = &#63; and status = &#63; from the database.
	*
	* @param groupId the group ID
	* @param status the status
	*/
	public static void removeByG_S(long groupId, int status) {
		getPersistence().removeByG_S(groupId, status);
	}

	/**
	* Returns the number of foos where groupId = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param status the status
	* @return the number of matching foos
	*/
	public static int countByG_S(long groupId, int status) {
		return getPersistence().countByG_S(groupId, status);
	}

	/**
	* Returns the number of foos that the user has permission to view where groupId = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param status the status
	* @return the number of matching foos that the user has permission to view
	*/
	public static int filterCountByG_S(long groupId, int status) {
		return getPersistence().filterCountByG_S(groupId, status);
	}

	/**
	* Returns all the foos where companyId = &#63; and userId = &#63; and status = &#63;.
	*
	* @param companyId the company ID
	* @param userId the user ID
	* @param status the status
	* @return the matching foos
	*/
	public static List<Foo> findByC_U_S(long companyId, long userId, int status) {
		return getPersistence().findByC_U_S(companyId, userId, status);
	}

	/**
	* Returns a range of all the foos where companyId = &#63; and userId = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FooModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param userId the user ID
	* @param status the status
	* @param start the lower bound of the range of foos
	* @param end the upper bound of the range of foos (not inclusive)
	* @return the range of matching foos
	*/
	public static List<Foo> findByC_U_S(long companyId, long userId,
		int status, int start, int end) {
		return getPersistence()
				   .findByC_U_S(companyId, userId, status, start, end);
	}

	/**
	* Returns an ordered range of all the foos where companyId = &#63; and userId = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FooModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param userId the user ID
	* @param status the status
	* @param start the lower bound of the range of foos
	* @param end the upper bound of the range of foos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching foos
	*/
	public static List<Foo> findByC_U_S(long companyId, long userId,
		int status, int start, int end, OrderByComparator<Foo> orderByComparator) {
		return getPersistence()
				   .findByC_U_S(companyId, userId, status, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the foos where companyId = &#63; and userId = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FooModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param userId the user ID
	* @param status the status
	* @param start the lower bound of the range of foos
	* @param end the upper bound of the range of foos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching foos
	*/
	public static List<Foo> findByC_U_S(long companyId, long userId,
		int status, int start, int end,
		OrderByComparator<Foo> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findByC_U_S(companyId, userId, status, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first foo in the ordered set where companyId = &#63; and userId = &#63; and status = &#63;.
	*
	* @param companyId the company ID
	* @param userId the user ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching foo
	* @throws NoSuchFooException if a matching foo could not be found
	*/
	public static Foo findByC_U_S_First(long companyId, long userId,
		int status, OrderByComparator<Foo> orderByComparator)
		throws com.liferay.foo.exception.NoSuchFooException {
		return getPersistence()
				   .findByC_U_S_First(companyId, userId, status,
			orderByComparator);
	}

	/**
	* Returns the first foo in the ordered set where companyId = &#63; and userId = &#63; and status = &#63;.
	*
	* @param companyId the company ID
	* @param userId the user ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching foo, or <code>null</code> if a matching foo could not be found
	*/
	public static Foo fetchByC_U_S_First(long companyId, long userId,
		int status, OrderByComparator<Foo> orderByComparator) {
		return getPersistence()
				   .fetchByC_U_S_First(companyId, userId, status,
			orderByComparator);
	}

	/**
	* Returns the last foo in the ordered set where companyId = &#63; and userId = &#63; and status = &#63;.
	*
	* @param companyId the company ID
	* @param userId the user ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching foo
	* @throws NoSuchFooException if a matching foo could not be found
	*/
	public static Foo findByC_U_S_Last(long companyId, long userId, int status,
		OrderByComparator<Foo> orderByComparator)
		throws com.liferay.foo.exception.NoSuchFooException {
		return getPersistence()
				   .findByC_U_S_Last(companyId, userId, status,
			orderByComparator);
	}

	/**
	* Returns the last foo in the ordered set where companyId = &#63; and userId = &#63; and status = &#63;.
	*
	* @param companyId the company ID
	* @param userId the user ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching foo, or <code>null</code> if a matching foo could not be found
	*/
	public static Foo fetchByC_U_S_Last(long companyId, long userId,
		int status, OrderByComparator<Foo> orderByComparator) {
		return getPersistence()
				   .fetchByC_U_S_Last(companyId, userId, status,
			orderByComparator);
	}

	/**
	* Returns the foos before and after the current foo in the ordered set where companyId = &#63; and userId = &#63; and status = &#63;.
	*
	* @param fooId the primary key of the current foo
	* @param companyId the company ID
	* @param userId the user ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next foo
	* @throws NoSuchFooException if a foo with the primary key could not be found
	*/
	public static Foo[] findByC_U_S_PrevAndNext(long fooId, long companyId,
		long userId, int status, OrderByComparator<Foo> orderByComparator)
		throws com.liferay.foo.exception.NoSuchFooException {
		return getPersistence()
				   .findByC_U_S_PrevAndNext(fooId, companyId, userId, status,
			orderByComparator);
	}

	/**
	* Removes all the foos where companyId = &#63; and userId = &#63; and status = &#63; from the database.
	*
	* @param companyId the company ID
	* @param userId the user ID
	* @param status the status
	*/
	public static void removeByC_U_S(long companyId, long userId, int status) {
		getPersistence().removeByC_U_S(companyId, userId, status);
	}

	/**
	* Returns the number of foos where companyId = &#63; and userId = &#63; and status = &#63;.
	*
	* @param companyId the company ID
	* @param userId the user ID
	* @param status the status
	* @return the number of matching foos
	*/
	public static int countByC_U_S(long companyId, long userId, int status) {
		return getPersistence().countByC_U_S(companyId, userId, status);
	}

	/**
	* Returns all the foos where groupId = &#63; and userId = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param status the status
	* @return the matching foos
	*/
	public static List<Foo> findByG_U_S(long groupId, long userId, int status) {
		return getPersistence().findByG_U_S(groupId, userId, status);
	}

	/**
	* Returns a range of all the foos where groupId = &#63; and userId = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FooModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param status the status
	* @param start the lower bound of the range of foos
	* @param end the upper bound of the range of foos (not inclusive)
	* @return the range of matching foos
	*/
	public static List<Foo> findByG_U_S(long groupId, long userId, int status,
		int start, int end) {
		return getPersistence().findByG_U_S(groupId, userId, status, start, end);
	}

	/**
	* Returns an ordered range of all the foos where groupId = &#63; and userId = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FooModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param status the status
	* @param start the lower bound of the range of foos
	* @param end the upper bound of the range of foos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching foos
	*/
	public static List<Foo> findByG_U_S(long groupId, long userId, int status,
		int start, int end, OrderByComparator<Foo> orderByComparator) {
		return getPersistence()
				   .findByG_U_S(groupId, userId, status, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the foos where groupId = &#63; and userId = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FooModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param status the status
	* @param start the lower bound of the range of foos
	* @param end the upper bound of the range of foos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching foos
	*/
	public static List<Foo> findByG_U_S(long groupId, long userId, int status,
		int start, int end, OrderByComparator<Foo> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByG_U_S(groupId, userId, status, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first foo in the ordered set where groupId = &#63; and userId = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching foo
	* @throws NoSuchFooException if a matching foo could not be found
	*/
	public static Foo findByG_U_S_First(long groupId, long userId, int status,
		OrderByComparator<Foo> orderByComparator)
		throws com.liferay.foo.exception.NoSuchFooException {
		return getPersistence()
				   .findByG_U_S_First(groupId, userId, status, orderByComparator);
	}

	/**
	* Returns the first foo in the ordered set where groupId = &#63; and userId = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching foo, or <code>null</code> if a matching foo could not be found
	*/
	public static Foo fetchByG_U_S_First(long groupId, long userId, int status,
		OrderByComparator<Foo> orderByComparator) {
		return getPersistence()
				   .fetchByG_U_S_First(groupId, userId, status,
			orderByComparator);
	}

	/**
	* Returns the last foo in the ordered set where groupId = &#63; and userId = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching foo
	* @throws NoSuchFooException if a matching foo could not be found
	*/
	public static Foo findByG_U_S_Last(long groupId, long userId, int status,
		OrderByComparator<Foo> orderByComparator)
		throws com.liferay.foo.exception.NoSuchFooException {
		return getPersistence()
				   .findByG_U_S_Last(groupId, userId, status, orderByComparator);
	}

	/**
	* Returns the last foo in the ordered set where groupId = &#63; and userId = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching foo, or <code>null</code> if a matching foo could not be found
	*/
	public static Foo fetchByG_U_S_Last(long groupId, long userId, int status,
		OrderByComparator<Foo> orderByComparator) {
		return getPersistence()
				   .fetchByG_U_S_Last(groupId, userId, status, orderByComparator);
	}

	/**
	* Returns the foos before and after the current foo in the ordered set where groupId = &#63; and userId = &#63; and status = &#63;.
	*
	* @param fooId the primary key of the current foo
	* @param groupId the group ID
	* @param userId the user ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next foo
	* @throws NoSuchFooException if a foo with the primary key could not be found
	*/
	public static Foo[] findByG_U_S_PrevAndNext(long fooId, long groupId,
		long userId, int status, OrderByComparator<Foo> orderByComparator)
		throws com.liferay.foo.exception.NoSuchFooException {
		return getPersistence()
				   .findByG_U_S_PrevAndNext(fooId, groupId, userId, status,
			orderByComparator);
	}

	/**
	* Returns all the foos that the user has permission to view where groupId = &#63; and userId = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param status the status
	* @return the matching foos that the user has permission to view
	*/
	public static List<Foo> filterFindByG_U_S(long groupId, long userId,
		int status) {
		return getPersistence().filterFindByG_U_S(groupId, userId, status);
	}

	/**
	* Returns a range of all the foos that the user has permission to view where groupId = &#63; and userId = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FooModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param status the status
	* @param start the lower bound of the range of foos
	* @param end the upper bound of the range of foos (not inclusive)
	* @return the range of matching foos that the user has permission to view
	*/
	public static List<Foo> filterFindByG_U_S(long groupId, long userId,
		int status, int start, int end) {
		return getPersistence()
				   .filterFindByG_U_S(groupId, userId, status, start, end);
	}

	/**
	* Returns an ordered range of all the foos that the user has permissions to view where groupId = &#63; and userId = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FooModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param status the status
	* @param start the lower bound of the range of foos
	* @param end the upper bound of the range of foos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching foos that the user has permission to view
	*/
	public static List<Foo> filterFindByG_U_S(long groupId, long userId,
		int status, int start, int end, OrderByComparator<Foo> orderByComparator) {
		return getPersistence()
				   .filterFindByG_U_S(groupId, userId, status, start, end,
			orderByComparator);
	}

	/**
	* Returns the foos before and after the current foo in the ordered set of foos that the user has permission to view where groupId = &#63; and userId = &#63; and status = &#63;.
	*
	* @param fooId the primary key of the current foo
	* @param groupId the group ID
	* @param userId the user ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next foo
	* @throws NoSuchFooException if a foo with the primary key could not be found
	*/
	public static Foo[] filterFindByG_U_S_PrevAndNext(long fooId, long groupId,
		long userId, int status, OrderByComparator<Foo> orderByComparator)
		throws com.liferay.foo.exception.NoSuchFooException {
		return getPersistence()
				   .filterFindByG_U_S_PrevAndNext(fooId, groupId, userId,
			status, orderByComparator);
	}

	/**
	* Removes all the foos where groupId = &#63; and userId = &#63; and status = &#63; from the database.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param status the status
	*/
	public static void removeByG_U_S(long groupId, long userId, int status) {
		getPersistence().removeByG_U_S(groupId, userId, status);
	}

	/**
	* Returns the number of foos where groupId = &#63; and userId = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param status the status
	* @return the number of matching foos
	*/
	public static int countByG_U_S(long groupId, long userId, int status) {
		return getPersistence().countByG_U_S(groupId, userId, status);
	}

	/**
	* Returns the number of foos that the user has permission to view where groupId = &#63; and userId = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param status the status
	* @return the number of matching foos that the user has permission to view
	*/
	public static int filterCountByG_U_S(long groupId, long userId, int status) {
		return getPersistence().filterCountByG_U_S(groupId, userId, status);
	}

	/**
	* Returns all the foos where userId = &#63; and status = &#63;.
	*
	* @param userId the user ID
	* @param status the status
	* @return the matching foos
	*/
	public static List<Foo> findByU_S(long userId, int status) {
		return getPersistence().findByU_S(userId, status);
	}

	/**
	* Returns a range of all the foos where userId = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FooModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param status the status
	* @param start the lower bound of the range of foos
	* @param end the upper bound of the range of foos (not inclusive)
	* @return the range of matching foos
	*/
	public static List<Foo> findByU_S(long userId, int status, int start,
		int end) {
		return getPersistence().findByU_S(userId, status, start, end);
	}

	/**
	* Returns an ordered range of all the foos where userId = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FooModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param status the status
	* @param start the lower bound of the range of foos
	* @param end the upper bound of the range of foos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching foos
	*/
	public static List<Foo> findByU_S(long userId, int status, int start,
		int end, OrderByComparator<Foo> orderByComparator) {
		return getPersistence()
				   .findByU_S(userId, status, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the foos where userId = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FooModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param status the status
	* @param start the lower bound of the range of foos
	* @param end the upper bound of the range of foos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching foos
	*/
	public static List<Foo> findByU_S(long userId, int status, int start,
		int end, OrderByComparator<Foo> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByU_S(userId, status, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first foo in the ordered set where userId = &#63; and status = &#63;.
	*
	* @param userId the user ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching foo
	* @throws NoSuchFooException if a matching foo could not be found
	*/
	public static Foo findByU_S_First(long userId, int status,
		OrderByComparator<Foo> orderByComparator)
		throws com.liferay.foo.exception.NoSuchFooException {
		return getPersistence()
				   .findByU_S_First(userId, status, orderByComparator);
	}

	/**
	* Returns the first foo in the ordered set where userId = &#63; and status = &#63;.
	*
	* @param userId the user ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching foo, or <code>null</code> if a matching foo could not be found
	*/
	public static Foo fetchByU_S_First(long userId, int status,
		OrderByComparator<Foo> orderByComparator) {
		return getPersistence()
				   .fetchByU_S_First(userId, status, orderByComparator);
	}

	/**
	* Returns the last foo in the ordered set where userId = &#63; and status = &#63;.
	*
	* @param userId the user ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching foo
	* @throws NoSuchFooException if a matching foo could not be found
	*/
	public static Foo findByU_S_Last(long userId, int status,
		OrderByComparator<Foo> orderByComparator)
		throws com.liferay.foo.exception.NoSuchFooException {
		return getPersistence().findByU_S_Last(userId, status, orderByComparator);
	}

	/**
	* Returns the last foo in the ordered set where userId = &#63; and status = &#63;.
	*
	* @param userId the user ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching foo, or <code>null</code> if a matching foo could not be found
	*/
	public static Foo fetchByU_S_Last(long userId, int status,
		OrderByComparator<Foo> orderByComparator) {
		return getPersistence()
				   .fetchByU_S_Last(userId, status, orderByComparator);
	}

	/**
	* Returns the foos before and after the current foo in the ordered set where userId = &#63; and status = &#63;.
	*
	* @param fooId the primary key of the current foo
	* @param userId the user ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next foo
	* @throws NoSuchFooException if a foo with the primary key could not be found
	*/
	public static Foo[] findByU_S_PrevAndNext(long fooId, long userId,
		int status, OrderByComparator<Foo> orderByComparator)
		throws com.liferay.foo.exception.NoSuchFooException {
		return getPersistence()
				   .findByU_S_PrevAndNext(fooId, userId, status,
			orderByComparator);
	}

	/**
	* Removes all the foos where userId = &#63; and status = &#63; from the database.
	*
	* @param userId the user ID
	* @param status the status
	*/
	public static void removeByU_S(long userId, int status) {
		getPersistence().removeByU_S(userId, status);
	}

	/**
	* Returns the number of foos where userId = &#63; and status = &#63;.
	*
	* @param userId the user ID
	* @param status the status
	* @return the number of matching foos
	*/
	public static int countByU_S(long userId, int status) {
		return getPersistence().countByU_S(userId, status);
	}

	/**
	* Returns all the foos where groupId = &#63; and urlTitle = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param urlTitle the url title
	* @param status the status
	* @return the matching foos
	*/
	public static List<Foo> findByG_UT_ST(long groupId,
		java.lang.String urlTitle, int status) {
		return getPersistence().findByG_UT_ST(groupId, urlTitle, status);
	}

	/**
	* Returns a range of all the foos where groupId = &#63; and urlTitle = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FooModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param urlTitle the url title
	* @param status the status
	* @param start the lower bound of the range of foos
	* @param end the upper bound of the range of foos (not inclusive)
	* @return the range of matching foos
	*/
	public static List<Foo> findByG_UT_ST(long groupId,
		java.lang.String urlTitle, int status, int start, int end) {
		return getPersistence()
				   .findByG_UT_ST(groupId, urlTitle, status, start, end);
	}

	/**
	* Returns an ordered range of all the foos where groupId = &#63; and urlTitle = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FooModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param urlTitle the url title
	* @param status the status
	* @param start the lower bound of the range of foos
	* @param end the upper bound of the range of foos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching foos
	*/
	public static List<Foo> findByG_UT_ST(long groupId,
		java.lang.String urlTitle, int status, int start, int end,
		OrderByComparator<Foo> orderByComparator) {
		return getPersistence()
				   .findByG_UT_ST(groupId, urlTitle, status, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the foos where groupId = &#63; and urlTitle = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FooModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param urlTitle the url title
	* @param status the status
	* @param start the lower bound of the range of foos
	* @param end the upper bound of the range of foos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching foos
	*/
	public static List<Foo> findByG_UT_ST(long groupId,
		java.lang.String urlTitle, int status, int start, int end,
		OrderByComparator<Foo> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findByG_UT_ST(groupId, urlTitle, status, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first foo in the ordered set where groupId = &#63; and urlTitle = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param urlTitle the url title
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching foo
	* @throws NoSuchFooException if a matching foo could not be found
	*/
	public static Foo findByG_UT_ST_First(long groupId,
		java.lang.String urlTitle, int status,
		OrderByComparator<Foo> orderByComparator)
		throws com.liferay.foo.exception.NoSuchFooException {
		return getPersistence()
				   .findByG_UT_ST_First(groupId, urlTitle, status,
			orderByComparator);
	}

	/**
	* Returns the first foo in the ordered set where groupId = &#63; and urlTitle = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param urlTitle the url title
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching foo, or <code>null</code> if a matching foo could not be found
	*/
	public static Foo fetchByG_UT_ST_First(long groupId,
		java.lang.String urlTitle, int status,
		OrderByComparator<Foo> orderByComparator) {
		return getPersistence()
				   .fetchByG_UT_ST_First(groupId, urlTitle, status,
			orderByComparator);
	}

	/**
	* Returns the last foo in the ordered set where groupId = &#63; and urlTitle = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param urlTitle the url title
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching foo
	* @throws NoSuchFooException if a matching foo could not be found
	*/
	public static Foo findByG_UT_ST_Last(long groupId,
		java.lang.String urlTitle, int status,
		OrderByComparator<Foo> orderByComparator)
		throws com.liferay.foo.exception.NoSuchFooException {
		return getPersistence()
				   .findByG_UT_ST_Last(groupId, urlTitle, status,
			orderByComparator);
	}

	/**
	* Returns the last foo in the ordered set where groupId = &#63; and urlTitle = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param urlTitle the url title
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching foo, or <code>null</code> if a matching foo could not be found
	*/
	public static Foo fetchByG_UT_ST_Last(long groupId,
		java.lang.String urlTitle, int status,
		OrderByComparator<Foo> orderByComparator) {
		return getPersistence()
				   .fetchByG_UT_ST_Last(groupId, urlTitle, status,
			orderByComparator);
	}

	/**
	* Returns the foos before and after the current foo in the ordered set where groupId = &#63; and urlTitle = &#63; and status = &#63;.
	*
	* @param fooId the primary key of the current foo
	* @param groupId the group ID
	* @param urlTitle the url title
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next foo
	* @throws NoSuchFooException if a foo with the primary key could not be found
	*/
	public static Foo[] findByG_UT_ST_PrevAndNext(long fooId, long groupId,
		java.lang.String urlTitle, int status,
		OrderByComparator<Foo> orderByComparator)
		throws com.liferay.foo.exception.NoSuchFooException {
		return getPersistence()
				   .findByG_UT_ST_PrevAndNext(fooId, groupId, urlTitle, status,
			orderByComparator);
	}

	/**
	* Returns all the foos that the user has permission to view where groupId = &#63; and urlTitle = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param urlTitle the url title
	* @param status the status
	* @return the matching foos that the user has permission to view
	*/
	public static List<Foo> filterFindByG_UT_ST(long groupId,
		java.lang.String urlTitle, int status) {
		return getPersistence().filterFindByG_UT_ST(groupId, urlTitle, status);
	}

	/**
	* Returns a range of all the foos that the user has permission to view where groupId = &#63; and urlTitle = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FooModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param urlTitle the url title
	* @param status the status
	* @param start the lower bound of the range of foos
	* @param end the upper bound of the range of foos (not inclusive)
	* @return the range of matching foos that the user has permission to view
	*/
	public static List<Foo> filterFindByG_UT_ST(long groupId,
		java.lang.String urlTitle, int status, int start, int end) {
		return getPersistence()
				   .filterFindByG_UT_ST(groupId, urlTitle, status, start, end);
	}

	/**
	* Returns an ordered range of all the foos that the user has permissions to view where groupId = &#63; and urlTitle = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FooModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param urlTitle the url title
	* @param status the status
	* @param start the lower bound of the range of foos
	* @param end the upper bound of the range of foos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching foos that the user has permission to view
	*/
	public static List<Foo> filterFindByG_UT_ST(long groupId,
		java.lang.String urlTitle, int status, int start, int end,
		OrderByComparator<Foo> orderByComparator) {
		return getPersistence()
				   .filterFindByG_UT_ST(groupId, urlTitle, status, start, end,
			orderByComparator);
	}

	/**
	* Returns the foos before and after the current foo in the ordered set of foos that the user has permission to view where groupId = &#63; and urlTitle = &#63; and status = &#63;.
	*
	* @param fooId the primary key of the current foo
	* @param groupId the group ID
	* @param urlTitle the url title
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next foo
	* @throws NoSuchFooException if a foo with the primary key could not be found
	*/
	public static Foo[] filterFindByG_UT_ST_PrevAndNext(long fooId,
		long groupId, java.lang.String urlTitle, int status,
		OrderByComparator<Foo> orderByComparator)
		throws com.liferay.foo.exception.NoSuchFooException {
		return getPersistence()
				   .filterFindByG_UT_ST_PrevAndNext(fooId, groupId, urlTitle,
			status, orderByComparator);
	}

	/**
	* Removes all the foos where groupId = &#63; and urlTitle = &#63; and status = &#63; from the database.
	*
	* @param groupId the group ID
	* @param urlTitle the url title
	* @param status the status
	*/
	public static void removeByG_UT_ST(long groupId, java.lang.String urlTitle,
		int status) {
		getPersistence().removeByG_UT_ST(groupId, urlTitle, status);
	}

	/**
	* Returns the number of foos where groupId = &#63; and urlTitle = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param urlTitle the url title
	* @param status the status
	* @return the number of matching foos
	*/
	public static int countByG_UT_ST(long groupId, java.lang.String urlTitle,
		int status) {
		return getPersistence().countByG_UT_ST(groupId, urlTitle, status);
	}

	/**
	* Returns the number of foos that the user has permission to view where groupId = &#63; and urlTitle = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param urlTitle the url title
	* @param status the status
	* @return the number of matching foos that the user has permission to view
	*/
	public static int filterCountByG_UT_ST(long groupId,
		java.lang.String urlTitle, int status) {
		return getPersistence().filterCountByG_UT_ST(groupId, urlTitle, status);
	}

	/**
	* Returns the foo where groupId = &#63; and urlTitle = &#63; or throws a {@link NoSuchFooException} if it could not be found.
	*
	* @param groupId the group ID
	* @param urlTitle the url title
	* @return the matching foo
	* @throws NoSuchFooException if a matching foo could not be found
	*/
	public static Foo findByG_UT(long groupId, java.lang.String urlTitle)
		throws com.liferay.foo.exception.NoSuchFooException {
		return getPersistence().findByG_UT(groupId, urlTitle);
	}

	/**
	* Returns the foo where groupId = &#63; and urlTitle = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param groupId the group ID
	* @param urlTitle the url title
	* @return the matching foo, or <code>null</code> if a matching foo could not be found
	*/
	public static Foo fetchByG_UT(long groupId, java.lang.String urlTitle) {
		return getPersistence().fetchByG_UT(groupId, urlTitle);
	}

	/**
	* Returns the foo where groupId = &#63; and urlTitle = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param groupId the group ID
	* @param urlTitle the url title
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching foo, or <code>null</code> if a matching foo could not be found
	*/
	public static Foo fetchByG_UT(long groupId, java.lang.String urlTitle,
		boolean retrieveFromCache) {
		return getPersistence().fetchByG_UT(groupId, urlTitle, retrieveFromCache);
	}

	/**
	* Removes the foo where groupId = &#63; and urlTitle = &#63; from the database.
	*
	* @param groupId the group ID
	* @param urlTitle the url title
	* @return the foo that was removed
	*/
	public static Foo removeByG_UT(long groupId, java.lang.String urlTitle)
		throws com.liferay.foo.exception.NoSuchFooException {
		return getPersistence().removeByG_UT(groupId, urlTitle);
	}

	/**
	* Returns the number of foos where groupId = &#63; and urlTitle = &#63;.
	*
	* @param groupId the group ID
	* @param urlTitle the url title
	* @return the number of matching foos
	*/
	public static int countByG_UT(long groupId, java.lang.String urlTitle) {
		return getPersistence().countByG_UT(groupId, urlTitle);
	}

	/**
	* Returns the foo where urlTitle = &#63; or throws a {@link NoSuchFooException} if it could not be found.
	*
	* @param urlTitle the url title
	* @return the matching foo
	* @throws NoSuchFooException if a matching foo could not be found
	*/
	public static Foo findByURLTitle(java.lang.String urlTitle)
		throws com.liferay.foo.exception.NoSuchFooException {
		return getPersistence().findByURLTitle(urlTitle);
	}

	/**
	* Returns the foo where urlTitle = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param urlTitle the url title
	* @return the matching foo, or <code>null</code> if a matching foo could not be found
	*/
	public static Foo fetchByURLTitle(java.lang.String urlTitle) {
		return getPersistence().fetchByURLTitle(urlTitle);
	}

	/**
	* Returns the foo where urlTitle = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param urlTitle the url title
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching foo, or <code>null</code> if a matching foo could not be found
	*/
	public static Foo fetchByURLTitle(java.lang.String urlTitle,
		boolean retrieveFromCache) {
		return getPersistence().fetchByURLTitle(urlTitle, retrieveFromCache);
	}

	/**
	* Removes the foo where urlTitle = &#63; from the database.
	*
	* @param urlTitle the url title
	* @return the foo that was removed
	*/
	public static Foo removeByURLTitle(java.lang.String urlTitle)
		throws com.liferay.foo.exception.NoSuchFooException {
		return getPersistence().removeByURLTitle(urlTitle);
	}

	/**
	* Returns the number of foos where urlTitle = &#63;.
	*
	* @param urlTitle the url title
	* @return the number of matching foos
	*/
	public static int countByURLTitle(java.lang.String urlTitle) {
		return getPersistence().countByURLTitle(urlTitle);
	}

	/**
	* Returns all the foos where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the matching foos
	*/
	public static List<Foo> findByGroupId(long groupId) {
		return getPersistence().findByGroupId(groupId);
	}

	/**
	* Returns a range of all the foos where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FooModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of foos
	* @param end the upper bound of the range of foos (not inclusive)
	* @return the range of matching foos
	*/
	public static List<Foo> findByGroupId(long groupId, int start, int end) {
		return getPersistence().findByGroupId(groupId, start, end);
	}

	/**
	* Returns an ordered range of all the foos where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FooModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of foos
	* @param end the upper bound of the range of foos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching foos
	*/
	public static List<Foo> findByGroupId(long groupId, int start, int end,
		OrderByComparator<Foo> orderByComparator) {
		return getPersistence()
				   .findByGroupId(groupId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the foos where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FooModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of foos
	* @param end the upper bound of the range of foos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching foos
	*/
	public static List<Foo> findByGroupId(long groupId, int start, int end,
		OrderByComparator<Foo> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findByGroupId(groupId, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first foo in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching foo
	* @throws NoSuchFooException if a matching foo could not be found
	*/
	public static Foo findByGroupId_First(long groupId,
		OrderByComparator<Foo> orderByComparator)
		throws com.liferay.foo.exception.NoSuchFooException {
		return getPersistence().findByGroupId_First(groupId, orderByComparator);
	}

	/**
	* Returns the first foo in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching foo, or <code>null</code> if a matching foo could not be found
	*/
	public static Foo fetchByGroupId_First(long groupId,
		OrderByComparator<Foo> orderByComparator) {
		return getPersistence().fetchByGroupId_First(groupId, orderByComparator);
	}

	/**
	* Returns the last foo in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching foo
	* @throws NoSuchFooException if a matching foo could not be found
	*/
	public static Foo findByGroupId_Last(long groupId,
		OrderByComparator<Foo> orderByComparator)
		throws com.liferay.foo.exception.NoSuchFooException {
		return getPersistence().findByGroupId_Last(groupId, orderByComparator);
	}

	/**
	* Returns the last foo in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching foo, or <code>null</code> if a matching foo could not be found
	*/
	public static Foo fetchByGroupId_Last(long groupId,
		OrderByComparator<Foo> orderByComparator) {
		return getPersistence().fetchByGroupId_Last(groupId, orderByComparator);
	}

	/**
	* Returns the foos before and after the current foo in the ordered set where groupId = &#63;.
	*
	* @param fooId the primary key of the current foo
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next foo
	* @throws NoSuchFooException if a foo with the primary key could not be found
	*/
	public static Foo[] findByGroupId_PrevAndNext(long fooId, long groupId,
		OrderByComparator<Foo> orderByComparator)
		throws com.liferay.foo.exception.NoSuchFooException {
		return getPersistence()
				   .findByGroupId_PrevAndNext(fooId, groupId, orderByComparator);
	}

	/**
	* Returns all the foos that the user has permission to view where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the matching foos that the user has permission to view
	*/
	public static List<Foo> filterFindByGroupId(long groupId) {
		return getPersistence().filterFindByGroupId(groupId);
	}

	/**
	* Returns a range of all the foos that the user has permission to view where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FooModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of foos
	* @param end the upper bound of the range of foos (not inclusive)
	* @return the range of matching foos that the user has permission to view
	*/
	public static List<Foo> filterFindByGroupId(long groupId, int start, int end) {
		return getPersistence().filterFindByGroupId(groupId, start, end);
	}

	/**
	* Returns an ordered range of all the foos that the user has permissions to view where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FooModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of foos
	* @param end the upper bound of the range of foos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching foos that the user has permission to view
	*/
	public static List<Foo> filterFindByGroupId(long groupId, int start,
		int end, OrderByComparator<Foo> orderByComparator) {
		return getPersistence()
				   .filterFindByGroupId(groupId, start, end, orderByComparator);
	}

	/**
	* Returns the foos before and after the current foo in the ordered set of foos that the user has permission to view where groupId = &#63;.
	*
	* @param fooId the primary key of the current foo
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next foo
	* @throws NoSuchFooException if a foo with the primary key could not be found
	*/
	public static Foo[] filterFindByGroupId_PrevAndNext(long fooId,
		long groupId, OrderByComparator<Foo> orderByComparator)
		throws com.liferay.foo.exception.NoSuchFooException {
		return getPersistence()
				   .filterFindByGroupId_PrevAndNext(fooId, groupId,
			orderByComparator);
	}

	/**
	* Removes all the foos where groupId = &#63; from the database.
	*
	* @param groupId the group ID
	*/
	public static void removeByGroupId(long groupId) {
		getPersistence().removeByGroupId(groupId);
	}

	/**
	* Returns the number of foos where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the number of matching foos
	*/
	public static int countByGroupId(long groupId) {
		return getPersistence().countByGroupId(groupId);
	}

	/**
	* Returns the number of foos that the user has permission to view where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the number of matching foos that the user has permission to view
	*/
	public static int filterCountByGroupId(long groupId) {
		return getPersistence().filterCountByGroupId(groupId);
	}

	/**
	* Returns all the foos where userId = &#63; and groupId = &#63;.
	*
	* @param userId the user ID
	* @param groupId the group ID
	* @return the matching foos
	*/
	public static List<Foo> findByUserIdGroupId(long userId, long groupId) {
		return getPersistence().findByUserIdGroupId(userId, groupId);
	}

	/**
	* Returns a range of all the foos where userId = &#63; and groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FooModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param groupId the group ID
	* @param start the lower bound of the range of foos
	* @param end the upper bound of the range of foos (not inclusive)
	* @return the range of matching foos
	*/
	public static List<Foo> findByUserIdGroupId(long userId, long groupId,
		int start, int end) {
		return getPersistence().findByUserIdGroupId(userId, groupId, start, end);
	}

	/**
	* Returns an ordered range of all the foos where userId = &#63; and groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FooModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param groupId the group ID
	* @param start the lower bound of the range of foos
	* @param end the upper bound of the range of foos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching foos
	*/
	public static List<Foo> findByUserIdGroupId(long userId, long groupId,
		int start, int end, OrderByComparator<Foo> orderByComparator) {
		return getPersistence()
				   .findByUserIdGroupId(userId, groupId, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the foos where userId = &#63; and groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FooModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param groupId the group ID
	* @param start the lower bound of the range of foos
	* @param end the upper bound of the range of foos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching foos
	*/
	public static List<Foo> findByUserIdGroupId(long userId, long groupId,
		int start, int end, OrderByComparator<Foo> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByUserIdGroupId(userId, groupId, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first foo in the ordered set where userId = &#63; and groupId = &#63;.
	*
	* @param userId the user ID
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching foo
	* @throws NoSuchFooException if a matching foo could not be found
	*/
	public static Foo findByUserIdGroupId_First(long userId, long groupId,
		OrderByComparator<Foo> orderByComparator)
		throws com.liferay.foo.exception.NoSuchFooException {
		return getPersistence()
				   .findByUserIdGroupId_First(userId, groupId, orderByComparator);
	}

	/**
	* Returns the first foo in the ordered set where userId = &#63; and groupId = &#63;.
	*
	* @param userId the user ID
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching foo, or <code>null</code> if a matching foo could not be found
	*/
	public static Foo fetchByUserIdGroupId_First(long userId, long groupId,
		OrderByComparator<Foo> orderByComparator) {
		return getPersistence()
				   .fetchByUserIdGroupId_First(userId, groupId,
			orderByComparator);
	}

	/**
	* Returns the last foo in the ordered set where userId = &#63; and groupId = &#63;.
	*
	* @param userId the user ID
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching foo
	* @throws NoSuchFooException if a matching foo could not be found
	*/
	public static Foo findByUserIdGroupId_Last(long userId, long groupId,
		OrderByComparator<Foo> orderByComparator)
		throws com.liferay.foo.exception.NoSuchFooException {
		return getPersistence()
				   .findByUserIdGroupId_Last(userId, groupId, orderByComparator);
	}

	/**
	* Returns the last foo in the ordered set where userId = &#63; and groupId = &#63;.
	*
	* @param userId the user ID
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching foo, or <code>null</code> if a matching foo could not be found
	*/
	public static Foo fetchByUserIdGroupId_Last(long userId, long groupId,
		OrderByComparator<Foo> orderByComparator) {
		return getPersistence()
				   .fetchByUserIdGroupId_Last(userId, groupId, orderByComparator);
	}

	/**
	* Returns the foos before and after the current foo in the ordered set where userId = &#63; and groupId = &#63;.
	*
	* @param fooId the primary key of the current foo
	* @param userId the user ID
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next foo
	* @throws NoSuchFooException if a foo with the primary key could not be found
	*/
	public static Foo[] findByUserIdGroupId_PrevAndNext(long fooId,
		long userId, long groupId, OrderByComparator<Foo> orderByComparator)
		throws com.liferay.foo.exception.NoSuchFooException {
		return getPersistence()
				   .findByUserIdGroupId_PrevAndNext(fooId, userId, groupId,
			orderByComparator);
	}

	/**
	* Returns all the foos that the user has permission to view where userId = &#63; and groupId = &#63;.
	*
	* @param userId the user ID
	* @param groupId the group ID
	* @return the matching foos that the user has permission to view
	*/
	public static List<Foo> filterFindByUserIdGroupId(long userId, long groupId) {
		return getPersistence().filterFindByUserIdGroupId(userId, groupId);
	}

	/**
	* Returns a range of all the foos that the user has permission to view where userId = &#63; and groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FooModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param groupId the group ID
	* @param start the lower bound of the range of foos
	* @param end the upper bound of the range of foos (not inclusive)
	* @return the range of matching foos that the user has permission to view
	*/
	public static List<Foo> filterFindByUserIdGroupId(long userId,
		long groupId, int start, int end) {
		return getPersistence()
				   .filterFindByUserIdGroupId(userId, groupId, start, end);
	}

	/**
	* Returns an ordered range of all the foos that the user has permissions to view where userId = &#63; and groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FooModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param groupId the group ID
	* @param start the lower bound of the range of foos
	* @param end the upper bound of the range of foos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching foos that the user has permission to view
	*/
	public static List<Foo> filterFindByUserIdGroupId(long userId,
		long groupId, int start, int end,
		OrderByComparator<Foo> orderByComparator) {
		return getPersistence()
				   .filterFindByUserIdGroupId(userId, groupId, start, end,
			orderByComparator);
	}

	/**
	* Returns the foos before and after the current foo in the ordered set of foos that the user has permission to view where userId = &#63; and groupId = &#63;.
	*
	* @param fooId the primary key of the current foo
	* @param userId the user ID
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next foo
	* @throws NoSuchFooException if a foo with the primary key could not be found
	*/
	public static Foo[] filterFindByUserIdGroupId_PrevAndNext(long fooId,
		long userId, long groupId, OrderByComparator<Foo> orderByComparator)
		throws com.liferay.foo.exception.NoSuchFooException {
		return getPersistence()
				   .filterFindByUserIdGroupId_PrevAndNext(fooId, userId,
			groupId, orderByComparator);
	}

	/**
	* Removes all the foos where userId = &#63; and groupId = &#63; from the database.
	*
	* @param userId the user ID
	* @param groupId the group ID
	*/
	public static void removeByUserIdGroupId(long userId, long groupId) {
		getPersistence().removeByUserIdGroupId(userId, groupId);
	}

	/**
	* Returns the number of foos where userId = &#63; and groupId = &#63;.
	*
	* @param userId the user ID
	* @param groupId the group ID
	* @return the number of matching foos
	*/
	public static int countByUserIdGroupId(long userId, long groupId) {
		return getPersistence().countByUserIdGroupId(userId, groupId);
	}

	/**
	* Returns the number of foos that the user has permission to view where userId = &#63; and groupId = &#63;.
	*
	* @param userId the user ID
	* @param groupId the group ID
	* @return the number of matching foos that the user has permission to view
	*/
	public static int filterCountByUserIdGroupId(long userId, long groupId) {
		return getPersistence().filterCountByUserIdGroupId(userId, groupId);
	}

	/**
	* Returns all the foos where userId = &#63;.
	*
	* @param userId the user ID
	* @return the matching foos
	*/
	public static List<Foo> findByUserId(long userId) {
		return getPersistence().findByUserId(userId);
	}

	/**
	* Returns a range of all the foos where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FooModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param start the lower bound of the range of foos
	* @param end the upper bound of the range of foos (not inclusive)
	* @return the range of matching foos
	*/
	public static List<Foo> findByUserId(long userId, int start, int end) {
		return getPersistence().findByUserId(userId, start, end);
	}

	/**
	* Returns an ordered range of all the foos where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FooModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param start the lower bound of the range of foos
	* @param end the upper bound of the range of foos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching foos
	*/
	public static List<Foo> findByUserId(long userId, int start, int end,
		OrderByComparator<Foo> orderByComparator) {
		return getPersistence()
				   .findByUserId(userId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the foos where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FooModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param start the lower bound of the range of foos
	* @param end the upper bound of the range of foos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching foos
	*/
	public static List<Foo> findByUserId(long userId, int start, int end,
		OrderByComparator<Foo> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findByUserId(userId, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first foo in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching foo
	* @throws NoSuchFooException if a matching foo could not be found
	*/
	public static Foo findByUserId_First(long userId,
		OrderByComparator<Foo> orderByComparator)
		throws com.liferay.foo.exception.NoSuchFooException {
		return getPersistence().findByUserId_First(userId, orderByComparator);
	}

	/**
	* Returns the first foo in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching foo, or <code>null</code> if a matching foo could not be found
	*/
	public static Foo fetchByUserId_First(long userId,
		OrderByComparator<Foo> orderByComparator) {
		return getPersistence().fetchByUserId_First(userId, orderByComparator);
	}

	/**
	* Returns the last foo in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching foo
	* @throws NoSuchFooException if a matching foo could not be found
	*/
	public static Foo findByUserId_Last(long userId,
		OrderByComparator<Foo> orderByComparator)
		throws com.liferay.foo.exception.NoSuchFooException {
		return getPersistence().findByUserId_Last(userId, orderByComparator);
	}

	/**
	* Returns the last foo in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching foo, or <code>null</code> if a matching foo could not be found
	*/
	public static Foo fetchByUserId_Last(long userId,
		OrderByComparator<Foo> orderByComparator) {
		return getPersistence().fetchByUserId_Last(userId, orderByComparator);
	}

	/**
	* Returns the foos before and after the current foo in the ordered set where userId = &#63;.
	*
	* @param fooId the primary key of the current foo
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next foo
	* @throws NoSuchFooException if a foo with the primary key could not be found
	*/
	public static Foo[] findByUserId_PrevAndNext(long fooId, long userId,
		OrderByComparator<Foo> orderByComparator)
		throws com.liferay.foo.exception.NoSuchFooException {
		return getPersistence()
				   .findByUserId_PrevAndNext(fooId, userId, orderByComparator);
	}

	/**
	* Removes all the foos where userId = &#63; from the database.
	*
	* @param userId the user ID
	*/
	public static void removeByUserId(long userId) {
		getPersistence().removeByUserId(userId);
	}

	/**
	* Returns the number of foos where userId = &#63;.
	*
	* @param userId the user ID
	* @return the number of matching foos
	*/
	public static int countByUserId(long userId) {
		return getPersistence().countByUserId(userId);
	}

	/**
	* Returns all the foos where companyId = &#63;.
	*
	* @param companyId the company ID
	* @return the matching foos
	*/
	public static List<Foo> findByCompanyId(long companyId) {
		return getPersistence().findByCompanyId(companyId);
	}

	/**
	* Returns a range of all the foos where companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FooModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param start the lower bound of the range of foos
	* @param end the upper bound of the range of foos (not inclusive)
	* @return the range of matching foos
	*/
	public static List<Foo> findByCompanyId(long companyId, int start, int end) {
		return getPersistence().findByCompanyId(companyId, start, end);
	}

	/**
	* Returns an ordered range of all the foos where companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FooModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param start the lower bound of the range of foos
	* @param end the upper bound of the range of foos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching foos
	*/
	public static List<Foo> findByCompanyId(long companyId, int start, int end,
		OrderByComparator<Foo> orderByComparator) {
		return getPersistence()
				   .findByCompanyId(companyId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the foos where companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FooModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param start the lower bound of the range of foos
	* @param end the upper bound of the range of foos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching foos
	*/
	public static List<Foo> findByCompanyId(long companyId, int start, int end,
		OrderByComparator<Foo> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findByCompanyId(companyId, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first foo in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching foo
	* @throws NoSuchFooException if a matching foo could not be found
	*/
	public static Foo findByCompanyId_First(long companyId,
		OrderByComparator<Foo> orderByComparator)
		throws com.liferay.foo.exception.NoSuchFooException {
		return getPersistence()
				   .findByCompanyId_First(companyId, orderByComparator);
	}

	/**
	* Returns the first foo in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching foo, or <code>null</code> if a matching foo could not be found
	*/
	public static Foo fetchByCompanyId_First(long companyId,
		OrderByComparator<Foo> orderByComparator) {
		return getPersistence()
				   .fetchByCompanyId_First(companyId, orderByComparator);
	}

	/**
	* Returns the last foo in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching foo
	* @throws NoSuchFooException if a matching foo could not be found
	*/
	public static Foo findByCompanyId_Last(long companyId,
		OrderByComparator<Foo> orderByComparator)
		throws com.liferay.foo.exception.NoSuchFooException {
		return getPersistence()
				   .findByCompanyId_Last(companyId, orderByComparator);
	}

	/**
	* Returns the last foo in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching foo, or <code>null</code> if a matching foo could not be found
	*/
	public static Foo fetchByCompanyId_Last(long companyId,
		OrderByComparator<Foo> orderByComparator) {
		return getPersistence()
				   .fetchByCompanyId_Last(companyId, orderByComparator);
	}

	/**
	* Returns the foos before and after the current foo in the ordered set where companyId = &#63;.
	*
	* @param fooId the primary key of the current foo
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next foo
	* @throws NoSuchFooException if a foo with the primary key could not be found
	*/
	public static Foo[] findByCompanyId_PrevAndNext(long fooId, long companyId,
		OrderByComparator<Foo> orderByComparator)
		throws com.liferay.foo.exception.NoSuchFooException {
		return getPersistence()
				   .findByCompanyId_PrevAndNext(fooId, companyId,
			orderByComparator);
	}

	/**
	* Removes all the foos where companyId = &#63; from the database.
	*
	* @param companyId the company ID
	*/
	public static void removeByCompanyId(long companyId) {
		getPersistence().removeByCompanyId(companyId);
	}

	/**
	* Returns the number of foos where companyId = &#63;.
	*
	* @param companyId the company ID
	* @return the number of matching foos
	*/
	public static int countByCompanyId(long companyId) {
		return getPersistence().countByCompanyId(companyId);
	}

	/**
	* Returns all the foos where fooId = &#63;.
	*
	* @param fooId the foo ID
	* @return the matching foos
	*/
	public static List<Foo> findByFooId(long fooId) {
		return getPersistence().findByFooId(fooId);
	}

	/**
	* Returns a range of all the foos where fooId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FooModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param fooId the foo ID
	* @param start the lower bound of the range of foos
	* @param end the upper bound of the range of foos (not inclusive)
	* @return the range of matching foos
	*/
	public static List<Foo> findByFooId(long fooId, int start, int end) {
		return getPersistence().findByFooId(fooId, start, end);
	}

	/**
	* Returns an ordered range of all the foos where fooId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FooModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param fooId the foo ID
	* @param start the lower bound of the range of foos
	* @param end the upper bound of the range of foos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching foos
	*/
	public static List<Foo> findByFooId(long fooId, int start, int end,
		OrderByComparator<Foo> orderByComparator) {
		return getPersistence().findByFooId(fooId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the foos where fooId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FooModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param fooId the foo ID
	* @param start the lower bound of the range of foos
	* @param end the upper bound of the range of foos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching foos
	*/
	public static List<Foo> findByFooId(long fooId, int start, int end,
		OrderByComparator<Foo> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findByFooId(fooId, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first foo in the ordered set where fooId = &#63;.
	*
	* @param fooId the foo ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching foo
	* @throws NoSuchFooException if a matching foo could not be found
	*/
	public static Foo findByFooId_First(long fooId,
		OrderByComparator<Foo> orderByComparator)
		throws com.liferay.foo.exception.NoSuchFooException {
		return getPersistence().findByFooId_First(fooId, orderByComparator);
	}

	/**
	* Returns the first foo in the ordered set where fooId = &#63;.
	*
	* @param fooId the foo ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching foo, or <code>null</code> if a matching foo could not be found
	*/
	public static Foo fetchByFooId_First(long fooId,
		OrderByComparator<Foo> orderByComparator) {
		return getPersistence().fetchByFooId_First(fooId, orderByComparator);
	}

	/**
	* Returns the last foo in the ordered set where fooId = &#63;.
	*
	* @param fooId the foo ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching foo
	* @throws NoSuchFooException if a matching foo could not be found
	*/
	public static Foo findByFooId_Last(long fooId,
		OrderByComparator<Foo> orderByComparator)
		throws com.liferay.foo.exception.NoSuchFooException {
		return getPersistence().findByFooId_Last(fooId, orderByComparator);
	}

	/**
	* Returns the last foo in the ordered set where fooId = &#63;.
	*
	* @param fooId the foo ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching foo, or <code>null</code> if a matching foo could not be found
	*/
	public static Foo fetchByFooId_Last(long fooId,
		OrderByComparator<Foo> orderByComparator) {
		return getPersistence().fetchByFooId_Last(fooId, orderByComparator);
	}

	/**
	* Removes all the foos where fooId = &#63; from the database.
	*
	* @param fooId the foo ID
	*/
	public static void removeByFooId(long fooId) {
		getPersistence().removeByFooId(fooId);
	}

	/**
	* Returns the number of foos where fooId = &#63;.
	*
	* @param fooId the foo ID
	* @return the number of matching foos
	*/
	public static int countByFooId(long fooId) {
		return getPersistence().countByFooId(fooId);
	}

	/**
	* Returns all the foos where title = &#63;.
	*
	* @param title the title
	* @return the matching foos
	*/
	public static List<Foo> findByTitle(java.lang.String title) {
		return getPersistence().findByTitle(title);
	}

	/**
	* Returns a range of all the foos where title = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FooModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param title the title
	* @param start the lower bound of the range of foos
	* @param end the upper bound of the range of foos (not inclusive)
	* @return the range of matching foos
	*/
	public static List<Foo> findByTitle(java.lang.String title, int start,
		int end) {
		return getPersistence().findByTitle(title, start, end);
	}

	/**
	* Returns an ordered range of all the foos where title = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FooModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param title the title
	* @param start the lower bound of the range of foos
	* @param end the upper bound of the range of foos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching foos
	*/
	public static List<Foo> findByTitle(java.lang.String title, int start,
		int end, OrderByComparator<Foo> orderByComparator) {
		return getPersistence().findByTitle(title, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the foos where title = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FooModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param title the title
	* @param start the lower bound of the range of foos
	* @param end the upper bound of the range of foos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching foos
	*/
	public static List<Foo> findByTitle(java.lang.String title, int start,
		int end, OrderByComparator<Foo> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByTitle(title, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first foo in the ordered set where title = &#63;.
	*
	* @param title the title
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching foo
	* @throws NoSuchFooException if a matching foo could not be found
	*/
	public static Foo findByTitle_First(java.lang.String title,
		OrderByComparator<Foo> orderByComparator)
		throws com.liferay.foo.exception.NoSuchFooException {
		return getPersistence().findByTitle_First(title, orderByComparator);
	}

	/**
	* Returns the first foo in the ordered set where title = &#63;.
	*
	* @param title the title
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching foo, or <code>null</code> if a matching foo could not be found
	*/
	public static Foo fetchByTitle_First(java.lang.String title,
		OrderByComparator<Foo> orderByComparator) {
		return getPersistence().fetchByTitle_First(title, orderByComparator);
	}

	/**
	* Returns the last foo in the ordered set where title = &#63;.
	*
	* @param title the title
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching foo
	* @throws NoSuchFooException if a matching foo could not be found
	*/
	public static Foo findByTitle_Last(java.lang.String title,
		OrderByComparator<Foo> orderByComparator)
		throws com.liferay.foo.exception.NoSuchFooException {
		return getPersistence().findByTitle_Last(title, orderByComparator);
	}

	/**
	* Returns the last foo in the ordered set where title = &#63;.
	*
	* @param title the title
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching foo, or <code>null</code> if a matching foo could not be found
	*/
	public static Foo fetchByTitle_Last(java.lang.String title,
		OrderByComparator<Foo> orderByComparator) {
		return getPersistence().fetchByTitle_Last(title, orderByComparator);
	}

	/**
	* Returns the foos before and after the current foo in the ordered set where title = &#63;.
	*
	* @param fooId the primary key of the current foo
	* @param title the title
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next foo
	* @throws NoSuchFooException if a foo with the primary key could not be found
	*/
	public static Foo[] findByTitle_PrevAndNext(long fooId,
		java.lang.String title, OrderByComparator<Foo> orderByComparator)
		throws com.liferay.foo.exception.NoSuchFooException {
		return getPersistence()
				   .findByTitle_PrevAndNext(fooId, title, orderByComparator);
	}

	/**
	* Removes all the foos where title = &#63; from the database.
	*
	* @param title the title
	*/
	public static void removeByTitle(java.lang.String title) {
		getPersistence().removeByTitle(title);
	}

	/**
	* Returns the number of foos where title = &#63;.
	*
	* @param title the title
	* @return the number of matching foos
	*/
	public static int countByTitle(java.lang.String title) {
		return getPersistence().countByTitle(title);
	}

	/**
	* Returns all the foos where fooBooleanStat = &#63;.
	*
	* @param fooBooleanStat the foo boolean stat
	* @return the matching foos
	*/
	public static List<Foo> findByFooBooleanStat(boolean fooBooleanStat) {
		return getPersistence().findByFooBooleanStat(fooBooleanStat);
	}

	/**
	* Returns a range of all the foos where fooBooleanStat = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FooModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param fooBooleanStat the foo boolean stat
	* @param start the lower bound of the range of foos
	* @param end the upper bound of the range of foos (not inclusive)
	* @return the range of matching foos
	*/
	public static List<Foo> findByFooBooleanStat(boolean fooBooleanStat,
		int start, int end) {
		return getPersistence().findByFooBooleanStat(fooBooleanStat, start, end);
	}

	/**
	* Returns an ordered range of all the foos where fooBooleanStat = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FooModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param fooBooleanStat the foo boolean stat
	* @param start the lower bound of the range of foos
	* @param end the upper bound of the range of foos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching foos
	*/
	public static List<Foo> findByFooBooleanStat(boolean fooBooleanStat,
		int start, int end, OrderByComparator<Foo> orderByComparator) {
		return getPersistence()
				   .findByFooBooleanStat(fooBooleanStat, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the foos where fooBooleanStat = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FooModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param fooBooleanStat the foo boolean stat
	* @param start the lower bound of the range of foos
	* @param end the upper bound of the range of foos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching foos
	*/
	public static List<Foo> findByFooBooleanStat(boolean fooBooleanStat,
		int start, int end, OrderByComparator<Foo> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByFooBooleanStat(fooBooleanStat, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first foo in the ordered set where fooBooleanStat = &#63;.
	*
	* @param fooBooleanStat the foo boolean stat
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching foo
	* @throws NoSuchFooException if a matching foo could not be found
	*/
	public static Foo findByFooBooleanStat_First(boolean fooBooleanStat,
		OrderByComparator<Foo> orderByComparator)
		throws com.liferay.foo.exception.NoSuchFooException {
		return getPersistence()
				   .findByFooBooleanStat_First(fooBooleanStat, orderByComparator);
	}

	/**
	* Returns the first foo in the ordered set where fooBooleanStat = &#63;.
	*
	* @param fooBooleanStat the foo boolean stat
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching foo, or <code>null</code> if a matching foo could not be found
	*/
	public static Foo fetchByFooBooleanStat_First(boolean fooBooleanStat,
		OrderByComparator<Foo> orderByComparator) {
		return getPersistence()
				   .fetchByFooBooleanStat_First(fooBooleanStat,
			orderByComparator);
	}

	/**
	* Returns the last foo in the ordered set where fooBooleanStat = &#63;.
	*
	* @param fooBooleanStat the foo boolean stat
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching foo
	* @throws NoSuchFooException if a matching foo could not be found
	*/
	public static Foo findByFooBooleanStat_Last(boolean fooBooleanStat,
		OrderByComparator<Foo> orderByComparator)
		throws com.liferay.foo.exception.NoSuchFooException {
		return getPersistence()
				   .findByFooBooleanStat_Last(fooBooleanStat, orderByComparator);
	}

	/**
	* Returns the last foo in the ordered set where fooBooleanStat = &#63;.
	*
	* @param fooBooleanStat the foo boolean stat
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching foo, or <code>null</code> if a matching foo could not be found
	*/
	public static Foo fetchByFooBooleanStat_Last(boolean fooBooleanStat,
		OrderByComparator<Foo> orderByComparator) {
		return getPersistence()
				   .fetchByFooBooleanStat_Last(fooBooleanStat, orderByComparator);
	}

	/**
	* Returns the foos before and after the current foo in the ordered set where fooBooleanStat = &#63;.
	*
	* @param fooId the primary key of the current foo
	* @param fooBooleanStat the foo boolean stat
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next foo
	* @throws NoSuchFooException if a foo with the primary key could not be found
	*/
	public static Foo[] findByFooBooleanStat_PrevAndNext(long fooId,
		boolean fooBooleanStat, OrderByComparator<Foo> orderByComparator)
		throws com.liferay.foo.exception.NoSuchFooException {
		return getPersistence()
				   .findByFooBooleanStat_PrevAndNext(fooId, fooBooleanStat,
			orderByComparator);
	}

	/**
	* Removes all the foos where fooBooleanStat = &#63; from the database.
	*
	* @param fooBooleanStat the foo boolean stat
	*/
	public static void removeByFooBooleanStat(boolean fooBooleanStat) {
		getPersistence().removeByFooBooleanStat(fooBooleanStat);
	}

	/**
	* Returns the number of foos where fooBooleanStat = &#63;.
	*
	* @param fooBooleanStat the foo boolean stat
	* @return the number of matching foos
	*/
	public static int countByFooBooleanStat(boolean fooBooleanStat) {
		return getPersistence().countByFooBooleanStat(fooBooleanStat);
	}

	/**
	* Returns all the foos where fooDateTime = &#63;.
	*
	* @param fooDateTime the foo date time
	* @return the matching foos
	*/
	public static List<Foo> findByFooDateTime(Date fooDateTime) {
		return getPersistence().findByFooDateTime(fooDateTime);
	}

	/**
	* Returns a range of all the foos where fooDateTime = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FooModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param fooDateTime the foo date time
	* @param start the lower bound of the range of foos
	* @param end the upper bound of the range of foos (not inclusive)
	* @return the range of matching foos
	*/
	public static List<Foo> findByFooDateTime(Date fooDateTime, int start,
		int end) {
		return getPersistence().findByFooDateTime(fooDateTime, start, end);
	}

	/**
	* Returns an ordered range of all the foos where fooDateTime = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FooModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param fooDateTime the foo date time
	* @param start the lower bound of the range of foos
	* @param end the upper bound of the range of foos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching foos
	*/
	public static List<Foo> findByFooDateTime(Date fooDateTime, int start,
		int end, OrderByComparator<Foo> orderByComparator) {
		return getPersistence()
				   .findByFooDateTime(fooDateTime, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the foos where fooDateTime = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FooModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param fooDateTime the foo date time
	* @param start the lower bound of the range of foos
	* @param end the upper bound of the range of foos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching foos
	*/
	public static List<Foo> findByFooDateTime(Date fooDateTime, int start,
		int end, OrderByComparator<Foo> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByFooDateTime(fooDateTime, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first foo in the ordered set where fooDateTime = &#63;.
	*
	* @param fooDateTime the foo date time
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching foo
	* @throws NoSuchFooException if a matching foo could not be found
	*/
	public static Foo findByFooDateTime_First(Date fooDateTime,
		OrderByComparator<Foo> orderByComparator)
		throws com.liferay.foo.exception.NoSuchFooException {
		return getPersistence()
				   .findByFooDateTime_First(fooDateTime, orderByComparator);
	}

	/**
	* Returns the first foo in the ordered set where fooDateTime = &#63;.
	*
	* @param fooDateTime the foo date time
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching foo, or <code>null</code> if a matching foo could not be found
	*/
	public static Foo fetchByFooDateTime_First(Date fooDateTime,
		OrderByComparator<Foo> orderByComparator) {
		return getPersistence()
				   .fetchByFooDateTime_First(fooDateTime, orderByComparator);
	}

	/**
	* Returns the last foo in the ordered set where fooDateTime = &#63;.
	*
	* @param fooDateTime the foo date time
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching foo
	* @throws NoSuchFooException if a matching foo could not be found
	*/
	public static Foo findByFooDateTime_Last(Date fooDateTime,
		OrderByComparator<Foo> orderByComparator)
		throws com.liferay.foo.exception.NoSuchFooException {
		return getPersistence()
				   .findByFooDateTime_Last(fooDateTime, orderByComparator);
	}

	/**
	* Returns the last foo in the ordered set where fooDateTime = &#63;.
	*
	* @param fooDateTime the foo date time
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching foo, or <code>null</code> if a matching foo could not be found
	*/
	public static Foo fetchByFooDateTime_Last(Date fooDateTime,
		OrderByComparator<Foo> orderByComparator) {
		return getPersistence()
				   .fetchByFooDateTime_Last(fooDateTime, orderByComparator);
	}

	/**
	* Returns the foos before and after the current foo in the ordered set where fooDateTime = &#63;.
	*
	* @param fooId the primary key of the current foo
	* @param fooDateTime the foo date time
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next foo
	* @throws NoSuchFooException if a foo with the primary key could not be found
	*/
	public static Foo[] findByFooDateTime_PrevAndNext(long fooId,
		Date fooDateTime, OrderByComparator<Foo> orderByComparator)
		throws com.liferay.foo.exception.NoSuchFooException {
		return getPersistence()
				   .findByFooDateTime_PrevAndNext(fooId, fooDateTime,
			orderByComparator);
	}

	/**
	* Removes all the foos where fooDateTime = &#63; from the database.
	*
	* @param fooDateTime the foo date time
	*/
	public static void removeByFooDateTime(Date fooDateTime) {
		getPersistence().removeByFooDateTime(fooDateTime);
	}

	/**
	* Returns the number of foos where fooDateTime = &#63;.
	*
	* @param fooDateTime the foo date time
	* @return the number of matching foos
	*/
	public static int countByFooDateTime(Date fooDateTime) {
		return getPersistence().countByFooDateTime(fooDateTime);
	}

	/**
	* Returns all the foos where fooDocumentLibrary = &#63;.
	*
	* @param fooDocumentLibrary the foo document library
	* @return the matching foos
	*/
	public static List<Foo> findByFooDocumentLibrary(
		java.lang.String fooDocumentLibrary) {
		return getPersistence().findByFooDocumentLibrary(fooDocumentLibrary);
	}

	/**
	* Returns a range of all the foos where fooDocumentLibrary = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FooModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param fooDocumentLibrary the foo document library
	* @param start the lower bound of the range of foos
	* @param end the upper bound of the range of foos (not inclusive)
	* @return the range of matching foos
	*/
	public static List<Foo> findByFooDocumentLibrary(
		java.lang.String fooDocumentLibrary, int start, int end) {
		return getPersistence()
				   .findByFooDocumentLibrary(fooDocumentLibrary, start, end);
	}

	/**
	* Returns an ordered range of all the foos where fooDocumentLibrary = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FooModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param fooDocumentLibrary the foo document library
	* @param start the lower bound of the range of foos
	* @param end the upper bound of the range of foos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching foos
	*/
	public static List<Foo> findByFooDocumentLibrary(
		java.lang.String fooDocumentLibrary, int start, int end,
		OrderByComparator<Foo> orderByComparator) {
		return getPersistence()
				   .findByFooDocumentLibrary(fooDocumentLibrary, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the foos where fooDocumentLibrary = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FooModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param fooDocumentLibrary the foo document library
	* @param start the lower bound of the range of foos
	* @param end the upper bound of the range of foos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching foos
	*/
	public static List<Foo> findByFooDocumentLibrary(
		java.lang.String fooDocumentLibrary, int start, int end,
		OrderByComparator<Foo> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findByFooDocumentLibrary(fooDocumentLibrary, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first foo in the ordered set where fooDocumentLibrary = &#63;.
	*
	* @param fooDocumentLibrary the foo document library
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching foo
	* @throws NoSuchFooException if a matching foo could not be found
	*/
	public static Foo findByFooDocumentLibrary_First(
		java.lang.String fooDocumentLibrary,
		OrderByComparator<Foo> orderByComparator)
		throws com.liferay.foo.exception.NoSuchFooException {
		return getPersistence()
				   .findByFooDocumentLibrary_First(fooDocumentLibrary,
			orderByComparator);
	}

	/**
	* Returns the first foo in the ordered set where fooDocumentLibrary = &#63;.
	*
	* @param fooDocumentLibrary the foo document library
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching foo, or <code>null</code> if a matching foo could not be found
	*/
	public static Foo fetchByFooDocumentLibrary_First(
		java.lang.String fooDocumentLibrary,
		OrderByComparator<Foo> orderByComparator) {
		return getPersistence()
				   .fetchByFooDocumentLibrary_First(fooDocumentLibrary,
			orderByComparator);
	}

	/**
	* Returns the last foo in the ordered set where fooDocumentLibrary = &#63;.
	*
	* @param fooDocumentLibrary the foo document library
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching foo
	* @throws NoSuchFooException if a matching foo could not be found
	*/
	public static Foo findByFooDocumentLibrary_Last(
		java.lang.String fooDocumentLibrary,
		OrderByComparator<Foo> orderByComparator)
		throws com.liferay.foo.exception.NoSuchFooException {
		return getPersistence()
				   .findByFooDocumentLibrary_Last(fooDocumentLibrary,
			orderByComparator);
	}

	/**
	* Returns the last foo in the ordered set where fooDocumentLibrary = &#63;.
	*
	* @param fooDocumentLibrary the foo document library
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching foo, or <code>null</code> if a matching foo could not be found
	*/
	public static Foo fetchByFooDocumentLibrary_Last(
		java.lang.String fooDocumentLibrary,
		OrderByComparator<Foo> orderByComparator) {
		return getPersistence()
				   .fetchByFooDocumentLibrary_Last(fooDocumentLibrary,
			orderByComparator);
	}

	/**
	* Returns the foos before and after the current foo in the ordered set where fooDocumentLibrary = &#63;.
	*
	* @param fooId the primary key of the current foo
	* @param fooDocumentLibrary the foo document library
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next foo
	* @throws NoSuchFooException if a foo with the primary key could not be found
	*/
	public static Foo[] findByFooDocumentLibrary_PrevAndNext(long fooId,
		java.lang.String fooDocumentLibrary,
		OrderByComparator<Foo> orderByComparator)
		throws com.liferay.foo.exception.NoSuchFooException {
		return getPersistence()
				   .findByFooDocumentLibrary_PrevAndNext(fooId,
			fooDocumentLibrary, orderByComparator);
	}

	/**
	* Removes all the foos where fooDocumentLibrary = &#63; from the database.
	*
	* @param fooDocumentLibrary the foo document library
	*/
	public static void removeByFooDocumentLibrary(
		java.lang.String fooDocumentLibrary) {
		getPersistence().removeByFooDocumentLibrary(fooDocumentLibrary);
	}

	/**
	* Returns the number of foos where fooDocumentLibrary = &#63;.
	*
	* @param fooDocumentLibrary the foo document library
	* @return the number of matching foos
	*/
	public static int countByFooDocumentLibrary(
		java.lang.String fooDocumentLibrary) {
		return getPersistence().countByFooDocumentLibrary(fooDocumentLibrary);
	}

	/**
	* Returns all the foos where fooDouble = &#63;.
	*
	* @param fooDouble the foo double
	* @return the matching foos
	*/
	public static List<Foo> findByFooDouble(double fooDouble) {
		return getPersistence().findByFooDouble(fooDouble);
	}

	/**
	* Returns a range of all the foos where fooDouble = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FooModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param fooDouble the foo double
	* @param start the lower bound of the range of foos
	* @param end the upper bound of the range of foos (not inclusive)
	* @return the range of matching foos
	*/
	public static List<Foo> findByFooDouble(double fooDouble, int start, int end) {
		return getPersistence().findByFooDouble(fooDouble, start, end);
	}

	/**
	* Returns an ordered range of all the foos where fooDouble = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FooModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param fooDouble the foo double
	* @param start the lower bound of the range of foos
	* @param end the upper bound of the range of foos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching foos
	*/
	public static List<Foo> findByFooDouble(double fooDouble, int start,
		int end, OrderByComparator<Foo> orderByComparator) {
		return getPersistence()
				   .findByFooDouble(fooDouble, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the foos where fooDouble = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FooModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param fooDouble the foo double
	* @param start the lower bound of the range of foos
	* @param end the upper bound of the range of foos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching foos
	*/
	public static List<Foo> findByFooDouble(double fooDouble, int start,
		int end, OrderByComparator<Foo> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByFooDouble(fooDouble, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first foo in the ordered set where fooDouble = &#63;.
	*
	* @param fooDouble the foo double
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching foo
	* @throws NoSuchFooException if a matching foo could not be found
	*/
	public static Foo findByFooDouble_First(double fooDouble,
		OrderByComparator<Foo> orderByComparator)
		throws com.liferay.foo.exception.NoSuchFooException {
		return getPersistence()
				   .findByFooDouble_First(fooDouble, orderByComparator);
	}

	/**
	* Returns the first foo in the ordered set where fooDouble = &#63;.
	*
	* @param fooDouble the foo double
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching foo, or <code>null</code> if a matching foo could not be found
	*/
	public static Foo fetchByFooDouble_First(double fooDouble,
		OrderByComparator<Foo> orderByComparator) {
		return getPersistence()
				   .fetchByFooDouble_First(fooDouble, orderByComparator);
	}

	/**
	* Returns the last foo in the ordered set where fooDouble = &#63;.
	*
	* @param fooDouble the foo double
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching foo
	* @throws NoSuchFooException if a matching foo could not be found
	*/
	public static Foo findByFooDouble_Last(double fooDouble,
		OrderByComparator<Foo> orderByComparator)
		throws com.liferay.foo.exception.NoSuchFooException {
		return getPersistence()
				   .findByFooDouble_Last(fooDouble, orderByComparator);
	}

	/**
	* Returns the last foo in the ordered set where fooDouble = &#63;.
	*
	* @param fooDouble the foo double
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching foo, or <code>null</code> if a matching foo could not be found
	*/
	public static Foo fetchByFooDouble_Last(double fooDouble,
		OrderByComparator<Foo> orderByComparator) {
		return getPersistence()
				   .fetchByFooDouble_Last(fooDouble, orderByComparator);
	}

	/**
	* Returns the foos before and after the current foo in the ordered set where fooDouble = &#63;.
	*
	* @param fooId the primary key of the current foo
	* @param fooDouble the foo double
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next foo
	* @throws NoSuchFooException if a foo with the primary key could not be found
	*/
	public static Foo[] findByFooDouble_PrevAndNext(long fooId,
		double fooDouble, OrderByComparator<Foo> orderByComparator)
		throws com.liferay.foo.exception.NoSuchFooException {
		return getPersistence()
				   .findByFooDouble_PrevAndNext(fooId, fooDouble,
			orderByComparator);
	}

	/**
	* Removes all the foos where fooDouble = &#63; from the database.
	*
	* @param fooDouble the foo double
	*/
	public static void removeByFooDouble(double fooDouble) {
		getPersistence().removeByFooDouble(fooDouble);
	}

	/**
	* Returns the number of foos where fooDouble = &#63;.
	*
	* @param fooDouble the foo double
	* @return the number of matching foos
	*/
	public static int countByFooDouble(double fooDouble) {
		return getPersistence().countByFooDouble(fooDouble);
	}

	/**
	* Returns all the foos where fooInteger = &#63;.
	*
	* @param fooInteger the foo integer
	* @return the matching foos
	*/
	public static List<Foo> findByFooInteger(int fooInteger) {
		return getPersistence().findByFooInteger(fooInteger);
	}

	/**
	* Returns a range of all the foos where fooInteger = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FooModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param fooInteger the foo integer
	* @param start the lower bound of the range of foos
	* @param end the upper bound of the range of foos (not inclusive)
	* @return the range of matching foos
	*/
	public static List<Foo> findByFooInteger(int fooInteger, int start, int end) {
		return getPersistence().findByFooInteger(fooInteger, start, end);
	}

	/**
	* Returns an ordered range of all the foos where fooInteger = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FooModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param fooInteger the foo integer
	* @param start the lower bound of the range of foos
	* @param end the upper bound of the range of foos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching foos
	*/
	public static List<Foo> findByFooInteger(int fooInteger, int start,
		int end, OrderByComparator<Foo> orderByComparator) {
		return getPersistence()
				   .findByFooInteger(fooInteger, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the foos where fooInteger = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FooModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param fooInteger the foo integer
	* @param start the lower bound of the range of foos
	* @param end the upper bound of the range of foos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching foos
	*/
	public static List<Foo> findByFooInteger(int fooInteger, int start,
		int end, OrderByComparator<Foo> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByFooInteger(fooInteger, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first foo in the ordered set where fooInteger = &#63;.
	*
	* @param fooInteger the foo integer
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching foo
	* @throws NoSuchFooException if a matching foo could not be found
	*/
	public static Foo findByFooInteger_First(int fooInteger,
		OrderByComparator<Foo> orderByComparator)
		throws com.liferay.foo.exception.NoSuchFooException {
		return getPersistence()
				   .findByFooInteger_First(fooInteger, orderByComparator);
	}

	/**
	* Returns the first foo in the ordered set where fooInteger = &#63;.
	*
	* @param fooInteger the foo integer
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching foo, or <code>null</code> if a matching foo could not be found
	*/
	public static Foo fetchByFooInteger_First(int fooInteger,
		OrderByComparator<Foo> orderByComparator) {
		return getPersistence()
				   .fetchByFooInteger_First(fooInteger, orderByComparator);
	}

	/**
	* Returns the last foo in the ordered set where fooInteger = &#63;.
	*
	* @param fooInteger the foo integer
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching foo
	* @throws NoSuchFooException if a matching foo could not be found
	*/
	public static Foo findByFooInteger_Last(int fooInteger,
		OrderByComparator<Foo> orderByComparator)
		throws com.liferay.foo.exception.NoSuchFooException {
		return getPersistence()
				   .findByFooInteger_Last(fooInteger, orderByComparator);
	}

	/**
	* Returns the last foo in the ordered set where fooInteger = &#63;.
	*
	* @param fooInteger the foo integer
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching foo, or <code>null</code> if a matching foo could not be found
	*/
	public static Foo fetchByFooInteger_Last(int fooInteger,
		OrderByComparator<Foo> orderByComparator) {
		return getPersistence()
				   .fetchByFooInteger_Last(fooInteger, orderByComparator);
	}

	/**
	* Returns the foos before and after the current foo in the ordered set where fooInteger = &#63;.
	*
	* @param fooId the primary key of the current foo
	* @param fooInteger the foo integer
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next foo
	* @throws NoSuchFooException if a foo with the primary key could not be found
	*/
	public static Foo[] findByFooInteger_PrevAndNext(long fooId,
		int fooInteger, OrderByComparator<Foo> orderByComparator)
		throws com.liferay.foo.exception.NoSuchFooException {
		return getPersistence()
				   .findByFooInteger_PrevAndNext(fooId, fooInteger,
			orderByComparator);
	}

	/**
	* Removes all the foos where fooInteger = &#63; from the database.
	*
	* @param fooInteger the foo integer
	*/
	public static void removeByFooInteger(int fooInteger) {
		getPersistence().removeByFooInteger(fooInteger);
	}

	/**
	* Returns the number of foos where fooInteger = &#63;.
	*
	* @param fooInteger the foo integer
	* @return the number of matching foos
	*/
	public static int countByFooInteger(int fooInteger) {
		return getPersistence().countByFooInteger(fooInteger);
	}

	/**
	* Returns all the foos where fooRichText = &#63;.
	*
	* @param fooRichText the foo rich text
	* @return the matching foos
	*/
	public static List<Foo> findByFooRichText(java.lang.String fooRichText) {
		return getPersistence().findByFooRichText(fooRichText);
	}

	/**
	* Returns a range of all the foos where fooRichText = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FooModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param fooRichText the foo rich text
	* @param start the lower bound of the range of foos
	* @param end the upper bound of the range of foos (not inclusive)
	* @return the range of matching foos
	*/
	public static List<Foo> findByFooRichText(java.lang.String fooRichText,
		int start, int end) {
		return getPersistence().findByFooRichText(fooRichText, start, end);
	}

	/**
	* Returns an ordered range of all the foos where fooRichText = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FooModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param fooRichText the foo rich text
	* @param start the lower bound of the range of foos
	* @param end the upper bound of the range of foos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching foos
	*/
	public static List<Foo> findByFooRichText(java.lang.String fooRichText,
		int start, int end, OrderByComparator<Foo> orderByComparator) {
		return getPersistence()
				   .findByFooRichText(fooRichText, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the foos where fooRichText = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FooModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param fooRichText the foo rich text
	* @param start the lower bound of the range of foos
	* @param end the upper bound of the range of foos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching foos
	*/
	public static List<Foo> findByFooRichText(java.lang.String fooRichText,
		int start, int end, OrderByComparator<Foo> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByFooRichText(fooRichText, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first foo in the ordered set where fooRichText = &#63;.
	*
	* @param fooRichText the foo rich text
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching foo
	* @throws NoSuchFooException if a matching foo could not be found
	*/
	public static Foo findByFooRichText_First(java.lang.String fooRichText,
		OrderByComparator<Foo> orderByComparator)
		throws com.liferay.foo.exception.NoSuchFooException {
		return getPersistence()
				   .findByFooRichText_First(fooRichText, orderByComparator);
	}

	/**
	* Returns the first foo in the ordered set where fooRichText = &#63;.
	*
	* @param fooRichText the foo rich text
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching foo, or <code>null</code> if a matching foo could not be found
	*/
	public static Foo fetchByFooRichText_First(java.lang.String fooRichText,
		OrderByComparator<Foo> orderByComparator) {
		return getPersistence()
				   .fetchByFooRichText_First(fooRichText, orderByComparator);
	}

	/**
	* Returns the last foo in the ordered set where fooRichText = &#63;.
	*
	* @param fooRichText the foo rich text
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching foo
	* @throws NoSuchFooException if a matching foo could not be found
	*/
	public static Foo findByFooRichText_Last(java.lang.String fooRichText,
		OrderByComparator<Foo> orderByComparator)
		throws com.liferay.foo.exception.NoSuchFooException {
		return getPersistence()
				   .findByFooRichText_Last(fooRichText, orderByComparator);
	}

	/**
	* Returns the last foo in the ordered set where fooRichText = &#63;.
	*
	* @param fooRichText the foo rich text
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching foo, or <code>null</code> if a matching foo could not be found
	*/
	public static Foo fetchByFooRichText_Last(java.lang.String fooRichText,
		OrderByComparator<Foo> orderByComparator) {
		return getPersistence()
				   .fetchByFooRichText_Last(fooRichText, orderByComparator);
	}

	/**
	* Returns the foos before and after the current foo in the ordered set where fooRichText = &#63;.
	*
	* @param fooId the primary key of the current foo
	* @param fooRichText the foo rich text
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next foo
	* @throws NoSuchFooException if a foo with the primary key could not be found
	*/
	public static Foo[] findByFooRichText_PrevAndNext(long fooId,
		java.lang.String fooRichText, OrderByComparator<Foo> orderByComparator)
		throws com.liferay.foo.exception.NoSuchFooException {
		return getPersistence()
				   .findByFooRichText_PrevAndNext(fooId, fooRichText,
			orderByComparator);
	}

	/**
	* Removes all the foos where fooRichText = &#63; from the database.
	*
	* @param fooRichText the foo rich text
	*/
	public static void removeByFooRichText(java.lang.String fooRichText) {
		getPersistence().removeByFooRichText(fooRichText);
	}

	/**
	* Returns the number of foos where fooRichText = &#63;.
	*
	* @param fooRichText the foo rich text
	* @return the number of matching foos
	*/
	public static int countByFooRichText(java.lang.String fooRichText) {
		return getPersistence().countByFooRichText(fooRichText);
	}

	/**
	* Returns all the foos where fooText = &#63;.
	*
	* @param fooText the foo text
	* @return the matching foos
	*/
	public static List<Foo> findByFooText(java.lang.String fooText) {
		return getPersistence().findByFooText(fooText);
	}

	/**
	* Returns a range of all the foos where fooText = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FooModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param fooText the foo text
	* @param start the lower bound of the range of foos
	* @param end the upper bound of the range of foos (not inclusive)
	* @return the range of matching foos
	*/
	public static List<Foo> findByFooText(java.lang.String fooText, int start,
		int end) {
		return getPersistence().findByFooText(fooText, start, end);
	}

	/**
	* Returns an ordered range of all the foos where fooText = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FooModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param fooText the foo text
	* @param start the lower bound of the range of foos
	* @param end the upper bound of the range of foos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching foos
	*/
	public static List<Foo> findByFooText(java.lang.String fooText, int start,
		int end, OrderByComparator<Foo> orderByComparator) {
		return getPersistence()
				   .findByFooText(fooText, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the foos where fooText = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FooModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param fooText the foo text
	* @param start the lower bound of the range of foos
	* @param end the upper bound of the range of foos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching foos
	*/
	public static List<Foo> findByFooText(java.lang.String fooText, int start,
		int end, OrderByComparator<Foo> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByFooText(fooText, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first foo in the ordered set where fooText = &#63;.
	*
	* @param fooText the foo text
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching foo
	* @throws NoSuchFooException if a matching foo could not be found
	*/
	public static Foo findByFooText_First(java.lang.String fooText,
		OrderByComparator<Foo> orderByComparator)
		throws com.liferay.foo.exception.NoSuchFooException {
		return getPersistence().findByFooText_First(fooText, orderByComparator);
	}

	/**
	* Returns the first foo in the ordered set where fooText = &#63;.
	*
	* @param fooText the foo text
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching foo, or <code>null</code> if a matching foo could not be found
	*/
	public static Foo fetchByFooText_First(java.lang.String fooText,
		OrderByComparator<Foo> orderByComparator) {
		return getPersistence().fetchByFooText_First(fooText, orderByComparator);
	}

	/**
	* Returns the last foo in the ordered set where fooText = &#63;.
	*
	* @param fooText the foo text
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching foo
	* @throws NoSuchFooException if a matching foo could not be found
	*/
	public static Foo findByFooText_Last(java.lang.String fooText,
		OrderByComparator<Foo> orderByComparator)
		throws com.liferay.foo.exception.NoSuchFooException {
		return getPersistence().findByFooText_Last(fooText, orderByComparator);
	}

	/**
	* Returns the last foo in the ordered set where fooText = &#63;.
	*
	* @param fooText the foo text
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching foo, or <code>null</code> if a matching foo could not be found
	*/
	public static Foo fetchByFooText_Last(java.lang.String fooText,
		OrderByComparator<Foo> orderByComparator) {
		return getPersistence().fetchByFooText_Last(fooText, orderByComparator);
	}

	/**
	* Returns the foos before and after the current foo in the ordered set where fooText = &#63;.
	*
	* @param fooId the primary key of the current foo
	* @param fooText the foo text
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next foo
	* @throws NoSuchFooException if a foo with the primary key could not be found
	*/
	public static Foo[] findByFooText_PrevAndNext(long fooId,
		java.lang.String fooText, OrderByComparator<Foo> orderByComparator)
		throws com.liferay.foo.exception.NoSuchFooException {
		return getPersistence()
				   .findByFooText_PrevAndNext(fooId, fooText, orderByComparator);
	}

	/**
	* Removes all the foos where fooText = &#63; from the database.
	*
	* @param fooText the foo text
	*/
	public static void removeByFooText(java.lang.String fooText) {
		getPersistence().removeByFooText(fooText);
	}

	/**
	* Returns the number of foos where fooText = &#63;.
	*
	* @param fooText the foo text
	* @return the number of matching foos
	*/
	public static int countByFooText(java.lang.String fooText) {
		return getPersistence().countByFooText(fooText);
	}

	/**
	* Caches the foo in the entity cache if it is enabled.
	*
	* @param foo the foo
	*/
	public static void cacheResult(Foo foo) {
		getPersistence().cacheResult(foo);
	}

	/**
	* Caches the foos in the entity cache if it is enabled.
	*
	* @param foos the foos
	*/
	public static void cacheResult(List<Foo> foos) {
		getPersistence().cacheResult(foos);
	}

	/**
	* Creates a new foo with the primary key. Does not add the foo to the database.
	*
	* @param fooId the primary key for the new foo
	* @return the new foo
	*/
	public static Foo create(long fooId) {
		return getPersistence().create(fooId);
	}

	/**
	* Removes the foo with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param fooId the primary key of the foo
	* @return the foo that was removed
	* @throws NoSuchFooException if a foo with the primary key could not be found
	*/
	public static Foo remove(long fooId)
		throws com.liferay.foo.exception.NoSuchFooException {
		return getPersistence().remove(fooId);
	}

	public static Foo updateImpl(Foo foo) {
		return getPersistence().updateImpl(foo);
	}

	/**
	* Returns the foo with the primary key or throws a {@link NoSuchFooException} if it could not be found.
	*
	* @param fooId the primary key of the foo
	* @return the foo
	* @throws NoSuchFooException if a foo with the primary key could not be found
	*/
	public static Foo findByPrimaryKey(long fooId)
		throws com.liferay.foo.exception.NoSuchFooException {
		return getPersistence().findByPrimaryKey(fooId);
	}

	/**
	* Returns the foo with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param fooId the primary key of the foo
	* @return the foo, or <code>null</code> if a foo with the primary key could not be found
	*/
	public static Foo fetchByPrimaryKey(long fooId) {
		return getPersistence().fetchByPrimaryKey(fooId);
	}

	public static java.util.Map<java.io.Serializable, Foo> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the foos.
	*
	* @return the foos
	*/
	public static List<Foo> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the foos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FooModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of foos
	* @param end the upper bound of the range of foos (not inclusive)
	* @return the range of foos
	*/
	public static List<Foo> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the foos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FooModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of foos
	* @param end the upper bound of the range of foos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of foos
	*/
	public static List<Foo> findAll(int start, int end,
		OrderByComparator<Foo> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the foos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FooModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of foos
	* @param end the upper bound of the range of foos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of foos
	*/
	public static List<Foo> findAll(int start, int end,
		OrderByComparator<Foo> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the foos from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of foos.
	*
	* @return the number of foos
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<java.lang.String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static FooPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<FooPersistence, FooPersistence> _serviceTracker =
		ServiceTrackerFactory.open(FooPersistence.class);
}