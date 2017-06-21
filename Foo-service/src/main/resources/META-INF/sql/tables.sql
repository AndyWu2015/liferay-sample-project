create table Foo_Foo (
	uuid_ VARCHAR(75) null,
	fooId LONG not null primary key,
	title VARCHAR(80) null,
	fooBooleanStat BOOLEAN,
	fooDateTime DATE null,
	fooDocumentLibrary VARCHAR(512) null,
	fooDouble DOUBLE,
	fooInteger INTEGER,
	fooRichText TEXT null,
	fooText TEXT null,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	urlTitle VARCHAR(75) null,
	fooTitleName VARCHAR(255) null,
	fooSummaryName TEXT null,
	status INTEGER,
	statusByUserId LONG,
	statusByUserName VARCHAR(75) null,
	statusDate DATE null
);