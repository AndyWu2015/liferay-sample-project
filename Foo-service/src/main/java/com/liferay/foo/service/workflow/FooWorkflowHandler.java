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



package com.liferay.foo.service.workflow;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.security.permission.ResourceActionsUtil;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.workflow.BaseWorkflowHandler;
import com.liferay.portal.kernel.workflow.WorkflowConstants;
import com.liferay.portal.kernel.workflow.WorkflowHandler;
import com.liferay.foo.model.Foo;
import com.liferay.foo.service.FooLocalService;

import java.io.Serializable;
import java.util.Locale;
import java.util.Map;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * Workflow Handler
 *
 * @author Yasuyuki Takeo
 * @author liferay
 */
@Component(
    property = {"model.class.name=com.liferay.foo.model.Foo"},
    service = WorkflowHandler.class
)
public class FooWorkflowHandler extends BaseWorkflowHandler<Foo> {

    @Override
    public String getClassName() {
        return Foo.class.getName();
    }

    @Override
    public String getType(Locale locale) {
        return ResourceActionsUtil.getModelResource(locale, getClassName());
    }

    @Override
    public Foo updateStatus(
        int status, Map<String, Serializable> workflowContext)
        throws PortalException {

        long userId = GetterUtil.getLong(
            (String)workflowContext.get(WorkflowConstants.CONTEXT_USER_ID));
        long classPK = GetterUtil.getLong(
            (String)workflowContext.get(
                WorkflowConstants.CONTEXT_ENTRY_CLASS_PK));

        ServiceContext serviceContext = (ServiceContext)workflowContext.get(
            "serviceContext");

        return _fooLocalService.updateStatus(
            userId, classPK, status, serviceContext, workflowContext);
    }

    @Reference(unbind = "-")
    protected void setFooLocalService(
        FooLocalService fooLocalService) {

        _fooLocalService = fooLocalService;
    }

    private FooLocalService _fooLocalService;
}
