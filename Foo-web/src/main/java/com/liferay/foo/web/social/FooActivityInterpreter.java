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



package com.liferay.foo.web.social;

import com.liferay.portal.kernel.util.AggregateResourceBundleLoader;
import com.liferay.portal.kernel.util.ResourceBundleLoader;
import com.liferay.portal.kernel.util.ResourceBundleLoaderUtil;
import com.liferay.social.kernel.model.BaseSocialActivityInterpreter;
import com.liferay.social.kernel.model.SocialActivityInterpreter;
import com.liferay.foo.constants.FooPortletKeys;
import com.liferay.foo.model.Foo;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * Foo Activity Interpreter
 *
 * @author Yasuyuki Takeo
 * @author liferay
 */
@Component(
    property = {"javax.portlet.name=" + FooPortletKeys.FOO},
    service = SocialActivityInterpreter.class
)
public class FooActivityInterpreter extends BaseSocialActivityInterpreter {

    @Override
    public String[] getClassNames() {
        return _CLASS_NAMES;
    }

    @Override
    protected ResourceBundleLoader getResourceBundleLoader() {
        return _resourceBundleLoader;
    }

    @Reference(
        target = "(bundle.symbolic.name=com.liferay.foo.web)", unbind = "-"
    )
    protected void setResourceBundleLoader(
        ResourceBundleLoader resourceBundleLoader) {

        _resourceBundleLoader = new AggregateResourceBundleLoader(
            resourceBundleLoader,
            ResourceBundleLoaderUtil.getPortalResourceBundleLoader());
    }

    private ResourceBundleLoader _resourceBundleLoader;
    private static final String[] _CLASS_NAMES = {Foo.class.getName()};

}
