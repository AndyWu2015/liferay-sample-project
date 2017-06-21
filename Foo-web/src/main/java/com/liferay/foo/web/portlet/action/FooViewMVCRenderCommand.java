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

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCRenderCommand;
import com.liferay.foo.constants.FooPortletKeys;
import com.liferay.foo.web.constants.FooWebKeys;
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
        "mvc.command.name=/",
        "mvc.command.name=/foo/view"
    },
    service = MVCRenderCommand.class
)
public class FooViewMVCRenderCommand implements MVCRenderCommand {

    @Override
    public String render(
        RenderRequest request, RenderResponse response)
        throws PortletException {

        request.setAttribute(FooWebKeys.FOO_VIEW_HELPER, _fooViewHelper);

        return "/view.jsp";
    }

    @Reference(unbind = "-")
    public void setViewHelper(
        FooViewHelper fooViewHelper) {
        _fooViewHelper = fooViewHelper;
    }

    private FooViewHelper _fooViewHelper;
}