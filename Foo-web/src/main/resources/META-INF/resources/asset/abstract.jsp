
<%@include file="../init.jsp" %>
<%@ page import="com.liferay.foo.model.Foo" %>

<%@ page import="com.liferay.portal.kernel.util.StringPool" %>
<%@ page import="com.liferay.portal.kernel.util.HttpUtil" %>
<%@ page import="com.liferay.portal.kernel.util.HtmlUtil" %>


<jsp:useBean id="foo" type="com.liferay.foo.model.Foo" scope="request"/>

<portlet:defineObjects />

<%= foo.getFooTitleName() %>

