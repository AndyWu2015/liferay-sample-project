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



package com.liferay.foo.web.asset;

import com.liferay.asset.kernel.model.AssetRendererFactory;
import com.liferay.asset.kernel.model.BaseJSPAssetRenderer;
import com.liferay.portal.kernel.security.permission.ActionKeys;
import com.liferay.portal.kernel.security.permission.PermissionChecker;
import com.liferay.portal.kernel.trash.TrashRenderer;
import com.liferay.portal.kernel.util.HtmlUtil;
import com.liferay.foo.model.Foo;
import com.liferay.foo.service.permission.FooPermissionChecker;

import java.util.Locale;

import javax.portlet.PortletRequest;
import javax.portlet.PortletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Foo Asset Renderer
 *
 * @author Yasuyuki Takeo
 * @author liferay
 */
public class FooAssetRenderer
    extends BaseJSPAssetRenderer<Foo>
    implements TrashRenderer {

    public FooAssetRenderer(
        Foo entry) {
        _entry = entry;
    }

    @Override
    public Foo getAssetObject() {
        return _entry;
    }

    @Override
    public String getClassName() {
        return Foo.class.getName();
    }

    @Override
    public long getClassPK() {
        return _entry.getPrimaryKey();
    }

    @Override
    public String getDiscussionPath() {
        return null;
    }

    @Override
    public long getGroupId() {
        return _entry.getGroupId();
    }

    @Override
    public String getJspPath(HttpServletRequest request, String template) {
        if (template.equals(TEMPLATE_ABSTRACT)
            || template.equals(TEMPLATE_FULL_CONTENT)) {

            request.setAttribute("foo", _entry);
            return "/asset/" + template + ".jsp";
        } else {
            return null;
        }
    }

    @Override
    public String getPortletId() {
        AssetRendererFactory<Foo> assetRendererFactory = getAssetRendererFactory();

        return assetRendererFactory.getPortletId();
    }

    @Override
    public int getStatus() {
        return _entry.getStatus();
    }

    @Override
    public String getSummary(
        PortletRequest portletRequest, PortletResponse portletResponse) {
        return HtmlUtil.stripHtml(_entry.getFooSummaryName());
    }

    @Override
    public String getTitle(Locale locale) {
        return _entry.getFooTitleName();
    }

    @Override
    public String getType() {
        return FooAssetRendererFactory.TYPE;
    }

    @Override
    public boolean include(
        HttpServletRequest request, HttpServletResponse response,
        String template) throws Exception {
        request.setAttribute("foo", _entry);

        return super.include(request, response, template);
    }

    @Override
    public long getUserId() {
        return _entry.getUserId();
    }

    @Override
    public String getUserName() {
        return _entry.getUserName();
    }

    @Override
    public String getUuid() {
        return _entry.getUuid();
    }

    public boolean hasDeletePermission(PermissionChecker permissionChecker) {
        return FooPermissionChecker.contains(permissionChecker, _entry,
                                                  ActionKeys.DELETE);
    }

    @Override
    public boolean hasEditPermission(PermissionChecker permissionChecker) {
        return FooPermissionChecker.contains(permissionChecker, _entry,
                                                  ActionKeys.UPDATE);
    }

    @Override
    public boolean hasViewPermission(PermissionChecker permissionChecker) {
        return FooPermissionChecker.contains(permissionChecker, _entry,
                                                  ActionKeys.VIEW);
    }

    private Foo _entry;

}
