
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>
<%@ taglib uri="http://liferay.com/tld/frontend" prefix="liferay-frontend" %>
<%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %>
<%@ taglib uri="http://liferay.com/tld/security" prefix="liferay-security" %>
<%@ taglib uri="http://liferay.com/tld/item-selector" prefix="liferay-item-selector" %>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@ taglib uri="http://liferay.com/tld/trash" prefix="liferay-trash" %>
<%@ taglib uri="http://liferay.com/tld/util" prefix="liferay-util" %>

<%@ page import="com.liferay.portal.kernel.util.ParamUtil" %>
<%@ page import="com.liferay.portal.kernel.language.LanguageUtil" %>
<%@ page import="com.liferay.portal.kernel.util.*" %>
<%@ page import="javax.portlet.PortletException" %>
<%@ page import="com.liferay.portal.kernel.dao.search.EmptyOnClickRowChecker" %>
<%@ page import="com.liferay.portal.kernel.dao.search.SearchContainer" %>
<%@ page import="com.liferay.portal.kernel.portlet.*" %>
<%@ page import="com.liferay.portal.kernel.util.HttpUtil"%>
<%@ page import="com.liferay.portal.kernel.language.UnicodeLanguageUtil"%>
<%@ page import="com.liferay.trash.kernel.util.TrashUtil"%>
<%@ page import="com.liferay.portal.kernel.dao.search.ResultRow" %>
<%@ page import="com.liferay.portal.kernel.util.WebKeys" %>
<%@ page import="com.liferay.portal.kernel.util.StringPool" %>
<%@ page import="com.liferay.portal.kernel.util.HtmlUtil" %>
<%@ page import="com.liferay.portal.kernel.dao.search.SearchContainer" %>
<%@ page import="com.liferay.portal.kernel.dao.search.SearchContainerResults" %>
<%@ page import="com.liferay.portal.kernel.dao.search.EmptyOnClickRowChecker" %>
<%@ page import="com.liferay.portal.kernel.dao.search.DisplayTerms" %>
<%@ page import="com.liferay.portal.kernel.service.WorkflowDefinitionLinkLocalServiceUtil"%>
<%@ page import="com.liferay.portal.kernel.dao.search.RowChecker" %>
<%@ page import="com.liferay.portal.kernel.security.permission.ActionKeys" %>
<%@ page import="javax.portlet.PortletPreferences" %>
<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.Date" %>
<%@ page import="java.util.List" %>

<%@ page import="javax.portlet.PortletURL" %>
<%@ page import="javax.portlet.WindowState" %>

<%@ page import="com.liferay.portal.kernel.model.Group" %>
<%@ page import="com.liferay.portal.kernel.service.GroupLocalServiceUtil"%>
<%@ page import="com.liferay.portal.kernel.service.LayoutLocalServiceUtil"%>
<%@ page import="com.liferay.portal.kernel.util.PortletKeys"%>
<%@ page import="com.liferay.portal.kernel.util.PortalUtil"%>
<%@ page import="com.liferay.portal.kernel.model.GroupConstants"%>

<%@ page import="com.liferay.foo.model.Foo" %>
<%@ page import="com.liferay.foo.service.FooLocalServiceUtil"%>
<%@ page import="com.liferay.foo.web.portlet.action.FooConfiguration" %>
<%@ page import="com.liferay.foo.service.permission.FooPermissionChecker" %>
<%@ page import="com.liferay.foo.service.permission.FooResourcePermissionChecker" %>
<%@ page import="com.liferay.foo.web.constants.FooWebKeys" %>
<%@ page import="com.liferay.foo.web.upload.FooItemSelectorHelper" %>
<%@ page import="com.liferay.foo.web.util.FooViewHelper" %>

<liferay-frontend:defineObjects/>
<liferay-theme:defineObjects/>
<portlet:defineObjects/>

<%
    FooConfiguration fooConfiguration =
        (FooConfiguration)
            renderRequest.getAttribute(FooConfiguration.class.getName());

    String prefsViewType = StringPool.BLANK;
    String dateFormatVal = StringPool.BLANK;
    String datetimeFormatVal = StringPool.BLANK;

    if (Validator.isNotNull(fooConfiguration)) {
        prefsViewType =
            HtmlUtil.escape(
                portletPreferences.getValue(
                    "prefsViewType", String.valueOf(fooConfiguration.prefsViewType())));

        dateFormatVal =
            HtmlUtil.escape(
                portletPreferences.getValue(
                    "dateFormat", fooConfiguration.dateFormat()));

        datetimeFormatVal =
            HtmlUtil.escape(
                portletPreferences.getValue(
                    "datetimeFormat", fooConfiguration.datetimeFormat()));
    }

%>