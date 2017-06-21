
<%@ include file="/init.jsp"%>
<%
	PortletURL portletURL = PortletURLUtil.clone(renderResponse.createRenderURL(), liferayPortletResponse);
	boolean fromAsset = (request.getAttribute("fromAsset") != null
		? (Boolean) request.getAttribute("fromAsset")
		: false);
	String CMD = ParamUtil.getString(request, Constants.CMD,
		Constants.UPDATE);
	Foo foo = (Foo) request.getAttribute("foo");
	String redirect = ParamUtil.getString(request, "redirect");
%>

<portlet:actionURL name="/foo/crud" var="fooEditURL">
	<portlet:param name="<%=Constants.CMD%>" value="<%=CMD%>" />
	<portlet:param name="redirect" value="<%=portletURL.toString()%>" />
</portlet:actionURL>

<aui:fieldset>
	<aui:form name="fooEdit" action="<%=fooEditURL%>"
		method="post">
		<aui:model-context bean="<%=foo%>" model="<%=Foo.class%>" />
		<aui:input name="<%=Constants.CMD%>" type="hidden" value="<%=CMD%>" />
		<aui:input type="hidden" name="resourcePrimKey" value="<%=foo.getPrimaryKey()%>" />
		<c:if test='<%=Constants.ADD.equals(CMD)%>'>
			<aui:input type="hidden" name="addGuestPermissions" value="true" />
			<aui:input type="hidden" name="addGroupPermissions" value="true" />
		</c:if>
			<aui:input name="fooTitleName" label="title" />
			<aui:input name="fooSummaryName" label="summary" />

        <%
        	String requiredLabel = "";
        %>

 
		<%
			requiredLabel = "*";
		%>
		<liferay-ui:error key="foo-title-required"
						  message="foo-title-required" />

		<aui:input name="title" disabled="false"
				   label='<%=LanguageUtil.get(request, "foo-title")
					+ requiredLabel%>' />
			 
		<%
			requiredLabel = "";
		%>

		<aui:input name="fooBooleanStat" disabled="false"
				   label='<%=LanguageUtil.get(request, "foo-foobooleanstat")
					+ requiredLabel%>' />
			 
		<%
			requiredLabel = "";
		%>

		<aui:input name="fooDateTime" disabled="false"
				   label='<%=LanguageUtil.get(request, "foo-foodatetime")
					+ requiredLabel%>' />
			 
		<%
			requiredLabel = "";
		%>

		<aui:input name="fooDocumentLibrary" disabled="false"
				   readonly="true" type="text" label='<%=LanguageUtil.get(request,
				"foo-foodocumentlibrary") + requiredLabel%>' />
		<%
		String fooDocumentLibraryClick = renderResponse.getNamespace() + "dlBrowse('fooDocumentLibrary Files select','" +
		renderResponse.getNamespace()+"fooDocumentLibrary')";
		%>

		<aui:button onClick="<%=fooDocumentLibraryClick%>" value="select" />

			 
		<%
			requiredLabel = "";
		%>

		<aui:input name="fooDouble" disabled="false"
				   label='<%=LanguageUtil.get(request, "foo-foodouble")
					+ requiredLabel%>' />
			 
		<%
			requiredLabel = "";
		%>

		<aui:input name="fooInteger" disabled="false"
				   label='<%=LanguageUtil.get(request, "foo-foointeger")
					+ requiredLabel%>' />
			 
		<%
			requiredLabel = "";
		%>

		<aui:field-wrapper
			label="<%=LanguageUtil.get(request,\"foo-foorichtext\") + requiredLabel%>">
		<liferay-ui:input-editor name="fooRichTextEditor"
								 initMethod="initfooRichTextEditor" />
		</aui:field-wrapper>
		<aui:input disabled="false" name="fooRichText" type="hidden" />
			 
		<%
			requiredLabel = "";
		%>

		<aui:input name="fooText" disabled="false"
				   label='<%=LanguageUtil.get(request, "foo-footext")
					+ requiredLabel%>' />
			 

		<%
			if (foo.getPrimaryKey() != 0) {
		%>
		<liferay-ui:ratings className="<%=Foo.class.getName()%>"
			classPK="<%=foo.getPrimaryKey()%>" type="stars" />
		<%
			}
		%>
		<aui:input name="categories" type="assetCategories" />
		<aui:input name="tags" type="assetTags" />

		<liferay-ui:panel defaultState="closed" extended="<%=false%>"
			id="fooEntryAssetLinksPanel" persistState="<%=true%>"
			title="related-assets">
			<aui:fieldset>
				<liferay-ui:input-asset-links
					className="<%=Foo.class.getName()%>"
					classPK="<%=foo.getPrimaryKey()%>" />
			</aui:fieldset>
		</liferay-ui:panel>

		<aui:button-row>
			<%
				String publishButtonLabel = "submit";
			%>

			<%
				if (WorkflowDefinitionLinkLocalServiceUtil
					.hasWorkflowDefinitionLink(
            		themeDisplay.getCompanyId(), scopeGroupId,
					Foo.class.getName())) {
						publishButtonLabel = "submit-for-publication";
				}
			%>
			<aui:button cssClass="btn-lg"
				onClick="<%=renderResponse.getNamespace() +\"saveEditors()\"%>"
				value="<%=publishButtonLabel%>" />
				&nbsp;&nbsp;&minus; or &minus;
			<%
				if (!fromAsset) {
			%>
			<aui:button onClick="<%=redirect%>" type="cancel" />
			<%
				}
			%>
		</aui:button-row>
	</aui:form>
	<%
		if (foo.getPrimaryKey() != 0) {
	%>
	<liferay-ui:panel-container extended="<%=false%>"
		id="fooCommentsPanelContainer" persistState="<%=true%>">

		<liferay-ui:panel collapsible="<%=true%>" extended="<%=true%>"
			id="fooCommentsPanel" persistState="<%=true%>"
			title='<%=LanguageUtil.get(request, "comments")%>'>

			<portlet:actionURL name="invokeTaglibDiscussion" var="discussionURL" />

			<liferay-ui:discussion className="<%=Foo.class.getName()%>"
				classPK="<%=foo.getPrimaryKey()%>" formName="fm2"
				ratingsEnabled="<%=true%>" redirect="<%=currentURL%>"
				userId="<%=foo.getUserId()%>" />
		</liferay-ui:panel>

	</liferay-ui:panel-container>
	<%
		}
	%>
</aui:fieldset>

<aui:script>
	function <portlet:namespace />initfooRichTextEditor() {
		return '<%=UnicodeFormatter.toString(foo.getFooRichText())%>';
	}
</aui:script>


<aui:script>
	function <portlet:namespace />saveEditors() {
		document.<portlet:namespace />fooEdit.<portlet:namespace />fooRichText.value =
		window.<portlet:namespace />fooRichTextEditor.getHTML();
		submitForm(document.<portlet:namespace />fooEdit);
	}
</aui:script>

<%
	FooItemSelectorHelper fooItemSelectorHelper = (FooItemSelectorHelper) request
		.getAttribute(FooWebKeys.FOO_ITEM_SELECTOR_HELPER);
	RequestBackedPortletURLFactory requestBackedPortletURLFactory = RequestBackedPortletURLFactoryUtil
		.create(liferayPortletRequest);
	String selectItemName = liferayPortletResponse.getNamespace()
			+ "selectItem";
%>

<aui:script>
    function <portlet:namespace />dlBrowse (title, inputField) {
       	event.preventDefault();
       	var itemSrc = $('#'+inputField);
		AUI().use(
			'liferay-item-selector-dialog',
			function(A) {
				var itemSelectorDialog = new A.LiferayItemSelectorDialog(
				    {
				        eventName: '<%=selectItemName%>',
				        on: {
			                selectedItemChange: function(event) {
			                    var selectedItem = event.newVal;

			                    if (selectedItem) {
			                        var itemValue = JSON.parse(
			                        	selectedItem.value
			                        );
			                        itemSrc.val(itemValue.url);
			                    }
			                }
				        },
				        title: title,
				        url: '<%=fooItemSelectorHelper.getItemSelectorURL(
						requestBackedPortletURLFactory, themeDisplay,
						selectItemName)%>'
				    }
				);
				itemSelectorDialog.open();
			}
		);
    }
</aui:script>