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



package com.liferay.foo.trash;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.portlet.PortletURLFactoryUtil;
import com.liferay.portal.kernel.security.permission.PermissionChecker;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.trash.BaseTrashHandler;
import com.liferay.portal.kernel.trash.TrashHandler;
import com.liferay.portal.kernel.util.Constants;
import com.liferay.portal.kernel.util.Portal;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.foo.constants.FooPortletKeys;
import com.liferay.foo.model.Foo;
import com.liferay.foo.service.FooLocalService;
import com.liferay.foo.service.permission.FooPermissionChecker;

import javax.portlet.PortletRequest;
import javax.portlet.PortletURL;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * Trash handler
 *
 * @author Yasuyuki Takeo
 * @author liferay
 */
@Component(
    property = {"model.class.name=com.liferay.foo.model.Foo"},
    service = TrashHandler.class
)
public class FooTrashHandler
    extends BaseTrashHandler {

    @Override
    public void deleteTrashEntry(long classPK) throws PortalException {
        _fooLocalService.deleteEntry(classPK);
    }

    @Override
    public String getClassName() {
        return Foo.class.getName();
    }

    @Override
    public String getRestoreContainedModelLink(
        PortletRequest portletRequest, long classPK)
        throws PortalException {

        Foo entry = _fooLocalService.getFoo(classPK);

        PortletURL portletURL = getRestoreURL(portletRequest, classPK, true);

        portletURL.setParameter(Constants.CMD, Constants.UPDATE);
        portletURL.setParameter("resourcePrimKey", String.valueOf(entry.getPrimaryKey()));

        return portletURL.toString();
    }

    @Override
    public String getRestoreContainerModelLink(
        PortletRequest portletRequest, long classPK)
        throws PortalException {
        PortletURL portletURL = getRestoreURL(portletRequest, classPK, true);

        return portletURL.toString();
    }

    @Override
    public String getRestoreMessage(
        PortletRequest portletRequest, long classPK) {

        ThemeDisplay themeDisplay = (ThemeDisplay)portletRequest.getAttribute(
            WebKeys.THEME_DISPLAY);

        return themeDisplay.translate("Foo");
    }

    @Override
    public boolean isInTrash(long classPK) throws PortalException {
        Foo entry = _fooLocalService.getFoo(classPK);

        return entry.isInTrash();
    }

    @Override
    public void restoreTrashEntry(long userId, long classPK)
        throws PortalException {

        _fooLocalService.restoreEntryFromTrash(userId, classPK);
    }

    protected PortletURL getRestoreURL(
        PortletRequest portletRequest, long classPK, boolean containerModel)
        throws PortalException {

        PortletURL portletURL = null;

        Foo entry = _fooLocalService.getFoo(classPK);

        long plid = _portal.getPlidFromPortletId(entry.getGroupId(), FooPortletKeys.FOO);

        portletURL = PortletURLFactoryUtil.create(
            portletRequest, FooPortletKeys.FOO, plid,
            PortletRequest.RENDER_PHASE);

        if (!containerModel) {
            portletURL.setParameter(
                "mvcRenderCommandName", "/foo/crud");
        } else {
            portletURL.setParameter(
                "mvcRenderCommandName", "/foo/view");
        }

        return portletURL;
    }

    @Override
    protected boolean hasPermission(
        PermissionChecker permissionChecker, long classPK, String actionId)
        throws PortalException {

        return FooPermissionChecker.contains(
            permissionChecker, classPK, actionId);
    }

    @Reference(unbind = "-")
    protected void setFooLocalService(
        FooLocalService foolocalservice) {
        _fooLocalService = foolocalservice;
    }

    private FooLocalService _fooLocalService;

    @Reference
    private Portal _portal;
}
