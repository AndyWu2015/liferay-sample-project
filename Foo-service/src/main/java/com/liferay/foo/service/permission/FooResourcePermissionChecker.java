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



package com.liferay.foo.service.permission;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.security.auth.PrincipalException;
import com.liferay.portal.kernel.security.permission.BaseResourcePermissionChecker;
import com.liferay.portal.kernel.security.permission.PermissionChecker;
import com.liferay.portal.kernel.security.permission.ResourcePermissionChecker;
import com.liferay.foo.constants.FooPortletKeys;

import org.osgi.service.component.annotations.Component;

/**
 * Foo Resource Permission Checker
 *
 * @author Yasuyuki Takeo
 * @author liferay
 */
@Component(
    immediate = true,
    property = {"resource.name=" +  FooResourcePermissionChecker.RESOURCE_NAME},
    service = ResourcePermissionChecker.class
)
public class FooResourcePermissionChecker
    extends BaseResourcePermissionChecker {

    public static final String RESOURCE_NAME = "com.liferay.foo";

    public static void check(
        PermissionChecker permissionChecker, long groupId, String actionId)
        throws PortalException {

        if (!contains(permissionChecker, groupId, actionId)) {
            throw new PrincipalException.MustHavePermission(
                permissionChecker, RESOURCE_NAME, groupId, actionId);
        }
    }

    public static boolean contains(
        PermissionChecker permissionChecker, long classPK, String actionId) {

        return contains(
            permissionChecker, RESOURCE_NAME, FooPortletKeys.FOO,
            classPK, actionId);
    }

    @Override
    public Boolean checkResource(
        PermissionChecker permissionChecker, long classPK, String actionId) {
        return contains(permissionChecker, classPK, actionId);
    }
}