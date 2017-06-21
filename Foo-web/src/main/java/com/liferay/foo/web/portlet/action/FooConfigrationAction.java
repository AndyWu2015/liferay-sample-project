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

import com.google.common.collect.Lists;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.ConfigurationAction;
import com.liferay.portal.kernel.portlet.DefaultConfigurationAction;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.foo.constants.FooPortletKeys;

import java.util.List;
import java.util.Map;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletConfig;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ConfigurationPolicy;
import org.osgi.service.component.annotations.Modified;

import aQute.bnd.annotation.metatype.Configurable;

/**
 * Foo Configuraion Aciton
 *
 * Determine the scope of the portlet configuration in DS properties of Portlet
 * class The default of this generator is Portlet Instance scope.
 *
 * Look at the elements preferences-company-wide, preferences-unique-per-layout
 * and preferences-owned-by-group to determine the right scope. The following
 * table maps out the scopes:
 *
 * liferay-portlet.xml Scope preferences-company-wide=true Company
 * preferences-owned-by-group=true AND preferences-unique-per-layout=false Group
 * preferences-owned-by-group=true AND preferences-unique-per-layout=true
 * Portlet Instance
 *
 * @author Yasuyuki Takeo
 * @author liferay
 *
 */
@Component(
    immediate = true,
    configurationPid = FooPortletKeys.FOO_CONFIG,
    configurationPolicy = ConfigurationPolicy.OPTIONAL,
    property = {
        "javax.portlet.name=" + FooPortletKeys.FOO,
    }, service = ConfigurationAction.class
)
public class FooConfigrationAction
    extends DefaultConfigurationAction {

    @Override
    public void processAction(
        PortletConfig portletConfig, ActionRequest actionRequest,
        ActionResponse actionResponse) throws Exception {

        int prefsViewType = ParamUtil.getInteger(actionRequest,
                                                 FooConfiguration.CONF_PREFS_VIEW_TYPE,
                                                 Integer.valueOf(FooConfiguration.PREFS_VIEW_TYPE_DEFAULT));
        String dateFormat = ParamUtil.getString(actionRequest,
                                                FooConfiguration.CONF_DATE_FORMAT);
        String datetimeFormat = ParamUtil.getString(actionRequest,
                                                    FooConfiguration.CONF_DATETIME_FORMAT);

        if (_log.isDebugEnabled()) {
            _log.debug("Prefs View Type :" + prefsViewType);
            _log.debug("Date Format     :" + dateFormat);
            _log.debug("Date Time Format:" + datetimeFormat);
        }

        List<String> errors = Lists.newArrayList();
        if (validate(dateFormat, datetimeFormat,
                     errors)) {
            setPreference(actionRequest,
                          FooConfiguration.CONF_PREFS_VIEW_TYPE,
                          String.valueOf(prefsViewType));
            setPreference(actionRequest, FooConfiguration.CONF_DATE_FORMAT,
                          dateFormat);
            setPreference(actionRequest,
                          FooConfiguration.CONF_DATETIME_FORMAT, datetimeFormat);

            SessionMessages.add(actionRequest, "prefs-success");
        }

        super.processAction(portletConfig, actionRequest, actionResponse);
    }

    @Override
    public void include(
        PortletConfig portletConfig, HttpServletRequest httpServletRequest,
        HttpServletResponse httpServletResponse) throws Exception {

        if (_log.isDebugEnabled()) {
            _log.debug("Foo Portlet configuration include");
        }

        httpServletRequest.setAttribute(FooConfiguration.class.getName(),
                                        _fooConfiguration);

        super.include(portletConfig, httpServletRequest, httpServletResponse);
    }

    @Activate
    @Modified
    protected void activate(Map<Object, Object> properties) {
        _fooConfiguration = Configurable
            .createConfigurable(FooConfiguration.class, properties);
    }

    /**
     * Validate Preference
     *
     * @param dateFormat Date Format
     * @param datetimeFormat Date Time Format
     * @param errors
     * @return boolean
     */
    protected boolean validate(
        String dateFormat, String datetimeFormat, List<String> errors) {
        boolean valid = true;

        if (Validator.isNull(dateFormat)) {
            errors.add("date-format-required");
            valid = false;
        } else if (Validator.isNull(datetimeFormat)) {
            errors.add("datetime-format.required");
            valid = false;
        }
        return valid;
    }

    private static final Log _log = LogFactoryUtil
        .getLog(FooConfigrationAction.class);

    private volatile FooConfiguration _fooConfiguration;
}
