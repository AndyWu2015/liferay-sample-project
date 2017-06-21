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

package com.liferay.foo.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.foo.model.Foo;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Foo in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see Foo
 * @generated
 */
@ProviderType
public class FooCacheModel implements CacheModel<Foo>, Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof FooCacheModel)) {
			return false;
		}

		FooCacheModel fooCacheModel = (FooCacheModel)obj;

		if (fooId == fooCacheModel.fooId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, fooId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(47);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", fooId=");
		sb.append(fooId);
		sb.append(", title=");
		sb.append(title);
		sb.append(", fooBooleanStat=");
		sb.append(fooBooleanStat);
		sb.append(", fooDateTime=");
		sb.append(fooDateTime);
		sb.append(", fooDocumentLibrary=");
		sb.append(fooDocumentLibrary);
		sb.append(", fooDouble=");
		sb.append(fooDouble);
		sb.append(", fooInteger=");
		sb.append(fooInteger);
		sb.append(", fooRichText=");
		sb.append(fooRichText);
		sb.append(", fooText=");
		sb.append(fooText);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", urlTitle=");
		sb.append(urlTitle);
		sb.append(", fooTitleName=");
		sb.append(fooTitleName);
		sb.append(", fooSummaryName=");
		sb.append(fooSummaryName);
		sb.append(", status=");
		sb.append(status);
		sb.append(", statusByUserId=");
		sb.append(statusByUserId);
		sb.append(", statusByUserName=");
		sb.append(statusByUserName);
		sb.append(", statusDate=");
		sb.append(statusDate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Foo toEntityModel() {
		FooImpl fooImpl = new FooImpl();

		if (uuid == null) {
			fooImpl.setUuid(StringPool.BLANK);
		}
		else {
			fooImpl.setUuid(uuid);
		}

		fooImpl.setFooId(fooId);

		if (title == null) {
			fooImpl.setTitle(StringPool.BLANK);
		}
		else {
			fooImpl.setTitle(title);
		}

		fooImpl.setFooBooleanStat(fooBooleanStat);

		if (fooDateTime == Long.MIN_VALUE) {
			fooImpl.setFooDateTime(null);
		}
		else {
			fooImpl.setFooDateTime(new Date(fooDateTime));
		}

		if (fooDocumentLibrary == null) {
			fooImpl.setFooDocumentLibrary(StringPool.BLANK);
		}
		else {
			fooImpl.setFooDocumentLibrary(fooDocumentLibrary);
		}

		fooImpl.setFooDouble(fooDouble);
		fooImpl.setFooInteger(fooInteger);

		if (fooRichText == null) {
			fooImpl.setFooRichText(StringPool.BLANK);
		}
		else {
			fooImpl.setFooRichText(fooRichText);
		}

		if (fooText == null) {
			fooImpl.setFooText(StringPool.BLANK);
		}
		else {
			fooImpl.setFooText(fooText);
		}

		fooImpl.setGroupId(groupId);
		fooImpl.setCompanyId(companyId);
		fooImpl.setUserId(userId);

		if (userName == null) {
			fooImpl.setUserName(StringPool.BLANK);
		}
		else {
			fooImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			fooImpl.setCreateDate(null);
		}
		else {
			fooImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			fooImpl.setModifiedDate(null);
		}
		else {
			fooImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (urlTitle == null) {
			fooImpl.setUrlTitle(StringPool.BLANK);
		}
		else {
			fooImpl.setUrlTitle(urlTitle);
		}

		if (fooTitleName == null) {
			fooImpl.setFooTitleName(StringPool.BLANK);
		}
		else {
			fooImpl.setFooTitleName(fooTitleName);
		}

		if (fooSummaryName == null) {
			fooImpl.setFooSummaryName(StringPool.BLANK);
		}
		else {
			fooImpl.setFooSummaryName(fooSummaryName);
		}

		fooImpl.setStatus(status);
		fooImpl.setStatusByUserId(statusByUserId);

		if (statusByUserName == null) {
			fooImpl.setStatusByUserName(StringPool.BLANK);
		}
		else {
			fooImpl.setStatusByUserName(statusByUserName);
		}

		if (statusDate == Long.MIN_VALUE) {
			fooImpl.setStatusDate(null);
		}
		else {
			fooImpl.setStatusDate(new Date(statusDate));
		}

		fooImpl.resetOriginalValues();

		return fooImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		fooId = objectInput.readLong();
		title = objectInput.readUTF();

		fooBooleanStat = objectInput.readBoolean();
		fooDateTime = objectInput.readLong();
		fooDocumentLibrary = objectInput.readUTF();

		fooDouble = objectInput.readDouble();

		fooInteger = objectInput.readInt();
		fooRichText = objectInput.readUTF();
		fooText = objectInput.readUTF();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		urlTitle = objectInput.readUTF();
		fooTitleName = objectInput.readUTF();
		fooSummaryName = objectInput.readUTF();

		status = objectInput.readInt();

		statusByUserId = objectInput.readLong();
		statusByUserName = objectInput.readUTF();
		statusDate = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(fooId);

		if (title == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(title);
		}

		objectOutput.writeBoolean(fooBooleanStat);
		objectOutput.writeLong(fooDateTime);

		if (fooDocumentLibrary == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(fooDocumentLibrary);
		}

		objectOutput.writeDouble(fooDouble);

		objectOutput.writeInt(fooInteger);

		if (fooRichText == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(fooRichText);
		}

		if (fooText == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(fooText);
		}

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		if (urlTitle == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(urlTitle);
		}

		if (fooTitleName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(fooTitleName);
		}

		if (fooSummaryName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(fooSummaryName);
		}

		objectOutput.writeInt(status);

		objectOutput.writeLong(statusByUserId);

		if (statusByUserName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(statusByUserName);
		}

		objectOutput.writeLong(statusDate);
	}

	public String uuid;
	public long fooId;
	public String title;
	public boolean fooBooleanStat;
	public long fooDateTime;
	public String fooDocumentLibrary;
	public double fooDouble;
	public int fooInteger;
	public String fooRichText;
	public String fooText;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String urlTitle;
	public String fooTitleName;
	public String fooSummaryName;
	public int status;
	public long statusByUserId;
	public String statusByUserName;
	public long statusDate;
}