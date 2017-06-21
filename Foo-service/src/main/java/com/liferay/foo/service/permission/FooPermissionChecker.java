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

import com.liferay.exportimport.kernel.staging.permission.StagingPermissionUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.portlet.PortletProvider;
import com.liferay.portal.kernel.portlet.PortletProviderUtil;
import com.liferay.portal.kernel.security.auth.PrincipalException;
import com.liferay.portal.kernel.security.permission.ActionKeys;
import com.liferay.portal.kernel.security.permission.BaseModelPermissionChecker;
import com.liferay.portal.kernel.security.permission.PermissionChecker;
import com.liferay.portal.kernel.workflow.permission.WorkflowPermissionUtil;
import com.liferay.foo.model.Foo;
import com.liferay.foo.service.FooLocalServiceUtil;

import org.osgi.service.component.annotations.Component;

/**
 * Foo Permission Checker
 *
 * @author Yasuyuki Takeo
 * @author liferay
 */
@Component(
    immediate = true,
    property = {"model.class.name=com.liferay.foo.model.Foo" }
)
public class FooPermissionChecker
    implements BaseModelPermissionChecker {

    public static void check(
        PermissionChecker permissionChecker, Foo entry, String actionId)
        throws PortalException {

        if (!contains(permissionChecker, entry, actionId)) {
            throw new PrincipalException.MustHavePermission(permissionChecker,
                                                            Foo.class.getName(), entry.getPrimaryKey(), actionId);
        }
    }

    public static void check(
        PermissionChecker permissionChecker, long entryId, String actionId)
        throws PortalException, SystemException {

        if (!contains(permissionChecker, entryId, actionId)) {
            throw new PrincipalException.MustHavePermission(permissionChecker,
                                                            Foo.class.getName(), entryId, actionId);
        }
    }

    public static boolean contains(
        PermissionChecker permissionChecker, Foo entry, String actionId) {

        String portletId = PortletProviderUtil.getPortletId(
            Foo.class.getName(), PortletProvider.Action.EDIT);

        Boolean hasPermission = StagingPermissionUtil.hasPermission(
            permissionChecker, entry.getGroupId(), Foo.class.getName(),
            entry.getPrimaryKey(), portletId, actionId);

        if (hasPermission != null) {
            return hasPermission.booleanValue();
        }

        if (entry.isDraft() || entry.isScheduled()) {
            if (actionId.equals(ActionKeys.VIEW)
                && !contains(permissionChecker, entry, ActionKeys.UPDATE)) {

                return false;
            }
        } else if (entry.isPending()) {
            hasPermission = WorkflowPermissionUtil.hasPermission(
                permissionChecker, entry.getGroupId(), Foo.class.getName(),
                entry.getPrimaryKey(), actionId);

            if (hasPermission != null) {
                return hasPermission.booleanValue();
            }
        }

        if (permissionChecker.hasOwnerPermission(entry.getCompanyId(),
                                                 Foo.class.getName(), entry.getPrimaryKey(), entry.getUserId(),
                                                 actionId)) {

            return true;
        }

        return permissionChecker.hasPermission(entry.getGroupId(),
                                               Foo.class.getName(), entry.getPrimaryKey(), actionId);
    }

    public static boolean contains(
        PermissionChecker permissionChecker, long entryId, String actionId)
        throws PortalException, SystemException {

        Foo entry = FooLocalServiceUtil.getFoo(entryId);

        return contains(permissionChecker, entry, actionId);
    }

    @Override
    public void checkBaseModel(
        PermissionChecker permissionChecker, long groupId, long primaryKey,
        String actionId) throws PortalException {
        check(permissionChecker, primaryKey, actionId);

    }
}
