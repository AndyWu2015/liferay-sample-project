
<%@include file="/init.jsp"%>

<%
    PortletURL navigationPortletURL = renderResponse.createRenderURL();
    PortletURL portletURL = PortletURLUtil.clone(navigationPortletURL, liferayPortletResponse);

    ResultRow row = (ResultRow) request.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);
    Foo foo = (Foo) row.getObject();

    long groupId = foo.getGroupId();
    String name = Foo.class.getName();
    String primKey = String.valueOf(foo.getPrimaryKey());
%>
<liferay-ui:icon-menu
    cssClass="<%=row == null ? "entry-options inline" : StringPool.BLANK%>"
    direction="left-side" icon="<%=StringPool.BLANK%>" markupView="lexicon"
    message="<%=StringPool.BLANK%>" showWhenSingleIcon="<%=true%>">

    <c:if test="<%= FooPermissionChecker.contains(permissionChecker, foo, ActionKeys.PERMISSIONS) %>">
        <liferay-security:permissionsURL
            modelResource="com.liferay.foo.model.Foo"
            modelResourceDescription="Foo"
            resourcePrimKey="<%=String.valueOf(primKey)%>"
            var="permissionsEntryURL" />

        <liferay-ui:icon image="permissions" url="<%=permissionsEntryURL%>" />
    </c:if>

    <c:if test="<%= FooPermissionChecker.contains(permissionChecker, foo, ActionKeys.VIEW) %>">
        <portlet:renderURL var="viewFooURL">
            <portlet:param name="mvcRenderCommandName" value="/foo/crud" />
            <portlet:param name="<%=Constants.CMD%>"
                           value="<%=Constants.VIEW%>" />
            <portlet:param name="redirect" value="<%=portletURL.toString()%>" />
            <portlet:param name="resourcePrimKey" value="<%=primKey%>" />
        </portlet:renderURL>
        <liferay-ui:icon image="view" url="<%=viewFooURL.toString()%>" />
    </c:if>

    <c:if test="<%= FooPermissionChecker.contains(permissionChecker, foo, ActionKeys.UPDATE) %>">
        <portlet:renderURL var="editFooURL">
            <portlet:param name="mvcRenderCommandName" value="/foo/crud" />
            <portlet:param name="<%=Constants.CMD%>"
                           value="<%=Constants.UPDATE%>" />
            <portlet:param name="redirect" value="<%=portletURL.toString()%>" />
            <portlet:param name="resourcePrimKey" value="<%=primKey%>" />
        </portlet:renderURL>
        <liferay-ui:icon image="edit" url="<%=editFooURL.toString()%>" />
    </c:if>

    <c:if test="<%= FooPermissionChecker.contains(permissionChecker, foo, ActionKeys.DELETE) %>">
        <portlet:actionURL name="/foo/crud" var="deleteFooURL">
            <portlet:param name="<%=Constants.CMD%>"
                           value="<%=Constants.DELETE%>" />
            <portlet:param name="redirect" value="<%=portletURL.toString()%>" />
            <portlet:param name="resourcePrimKey" value="<%=primKey%>" />
        </portlet:actionURL>
        <liferay-ui:icon image="delete" url="<%=deleteFooURL.toString()%>" />
    </c:if>

    <c:if test="<%= FooPermissionChecker.contains(permissionChecker, foo, ActionKeys.DELETE) %>">
        <portlet:actionURL name="/foo/crud" var="moveToTrashFooURL">
            <portlet:param name="<%=Constants.CMD%>"
                           value="<%=Constants.MOVE_TO_TRASH%>" />
            <portlet:param name="redirect" value="<%=portletURL.toString()%>" />
            <portlet:param name="resourcePrimKey" value="<%=primKey%>" />
        </portlet:actionURL>
        <liferay-ui:icon image="trash" url="<%=moveToTrashFooURL.toString()%>" />
    </c:if>

</liferay-ui:icon-menu>
