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



package com.liferay.foo.web.portlet.action;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.TrashedModel;
import com.liferay.portal.kernel.portlet.bridges.mvc.BaseMVCActionCommand;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.security.permission.ActionKeys;
import com.liferay.portal.kernel.security.permission.PermissionChecker;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextFactory;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.Constants;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.foo.constants.FooPortletKeys;
import com.liferay.foo.exception.FooValidateException;
import com.liferay.foo.model.Foo;
import com.liferay.foo.service.FooLocalService;
import com.liferay.foo.service.permission.FooPermissionChecker;
import com.liferay.foo.service.permission.FooResourcePermissionChecker;
import com.liferay.trash.kernel.util.TrashUtil;

import java.util.ArrayList;
import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author Yasuyuki Takeo
 * @author liferay
 */
@Component(
    immediate = true, property = {
        "javax.portlet.name=" + FooPortletKeys.FOO,
        "mvc.command.name=/foo/crud"
    },
    service = MVCActionCommand.class
)
public class FooCrudMVCActionCommand
    extends BaseMVCActionCommand {

    @Override
    protected void doProcessAction(ActionRequest request, ActionResponse response) {

        try {
            // Fetch command
            String cmd = ParamUtil.getString(request, Constants.CMD);

            if (cmd.equals(Constants.ADD)) {
                addEntry(request, response);

            } else if (cmd.equals(Constants.UPDATE)) {
                updateEntry(request, response);

            } else if (cmd.equals(Constants.DELETE)) {
                deleteEntry(request, response, false);

            } else if (cmd.equals(Constants.MOVE_TO_TRASH)) {
                deleteEntry(request, response, true);

            }
        } catch (FooValidateException e) {
            for (String error : e.getErrors()) {
                SessionErrors.add(request, error);
            }
            PortalUtil.copyRequestParameters(request, response);
            response.setRenderParameter(
                "mvcRenderCommandName",
                "/foo/crud");
            hideDefaultSuccessMessage(request);
        } catch (Throwable t) {

            _log.error(t, t);
            SessionErrors.add(request, PortalException.class);
            hideDefaultSuccessMessage(request);
        }
    }

    /**
     * Delte Entry
     *
     * @param request
     * @param response
     * @param moveToTrash true to move to trush.
     * @throws PortalException
     * @throws Exception
     */
    public void deleteEntry(
        ActionRequest request, ActionResponse response, boolean moveToTrash)
        throws PortalException {
        long[] deleteEntryIds = null;
        ThemeDisplay themeDisplay = (ThemeDisplay) request
            .getAttribute(WebKeys.THEME_DISPLAY);
        PermissionChecker permissionChecker = themeDisplay
            .getPermissionChecker();

        long entryId = ParamUtil.getLong(request, "resourcePrimKey", 0L);

        if (entryId > 0) {
            deleteEntryIds = new long[] {
                entryId };
        } else {
            deleteEntryIds = StringUtil
                .split(ParamUtil.getString(request, "deleteEntryIds"), 0L);
        }

        List<TrashedModel> trashedModels = new ArrayList<>();

        for (long deleteEntryId : deleteEntryIds) {

            // Permission check
            if (!FooPermissionChecker.contains(
                    permissionChecker, deleteEntryId, ActionKeys.DELETE)) {
                SessionErrors.add(request, "permission-error for ID - "
                    + String.valueOf(deleteEntryId));
                continue;
            }

            if (moveToTrash) {
                Foo entry = _fooLocalService
                    .moveEntryToTrash(themeDisplay.getUserId(), deleteEntryId);

                trashedModels.add(entry);
            } else {
                _fooLocalService.deleteEntry(deleteEntryId);
            }
        }

        if (moveToTrash && !trashedModels.isEmpty()) {
            TrashUtil.addTrashSessionMessages(request, trashedModels);

            SessionMessages.add(
                request, SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_SUCCESS_MESSAGE);
        } else {
            SessionMessages.add(request, "foo-deleted-successfully");
        }
    }

    /**
     * Add Entry
     *
     * @param request
     * @param response
     * @throws FooValidateException, Exception
     */
    public void addEntry(ActionRequest request, ActionResponse response)
        throws FooValidateException, Exception {
        ThemeDisplay themeDisplay = (ThemeDisplay) request
            .getAttribute(WebKeys.THEME_DISPLAY);
        PermissionChecker permissionChecker = themeDisplay
            .getPermissionChecker();

        long primaryKey = ParamUtil.getLong(request, "resourcePrimKey", 0);

        Foo entry = _fooLocalService
            .getFooFromRequest(primaryKey, request);

        // Permission check
        if (!FooResourcePermissionChecker.contains(
                permissionChecker, themeDisplay.getScopeGroupId(), ActionKeys.ADD_ENTRY)) {
            List<String> error = new ArrayList<>();
            error.add("permission-error");
            throw new FooValidateException(error);
        }

        ServiceContext serviceContext = ServiceContextFactory
            .getInstance(Foo.class.getName(), request);

        // Add entry
        _fooLocalService.addEntry(entry, serviceContext);

        SessionMessages.add(request, "foo-added-successfully");
    }

    /**
     * Update Entry
     *
     * @param request
     * @param response
     * @throws Exception
     */
    public void updateEntry(ActionRequest request, ActionResponse response)
        throws Exception {
        ThemeDisplay themeDisplay = (ThemeDisplay) request
            .getAttribute(WebKeys.THEME_DISPLAY);
        PermissionChecker permissionChecker = themeDisplay
            .getPermissionChecker();

        long primaryKey = ParamUtil.getLong(request, "resourcePrimKey", 0);

        Foo entry = _fooLocalService
            .getFooFromRequest(primaryKey, request);

        // Permission check
        if (!FooPermissionChecker.contains(
                permissionChecker, entry.getPrimaryKey(), ActionKeys.UPDATE)) {
            List<String> error = new ArrayList<>();
            error.add("permission-error");
            throw new FooValidateException(error);
        }

        ServiceContext serviceContext = ServiceContextFactory
            .getInstance(Foo.class.getName(), request);

        //Update entry
        _fooLocalService.updateEntry(entry, serviceContext);

        SessionMessages.add(request, "foo-updated-successfully");
    }

    @Reference(unbind = "-")
    protected void setFooLocalService(
        FooLocalService foolocalservice) {
        _fooLocalService = foolocalservice;
    }

    private FooLocalService _fooLocalService;

    private static Log _log = LogFactoryUtil
        .getLog(FooCrudMVCActionCommand.class);
}