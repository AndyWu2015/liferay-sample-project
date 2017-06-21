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



package com.liferay.foo.service.util;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.repository.model.ModelValidator;
import com.liferay.foo.exception.FooValidateException;
import com.liferay.foo.model.Foo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

/**
* Validators
*
* @author Yasuyuki Takeo
* @author liferay
*/
public class FooValidator
implements ModelValidator<Foo> {

    protected List<String> _errors = new ArrayList<>();

    /**
    * fooId field Validation
    *
    * @param field fooId
    */
    protected void validateFooId(long field) {
        //TODO : This validation needs to be implemented.
    }

    /**
    * title field Validation
    *
    * @param field title
    */
    protected void validateTitle(String field) {
        //TODO : This validation needs to be implemented.
        if (!StringUtils.isNotEmpty(field)) {
            _errors.add("foo-title-required");
        }
    }

    /**
    * fooBooleanStat field Validation
    *
    * @param field fooBooleanStat
    */
    protected void validateFooBooleanStat(boolean field) {
        //TODO : This validation needs to be implemented.
    }

    /**
    * fooDateTime field Validation
    *
    * @param field fooDateTime
    */
    protected void validateFooDateTime(Date field) {
        //TODO : This validation needs to be implemented.
    }

    /**
    * fooDocumentLibrary field Validation
    *
    * @param field fooDocumentLibrary
    */
    protected void validateFooDocumentLibrary(String field) {
        //TODO : This validation needs to be implemented.
    }

    /**
    * fooDouble field Validation
    *
    * @param field fooDouble
    */
    protected void validateFooDouble(double field) {
        //TODO : This validation needs to be implemented.
    }

    /**
    * fooInteger field Validation
    *
    * @param field fooInteger
    */
    protected void validateFooInteger(int field) {
        //TODO : This validation needs to be implemented.
    }

    /**
    * fooRichText field Validation
    *
    * @param field fooRichText
    */
    protected void validateFooRichText(String field) {
        //TODO : This validation needs to be implemented.
    }

    /**
    * fooText field Validation
    *
    * @param field fooText
    */
    protected void validateFooText(String field) {
        //TODO : This validation needs to be implemented.
    }

    @Override
    public void validate(Foo entry) throws PortalException {
        // Field fooId
        validateFooId(entry.getFooId());

        // Field title
        validateTitle(entry.getTitle());

        // Field fooBooleanStat
        validateFooBooleanStat(entry.getFooBooleanStat());

        // Field fooDateTime
        validateFooDateTime(entry.getFooDateTime());

        // Field fooDocumentLibrary
        validateFooDocumentLibrary(entry.getFooDocumentLibrary());

        // Field fooDouble
        validateFooDouble(entry.getFooDouble());

        // Field fooInteger
        validateFooInteger(entry.getFooInteger());

        // Field fooRichText
        validateFooRichText(entry.getFooRichText());

        // Field fooText
        validateFooText(entry.getFooText());

        if (0 < _errors.size()) {
            throw new FooValidateException(_errors);
        }
    }
}
