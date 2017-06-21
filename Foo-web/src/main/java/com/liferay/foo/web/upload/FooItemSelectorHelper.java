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



package com.liferay.foo.web.upload;

import com.liferay.item.selector.*;
import com.liferay.item.selector.criteria.*;
import com.liferay.item.selector.criteria.file.criterion.*;
import com.liferay.item.selector.criteria.image.criterion.*;
import com.liferay.portal.kernel.portlet.*;
import com.liferay.portal.kernel.theme.*;

import javax.portlet.*;
import java.util.*;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferenceCardinality;
import org.osgi.service.component.annotations.ReferencePolicy;
import org.osgi.service.component.annotations.ReferencePolicyOption;

/**
 * @author Yasuyuki Takeo
 */
@Component(service = FooItemSelectorHelper.class)
public class FooItemSelectorHelper {

    public String getItemSelectorURL(
        RequestBackedPortletURLFactory requestBackedPortletURLFactory,
        ThemeDisplay themeDisplay, String itemSelectedEventName) {

        List<ItemSelectorReturnType> desiredItemSelectorReturnTypes =
            new ArrayList<>();
        desiredItemSelectorReturnTypes.add(new FileEntryItemSelectorReturnType());

        FileItemSelectorCriterion fileItemSelectorCriterion =
            new FileItemSelectorCriterion();

        fileItemSelectorCriterion.setDesiredItemSelectorReturnTypes(
            desiredItemSelectorReturnTypes);

        PortletURL itemSelectorURL = _itemSelector.getItemSelectorURL(
            requestBackedPortletURLFactory, itemSelectedEventName,
            fileItemSelectorCriterion);

        return itemSelectorURL.toString();
    }

    @Reference(
        cardinality = ReferenceCardinality.OPTIONAL,
        policy = ReferencePolicy.DYNAMIC,
        policyOption = ReferencePolicyOption.GREEDY
    )
    public void setItemSelector(ItemSelector itemSelector) {
        _itemSelector = itemSelector;
    }

    public void unsetItemSelector(ItemSelector itemSelector) {
        _itemSelector = null;
    }

    private ItemSelector _itemSelector;

}
