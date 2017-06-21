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

import com.liferay.asset.kernel.model.AssetRenderer;
import com.liferay.asset.kernel.model.AssetRendererFactory;
import com.liferay.asset.kernel.model.BaseAssetRendererFactory;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.foo.constants.FooPortletKeys;
import com.liferay.foo.model.Foo;
import com.liferay.foo.service.FooLocalService;

import javax.servlet.ServletContext;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * Foo Asset Renderer Factory
 *
 * @author Yasuyuki Takeo
 * @author liferay
 */
@Component(
    immediate = true,
    property = {
        "javax.portlet.name=" + FooPortletKeys.FOO
    },
    service = AssetRendererFactory.class
)
public class FooAssetRendererFactory extends BaseAssetRendererFactory<Foo> {

    public static final String TYPE = "foo";

    public FooAssetRendererFactory() {
        setClassName(Foo.class.getName());
        setLinkable(true);
        setPortletId(FooPortletKeys.FOO);
        setSearchable(true);
    }

    @Override
    public AssetRenderer<Foo> getAssetRenderer(long classPK, int type) throws PortalException {
        Foo entry = _fooLocalService.getFoo(classPK);

        FooAssetRenderer fooAssetRenderer =
            new FooAssetRenderer(entry);

        fooAssetRenderer.setAssetRendererType(type);
        fooAssetRenderer.setServletContext(_servletContext);

        return fooAssetRenderer;
    }

    @Override
    public String getClassName() {
        return Foo.class.getName();
    }

    @Override
    public String getIconCssClass() {
        return TYPE;
    }

    @Override
    public String getType() {
        return TYPE;
    }

    @Reference(
        target = "(osgi.web.symbolicname=com.liferay.foo.web)", unbind = "-"
    )
    public void setServletContext(ServletContext servletContext) {
        _servletContext = servletContext;
    }

    @Reference(unbind = "-")
    protected void setFooLocalService(FooLocalService fooLocalService) {
        _fooLocalService = fooLocalService;
    }

    private FooLocalService _fooLocalService;
    private ServletContext _servletContext;
}
