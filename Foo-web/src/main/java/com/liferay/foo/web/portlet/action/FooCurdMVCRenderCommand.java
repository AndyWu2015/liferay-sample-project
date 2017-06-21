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
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCRenderCommand;
import com.liferay.portal.kernel.util.Constants;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.foo.constants.FooPortletKeys;
import com.liferay.foo.model.Foo;
import com.liferay.foo.service.FooLocalService;
import com.liferay.foo.service.FooLocalServiceUtil;
import com.liferay.foo.web.constants.FooWebKeys;
import com.liferay.foo.web.upload.FooItemSelectorHelper;
import com.liferay.foo.web.util.FooViewHelper;

import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author Yasuyuki Takeo
 */
@Component(
    immediate = true,
    property = {
        "javax.portlet.name=" + FooPortletKeys.FOO,
        "mvc.command.name=/foo/crud"
    },
    service = MVCRenderCommand.class
)
public class FooCurdMVCRenderCommand implements MVCRenderCommand {

    @Override
    public String render(RenderRequest request, RenderResponse response) throws PortletException {

        String renderJSP = FooWebKeys.VIEW_JSP;

        // Fetch command
        String cmd = ParamUtil.getString(request, Constants.CMD);

        // Fetch primary key
        long primaryKey = ParamUtil.getLong(request, "resourcePrimKey", 0);

        try {
            if (cmd.equalsIgnoreCase(Constants.UPDATE)) {

                Foo record = FooLocalServiceUtil.getFoo(primaryKey);
                request.setAttribute("foo", record);
                renderJSP = FooWebKeys.EDIT_JSP;

            } else if (cmd.equalsIgnoreCase(Constants.VIEW)) {

                Foo record = FooLocalServiceUtil.getFoo(primaryKey);
                request.setAttribute("foo", record);
                renderJSP = FooWebKeys.VIEW_RECORD_JSP;

            } else {

                Foo record = _fooLocalService.getNewObject(primaryKey);

                if (Validator.isNull(request.getParameter("addErrors"))) {

                    record = _fooLocalService.getInitializedFoo(primaryKey, request);
                } else {

                    record = _fooLocalService.getFooFromRequest(primaryKey, request);
                }
                request.setAttribute("foo", record);
                renderJSP = FooWebKeys.EDIT_JSP;
            }
        } catch (PortalException e) {
            throw new PortletException(e.getMessage());
        }

        request.setAttribute(FooWebKeys.FOO_ITEM_SELECTOR_HELPER, _fooItemSelectorHelper);

        return renderJSP;
    }

    @Reference(unbind = "-")
    protected void setFooLocalService(
        FooLocalService foolocalservice) {
        _fooLocalService = foolocalservice;
    }

    @Reference(unbind = "-")
    public void setItemSelectorHelper(
        FooItemSelectorHelper fooItemSelectorHelper) {
        _fooItemSelectorHelper = fooItemSelectorHelper;
    }

    private FooLocalService _fooLocalService;
    private FooItemSelectorHelper _fooItemSelectorHelper;

}