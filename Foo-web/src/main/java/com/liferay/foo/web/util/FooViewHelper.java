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



package com.liferay.foo.web.util;

import com.google.common.collect.Lists;
import com.liferay.portal.kernel.dao.search.DisplayTerms;
import com.liferay.portal.kernel.dao.search.SearchContainer;
import com.liferay.portal.kernel.dao.search.SearchContainerResults;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.search.Document;
import com.liferay.portal.kernel.search.Field;
import com.liferay.portal.kernel.search.Hits;
import com.liferay.portal.kernel.search.Indexer;
import com.liferay.portal.kernel.search.IndexerRegistryUtil;
import com.liferay.portal.kernel.search.SearchContext;
import com.liferay.portal.kernel.search.SearchContextFactory;
import com.liferay.portal.kernel.search.SearchException;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.OrderByComparatorFactoryUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.foo.model.Foo;
import com.liferay.foo.service.FooLocalService;
import com.liferay.foo.web.portlet.action.FooConfiguration;

import java.util.List;

import javax.portlet.PortletPreferences;
import javax.portlet.PortletRequest;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(service = FooViewHelper.class)
public class FooViewHelper {
    /**
     * Order string to boolean
     *
     * @param order
     * @return if true if order is "asc" or false
     */
    protected boolean getOrder(String order) {
        return ("asc".equalsIgnoreCase(order)) ? true : false;
    }

    /**
     *
     * Order Comparetor
     *
     * @param searchContainer
     * @return OrderByComparator
     */
    public OrderByComparator<Foo> getOrderByComparator(
        SearchContainer<?> searchContainer) {

        if (_log.isDebugEnabled()) {
            _log.debug("searchContainer.getOrderByCol()"
                           + (null != searchContainer.getOrderByCol()
                ? searchContainer.getOrderByCol()
                : "null"));
            _log.debug("searchContainer.getOrderByType()"
                           + (null != searchContainer.getOrderByType()
                ? searchContainer.getOrderByType()
                : "null"));
        }

        return OrderByComparatorFactoryUtil.create("Foo_Foo",
                                                   searchContainer.getOrderByCol(),
                                                   getOrder(searchContainer.getOrderByType()));
    }

    /**
     * Get Data list from Database
     *
     * @param request PortletRequest
     * @param searchContainer SearchContainer<?>
     * @return SearchContainerResults<Foo>
     */
    public SearchContainerResults<Foo> getListFromDB(
        PortletRequest request, SearchContainer<?> searchContainer) {

        ThemeDisplay themeDisplay = (ThemeDisplay) request
            .getAttribute(WebKeys.THEME_DISPLAY);
        PortletPreferences portletPreferences = request.getPreferences();

        // Filter type
        String prefsViewType = portletPreferences.getValue(
            FooConfiguration.CONF_PREFS_VIEW_TYPE,
            FooConfiguration.PREFS_VIEW_TYPE_DEFAULT);

        long groupId = themeDisplay.getScopeGroupId();
        int containerStart = searchContainer.getStart();
        int containerEnd = searchContainer.getEnd();

        List<Foo> results = null;
        int total = 0;

        // Get Order
        OrderByComparator<Foo> orderByComparator = getOrderByComparator(
            searchContainer);

        if (prefsViewType
            .equals(FooConfiguration.PREFS_VIEW_TYPE_DEFAULT)) {
            results = _fooLocalService.findAllInGroup(groupId,
                                                           containerStart, containerEnd, orderByComparator);
            total = _fooLocalService.countAllInGroup(groupId);

        } else if (prefsViewType
            .equals(FooConfiguration.PREFS_VIEW_TYPE_USER)) {
            results = _fooLocalService.findAllInUser(
                themeDisplay.getUserId(), containerStart, containerEnd,
                orderByComparator);
            total = _fooLocalService
                .countAllInUser(themeDisplay.getUserId());

        } else {
            results = _fooLocalService.findAllInUserAndGroup(
                themeDisplay.getUserId(), groupId, containerStart, containerEnd,
                orderByComparator);
            total = _fooLocalService
                .countAllInUserAndGroup(themeDisplay.getUserId(), groupId);

        }

        return new SearchContainerResults<>(results, total);
    }

    /**
     * Get Data list from Index
     *
     * @param request PortletRequest
     * @return searchContainer SearchContainer<?>
     * @throws SearchException
     */
    public SearchContainerResults<Foo> getListFromIndex(
        PortletRequest request, SearchContainer<?> searchContainer)
        throws SearchException {

        // Search Key
        String searchFilter = ParamUtil.getString(request,
                                                  DisplayTerms.KEYWORDS);

        Indexer<Foo> indexer = IndexerRegistryUtil
            .nullSafeGetIndexer(Foo.class);

        SearchContext searchContext = SearchContextFactory
            .getInstance(PortalUtil.getHttpServletRequest(request));

        searchContext.setKeywords(searchFilter);
        searchContext.setStart(searchContainer.getStart());
        searchContext.setEnd(searchContainer.getEnd());

        // Search in index
        Hits results = indexer.search(searchContext);

        // Initialize return values
        int total = results.getLength();
        List<Foo> tempResults = Lists.newArrayList();

        for (int i = 0; i < results.getDocs().length; i++) {
            Document doc = results.doc(i);

            Foo resReg = null;

            // Entry
            long entryId = GetterUtil.getLong(doc.get(Field.ENTRY_CLASS_PK));

            try {
                resReg = _fooLocalService.getFoo(entryId);

                resReg = resReg.toEscapedModel();

                tempResults.add(resReg);
            } catch (Exception e) {
                if (_log.isWarnEnabled()) {
                    _log.warn(
                        "Foo search index is stale and contains entry "
                            + entryId);
                }

                continue;
            }
        }

        return new SearchContainerResults<>(tempResults, total);
    }

    @Reference(unbind = "-")
    protected void setFooLocalService(
        FooLocalService fooLocalService) {
        _fooLocalService = fooLocalService;
    }

    private FooLocalService _fooLocalService;

    private static Log _log = LogFactoryUtil
        .getLog(FooViewHelper.class);
}
