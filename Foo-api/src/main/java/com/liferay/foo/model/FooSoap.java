/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.foo.model;

import aQute.bnd.annotation.ProviderType;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@ProviderType
public class FooSoap implements Serializable {
	public static FooSoap toSoapModel(Foo model) {
		FooSoap soapModel = new FooSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setFooId(model.getFooId());
		soapModel.setTitle(model.getTitle());
		soapModel.setFooBooleanStat(model.getFooBooleanStat());
		soapModel.setFooDateTime(model.getFooDateTime());
		soapModel.setFooDocumentLibrary(model.getFooDocumentLibrary());
		soapModel.setFooDouble(model.getFooDouble());
		soapModel.setFooInteger(model.getFooInteger());
		soapModel.setFooRichText(model.getFooRichText());
		soapModel.setFooText(model.getFooText());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setUrlTitle(model.getUrlTitle());
		soapModel.setFooTitleName(model.getFooTitleName());
		soapModel.setFooSummaryName(model.getFooSummaryName());
		soapModel.setStatus(model.getStatus());
		soapModel.setStatusByUserId(model.getStatusByUserId());
		soapModel.setStatusByUserName(model.getStatusByUserName());
		soapModel.setStatusDate(model.getStatusDate());

		return soapModel;
	}

	public static FooSoap[] toSoapModels(Foo[] models) {
		FooSoap[] soapModels = new FooSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static FooSoap[][] toSoapModels(Foo[][] models) {
		FooSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new FooSoap[models.length][models[0].length];
		}
		else {
			soapModels = new FooSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static FooSoap[] toSoapModels(List<Foo> models) {
		List<FooSoap> soapModels = new ArrayList<FooSoap>(models.size());

		for (Foo model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new FooSoap[soapModels.size()]);
	}

	public FooSoap() {
	}

	public long getPrimaryKey() {
		return _fooId;
	}

	public void setPrimaryKey(long pk) {
		setFooId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getFooId() {
		return _fooId;
	}

	public void setFooId(long fooId) {
		_fooId = fooId;
	}

	public String getTitle() {
		return _title;
	}

	public void setTitle(String title) {
		_title = title;
	}

	public boolean getFooBooleanStat() {
		return _fooBooleanStat;
	}

	public boolean isFooBooleanStat() {
		return _fooBooleanStat;
	}

	public void setFooBooleanStat(boolean fooBooleanStat) {
		_fooBooleanStat = fooBooleanStat;
	}

	public Date getFooDateTime() {
		return _fooDateTime;
	}

	public void setFooDateTime(Date fooDateTime) {
		_fooDateTime = fooDateTime;
	}

	public String getFooDocumentLibrary() {
		return _fooDocumentLibrary;
	}

	public void setFooDocumentLibrary(String fooDocumentLibrary) {
		_fooDocumentLibrary = fooDocumentLibrary;
	}

	public double getFooDouble() {
		return _fooDouble;
	}

	public void setFooDouble(double fooDouble) {
		_fooDouble = fooDouble;
	}

	public int getFooInteger() {
		return _fooInteger;
	}

	public void setFooInteger(int fooInteger) {
		_fooInteger = fooInteger;
	}

	public String getFooRichText() {
		return _fooRichText;
	}

	public void setFooRichText(String fooRichText) {
		_fooRichText = fooRichText;
	}

	public String getFooText() {
		return _fooText;
	}

	public void setFooText(String fooText) {
		_fooText = fooText;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getUserName() {
		return _userName;
	}

	public void setUserName(String userName) {
		_userName = userName;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public String getUrlTitle() {
		return _urlTitle;
	}

	public void setUrlTitle(String urlTitle) {
		_urlTitle = urlTitle;
	}

	public String getFooTitleName() {
		return _fooTitleName;
	}

	public void setFooTitleName(String fooTitleName) {
		_fooTitleName = fooTitleName;
	}

	public String getFooSummaryName() {
		return _fooSummaryName;
	}

	public void setFooSummaryName(String fooSummaryName) {
		_fooSummaryName = fooSummaryName;
	}

	public int getStatus() {
		return _status;
	}

	public void setStatus(int status) {
		_status = status;
	}

	public long getStatusByUserId() {
		return _statusByUserId;
	}

	public void setStatusByUserId(long statusByUserId) {
		_statusByUserId = statusByUserId;
	}

	public String getStatusByUserName() {
		return _statusByUserName;
	}

	public void setStatusByUserName(String statusByUserName) {
		_statusByUserName = statusByUserName;
	}

	public Date getStatusDate() {
		return _statusDate;
	}

	public void setStatusDate(Date statusDate) {
		_statusDate = statusDate;
	}

	private String _uuid;
	private long _fooId;
	private String _title;
	private boolean _fooBooleanStat;
	private Date _fooDateTime;
	private String _fooDocumentLibrary;
	private double _fooDouble;
	private int _fooInteger;
	private String _fooRichText;
	private String _fooText;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _urlTitle;
	private String _fooTitleName;
	private String _fooSummaryName;
	private int _status;
	private long _statusByUserId;
	private String _statusByUserName;
	private Date _statusDate;
}