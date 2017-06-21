
<%@ include file="/init.jsp"%>
<%
	String iconChecked = "checked";
	String iconUnchecked = "unchecked";
	PortletPreferences prefs = renderRequest.getPreferences();
 	SimpleDateFormat dateFormat = new SimpleDateFormat(prefs.getValue("dateFormat", "yyyy/MM/dd"));
	SimpleDateFormat dateTimeFormat = new SimpleDateFormat(prefs.getValue("datetimeFormat","yyyy/MM/dd HH:mm"));

	PortletURL navigationPortletURL = renderResponse.createRenderURL();
	PortletURL portletURL = PortletURLUtil.clone(navigationPortletURL, liferayPortletResponse);

	String keywords = ParamUtil.getString(request, DisplayTerms.KEYWORDS);
	int cur = ParamUtil.getInteger(request, SearchContainer.DEFAULT_CUR_PARAM);
	int delta = ParamUtil.getInteger(request, SearchContainer.DEFAULT_DELTA_PARAM);
	String orderByCol = ParamUtil.getString(request, SearchContainer.DEFAULT_ORDER_BY_COL_PARAM, "fooId");
	String orderByType = ParamUtil.getString(request, SearchContainer.DEFAULT_ORDER_BY_TYPE_PARAM, "asc");
	String[] orderColumns = new String[] {
	"fooId"
    ,"title"
    ,"fooBooleanStat"
    ,"fooDateTime"
    ,"fooDocumentLibrary"
    ,"fooDouble"
    ,"fooInteger"
    ,"fooRichText"
    ,"fooText"
	};

	navigationPortletURL.setParameter(DisplayTerms.KEYWORDS, keywords);
	navigationPortletURL.setParameter(SearchContainer.DEFAULT_CUR_PARAM, String.valueOf(cur));
	navigationPortletURL.setParameter("mvcRenderCommandName", "/foo/view");
	navigationPortletURL.setParameter(SearchContainer.DEFAULT_ORDER_BY_COL_PARAM, orderByCol);
	navigationPortletURL.setParameter(SearchContainer.DEFAULT_ORDER_BY_TYPE_PARAM, orderByType);

	FooViewHelper fooViewHelper = (FooViewHelper) request
			.getAttribute(FooWebKeys.FOO_VIEW_HELPER);
%>

<portlet:renderURL var="fooAddURL">
	<portlet:param name="mvcRenderCommandName" value="/foo/crud" />
	<portlet:param name="<%=Constants.CMD%>" value="<%=Constants.ADD%>" />
	<portlet:param name="redirect" value="<%=portletURL.toString()%>" />
</portlet:renderURL>
    <div class="container-fluid-1280 icons-container lfr-meta-actions">
		<div class="add-record-button-container pull-left">
			<c:if test="<%= FooResourcePermissionChecker.contains(permissionChecker, themeDisplay.getScopeGroupId(), ActionKeys.ADD_ENTRY) %>">
            <aui:button href="<%=fooAddURL%>" cssClass="btn btn-default"
                icon="icon-plus" value="add-foo" />
			</c:if>
        </div>
		<div class="lfr-icon-actions">
			<c:if test="<%= FooResourcePermissionChecker.contains(permissionChecker, themeDisplay.getScopeGroupId(), ActionKeys.PERMISSIONS) %>">
				<liferay-security:permissionsURL
					modelResource="com.liferay.foo"
					modelResourceDescription="<%= HtmlUtil.escape(themeDisplay.getScopeGroupName()) %>"
					resourcePrimKey="<%= String.valueOf(themeDisplay.getScopeGroupId()) %>"
					var="modelPermissionsURL"
				/>
				<liferay-ui:icon
					cssClass="lfr-icon-action pull-right"
					icon="cog"
					label="<%= true %>"
					markupView="lexicon"
					message="permissions"
					url="<%= modelPermissionsURL %>"
				/>
			</c:if>
		</div>
    </div>

<aui:nav-bar cssClass="collapse-basic-search" markupView="lexicon">
	<aui:form action="<%=portletURL.toString()%>" name="searchFm">
		<aui:nav-bar-search>
			<liferay-ui:input-search markupView="lexicon" />
		</aui:nav-bar-search>
	</aui:form>
</aui:nav-bar>

<liferay-frontend:management-bar includeCheckBox="<%=true%>"
	searchContainerId="entryList">

	<liferay-frontend:management-bar-filters>
		<liferay-frontend:management-bar-sort orderByCol="<%=orderByCol%>"
			orderByType="<%=orderByType%>" orderColumns='<%=orderColumns%>'
			portletURL="<%=navigationPortletURL%>" />
	</liferay-frontend:management-bar-filters>

	<liferay-frontend:management-bar-action-buttons>
		<liferay-frontend:management-bar-button
			href='<%="javascript:" + renderResponse.getNamespace() + "deleteEntries();"%>'
			icon='<%=TrashUtil.isTrashEnabled(scopeGroupId) ? "trash" : "times"%>'
			label='<%=TrashUtil.isTrashEnabled(scopeGroupId) ? "recycle-bin" : "delete"%>' />
	</liferay-frontend:management-bar-action-buttons>

</liferay-frontend:management-bar>

<div class="container-fluid-1280"
	id="<portlet:namespace />formContainer">

	<aui:form action="<%=navigationPortletURL.toString()%>" method="get"
		name="fm">
		<aui:input name="<%=Constants.CMD%>" type="hidden" />
		<aui:input name="redirect" type="hidden"
			value="<%=navigationPortletURL.toString()%>" />
		<aui:input name="deleteEntryIds" type="hidden" />

		<liferay-ui:success key="foo-added-successfully"
							message="foo-added-successfully" />
        <liferay-ui:success key="foo-updated-successfully"
                            message="foo-updated-successfully" />
        <liferay-ui:success key="foo-deleted-successfully"
                            message="foo-deleted-successfully" />

		<liferay-ui:error exception="<%=PortletException.class%>"
			message="there-was-an-unexpected-error.-please-refresh-the-current-page" />

		<liferay-ui:search-container id="entryList" deltaConfigurable="true"
			rowChecker="<%=new EmptyOnClickRowChecker(renderResponse)%>"
			searchContainer='<%=new SearchContainer(renderRequest,
							PortletURLUtil.clone(navigationPortletURL, liferayPortletResponse), null,
							"no-recodes-were-found")%>'>

			<liferay-ui:search-container-results>
				<%@ include file="/search_results.jspf"%>
			</liferay-ui:search-container-results>

			<liferay-ui:search-container-row
				className="com.liferay.foo.model.Foo"
				escapedModel="<%= true %>" keyProperty="fooId"
				rowIdProperty="fooId" modelVar="foo">


				<liferay-ui:search-container-column-text name="FooId"
														 property="fooId" orderable="true" orderableProperty="fooId"
														 align="left" />



				<liferay-ui:search-container-column-text name="Title"
														 property="title" orderable="true" orderableProperty="title"
														 align="left" />



				<liferay-ui:search-container-column-text name="FooBooleanStat"
														 property="fooBooleanStat" orderable="true" orderableProperty="fooBooleanStat"
														 align="left" />



				<liferay-ui:search-container-column-text name="FooDateTime"
														 value="<%= dateFormat.format(foo.getFooDateTime()) %>"
														 orderable="true" orderableProperty="fooDateTime" align="left" />



				<liferay-ui:search-container-column-text name="FooDocumentLibrary"
														 property="fooDocumentLibrary" orderable="true" orderableProperty="fooDocumentLibrary"
														 align="left" />



				<liferay-ui:search-container-column-text name="FooDouble"
														 property="fooDouble" orderable="true" orderableProperty="fooDouble"
														 align="left" />



				<liferay-ui:search-container-column-text name="FooInteger"
														 property="fooInteger" orderable="true" orderableProperty="fooInteger"
														 align="left" />




				<liferay-ui:search-container-column-text name="FooRichText"
														 align="center">
					<%
					String fooRichTextIcon = iconUnchecked;
					String fooRichText = foo.getFooRichText();
					if (!fooRichText.equals("")) {
						fooRichTextIcon= iconChecked;
					}
					%>
					<liferay-ui:icon image="<%= fooRichTextIcon %>" />
				</liferay-ui:search-container-column-text>



				<liferay-ui:search-container-column-text name="FooText"
														 align="center">
					<%
					String fooTextIcon = iconUnchecked;
					String fooText = foo.getFooText();
					if (!fooText.equals("")) {
						fooTextIcon= iconChecked;
					}
					%>
					<liferay-ui:icon image="<%= fooTextIcon %>" />
				</liferay-ui:search-container-column-text>


				<liferay-ui:search-container-column-jsp align="right"
					path="/edit_actions.jsp" />

			</liferay-ui:search-container-row>
			<liferay-ui:search-iterator displayStyle="list" markupView="lexicon" />
		</liferay-ui:search-container>
	</aui:form>
</div>

<aui:script>
	function <portlet:namespace />deleteEntries() {
		if (<%=TrashUtil.isTrashEnabled(scopeGroupId)%> || confirm('<%=UnicodeLanguageUtil.get(request, "are-you-sure-you-want-to-delete-the-selected-entries")%>')) {
			var form = AUI.$(document.<portlet:namespace />fm);

			form.attr('method', 'post');
			form.fm('<%=Constants.CMD%>').val('<%=TrashUtil.isTrashEnabled(scopeGroupId) ? Constants.MOVE_TO_TRASH : Constants.DELETE%>');
			form.fm('deleteEntryIds').val(Liferay.Util.listCheckedExcept(form, '<portlet:namespace />allRowIds'));

			submitForm(form, '<portlet:actionURL name="/foo/crud" />');
		}
	}
</aui:script>
