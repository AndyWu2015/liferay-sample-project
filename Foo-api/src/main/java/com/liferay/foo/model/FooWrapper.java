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

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.exportimport.kernel.lar.StagedModelType;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link Foo}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Foo
 * @generated
 */
@ProviderType
public class FooWrapper implements Foo, ModelWrapper<Foo> {
	public FooWrapper(Foo foo) {
		_foo = foo;
	}

	@Override
	public Class<?> getModelClass() {
		return Foo.class;
	}

	@Override
	public String getModelClassName() {
		return Foo.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("fooId", getFooId());
		attributes.put("title", getTitle());
		attributes.put("fooBooleanStat", getFooBooleanStat());
		attributes.put("fooDateTime", getFooDateTime());
		attributes.put("fooDocumentLibrary", getFooDocumentLibrary());
		attributes.put("fooDouble", getFooDouble());
		attributes.put("fooInteger", getFooInteger());
		attributes.put("fooRichText", getFooRichText());
		attributes.put("fooText", getFooText());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("urlTitle", getUrlTitle());
		attributes.put("fooTitleName", getFooTitleName());
		attributes.put("fooSummaryName", getFooSummaryName());
		attributes.put("status", getStatus());
		attributes.put("statusByUserId", getStatusByUserId());
		attributes.put("statusByUserName", getStatusByUserName());
		attributes.put("statusDate", getStatusDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long fooId = (Long)attributes.get("fooId");

		if (fooId != null) {
			setFooId(fooId);
		}

		String title = (String)attributes.get("title");

		if (title != null) {
			setTitle(title);
		}

		Boolean fooBooleanStat = (Boolean)attributes.get("fooBooleanStat");

		if (fooBooleanStat != null) {
			setFooBooleanStat(fooBooleanStat);
		}

		Date fooDateTime = (Date)attributes.get("fooDateTime");

		if (fooDateTime != null) {
			setFooDateTime(fooDateTime);
		}

		String fooDocumentLibrary = (String)attributes.get("fooDocumentLibrary");

		if (fooDocumentLibrary != null) {
			setFooDocumentLibrary(fooDocumentLibrary);
		}

		Double fooDouble = (Double)attributes.get("fooDouble");

		if (fooDouble != null) {
			setFooDouble(fooDouble);
		}

		Integer fooInteger = (Integer)attributes.get("fooInteger");

		if (fooInteger != null) {
			setFooInteger(fooInteger);
		}

		String fooRichText = (String)attributes.get("fooRichText");

		if (fooRichText != null) {
			setFooRichText(fooRichText);
		}

		String fooText = (String)attributes.get("fooText");

		if (fooText != null) {
			setFooText(fooText);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String urlTitle = (String)attributes.get("urlTitle");

		if (urlTitle != null) {
			setUrlTitle(urlTitle);
		}

		String fooTitleName = (String)attributes.get("fooTitleName");

		if (fooTitleName != null) {
			setFooTitleName(fooTitleName);
		}

		String fooSummaryName = (String)attributes.get("fooSummaryName");

		if (fooSummaryName != null) {
			setFooSummaryName(fooSummaryName);
		}

		Integer status = (Integer)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}

		Long statusByUserId = (Long)attributes.get("statusByUserId");

		if (statusByUserId != null) {
			setStatusByUserId(statusByUserId);
		}

		String statusByUserName = (String)attributes.get("statusByUserName");

		if (statusByUserName != null) {
			setStatusByUserName(statusByUserName);
		}

		Date statusDate = (Date)attributes.get("statusDate");

		if (statusDate != null) {
			setStatusDate(statusDate);
		}
	}

	@Override
	public Foo toEscapedModel() {
		return new FooWrapper(_foo.toEscapedModel());
	}

	@Override
	public Foo toUnescapedModel() {
		return new FooWrapper(_foo.toUnescapedModel());
	}

	/**
	* Returns the foo boolean stat of this foo.
	*
	* @return the foo boolean stat of this foo
	*/
	@Override
	public boolean getFooBooleanStat() {
		return _foo.getFooBooleanStat();
	}

	/**
	* Returns <code>true</code> if this foo is approved.
	*
	* @return <code>true</code> if this foo is approved; <code>false</code> otherwise
	*/
	@Override
	public boolean isApproved() {
		return _foo.isApproved();
	}

	@Override
	public boolean isCachedModel() {
		return _foo.isCachedModel();
	}

	/**
	* Returns <code>true</code> if this foo is denied.
	*
	* @return <code>true</code> if this foo is denied; <code>false</code> otherwise
	*/
	@Override
	public boolean isDenied() {
		return _foo.isDenied();
	}

	/**
	* Returns <code>true</code> if this foo is a draft.
	*
	* @return <code>true</code> if this foo is a draft; <code>false</code> otherwise
	*/
	@Override
	public boolean isDraft() {
		return _foo.isDraft();
	}

	@Override
	public boolean isEscapedModel() {
		return _foo.isEscapedModel();
	}

	/**
	* Returns <code>true</code> if this foo is expired.
	*
	* @return <code>true</code> if this foo is expired; <code>false</code> otherwise
	*/
	@Override
	public boolean isExpired() {
		return _foo.isExpired();
	}

	/**
	* Returns <code>true</code> if this foo is foo boolean stat.
	*
	* @return <code>true</code> if this foo is foo boolean stat; <code>false</code> otherwise
	*/
	@Override
	public boolean isFooBooleanStat() {
		return _foo.isFooBooleanStat();
	}

	/**
	* Returns <code>true</code> if this foo is in the Recycle Bin.
	*
	* @return <code>true</code> if this foo is in the Recycle Bin; <code>false</code> otherwise
	*/
	@Override
	public boolean isInTrash() {
		return _foo.isInTrash();
	}

	/**
	* Returns <code>true</code> if the parent of this foo is in the Recycle Bin.
	*
	* @return <code>true</code> if the parent of this foo is in the Recycle Bin; <code>false</code> otherwise
	*/
	@Override
	public boolean isInTrashContainer() {
		return _foo.isInTrashContainer();
	}

	@Override
	public boolean isInTrashExplicitly() {
		return _foo.isInTrashExplicitly();
	}

	@Override
	public boolean isInTrashImplicitly() {
		return _foo.isInTrashImplicitly();
	}

	/**
	* Returns <code>true</code> if this foo is inactive.
	*
	* @return <code>true</code> if this foo is inactive; <code>false</code> otherwise
	*/
	@Override
	public boolean isInactive() {
		return _foo.isInactive();
	}

	/**
	* Returns <code>true</code> if this foo is incomplete.
	*
	* @return <code>true</code> if this foo is incomplete; <code>false</code> otherwise
	*/
	@Override
	public boolean isIncomplete() {
		return _foo.isIncomplete();
	}

	@Override
	public boolean isNew() {
		return _foo.isNew();
	}

	/**
	* Returns <code>true</code> if this foo is pending.
	*
	* @return <code>true</code> if this foo is pending; <code>false</code> otherwise
	*/
	@Override
	public boolean isPending() {
		return _foo.isPending();
	}

	/**
	* Returns <code>true</code> if this foo is scheduled.
	*
	* @return <code>true</code> if this foo is scheduled; <code>false</code> otherwise
	*/
	@Override
	public boolean isScheduled() {
		return _foo.isScheduled();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _foo.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<Foo> toCacheModel() {
		return _foo.toCacheModel();
	}

	/**
	* Returns the trash handler for this foo.
	*
	* @return the trash handler for this foo
	* @deprecated As of 7.0.0, with no direct replacement
	*/
	@Deprecated
	@Override
	public com.liferay.portal.kernel.trash.TrashHandler getTrashHandler() {
		return _foo.getTrashHandler();
	}

	/**
	* Returns the trash entry created when this foo was moved to the Recycle Bin. The trash entry may belong to one of the ancestors of this foo.
	*
	* @return the trash entry created when this foo was moved to the Recycle Bin
	*/
	@Override
	public com.liferay.trash.kernel.model.TrashEntry getTrashEntry()
		throws com.liferay.portal.kernel.exception.PortalException {
		return _foo.getTrashEntry();
	}

	/**
	* Returns the foo double of this foo.
	*
	* @return the foo double of this foo
	*/
	@Override
	public double getFooDouble() {
		return _foo.getFooDouble();
	}

	@Override
	public int compareTo(Foo foo) {
		return _foo.compareTo(foo);
	}

	/**
	* Returns the foo integer of this foo.
	*
	* @return the foo integer of this foo
	*/
	@Override
	public int getFooInteger() {
		return _foo.getFooInteger();
	}

	/**
	* Returns the status of this foo.
	*
	* @return the status of this foo
	*/
	@Override
	public int getStatus() {
		return _foo.getStatus();
	}

	@Override
	public int hashCode() {
		return _foo.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _foo.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new FooWrapper((Foo)_foo.clone());
	}

	/**
	* Returns the foo document library of this foo.
	*
	* @return the foo document library of this foo
	*/
	@Override
	public java.lang.String getFooDocumentLibrary() {
		return _foo.getFooDocumentLibrary();
	}

	/**
	* Returns the foo rich text of this foo.
	*
	* @return the foo rich text of this foo
	*/
	@Override
	public java.lang.String getFooRichText() {
		return _foo.getFooRichText();
	}

	/**
	* Returns the foo summary name of this foo.
	*
	* @return the foo summary name of this foo
	*/
	@Override
	public java.lang.String getFooSummaryName() {
		return _foo.getFooSummaryName();
	}

	/**
	* Returns the foo text of this foo.
	*
	* @return the foo text of this foo
	*/
	@Override
	public java.lang.String getFooText() {
		return _foo.getFooText();
	}

	/**
	* Returns the foo title name of this foo.
	*
	* @return the foo title name of this foo
	*/
	@Override
	public java.lang.String getFooTitleName() {
		return _foo.getFooTitleName();
	}

	/**
	* Returns the status by user name of this foo.
	*
	* @return the status by user name of this foo
	*/
	@Override
	public java.lang.String getStatusByUserName() {
		return _foo.getStatusByUserName();
	}

	/**
	* Returns the status by user uuid of this foo.
	*
	* @return the status by user uuid of this foo
	*/
	@Override
	public java.lang.String getStatusByUserUuid() {
		return _foo.getStatusByUserUuid();
	}

	/**
	* Returns the title of this foo.
	*
	* @return the title of this foo
	*/
	@Override
	public java.lang.String getTitle() {
		return _foo.getTitle();
	}

	/**
	* Returns the url title of this foo.
	*
	* @return the url title of this foo
	*/
	@Override
	public java.lang.String getUrlTitle() {
		return _foo.getUrlTitle();
	}

	/**
	* Returns the user name of this foo.
	*
	* @return the user name of this foo
	*/
	@Override
	public java.lang.String getUserName() {
		return _foo.getUserName();
	}

	/**
	* Returns the user uuid of this foo.
	*
	* @return the user uuid of this foo
	*/
	@Override
	public java.lang.String getUserUuid() {
		return _foo.getUserUuid();
	}

	/**
	* Returns the uuid of this foo.
	*
	* @return the uuid of this foo
	*/
	@Override
	public java.lang.String getUuid() {
		return _foo.getUuid();
	}

	@Override
	public java.lang.String toString() {
		return _foo.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _foo.toXmlString();
	}

	/**
	* Returns the create date of this foo.
	*
	* @return the create date of this foo
	*/
	@Override
	public Date getCreateDate() {
		return _foo.getCreateDate();
	}

	/**
	* Returns the foo date time of this foo.
	*
	* @return the foo date time of this foo
	*/
	@Override
	public Date getFooDateTime() {
		return _foo.getFooDateTime();
	}

	/**
	* Returns the modified date of this foo.
	*
	* @return the modified date of this foo
	*/
	@Override
	public Date getModifiedDate() {
		return _foo.getModifiedDate();
	}

	/**
	* Returns the status date of this foo.
	*
	* @return the status date of this foo
	*/
	@Override
	public Date getStatusDate() {
		return _foo.getStatusDate();
	}

	/**
	* Returns the company ID of this foo.
	*
	* @return the company ID of this foo
	*/
	@Override
	public long getCompanyId() {
		return _foo.getCompanyId();
	}

	/**
	* Returns the foo ID of this foo.
	*
	* @return the foo ID of this foo
	*/
	@Override
	public long getFooId() {
		return _foo.getFooId();
	}

	/**
	* Returns the group ID of this foo.
	*
	* @return the group ID of this foo
	*/
	@Override
	public long getGroupId() {
		return _foo.getGroupId();
	}

	/**
	* Returns the primary key of this foo.
	*
	* @return the primary key of this foo
	*/
	@Override
	public long getPrimaryKey() {
		return _foo.getPrimaryKey();
	}

	/**
	* Returns the status by user ID of this foo.
	*
	* @return the status by user ID of this foo
	*/
	@Override
	public long getStatusByUserId() {
		return _foo.getStatusByUserId();
	}

	/**
	* Returns the class primary key of the trash entry for this foo.
	*
	* @return the class primary key of the trash entry for this foo
	*/
	@Override
	public long getTrashEntryClassPK() {
		return _foo.getTrashEntryClassPK();
	}

	/**
	* Returns the user ID of this foo.
	*
	* @return the user ID of this foo
	*/
	@Override
	public long getUserId() {
		return _foo.getUserId();
	}

	@Override
	public void persist() {
		_foo.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_foo.setCachedModel(cachedModel);
	}

	/**
	* Sets the company ID of this foo.
	*
	* @param companyId the company ID of this foo
	*/
	@Override
	public void setCompanyId(long companyId) {
		_foo.setCompanyId(companyId);
	}

	/**
	* Sets the create date of this foo.
	*
	* @param createDate the create date of this foo
	*/
	@Override
	public void setCreateDate(Date createDate) {
		_foo.setCreateDate(createDate);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_foo.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_foo.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_foo.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets whether this foo is foo boolean stat.
	*
	* @param fooBooleanStat the foo boolean stat of this foo
	*/
	@Override
	public void setFooBooleanStat(boolean fooBooleanStat) {
		_foo.setFooBooleanStat(fooBooleanStat);
	}

	/**
	* Sets the foo date time of this foo.
	*
	* @param fooDateTime the foo date time of this foo
	*/
	@Override
	public void setFooDateTime(Date fooDateTime) {
		_foo.setFooDateTime(fooDateTime);
	}

	/**
	* Sets the foo document library of this foo.
	*
	* @param fooDocumentLibrary the foo document library of this foo
	*/
	@Override
	public void setFooDocumentLibrary(java.lang.String fooDocumentLibrary) {
		_foo.setFooDocumentLibrary(fooDocumentLibrary);
	}

	/**
	* Sets the foo double of this foo.
	*
	* @param fooDouble the foo double of this foo
	*/
	@Override
	public void setFooDouble(double fooDouble) {
		_foo.setFooDouble(fooDouble);
	}

	/**
	* Sets the foo ID of this foo.
	*
	* @param fooId the foo ID of this foo
	*/
	@Override
	public void setFooId(long fooId) {
		_foo.setFooId(fooId);
	}

	/**
	* Sets the foo integer of this foo.
	*
	* @param fooInteger the foo integer of this foo
	*/
	@Override
	public void setFooInteger(int fooInteger) {
		_foo.setFooInteger(fooInteger);
	}

	/**
	* Sets the foo rich text of this foo.
	*
	* @param fooRichText the foo rich text of this foo
	*/
	@Override
	public void setFooRichText(java.lang.String fooRichText) {
		_foo.setFooRichText(fooRichText);
	}

	/**
	* Sets the foo summary name of this foo.
	*
	* @param fooSummaryName the foo summary name of this foo
	*/
	@Override
	public void setFooSummaryName(java.lang.String fooSummaryName) {
		_foo.setFooSummaryName(fooSummaryName);
	}

	/**
	* Sets the foo text of this foo.
	*
	* @param fooText the foo text of this foo
	*/
	@Override
	public void setFooText(java.lang.String fooText) {
		_foo.setFooText(fooText);
	}

	/**
	* Sets the foo title name of this foo.
	*
	* @param fooTitleName the foo title name of this foo
	*/
	@Override
	public void setFooTitleName(java.lang.String fooTitleName) {
		_foo.setFooTitleName(fooTitleName);
	}

	/**
	* Sets the group ID of this foo.
	*
	* @param groupId the group ID of this foo
	*/
	@Override
	public void setGroupId(long groupId) {
		_foo.setGroupId(groupId);
	}

	/**
	* Sets the modified date of this foo.
	*
	* @param modifiedDate the modified date of this foo
	*/
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_foo.setModifiedDate(modifiedDate);
	}

	@Override
	public void setNew(boolean n) {
		_foo.setNew(n);
	}

	/**
	* Sets the primary key of this foo.
	*
	* @param primaryKey the primary key of this foo
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_foo.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_foo.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the status of this foo.
	*
	* @param status the status of this foo
	*/
	@Override
	public void setStatus(int status) {
		_foo.setStatus(status);
	}

	/**
	* Sets the status by user ID of this foo.
	*
	* @param statusByUserId the status by user ID of this foo
	*/
	@Override
	public void setStatusByUserId(long statusByUserId) {
		_foo.setStatusByUserId(statusByUserId);
	}

	/**
	* Sets the status by user name of this foo.
	*
	* @param statusByUserName the status by user name of this foo
	*/
	@Override
	public void setStatusByUserName(java.lang.String statusByUserName) {
		_foo.setStatusByUserName(statusByUserName);
	}

	/**
	* Sets the status by user uuid of this foo.
	*
	* @param statusByUserUuid the status by user uuid of this foo
	*/
	@Override
	public void setStatusByUserUuid(java.lang.String statusByUserUuid) {
		_foo.setStatusByUserUuid(statusByUserUuid);
	}

	/**
	* Sets the status date of this foo.
	*
	* @param statusDate the status date of this foo
	*/
	@Override
	public void setStatusDate(Date statusDate) {
		_foo.setStatusDate(statusDate);
	}

	/**
	* Sets the title of this foo.
	*
	* @param title the title of this foo
	*/
	@Override
	public void setTitle(java.lang.String title) {
		_foo.setTitle(title);
	}

	/**
	* Sets the url title of this foo.
	*
	* @param urlTitle the url title of this foo
	*/
	@Override
	public void setUrlTitle(java.lang.String urlTitle) {
		_foo.setUrlTitle(urlTitle);
	}

	/**
	* Sets the user ID of this foo.
	*
	* @param userId the user ID of this foo
	*/
	@Override
	public void setUserId(long userId) {
		_foo.setUserId(userId);
	}

	/**
	* Sets the user name of this foo.
	*
	* @param userName the user name of this foo
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_foo.setUserName(userName);
	}

	/**
	* Sets the user uuid of this foo.
	*
	* @param userUuid the user uuid of this foo
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_foo.setUserUuid(userUuid);
	}

	/**
	* Sets the uuid of this foo.
	*
	* @param uuid the uuid of this foo
	*/
	@Override
	public void setUuid(java.lang.String uuid) {
		_foo.setUuid(uuid);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof FooWrapper)) {
			return false;
		}

		FooWrapper fooWrapper = (FooWrapper)obj;

		if (Objects.equals(_foo, fooWrapper._foo)) {
			return true;
		}

		return false;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return _foo.getStagedModelType();
	}

	@Override
	public Foo getWrappedModel() {
		return _foo;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _foo.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _foo.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_foo.resetOriginalValues();
	}

	private final Foo _foo;
}