
<%@ include file="/init.jsp"%>
<%
    Foo foo = (Foo) request.getAttribute("foo");
    String redirect = ParamUtil.getString(request, "redirect");
%>

<div class="container-fluid-1280">
    <aui:fieldset>
        <div class="form-group">
            <h3><liferay-ui:message key="asset-title" /></h3>
            <p class="form-control"><%=foo.getFooTitleName()%></p>
        </div>
        <div class="form-group">
            <h3><liferay-ui:message key="asset-title" /></h3>
            <p class="form-control"><%=foo.getFooSummaryName()%></p>
        </div>

        <div class="form-group">
            <h3><liferay-ui:message key="foo-fooId" /></h3>
            <p class="form-control"><%=foo.getFooId()%></p>
        </div>

        <div class="form-group">
            <h3><liferay-ui:message key="foo-title" /></h3>
            <p class="form-control"><%=foo.getTitle()%></p>
        </div>

        <div class="form-group">
            <h3><liferay-ui:message key="foo-fooBooleanStat" /></h3>
            <p class="form-control"><%=foo.getFooBooleanStat()%></p>
        </div>

        <div class="form-group">
            <h3><liferay-ui:message key="foo-fooDateTime" /></h3>
            <p class="form-control"><%=foo.getFooDateTime()%></p>
        </div>

        <div class="form-group">
            <h3><liferay-ui:message key="foo-fooDocumentLibrary" /></h3>
            <p class="form-control"><%=foo.getFooDocumentLibrary()%></p>
        </div>

        <div class="form-group">
            <h3><liferay-ui:message key="foo-fooDouble" /></h3>
            <p class="form-control"><%=foo.getFooDouble()%></p>
        </div>

        <div class="form-group">
            <h3><liferay-ui:message key="foo-fooInteger" /></h3>
            <p class="form-control"><%=foo.getFooInteger()%></p>
        </div>

        <div class="form-group">
            <h3><liferay-ui:message key="foo-fooRichText" /></h3>
            <p class="form-control"><%=foo.getFooRichText()%></p>
        </div>

        <div class="form-group">
            <h3><liferay-ui:message key="foo-fooText" /></h3>
            <p class="form-control"><%=foo.getFooText()%></p>
        </div>

        <aui:button-row>
            <aui:button cssClass="btn-lg" href="<%=redirect%>" name="backToList"
                        primary="<%=true%>" value="back-to-list" />
        </aui:button-row>
    </aui:fieldset>
</div>
