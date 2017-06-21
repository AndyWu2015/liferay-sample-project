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

import com.liferay.foo.exception.NoSuchFooException;
import com.liferay.foo.model.Foo;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import java.util.Date;

/**
 * The persistence interface for the foo service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.liferay.foo.service.persistence.impl.FooPersistenceImpl
 * @see FooUtil
 * @generated
 */
@ProviderType
public interface FooPersistence extends BasePersistence<Foo> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link FooUtil} to access the foo persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the foos where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching foos
	*/
	public java.util.List<Foo> findByUuid(java.lang.String uuid);

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
	public java.util.List<Foo> findByUuid(java.lang.String uuid, int start,
		int end);

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
	public java.util.List<Foo> findByUuid(java.lang.String uuid, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<Foo> orderByComparator);

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
	public java.util.List<Foo> findByUuid(java.lang.String uuid, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<Foo> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first foo in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching foo
	* @throws NoSuchFooException if a matching foo could not be found
	*/
	public Foo findByUuid_First(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Foo> orderByComparator)
		throws NoSuchFooException;

	/**
	* Returns the first foo in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching foo, or <code>null</code> if a matching foo could not be found
	*/
	public Foo fetchByUuid_First(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Foo> orderByComparator);

	/**
	* Returns the last foo in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching foo
	* @throws NoSuchFooException if a matching foo could not be found
	*/
	public Foo findByUuid_Last(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Foo> orderByComparator)
		throws NoSuchFooException;

	/**
	* Returns the last foo in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching foo, or <code>null</code> if a matching foo could not be found
	*/
	public Foo fetchByUuid_Last(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Foo> orderByComparator);

	/**
	* Returns the foos before and after the current foo in the ordered set where uuid = &#63;.
	*
	* @param fooId the primary key of the current foo
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next foo
	* @throws NoSuchFooException if a foo with the primary key could not be found
	*/
	public Foo[] findByUuid_PrevAndNext(long fooId, java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Foo> orderByComparator)
		throws NoSuchFooException;

	/**
	* Removes all the foos where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public void removeByUuid(java.lang.String uuid);

	/**
	* Returns the number of foos where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching foos
	*/
	public int countByUuid(java.lang.String uuid);

	/**
	* Returns the foo where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchFooException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching foo
	* @throws NoSuchFooException if a matching foo could not be found
	*/
	public Foo findByUUID_G(java.lang.String uuid, long groupId)
		throws NoSuchFooException;

	/**
	* Returns the foo where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching foo, or <code>null</code> if a matching foo could not be found
	*/
	public Foo fetchByUUID_G(java.lang.String uuid, long groupId);

	/**
	* Returns the foo where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching foo, or <code>null</code> if a matching foo could not be found
	*/
	public Foo fetchByUUID_G(java.lang.String uuid, long groupId,
		boolean retrieveFromCache);

	/**
	* Removes the foo where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the foo that was removed
	*/
	public Foo removeByUUID_G(java.lang.String uuid, long groupId)
		throws NoSuchFooException;

	/**
	* Returns the number of foos where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching foos
	*/
	public int countByUUID_G(java.lang.String uuid, long groupId);

	/**
	* Returns all the foos where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching foos
	*/
	public java.util.List<Foo> findByUuid_C(java.lang.String uuid,
		long companyId);

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
	public java.util.List<Foo> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end);

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
	public java.util.List<Foo> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Foo> orderByComparator);

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
	public java.util.List<Foo> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Foo> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first foo in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching foo
	* @throws NoSuchFooException if a matching foo could not be found
	*/
	public Foo findByUuid_C_First(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Foo> orderByComparator)
		throws NoSuchFooException;

	/**
	* Returns the first foo in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching foo, or <code>null</code> if a matching foo could not be found
	*/
	public Foo fetchByUuid_C_First(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Foo> orderByComparator);

	/**
	* Returns the last foo in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching foo
	* @throws NoSuchFooException if a matching foo could not be found
	*/
	public Foo findByUuid_C_Last(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Foo> orderByComparator)
		throws NoSuchFooException;

	/**
	* Returns the last foo in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching foo, or <code>null</code> if a matching foo could not be found
	*/
	public Foo fetchByUuid_C_Last(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Foo> orderByComparator);

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
	public Foo[] findByUuid_C_PrevAndNext(long fooId, java.lang.String uuid,
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Foo> orderByComparator)
		throws NoSuchFooException;

	/**
	* Removes all the foos where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	*/
	public void removeByUuid_C(java.lang.String uuid, long companyId);

	/**
	* Returns the number of foos where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching foos
	*/
	public int countByUuid_C(java.lang.String uuid, long companyId);

	/**
	* Returns all the foos where companyId = &#63; and status = &#63;.
	*
	* @param companyId the company ID
	* @param status the status
	* @return the matching foos
	*/
	public java.util.List<Foo> findByC_S(long companyId, int status);

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
	public java.util.List<Foo> findByC_S(long companyId, int status, int start,
		int end);

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
	public java.util.List<Foo> findByC_S(long companyId, int status, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<Foo> orderByComparator);

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
	public java.util.List<Foo> findByC_S(long companyId, int status, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<Foo> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first foo in the ordered set where companyId = &#63; and status = &#63;.
	*
	* @param companyId the company ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching foo
	* @throws NoSuchFooException if a matching foo could not be found
	*/
	public Foo findByC_S_First(long companyId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<Foo> orderByComparator)
		throws NoSuchFooException;

	/**
	* Returns the first foo in the ordered set where companyId = &#63; and status = &#63;.
	*
	* @param companyId the company ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching foo, or <code>null</code> if a matching foo could not be found
	*/
	public Foo fetchByC_S_First(long companyId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<Foo> orderByComparator);

	/**
	* Returns the last foo in the ordered set where companyId = &#63; and status = &#63;.
	*
	* @param companyId the company ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching foo
	* @throws NoSuchFooException if a matching foo could not be found
	*/
	public Foo findByC_S_Last(long companyId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<Foo> orderByComparator)
		throws NoSuchFooException;

	/**
	* Returns the last foo in the ordered set where companyId = &#63; and status = &#63;.
	*
	* @param companyId the company ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching foo, or <code>null</code> if a matching foo could not be found
	*/
	public Foo fetchByC_S_Last(long companyId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<Foo> orderByComparator);

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
	public Foo[] findByC_S_PrevAndNext(long fooId, long companyId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<Foo> orderByComparator)
		throws NoSuchFooException;

	/**
	* Removes all the foos where companyId = &#63; and status = &#63; from the database.
	*
	* @param companyId the company ID
	* @param status the status
	*/
	public void removeByC_S(long companyId, int status);

	/**
	* Returns the number of foos where companyId = &#63; and status = &#63;.
	*
	* @param companyId the company ID
	* @param status the status
	* @return the number of matching foos
	*/
	public int countByC_S(long companyId, int status);

	/**
	* Returns all the foos where groupId = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param status the status
	* @return the matching foos
	*/
	public java.util.List<Foo> findByG_S(long groupId, int status);

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
	public java.util.List<Foo> findByG_S(long groupId, int status, int start,
		int end);

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
	public java.util.List<Foo> findByG_S(long groupId, int status, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<Foo> orderByComparator);

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
	public java.util.List<Foo> findByG_S(long groupId, int status, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<Foo> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first foo in the ordered set where groupId = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching foo
	* @throws NoSuchFooException if a matching foo could not be found
	*/
	public Foo findByG_S_First(long groupId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<Foo> orderByComparator)
		throws NoSuchFooException;

	/**
	* Returns the first foo in the ordered set where groupId = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching foo, or <code>null</code> if a matching foo could not be found
	*/
	public Foo fetchByG_S_First(long groupId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<Foo> orderByComparator);

	/**
	* Returns the last foo in the ordered set where groupId = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching foo
	* @throws NoSuchFooException if a matching foo could not be found
	*/
	public Foo findByG_S_Last(long groupId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<Foo> orderByComparator)
		throws NoSuchFooException;

	/**
	* Returns the last foo in the ordered set where groupId = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching foo, or <code>null</code> if a matching foo could not be found
	*/
	public Foo fetchByG_S_Last(long groupId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<Foo> orderByComparator);

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
	public Foo[] findByG_S_PrevAndNext(long fooId, long groupId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<Foo> orderByComparator)
		throws NoSuchFooException;

	/**
	* Returns all the foos that the user has permission to view where groupId = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param status the status
	* @return the matching foos that the user has permission to view
	*/
	public java.util.List<Foo> filterFindByG_S(long groupId, int status);

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
	public java.util.List<Foo> filterFindByG_S(long groupId, int status,
		int start, int end);

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
	public java.util.List<Foo> filterFindByG_S(long groupId, int status,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Foo> orderByComparator);

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
	public Foo[] filterFindByG_S_PrevAndNext(long fooId, long groupId,
		int status,
		com.liferay.portal.kernel.util.OrderByComparator<Foo> orderByComparator)
		throws NoSuchFooException;

	/**
	* Removes all the foos where groupId = &#63; and status = &#63; from the database.
	*
	* @param groupId the group ID
	* @param status the status
	*/
	public void removeByG_S(long groupId, int status);

	/**
	* Returns the number of foos where groupId = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param status the status
	* @return the number of matching foos
	*/
	public int countByG_S(long groupId, int status);

	/**
	* Returns the number of foos that the user has permission to view where groupId = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param status the status
	* @return the number of matching foos that the user has permission to view
	*/
	public int filterCountByG_S(long groupId, int status);

	/**
	* Returns all the foos where companyId = &#63; and userId = &#63; and status = &#63;.
	*
	* @param companyId the company ID
	* @param userId the user ID
	* @param status the status
	* @return the matching foos
	*/
	public java.util.List<Foo> findByC_U_S(long companyId, long userId,
		int status);

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
	public java.util.List<Foo> findByC_U_S(long companyId, long userId,
		int status, int start, int end);

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
	public java.util.List<Foo> findByC_U_S(long companyId, long userId,
		int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Foo> orderByComparator);

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
	public java.util.List<Foo> findByC_U_S(long companyId, long userId,
		int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Foo> orderByComparator,
		boolean retrieveFromCache);

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
	public Foo findByC_U_S_First(long companyId, long userId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<Foo> orderByComparator)
		throws NoSuchFooException;

	/**
	* Returns the first foo in the ordered set where companyId = &#63; and userId = &#63; and status = &#63;.
	*
	* @param companyId the company ID
	* @param userId the user ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching foo, or <code>null</code> if a matching foo could not be found
	*/
	public Foo fetchByC_U_S_First(long companyId, long userId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<Foo> orderByComparator);

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
	public Foo findByC_U_S_Last(long companyId, long userId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<Foo> orderByComparator)
		throws NoSuchFooException;

	/**
	* Returns the last foo in the ordered set where companyId = &#63; and userId = &#63; and status = &#63;.
	*
	* @param companyId the company ID
	* @param userId the user ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching foo, or <code>null</code> if a matching foo could not be found
	*/
	public Foo fetchByC_U_S_Last(long companyId, long userId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<Foo> orderByComparator);

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
	public Foo[] findByC_U_S_PrevAndNext(long fooId, long companyId,
		long userId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<Foo> orderByComparator)
		throws NoSuchFooException;

	/**
	* Removes all the foos where companyId = &#63; and userId = &#63; and status = &#63; from the database.
	*
	* @param companyId the company ID
	* @param userId the user ID
	* @param status the status
	*/
	public void removeByC_U_S(long companyId, long userId, int status);

	/**
	* Returns the number of foos where companyId = &#63; and userId = &#63; and status = &#63;.
	*
	* @param companyId the company ID
	* @param userId the user ID
	* @param status the status
	* @return the number of matching foos
	*/
	public int countByC_U_S(long companyId, long userId, int status);

	/**
	* Returns all the foos where groupId = &#63; and userId = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param status the status
	* @return the matching foos
	*/
	public java.util.List<Foo> findByG_U_S(long groupId, long userId, int status);

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
	public java.util.List<Foo> findByG_U_S(long groupId, long userId,
		int status, int start, int end);

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
	public java.util.List<Foo> findByG_U_S(long groupId, long userId,
		int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Foo> orderByComparator);

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
	public java.util.List<Foo> findByG_U_S(long groupId, long userId,
		int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Foo> orderByComparator,
		boolean retrieveFromCache);

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
	public Foo findByG_U_S_First(long groupId, long userId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<Foo> orderByComparator)
		throws NoSuchFooException;

	/**
	* Returns the first foo in the ordered set where groupId = &#63; and userId = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching foo, or <code>null</code> if a matching foo could not be found
	*/
	public Foo fetchByG_U_S_First(long groupId, long userId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<Foo> orderByComparator);

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
	public Foo findByG_U_S_Last(long groupId, long userId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<Foo> orderByComparator)
		throws NoSuchFooException;

	/**
	* Returns the last foo in the ordered set where groupId = &#63; and userId = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching foo, or <code>null</code> if a matching foo could not be found
	*/
	public Foo fetchByG_U_S_Last(long groupId, long userId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<Foo> orderByComparator);

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
	public Foo[] findByG_U_S_PrevAndNext(long fooId, long groupId, long userId,
		int status,
		com.liferay.portal.kernel.util.OrderByComparator<Foo> orderByComparator)
		throws NoSuchFooException;

	/**
	* Returns all the foos that the user has permission to view where groupId = &#63; and userId = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param status the status
	* @return the matching foos that the user has permission to view
	*/
	public java.util.List<Foo> filterFindByG_U_S(long groupId, long userId,
		int status);

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
	public java.util.List<Foo> filterFindByG_U_S(long groupId, long userId,
		int status, int start, int end);

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
	public java.util.List<Foo> filterFindByG_U_S(long groupId, long userId,
		int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Foo> orderByComparator);

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
	public Foo[] filterFindByG_U_S_PrevAndNext(long fooId, long groupId,
		long userId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<Foo> orderByComparator)
		throws NoSuchFooException;

	/**
	* Removes all the foos where groupId = &#63; and userId = &#63; and status = &#63; from the database.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param status the status
	*/
	public void removeByG_U_S(long groupId, long userId, int status);

	/**
	* Returns the number of foos where groupId = &#63; and userId = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param status the status
	* @return the number of matching foos
	*/
	public int countByG_U_S(long groupId, long userId, int status);

	/**
	* Returns the number of foos that the user has permission to view where groupId = &#63; and userId = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param status the status
	* @return the number of matching foos that the user has permission to view
	*/
	public int filterCountByG_U_S(long groupId, long userId, int status);

	/**
	* Returns all the foos where userId = &#63; and status = &#63;.
	*
	* @param userId the user ID
	* @param status the status
	* @return the matching foos
	*/
	public java.util.List<Foo> findByU_S(long userId, int status);

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
	public java.util.List<Foo> findByU_S(long userId, int status, int start,
		int end);

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
	public java.util.List<Foo> findByU_S(long userId, int status, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<Foo> orderByComparator);

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
	public java.util.List<Foo> findByU_S(long userId, int status, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<Foo> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first foo in the ordered set where userId = &#63; and status = &#63;.
	*
	* @param userId the user ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching foo
	* @throws NoSuchFooException if a matching foo could not be found
	*/
	public Foo findByU_S_First(long userId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<Foo> orderByComparator)
		throws NoSuchFooException;

	/**
	* Returns the first foo in the ordered set where userId = &#63; and status = &#63;.
	*
	* @param userId the user ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching foo, or <code>null</code> if a matching foo could not be found
	*/
	public Foo fetchByU_S_First(long userId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<Foo> orderByComparator);

	/**
	* Returns the last foo in the ordered set where userId = &#63; and status = &#63;.
	*
	* @param userId the user ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching foo
	* @throws NoSuchFooException if a matching foo could not be found
	*/
	public Foo findByU_S_Last(long userId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<Foo> orderByComparator)
		throws NoSuchFooException;

	/**
	* Returns the last foo in the ordered set where userId = &#63; and status = &#63;.
	*
	* @param userId the user ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching foo, or <code>null</code> if a matching foo could not be found
	*/
	public Foo fetchByU_S_Last(long userId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<Foo> orderByComparator);

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
	public Foo[] findByU_S_PrevAndNext(long fooId, long userId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<Foo> orderByComparator)
		throws NoSuchFooException;

	/**
	* Removes all the foos where userId = &#63; and status = &#63; from the database.
	*
	* @param userId the user ID
	* @param status the status
	*/
	public void removeByU_S(long userId, int status);

	/**
	* Returns the number of foos where userId = &#63; and status = &#63;.
	*
	* @param userId the user ID
	* @param status the status
	* @return the number of matching foos
	*/
	public int countByU_S(long userId, int status);

	/**
	* Returns all the foos where groupId = &#63; and urlTitle = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param urlTitle the url title
	* @param status the status
	* @return the matching foos
	*/
	public java.util.List<Foo> findByG_UT_ST(long groupId,
		java.lang.String urlTitle, int status);

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
	public java.util.List<Foo> findByG_UT_ST(long groupId,
		java.lang.String urlTitle, int status, int start, int end);

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
	public java.util.List<Foo> findByG_UT_ST(long groupId,
		java.lang.String urlTitle, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Foo> orderByComparator);

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
	public java.util.List<Foo> findByG_UT_ST(long groupId,
		java.lang.String urlTitle, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Foo> orderByComparator,
		boolean retrieveFromCache);

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
	public Foo findByG_UT_ST_First(long groupId, java.lang.String urlTitle,
		int status,
		com.liferay.portal.kernel.util.OrderByComparator<Foo> orderByComparator)
		throws NoSuchFooException;

	/**
	* Returns the first foo in the ordered set where groupId = &#63; and urlTitle = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param urlTitle the url title
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching foo, or <code>null</code> if a matching foo could not be found
	*/
	public Foo fetchByG_UT_ST_First(long groupId, java.lang.String urlTitle,
		int status,
		com.liferay.portal.kernel.util.OrderByComparator<Foo> orderByComparator);

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
	public Foo findByG_UT_ST_Last(long groupId, java.lang.String urlTitle,
		int status,
		com.liferay.portal.kernel.util.OrderByComparator<Foo> orderByComparator)
		throws NoSuchFooException;

	/**
	* Returns the last foo in the ordered set where groupId = &#63; and urlTitle = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param urlTitle the url title
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching foo, or <code>null</code> if a matching foo could not be found
	*/
	public Foo fetchByG_UT_ST_Last(long groupId, java.lang.String urlTitle,
		int status,
		com.liferay.portal.kernel.util.OrderByComparator<Foo> orderByComparator);

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
	public Foo[] findByG_UT_ST_PrevAndNext(long fooId, long groupId,
		java.lang.String urlTitle, int status,
		com.liferay.portal.kernel.util.OrderByComparator<Foo> orderByComparator)
		throws NoSuchFooException;

	/**
	* Returns all the foos that the user has permission to view where groupId = &#63; and urlTitle = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param urlTitle the url title
	* @param status the status
	* @return the matching foos that the user has permission to view
	*/
	public java.util.List<Foo> filterFindByG_UT_ST(long groupId,
		java.lang.String urlTitle, int status);

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
	public java.util.List<Foo> filterFindByG_UT_ST(long groupId,
		java.lang.String urlTitle, int status, int start, int end);

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
	public java.util.List<Foo> filterFindByG_UT_ST(long groupId,
		java.lang.String urlTitle, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Foo> orderByComparator);

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
	public Foo[] filterFindByG_UT_ST_PrevAndNext(long fooId, long groupId,
		java.lang.String urlTitle, int status,
		com.liferay.portal.kernel.util.OrderByComparator<Foo> orderByComparator)
		throws NoSuchFooException;

	/**
	* Removes all the foos where groupId = &#63; and urlTitle = &#63; and status = &#63; from the database.
	*
	* @param groupId the group ID
	* @param urlTitle the url title
	* @param status the status
	*/
	public void removeByG_UT_ST(long groupId, java.lang.String urlTitle,
		int status);

	/**
	* Returns the number of foos where groupId = &#63; and urlTitle = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param urlTitle the url title
	* @param status the status
	* @return the number of matching foos
	*/
	public int countByG_UT_ST(long groupId, java.lang.String urlTitle,
		int status);

	/**
	* Returns the number of foos that the user has permission to view where groupId = &#63; and urlTitle = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param urlTitle the url title
	* @param status the status
	* @return the number of matching foos that the user has permission to view
	*/
	public int filterCountByG_UT_ST(long groupId, java.lang.String urlTitle,
		int status);

	/**
	* Returns the foo where groupId = &#63; and urlTitle = &#63; or throws a {@link NoSuchFooException} if it could not be found.
	*
	* @param groupId the group ID
	* @param urlTitle the url title
	* @return the matching foo
	* @throws NoSuchFooException if a matching foo could not be found
	*/
	public Foo findByG_UT(long groupId, java.lang.String urlTitle)
		throws NoSuchFooException;

	/**
	* Returns the foo where groupId = &#63; and urlTitle = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param groupId the group ID
	* @param urlTitle the url title
	* @return the matching foo, or <code>null</code> if a matching foo could not be found
	*/
	public Foo fetchByG_UT(long groupId, java.lang.String urlTitle);

	/**
	* Returns the foo where groupId = &#63; and urlTitle = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param groupId the group ID
	* @param urlTitle the url title
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching foo, or <code>null</code> if a matching foo could not be found
	*/
	public Foo fetchByG_UT(long groupId, java.lang.String urlTitle,
		boolean retrieveFromCache);

	/**
	* Removes the foo where groupId = &#63; and urlTitle = &#63; from the database.
	*
	* @param groupId the group ID
	* @param urlTitle the url title
	* @return the foo that was removed
	*/
	public Foo removeByG_UT(long groupId, java.lang.String urlTitle)
		throws NoSuchFooException;

	/**
	* Returns the number of foos where groupId = &#63; and urlTitle = &#63;.
	*
	* @param groupId the group ID
	* @param urlTitle the url title
	* @return the number of matching foos
	*/
	public int countByG_UT(long groupId, java.lang.String urlTitle);

	/**
	* Returns the foo where urlTitle = &#63; or throws a {@link NoSuchFooException} if it could not be found.
	*
	* @param urlTitle the url title
	* @return the matching foo
	* @throws NoSuchFooException if a matching foo could not be found
	*/
	public Foo findByURLTitle(java.lang.String urlTitle)
		throws NoSuchFooException;

	/**
	* Returns the foo where urlTitle = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param urlTitle the url title
	* @return the matching foo, or <code>null</code> if a matching foo could not be found
	*/
	public Foo fetchByURLTitle(java.lang.String urlTitle);

	/**
	* Returns the foo where urlTitle = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param urlTitle the url title
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching foo, or <code>null</code> if a matching foo could not be found
	*/
	public Foo fetchByURLTitle(java.lang.String urlTitle,
		boolean retrieveFromCache);

	/**
	* Removes the foo where urlTitle = &#63; from the database.
	*
	* @param urlTitle the url title
	* @return the foo that was removed
	*/
	public Foo removeByURLTitle(java.lang.String urlTitle)
		throws NoSuchFooException;

	/**
	* Returns the number of foos where urlTitle = &#63;.
	*
	* @param urlTitle the url title
	* @return the number of matching foos
	*/
	public int countByURLTitle(java.lang.String urlTitle);

	/**
	* Returns all the foos where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the matching foos
	*/
	public java.util.List<Foo> findByGroupId(long groupId);

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
	public java.util.List<Foo> findByGroupId(long groupId, int start, int end);

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
	public java.util.List<Foo> findByGroupId(long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Foo> orderByComparator);

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
	public java.util.List<Foo> findByGroupId(long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Foo> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first foo in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching foo
	* @throws NoSuchFooException if a matching foo could not be found
	*/
	public Foo findByGroupId_First(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<Foo> orderByComparator)
		throws NoSuchFooException;

	/**
	* Returns the first foo in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching foo, or <code>null</code> if a matching foo could not be found
	*/
	public Foo fetchByGroupId_First(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<Foo> orderByComparator);

	/**
	* Returns the last foo in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching foo
	* @throws NoSuchFooException if a matching foo could not be found
	*/
	public Foo findByGroupId_Last(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<Foo> orderByComparator)
		throws NoSuchFooException;

	/**
	* Returns the last foo in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching foo, or <code>null</code> if a matching foo could not be found
	*/
	public Foo fetchByGroupId_Last(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<Foo> orderByComparator);

	/**
	* Returns the foos before and after the current foo in the ordered set where groupId = &#63;.
	*
	* @param fooId the primary key of the current foo
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next foo
	* @throws NoSuchFooException if a foo with the primary key could not be found
	*/
	public Foo[] findByGroupId_PrevAndNext(long fooId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<Foo> orderByComparator)
		throws NoSuchFooException;

	/**
	* Returns all the foos that the user has permission to view where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the matching foos that the user has permission to view
	*/
	public java.util.List<Foo> filterFindByGroupId(long groupId);

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
	public java.util.List<Foo> filterFindByGroupId(long groupId, int start,
		int end);

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
	public java.util.List<Foo> filterFindByGroupId(long groupId, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<Foo> orderByComparator);

	/**
	* Returns the foos before and after the current foo in the ordered set of foos that the user has permission to view where groupId = &#63;.
	*
	* @param fooId the primary key of the current foo
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next foo
	* @throws NoSuchFooException if a foo with the primary key could not be found
	*/
	public Foo[] filterFindByGroupId_PrevAndNext(long fooId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<Foo> orderByComparator)
		throws NoSuchFooException;

	/**
	* Removes all the foos where groupId = &#63; from the database.
	*
	* @param groupId the group ID
	*/
	public void removeByGroupId(long groupId);

	/**
	* Returns the number of foos where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the number of matching foos
	*/
	public int countByGroupId(long groupId);

	/**
	* Returns the number of foos that the user has permission to view where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the number of matching foos that the user has permission to view
	*/
	public int filterCountByGroupId(long groupId);

	/**
	* Returns all the foos where userId = &#63; and groupId = &#63;.
	*
	* @param userId the user ID
	* @param groupId the group ID
	* @return the matching foos
	*/
	public java.util.List<Foo> findByUserIdGroupId(long userId, long groupId);

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
	public java.util.List<Foo> findByUserIdGroupId(long userId, long groupId,
		int start, int end);

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
	public java.util.List<Foo> findByUserIdGroupId(long userId, long groupId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Foo> orderByComparator);

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
	public java.util.List<Foo> findByUserIdGroupId(long userId, long groupId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Foo> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first foo in the ordered set where userId = &#63; and groupId = &#63;.
	*
	* @param userId the user ID
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching foo
	* @throws NoSuchFooException if a matching foo could not be found
	*/
	public Foo findByUserIdGroupId_First(long userId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<Foo> orderByComparator)
		throws NoSuchFooException;

	/**
	* Returns the first foo in the ordered set where userId = &#63; and groupId = &#63;.
	*
	* @param userId the user ID
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching foo, or <code>null</code> if a matching foo could not be found
	*/
	public Foo fetchByUserIdGroupId_First(long userId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<Foo> orderByComparator);

	/**
	* Returns the last foo in the ordered set where userId = &#63; and groupId = &#63;.
	*
	* @param userId the user ID
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching foo
	* @throws NoSuchFooException if a matching foo could not be found
	*/
	public Foo findByUserIdGroupId_Last(long userId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<Foo> orderByComparator)
		throws NoSuchFooException;

	/**
	* Returns the last foo in the ordered set where userId = &#63; and groupId = &#63;.
	*
	* @param userId the user ID
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching foo, or <code>null</code> if a matching foo could not be found
	*/
	public Foo fetchByUserIdGroupId_Last(long userId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<Foo> orderByComparator);

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
	public Foo[] findByUserIdGroupId_PrevAndNext(long fooId, long userId,
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<Foo> orderByComparator)
		throws NoSuchFooException;

	/**
	* Returns all the foos that the user has permission to view where userId = &#63; and groupId = &#63;.
	*
	* @param userId the user ID
	* @param groupId the group ID
	* @return the matching foos that the user has permission to view
	*/
	public java.util.List<Foo> filterFindByUserIdGroupId(long userId,
		long groupId);

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
	public java.util.List<Foo> filterFindByUserIdGroupId(long userId,
		long groupId, int start, int end);

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
	public java.util.List<Foo> filterFindByUserIdGroupId(long userId,
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Foo> orderByComparator);

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
	public Foo[] filterFindByUserIdGroupId_PrevAndNext(long fooId, long userId,
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<Foo> orderByComparator)
		throws NoSuchFooException;

	/**
	* Removes all the foos where userId = &#63; and groupId = &#63; from the database.
	*
	* @param userId the user ID
	* @param groupId the group ID
	*/
	public void removeByUserIdGroupId(long userId, long groupId);

	/**
	* Returns the number of foos where userId = &#63; and groupId = &#63;.
	*
	* @param userId the user ID
	* @param groupId the group ID
	* @return the number of matching foos
	*/
	public int countByUserIdGroupId(long userId, long groupId);

	/**
	* Returns the number of foos that the user has permission to view where userId = &#63; and groupId = &#63;.
	*
	* @param userId the user ID
	* @param groupId the group ID
	* @return the number of matching foos that the user has permission to view
	*/
	public int filterCountByUserIdGroupId(long userId, long groupId);

	/**
	* Returns all the foos where userId = &#63;.
	*
	* @param userId the user ID
	* @return the matching foos
	*/
	public java.util.List<Foo> findByUserId(long userId);

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
	public java.util.List<Foo> findByUserId(long userId, int start, int end);

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
	public java.util.List<Foo> findByUserId(long userId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Foo> orderByComparator);

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
	public java.util.List<Foo> findByUserId(long userId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Foo> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first foo in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching foo
	* @throws NoSuchFooException if a matching foo could not be found
	*/
	public Foo findByUserId_First(long userId,
		com.liferay.portal.kernel.util.OrderByComparator<Foo> orderByComparator)
		throws NoSuchFooException;

	/**
	* Returns the first foo in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching foo, or <code>null</code> if a matching foo could not be found
	*/
	public Foo fetchByUserId_First(long userId,
		com.liferay.portal.kernel.util.OrderByComparator<Foo> orderByComparator);

	/**
	* Returns the last foo in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching foo
	* @throws NoSuchFooException if a matching foo could not be found
	*/
	public Foo findByUserId_Last(long userId,
		com.liferay.portal.kernel.util.OrderByComparator<Foo> orderByComparator)
		throws NoSuchFooException;

	/**
	* Returns the last foo in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching foo, or <code>null</code> if a matching foo could not be found
	*/
	public Foo fetchByUserId_Last(long userId,
		com.liferay.portal.kernel.util.OrderByComparator<Foo> orderByComparator);

	/**
	* Returns the foos before and after the current foo in the ordered set where userId = &#63;.
	*
	* @param fooId the primary key of the current foo
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next foo
	* @throws NoSuchFooException if a foo with the primary key could not be found
	*/
	public Foo[] findByUserId_PrevAndNext(long fooId, long userId,
		com.liferay.portal.kernel.util.OrderByComparator<Foo> orderByComparator)
		throws NoSuchFooException;

	/**
	* Removes all the foos where userId = &#63; from the database.
	*
	* @param userId the user ID
	*/
	public void removeByUserId(long userId);

	/**
	* Returns the number of foos where userId = &#63;.
	*
	* @param userId the user ID
	* @return the number of matching foos
	*/
	public int countByUserId(long userId);

	/**
	* Returns all the foos where companyId = &#63;.
	*
	* @param companyId the company ID
	* @return the matching foos
	*/
	public java.util.List<Foo> findByCompanyId(long companyId);

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
	public java.util.List<Foo> findByCompanyId(long companyId, int start,
		int end);

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
	public java.util.List<Foo> findByCompanyId(long companyId, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<Foo> orderByComparator);

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
	public java.util.List<Foo> findByCompanyId(long companyId, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<Foo> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first foo in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching foo
	* @throws NoSuchFooException if a matching foo could not be found
	*/
	public Foo findByCompanyId_First(long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Foo> orderByComparator)
		throws NoSuchFooException;

	/**
	* Returns the first foo in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching foo, or <code>null</code> if a matching foo could not be found
	*/
	public Foo fetchByCompanyId_First(long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Foo> orderByComparator);

	/**
	* Returns the last foo in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching foo
	* @throws NoSuchFooException if a matching foo could not be found
	*/
	public Foo findByCompanyId_Last(long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Foo> orderByComparator)
		throws NoSuchFooException;

	/**
	* Returns the last foo in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching foo, or <code>null</code> if a matching foo could not be found
	*/
	public Foo fetchByCompanyId_Last(long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Foo> orderByComparator);

	/**
	* Returns the foos before and after the current foo in the ordered set where companyId = &#63;.
	*
	* @param fooId the primary key of the current foo
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next foo
	* @throws NoSuchFooException if a foo with the primary key could not be found
	*/
	public Foo[] findByCompanyId_PrevAndNext(long fooId, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Foo> orderByComparator)
		throws NoSuchFooException;

	/**
	* Removes all the foos where companyId = &#63; from the database.
	*
	* @param companyId the company ID
	*/
	public void removeByCompanyId(long companyId);

	/**
	* Returns the number of foos where companyId = &#63;.
	*
	* @param companyId the company ID
	* @return the number of matching foos
	*/
	public int countByCompanyId(long companyId);

	/**
	* Returns all the foos where fooId = &#63;.
	*
	* @param fooId the foo ID
	* @return the matching foos
	*/
	public java.util.List<Foo> findByFooId(long fooId);

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
	public java.util.List<Foo> findByFooId(long fooId, int start, int end);

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
	public java.util.List<Foo> findByFooId(long fooId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Foo> orderByComparator);

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
	public java.util.List<Foo> findByFooId(long fooId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Foo> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first foo in the ordered set where fooId = &#63;.
	*
	* @param fooId the foo ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching foo
	* @throws NoSuchFooException if a matching foo could not be found
	*/
	public Foo findByFooId_First(long fooId,
		com.liferay.portal.kernel.util.OrderByComparator<Foo> orderByComparator)
		throws NoSuchFooException;

	/**
	* Returns the first foo in the ordered set where fooId = &#63;.
	*
	* @param fooId the foo ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching foo, or <code>null</code> if a matching foo could not be found
	*/
	public Foo fetchByFooId_First(long fooId,
		com.liferay.portal.kernel.util.OrderByComparator<Foo> orderByComparator);

	/**
	* Returns the last foo in the ordered set where fooId = &#63;.
	*
	* @param fooId the foo ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching foo
	* @throws NoSuchFooException if a matching foo could not be found
	*/
	public Foo findByFooId_Last(long fooId,
		com.liferay.portal.kernel.util.OrderByComparator<Foo> orderByComparator)
		throws NoSuchFooException;

	/**
	* Returns the last foo in the ordered set where fooId = &#63;.
	*
	* @param fooId the foo ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching foo, or <code>null</code> if a matching foo could not be found
	*/
	public Foo fetchByFooId_Last(long fooId,
		com.liferay.portal.kernel.util.OrderByComparator<Foo> orderByComparator);

	/**
	* Removes all the foos where fooId = &#63; from the database.
	*
	* @param fooId the foo ID
	*/
	public void removeByFooId(long fooId);

	/**
	* Returns the number of foos where fooId = &#63;.
	*
	* @param fooId the foo ID
	* @return the number of matching foos
	*/
	public int countByFooId(long fooId);

	/**
	* Returns all the foos where title = &#63;.
	*
	* @param title the title
	* @return the matching foos
	*/
	public java.util.List<Foo> findByTitle(java.lang.String title);

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
	public java.util.List<Foo> findByTitle(java.lang.String title, int start,
		int end);

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
	public java.util.List<Foo> findByTitle(java.lang.String title, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<Foo> orderByComparator);

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
	public java.util.List<Foo> findByTitle(java.lang.String title, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<Foo> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first foo in the ordered set where title = &#63;.
	*
	* @param title the title
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching foo
	* @throws NoSuchFooException if a matching foo could not be found
	*/
	public Foo findByTitle_First(java.lang.String title,
		com.liferay.portal.kernel.util.OrderByComparator<Foo> orderByComparator)
		throws NoSuchFooException;

	/**
	* Returns the first foo in the ordered set where title = &#63;.
	*
	* @param title the title
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching foo, or <code>null</code> if a matching foo could not be found
	*/
	public Foo fetchByTitle_First(java.lang.String title,
		com.liferay.portal.kernel.util.OrderByComparator<Foo> orderByComparator);

	/**
	* Returns the last foo in the ordered set where title = &#63;.
	*
	* @param title the title
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching foo
	* @throws NoSuchFooException if a matching foo could not be found
	*/
	public Foo findByTitle_Last(java.lang.String title,
		com.liferay.portal.kernel.util.OrderByComparator<Foo> orderByComparator)
		throws NoSuchFooException;

	/**
	* Returns the last foo in the ordered set where title = &#63;.
	*
	* @param title the title
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching foo, or <code>null</code> if a matching foo could not be found
	*/
	public Foo fetchByTitle_Last(java.lang.String title,
		com.liferay.portal.kernel.util.OrderByComparator<Foo> orderByComparator);

	/**
	* Returns the foos before and after the current foo in the ordered set where title = &#63;.
	*
	* @param fooId the primary key of the current foo
	* @param title the title
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next foo
	* @throws NoSuchFooException if a foo with the primary key could not be found
	*/
	public Foo[] findByTitle_PrevAndNext(long fooId, java.lang.String title,
		com.liferay.portal.kernel.util.OrderByComparator<Foo> orderByComparator)
		throws NoSuchFooException;

	/**
	* Removes all the foos where title = &#63; from the database.
	*
	* @param title the title
	*/
	public void removeByTitle(java.lang.String title);

	/**
	* Returns the number of foos where title = &#63;.
	*
	* @param title the title
	* @return the number of matching foos
	*/
	public int countByTitle(java.lang.String title);

	/**
	* Returns all the foos where fooBooleanStat = &#63;.
	*
	* @param fooBooleanStat the foo boolean stat
	* @return the matching foos
	*/
	public java.util.List<Foo> findByFooBooleanStat(boolean fooBooleanStat);

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
	public java.util.List<Foo> findByFooBooleanStat(boolean fooBooleanStat,
		int start, int end);

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
	public java.util.List<Foo> findByFooBooleanStat(boolean fooBooleanStat,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Foo> orderByComparator);

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
	public java.util.List<Foo> findByFooBooleanStat(boolean fooBooleanStat,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Foo> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first foo in the ordered set where fooBooleanStat = &#63;.
	*
	* @param fooBooleanStat the foo boolean stat
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching foo
	* @throws NoSuchFooException if a matching foo could not be found
	*/
	public Foo findByFooBooleanStat_First(boolean fooBooleanStat,
		com.liferay.portal.kernel.util.OrderByComparator<Foo> orderByComparator)
		throws NoSuchFooException;

	/**
	* Returns the first foo in the ordered set where fooBooleanStat = &#63;.
	*
	* @param fooBooleanStat the foo boolean stat
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching foo, or <code>null</code> if a matching foo could not be found
	*/
	public Foo fetchByFooBooleanStat_First(boolean fooBooleanStat,
		com.liferay.portal.kernel.util.OrderByComparator<Foo> orderByComparator);

	/**
	* Returns the last foo in the ordered set where fooBooleanStat = &#63;.
	*
	* @param fooBooleanStat the foo boolean stat
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching foo
	* @throws NoSuchFooException if a matching foo could not be found
	*/
	public Foo findByFooBooleanStat_Last(boolean fooBooleanStat,
		com.liferay.portal.kernel.util.OrderByComparator<Foo> orderByComparator)
		throws NoSuchFooException;

	/**
	* Returns the last foo in the ordered set where fooBooleanStat = &#63;.
	*
	* @param fooBooleanStat the foo boolean stat
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching foo, or <code>null</code> if a matching foo could not be found
	*/
	public Foo fetchByFooBooleanStat_Last(boolean fooBooleanStat,
		com.liferay.portal.kernel.util.OrderByComparator<Foo> orderByComparator);

	/**
	* Returns the foos before and after the current foo in the ordered set where fooBooleanStat = &#63;.
	*
	* @param fooId the primary key of the current foo
	* @param fooBooleanStat the foo boolean stat
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next foo
	* @throws NoSuchFooException if a foo with the primary key could not be found
	*/
	public Foo[] findByFooBooleanStat_PrevAndNext(long fooId,
		boolean fooBooleanStat,
		com.liferay.portal.kernel.util.OrderByComparator<Foo> orderByComparator)
		throws NoSuchFooException;

	/**
	* Removes all the foos where fooBooleanStat = &#63; from the database.
	*
	* @param fooBooleanStat the foo boolean stat
	*/
	public void removeByFooBooleanStat(boolean fooBooleanStat);

	/**
	* Returns the number of foos where fooBooleanStat = &#63;.
	*
	* @param fooBooleanStat the foo boolean stat
	* @return the number of matching foos
	*/
	public int countByFooBooleanStat(boolean fooBooleanStat);

	/**
	* Returns all the foos where fooDateTime = &#63;.
	*
	* @param fooDateTime the foo date time
	* @return the matching foos
	*/
	public java.util.List<Foo> findByFooDateTime(Date fooDateTime);

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
	public java.util.List<Foo> findByFooDateTime(Date fooDateTime, int start,
		int end);

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
	public java.util.List<Foo> findByFooDateTime(Date fooDateTime, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<Foo> orderByComparator);

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
	public java.util.List<Foo> findByFooDateTime(Date fooDateTime, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<Foo> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first foo in the ordered set where fooDateTime = &#63;.
	*
	* @param fooDateTime the foo date time
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching foo
	* @throws NoSuchFooException if a matching foo could not be found
	*/
	public Foo findByFooDateTime_First(Date fooDateTime,
		com.liferay.portal.kernel.util.OrderByComparator<Foo> orderByComparator)
		throws NoSuchFooException;

	/**
	* Returns the first foo in the ordered set where fooDateTime = &#63;.
	*
	* @param fooDateTime the foo date time
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching foo, or <code>null</code> if a matching foo could not be found
	*/
	public Foo fetchByFooDateTime_First(Date fooDateTime,
		com.liferay.portal.kernel.util.OrderByComparator<Foo> orderByComparator);

	/**
	* Returns the last foo in the ordered set where fooDateTime = &#63;.
	*
	* @param fooDateTime the foo date time
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching foo
	* @throws NoSuchFooException if a matching foo could not be found
	*/
	public Foo findByFooDateTime_Last(Date fooDateTime,
		com.liferay.portal.kernel.util.OrderByComparator<Foo> orderByComparator)
		throws NoSuchFooException;

	/**
	* Returns the last foo in the ordered set where fooDateTime = &#63;.
	*
	* @param fooDateTime the foo date time
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching foo, or <code>null</code> if a matching foo could not be found
	*/
	public Foo fetchByFooDateTime_Last(Date fooDateTime,
		com.liferay.portal.kernel.util.OrderByComparator<Foo> orderByComparator);

	/**
	* Returns the foos before and after the current foo in the ordered set where fooDateTime = &#63;.
	*
	* @param fooId the primary key of the current foo
	* @param fooDateTime the foo date time
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next foo
	* @throws NoSuchFooException if a foo with the primary key could not be found
	*/
	public Foo[] findByFooDateTime_PrevAndNext(long fooId, Date fooDateTime,
		com.liferay.portal.kernel.util.OrderByComparator<Foo> orderByComparator)
		throws NoSuchFooException;

	/**
	* Removes all the foos where fooDateTime = &#63; from the database.
	*
	* @param fooDateTime the foo date time
	*/
	public void removeByFooDateTime(Date fooDateTime);

	/**
	* Returns the number of foos where fooDateTime = &#63;.
	*
	* @param fooDateTime the foo date time
	* @return the number of matching foos
	*/
	public int countByFooDateTime(Date fooDateTime);

	/**
	* Returns all the foos where fooDocumentLibrary = &#63;.
	*
	* @param fooDocumentLibrary the foo document library
	* @return the matching foos
	*/
	public java.util.List<Foo> findByFooDocumentLibrary(
		java.lang.String fooDocumentLibrary);

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
	public java.util.List<Foo> findByFooDocumentLibrary(
		java.lang.String fooDocumentLibrary, int start, int end);

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
	public java.util.List<Foo> findByFooDocumentLibrary(
		java.lang.String fooDocumentLibrary, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Foo> orderByComparator);

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
	public java.util.List<Foo> findByFooDocumentLibrary(
		java.lang.String fooDocumentLibrary, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Foo> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first foo in the ordered set where fooDocumentLibrary = &#63;.
	*
	* @param fooDocumentLibrary the foo document library
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching foo
	* @throws NoSuchFooException if a matching foo could not be found
	*/
	public Foo findByFooDocumentLibrary_First(
		java.lang.String fooDocumentLibrary,
		com.liferay.portal.kernel.util.OrderByComparator<Foo> orderByComparator)
		throws NoSuchFooException;

	/**
	* Returns the first foo in the ordered set where fooDocumentLibrary = &#63;.
	*
	* @param fooDocumentLibrary the foo document library
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching foo, or <code>null</code> if a matching foo could not be found
	*/
	public Foo fetchByFooDocumentLibrary_First(
		java.lang.String fooDocumentLibrary,
		com.liferay.portal.kernel.util.OrderByComparator<Foo> orderByComparator);

	/**
	* Returns the last foo in the ordered set where fooDocumentLibrary = &#63;.
	*
	* @param fooDocumentLibrary the foo document library
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching foo
	* @throws NoSuchFooException if a matching foo could not be found
	*/
	public Foo findByFooDocumentLibrary_Last(
		java.lang.String fooDocumentLibrary,
		com.liferay.portal.kernel.util.OrderByComparator<Foo> orderByComparator)
		throws NoSuchFooException;

	/**
	* Returns the last foo in the ordered set where fooDocumentLibrary = &#63;.
	*
	* @param fooDocumentLibrary the foo document library
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching foo, or <code>null</code> if a matching foo could not be found
	*/
	public Foo fetchByFooDocumentLibrary_Last(
		java.lang.String fooDocumentLibrary,
		com.liferay.portal.kernel.util.OrderByComparator<Foo> orderByComparator);

	/**
	* Returns the foos before and after the current foo in the ordered set where fooDocumentLibrary = &#63;.
	*
	* @param fooId the primary key of the current foo
	* @param fooDocumentLibrary the foo document library
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next foo
	* @throws NoSuchFooException if a foo with the primary key could not be found
	*/
	public Foo[] findByFooDocumentLibrary_PrevAndNext(long fooId,
		java.lang.String fooDocumentLibrary,
		com.liferay.portal.kernel.util.OrderByComparator<Foo> orderByComparator)
		throws NoSuchFooException;

	/**
	* Removes all the foos where fooDocumentLibrary = &#63; from the database.
	*
	* @param fooDocumentLibrary the foo document library
	*/
	public void removeByFooDocumentLibrary(java.lang.String fooDocumentLibrary);

	/**
	* Returns the number of foos where fooDocumentLibrary = &#63;.
	*
	* @param fooDocumentLibrary the foo document library
	* @return the number of matching foos
	*/
	public int countByFooDocumentLibrary(java.lang.String fooDocumentLibrary);

	/**
	* Returns all the foos where fooDouble = &#63;.
	*
	* @param fooDouble the foo double
	* @return the matching foos
	*/
	public java.util.List<Foo> findByFooDouble(double fooDouble);

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
	public java.util.List<Foo> findByFooDouble(double fooDouble, int start,
		int end);

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
	public java.util.List<Foo> findByFooDouble(double fooDouble, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<Foo> orderByComparator);

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
	public java.util.List<Foo> findByFooDouble(double fooDouble, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<Foo> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first foo in the ordered set where fooDouble = &#63;.
	*
	* @param fooDouble the foo double
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching foo
	* @throws NoSuchFooException if a matching foo could not be found
	*/
	public Foo findByFooDouble_First(double fooDouble,
		com.liferay.portal.kernel.util.OrderByComparator<Foo> orderByComparator)
		throws NoSuchFooException;

	/**
	* Returns the first foo in the ordered set where fooDouble = &#63;.
	*
	* @param fooDouble the foo double
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching foo, or <code>null</code> if a matching foo could not be found
	*/
	public Foo fetchByFooDouble_First(double fooDouble,
		com.liferay.portal.kernel.util.OrderByComparator<Foo> orderByComparator);

	/**
	* Returns the last foo in the ordered set where fooDouble = &#63;.
	*
	* @param fooDouble the foo double
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching foo
	* @throws NoSuchFooException if a matching foo could not be found
	*/
	public Foo findByFooDouble_Last(double fooDouble,
		com.liferay.portal.kernel.util.OrderByComparator<Foo> orderByComparator)
		throws NoSuchFooException;

	/**
	* Returns the last foo in the ordered set where fooDouble = &#63;.
	*
	* @param fooDouble the foo double
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching foo, or <code>null</code> if a matching foo could not be found
	*/
	public Foo fetchByFooDouble_Last(double fooDouble,
		com.liferay.portal.kernel.util.OrderByComparator<Foo> orderByComparator);

	/**
	* Returns the foos before and after the current foo in the ordered set where fooDouble = &#63;.
	*
	* @param fooId the primary key of the current foo
	* @param fooDouble the foo double
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next foo
	* @throws NoSuchFooException if a foo with the primary key could not be found
	*/
	public Foo[] findByFooDouble_PrevAndNext(long fooId, double fooDouble,
		com.liferay.portal.kernel.util.OrderByComparator<Foo> orderByComparator)
		throws NoSuchFooException;

	/**
	* Removes all the foos where fooDouble = &#63; from the database.
	*
	* @param fooDouble the foo double
	*/
	public void removeByFooDouble(double fooDouble);

	/**
	* Returns the number of foos where fooDouble = &#63;.
	*
	* @param fooDouble the foo double
	* @return the number of matching foos
	*/
	public int countByFooDouble(double fooDouble);

	/**
	* Returns all the foos where fooInteger = &#63;.
	*
	* @param fooInteger the foo integer
	* @return the matching foos
	*/
	public java.util.List<Foo> findByFooInteger(int fooInteger);

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
	public java.util.List<Foo> findByFooInteger(int fooInteger, int start,
		int end);

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
	public java.util.List<Foo> findByFooInteger(int fooInteger, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<Foo> orderByComparator);

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
	public java.util.List<Foo> findByFooInteger(int fooInteger, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<Foo> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first foo in the ordered set where fooInteger = &#63;.
	*
	* @param fooInteger the foo integer
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching foo
	* @throws NoSuchFooException if a matching foo could not be found
	*/
	public Foo findByFooInteger_First(int fooInteger,
		com.liferay.portal.kernel.util.OrderByComparator<Foo> orderByComparator)
		throws NoSuchFooException;

	/**
	* Returns the first foo in the ordered set where fooInteger = &#63;.
	*
	* @param fooInteger the foo integer
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching foo, or <code>null</code> if a matching foo could not be found
	*/
	public Foo fetchByFooInteger_First(int fooInteger,
		com.liferay.portal.kernel.util.OrderByComparator<Foo> orderByComparator);

	/**
	* Returns the last foo in the ordered set where fooInteger = &#63;.
	*
	* @param fooInteger the foo integer
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching foo
	* @throws NoSuchFooException if a matching foo could not be found
	*/
	public Foo findByFooInteger_Last(int fooInteger,
		com.liferay.portal.kernel.util.OrderByComparator<Foo> orderByComparator)
		throws NoSuchFooException;

	/**
	* Returns the last foo in the ordered set where fooInteger = &#63;.
	*
	* @param fooInteger the foo integer
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching foo, or <code>null</code> if a matching foo could not be found
	*/
	public Foo fetchByFooInteger_Last(int fooInteger,
		com.liferay.portal.kernel.util.OrderByComparator<Foo> orderByComparator);

	/**
	* Returns the foos before and after the current foo in the ordered set where fooInteger = &#63;.
	*
	* @param fooId the primary key of the current foo
	* @param fooInteger the foo integer
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next foo
	* @throws NoSuchFooException if a foo with the primary key could not be found
	*/
	public Foo[] findByFooInteger_PrevAndNext(long fooId, int fooInteger,
		com.liferay.portal.kernel.util.OrderByComparator<Foo> orderByComparator)
		throws NoSuchFooException;

	/**
	* Removes all the foos where fooInteger = &#63; from the database.
	*
	* @param fooInteger the foo integer
	*/
	public void removeByFooInteger(int fooInteger);

	/**
	* Returns the number of foos where fooInteger = &#63;.
	*
	* @param fooInteger the foo integer
	* @return the number of matching foos
	*/
	public int countByFooInteger(int fooInteger);

	/**
	* Returns all the foos where fooRichText = &#63;.
	*
	* @param fooRichText the foo rich text
	* @return the matching foos
	*/
	public java.util.List<Foo> findByFooRichText(java.lang.String fooRichText);

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
	public java.util.List<Foo> findByFooRichText(java.lang.String fooRichText,
		int start, int end);

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
	public java.util.List<Foo> findByFooRichText(java.lang.String fooRichText,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Foo> orderByComparator);

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
	public java.util.List<Foo> findByFooRichText(java.lang.String fooRichText,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Foo> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first foo in the ordered set where fooRichText = &#63;.
	*
	* @param fooRichText the foo rich text
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching foo
	* @throws NoSuchFooException if a matching foo could not be found
	*/
	public Foo findByFooRichText_First(java.lang.String fooRichText,
		com.liferay.portal.kernel.util.OrderByComparator<Foo> orderByComparator)
		throws NoSuchFooException;

	/**
	* Returns the first foo in the ordered set where fooRichText = &#63;.
	*
	* @param fooRichText the foo rich text
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching foo, or <code>null</code> if a matching foo could not be found
	*/
	public Foo fetchByFooRichText_First(java.lang.String fooRichText,
		com.liferay.portal.kernel.util.OrderByComparator<Foo> orderByComparator);

	/**
	* Returns the last foo in the ordered set where fooRichText = &#63;.
	*
	* @param fooRichText the foo rich text
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching foo
	* @throws NoSuchFooException if a matching foo could not be found
	*/
	public Foo findByFooRichText_Last(java.lang.String fooRichText,
		com.liferay.portal.kernel.util.OrderByComparator<Foo> orderByComparator)
		throws NoSuchFooException;

	/**
	* Returns the last foo in the ordered set where fooRichText = &#63;.
	*
	* @param fooRichText the foo rich text
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching foo, or <code>null</code> if a matching foo could not be found
	*/
	public Foo fetchByFooRichText_Last(java.lang.String fooRichText,
		com.liferay.portal.kernel.util.OrderByComparator<Foo> orderByComparator);

	/**
	* Returns the foos before and after the current foo in the ordered set where fooRichText = &#63;.
	*
	* @param fooId the primary key of the current foo
	* @param fooRichText the foo rich text
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next foo
	* @throws NoSuchFooException if a foo with the primary key could not be found
	*/
	public Foo[] findByFooRichText_PrevAndNext(long fooId,
		java.lang.String fooRichText,
		com.liferay.portal.kernel.util.OrderByComparator<Foo> orderByComparator)
		throws NoSuchFooException;

	/**
	* Removes all the foos where fooRichText = &#63; from the database.
	*
	* @param fooRichText the foo rich text
	*/
	public void removeByFooRichText(java.lang.String fooRichText);

	/**
	* Returns the number of foos where fooRichText = &#63;.
	*
	* @param fooRichText the foo rich text
	* @return the number of matching foos
	*/
	public int countByFooRichText(java.lang.String fooRichText);

	/**
	* Returns all the foos where fooText = &#63;.
	*
	* @param fooText the foo text
	* @return the matching foos
	*/
	public java.util.List<Foo> findByFooText(java.lang.String fooText);

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
	public java.util.List<Foo> findByFooText(java.lang.String fooText,
		int start, int end);

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
	public java.util.List<Foo> findByFooText(java.lang.String fooText,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Foo> orderByComparator);

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
	public java.util.List<Foo> findByFooText(java.lang.String fooText,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Foo> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first foo in the ordered set where fooText = &#63;.
	*
	* @param fooText the foo text
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching foo
	* @throws NoSuchFooException if a matching foo could not be found
	*/
	public Foo findByFooText_First(java.lang.String fooText,
		com.liferay.portal.kernel.util.OrderByComparator<Foo> orderByComparator)
		throws NoSuchFooException;

	/**
	* Returns the first foo in the ordered set where fooText = &#63;.
	*
	* @param fooText the foo text
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching foo, or <code>null</code> if a matching foo could not be found
	*/
	public Foo fetchByFooText_First(java.lang.String fooText,
		com.liferay.portal.kernel.util.OrderByComparator<Foo> orderByComparator);

	/**
	* Returns the last foo in the ordered set where fooText = &#63;.
	*
	* @param fooText the foo text
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching foo
	* @throws NoSuchFooException if a matching foo could not be found
	*/
	public Foo findByFooText_Last(java.lang.String fooText,
		com.liferay.portal.kernel.util.OrderByComparator<Foo> orderByComparator)
		throws NoSuchFooException;

	/**
	* Returns the last foo in the ordered set where fooText = &#63;.
	*
	* @param fooText the foo text
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching foo, or <code>null</code> if a matching foo could not be found
	*/
	public Foo fetchByFooText_Last(java.lang.String fooText,
		com.liferay.portal.kernel.util.OrderByComparator<Foo> orderByComparator);

	/**
	* Returns the foos before and after the current foo in the ordered set where fooText = &#63;.
	*
	* @param fooId the primary key of the current foo
	* @param fooText the foo text
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next foo
	* @throws NoSuchFooException if a foo with the primary key could not be found
	*/
	public Foo[] findByFooText_PrevAndNext(long fooId,
		java.lang.String fooText,
		com.liferay.portal.kernel.util.OrderByComparator<Foo> orderByComparator)
		throws NoSuchFooException;

	/**
	* Removes all the foos where fooText = &#63; from the database.
	*
	* @param fooText the foo text
	*/
	public void removeByFooText(java.lang.String fooText);

	/**
	* Returns the number of foos where fooText = &#63;.
	*
	* @param fooText the foo text
	* @return the number of matching foos
	*/
	public int countByFooText(java.lang.String fooText);

	/**
	* Caches the foo in the entity cache if it is enabled.
	*
	* @param foo the foo
	*/
	public void cacheResult(Foo foo);

	/**
	* Caches the foos in the entity cache if it is enabled.
	*
	* @param foos the foos
	*/
	public void cacheResult(java.util.List<Foo> foos);

	/**
	* Creates a new foo with the primary key. Does not add the foo to the database.
	*
	* @param fooId the primary key for the new foo
	* @return the new foo
	*/
	public Foo create(long fooId);

	/**
	* Removes the foo with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param fooId the primary key of the foo
	* @return the foo that was removed
	* @throws NoSuchFooException if a foo with the primary key could not be found
	*/
	public Foo remove(long fooId) throws NoSuchFooException;

	public Foo updateImpl(Foo foo);

	/**
	* Returns the foo with the primary key or throws a {@link NoSuchFooException} if it could not be found.
	*
	* @param fooId the primary key of the foo
	* @return the foo
	* @throws NoSuchFooException if a foo with the primary key could not be found
	*/
	public Foo findByPrimaryKey(long fooId) throws NoSuchFooException;

	/**
	* Returns the foo with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param fooId the primary key of the foo
	* @return the foo, or <code>null</code> if a foo with the primary key could not be found
	*/
	public Foo fetchByPrimaryKey(long fooId);

	@Override
	public java.util.Map<java.io.Serializable, Foo> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the foos.
	*
	* @return the foos
	*/
	public java.util.List<Foo> findAll();

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
	public java.util.List<Foo> findAll(int start, int end);

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
	public java.util.List<Foo> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Foo> orderByComparator);

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
	public java.util.List<Foo> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Foo> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the foos from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of foos.
	*
	* @return the number of foos
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}