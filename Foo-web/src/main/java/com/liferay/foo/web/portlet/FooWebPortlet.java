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



package com.liferay.foo.web.portlet;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.foo.constants.FooPortletKeys;
import com.liferay.foo.web.portlet.action.FooConfiguration;

import java.io.IOException;
import java.util.Map;

import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Modified;

import aQute.bnd.annotation.metatype.Configurable;

/**
 * Foo Portlet
 *
 * @author Yasuyuki Takeo
 */
@Component(
    configurationPid =FooPortletKeys.FOO_CONFIG,
    immediate = true,
    property = {
        "com.liferay.portlet.preferences-unique-per-layout=true",
        "com.liferay.portlet.preferences-owned-by-group=true",
        "com.liferay.portlet.css-class-wrapper=portlet-foo",
        "com.liferay.portlet.display-category=category.sample",
        "com.liferay.portlet.instanceable=true",
        "com.liferay.portlet.use-default-template=true",
        "javax.portlet.display-name=Foo-web Portlet",
        "javax.portlet.init-param.mvc-action-command-package-prefix=com.liferay.foo.web.portlet.action" + FooPortletKeys.FOO,
        "javax.portlet.init-param.always-display-default-configuration-icons=true",
        "javax.portlet.expiration-cache=0",
        "javax.portlet.init-param.template-path=/",
        "javax.portlet.name=" + FooPortletKeys.FOO,
        "javax.portlet.resource-bundle=content.Language",
        "javax.portlet.security-role-ref=power-user,user",
        "javax.portlet.supports.mime-type=text/html"
    },
    service = Portlet.class
)
public class FooWebPortlet extends MVCPortlet {
    @Override
    public void doView(RenderRequest renderRequest, RenderResponse renderResponse)
        throws IOException, PortletException {

        renderRequest.setAttribute(FooConfiguration.class.getName(), _fooConfiguration);

        super.doView(renderRequest, renderResponse);
    }

    @Activate
    @Modified
    protected void activate(Map<Object, Object> properties) {
        _fooConfiguration = Configurable.createConfigurable(FooConfiguration.class, properties);
    }

    private volatile FooConfiguration _fooConfiguration;
}