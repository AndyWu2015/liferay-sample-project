create index IX_8B34DA1B on Foo_Foo (companyId, status);
create index IX_90FB5355 on Foo_Foo (companyId, userId, status);
create index IX_1D7B95FD on Foo_Foo (fooBooleanStat);
create index IX_932D2B3E on Foo_Foo (fooDateTime);
create index IX_70CA4A01 on Foo_Foo (fooDocumentLibrary[$COLUMN_LENGTH:512$]);
create index IX_2243DA34 on Foo_Foo (fooDouble);
create index IX_4685A17E on Foo_Foo (fooId);
create index IX_739F539F on Foo_Foo (fooInteger);
create index IX_49E0644C on Foo_Foo (fooRichText[$COLUMN_LENGTH:4001$]);
create index IX_CE9B64D0 on Foo_Foo (fooText[$COLUMN_LENGTH:4001$]);
create index IX_597F07DD on Foo_Foo (groupId, status);
create unique index IX_7B7F1614 on Foo_Foo (groupId, urlTitle[$COLUMN_LENGTH:75$]);
create index IX_D8A49F17 on Foo_Foo (groupId, userId, status);
create index IX_21362D95 on Foo_Foo (title[$COLUMN_LENGTH:80$]);
create unique index IX_E0E0DD30 on Foo_Foo (urlTitle[$COLUMN_LENGTH:75$]);
create index IX_C0EC5BFD on Foo_Foo (userId, groupId);
create index IX_B283A133 on Foo_Foo (userId, status);
create index IX_7430AD47 on Foo_Foo (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_56C1D989 on Foo_Foo (uuid_[$COLUMN_LENGTH:75$], groupId);