-- APPLICATIONTYPES
insert into DS_GLOBAL.MD_APPLICATIONTYPE (MD_APPLICATIONTYPE_ID, MD_APPLICATIONTYPE_NAME_KEY) values (DS_GLOBAL.SEQ_MD_APPLICATIONTYPE.NEXTVAL, 'APPLICATION_TYPE_1');
insert into DS_GLOBAL.MD_APPLICATIONTYPE (MD_APPLICATIONTYPE_ID, MD_APPLICATIONTYPE_NAME_KEY) values (DS_GLOBAL.SEQ_MD_APPLICATIONTYPE.NEXTVAL, 'APPLICATION_TYPE_2');
-- APPLICATIONGROUPS
insert into DS_GLOBAL.MD_APPLICATIONGROUP (MD_APPLICATIONGROUP_ID, MD_APPLICATIONGROUP_NAME_KEY) values (DS_GLOBAL.SEQ_MD_APPLICATIONGROUP.NEXTVAL, 'APPLICATION_GROUP_1');
insert into DS_GLOBAL.MD_APPLICATIONGROUP (MD_APPLICATIONGROUP_ID, MD_APPLICATIONGROUP_NAME_KEY) values (DS_GLOBAL.SEQ_MD_APPLICATIONGROUP.NEXTVAL, 'APPLICATION_GROUP_2');
-- APPLICATIONS
insert into DS_GLOBAL.MD_APPLICATION (MD_APPLICATION_ID, MD_APPLICATION_NAME, MD_APPLICATIONTYPE_ID, MD_APPLICATIONGROUP_ID) values (DS_GLOBAL.SEQ_MD_APPLICATION.NEXTVAL, 'APPLICATION_1', 1, 1);
insert into DS_GLOBAL.MD_APPLICATION (MD_APPLICATION_ID, MD_APPLICATION_NAME, MD_APPLICATIONTYPE_ID, MD_APPLICATIONGROUP_ID) values (DS_GLOBAL.SEQ_MD_APPLICATION.NEXTVAL, 'APPLICATION_2', 1, 2);
insert into DS_GLOBAL.MD_APPLICATION (MD_APPLICATION_ID, MD_APPLICATION_NAME, MD_APPLICATIONTYPE_ID, MD_APPLICATIONGROUP_ID) values (DS_GLOBAL.SEQ_MD_APPLICATION.NEXTVAL, 'APPLICATION_3', 2, 1);
insert into DS_GLOBAL.MD_APPLICATION (MD_APPLICATION_ID, MD_APPLICATION_NAME, MD_APPLICATIONTYPE_ID, MD_APPLICATIONGROUP_ID) values (DS_GLOBAL.SEQ_MD_APPLICATION.NEXTVAL, 'APPLICATION_4', 2, 2);
-- LANGUAGES
insert into DS_GLOBAL.MD_LANGUAGE (MD_LANGUAGE_ID, MD_LANGUAGE_NAME_KEY, MD_LANGUAGE_ISO_SHORT) values (DS_GLOBAL.SEQ_MD_LANGUAGE.NEXTVAL, 'LANGUAGE_1', 'L1');
insert into DS_GLOBAL.MD_LANGUAGE (MD_LANGUAGE_ID, MD_LANGUAGE_NAME_KEY, MD_LANGUAGE_ISO_SHORT) values (DS_GLOBAL.SEQ_MD_LANGUAGE.NEXTVAL, 'LANGUAGE_2', 'L2');
-- APPLICATION <-> LANGUAGES
insert into DS_GLOBAL.MD_APPLICATION_LANGUAGE (MD_APPLICATION_ID, MD_LANGUAGE_ID) values (1,1);
insert into DS_GLOBAL.MD_APPLICATION_LANGUAGE (MD_APPLICATION_ID, MD_LANGUAGE_ID) values (1,2);
insert into DS_GLOBAL.MD_APPLICATION_LANGUAGE (MD_APPLICATION_ID, MD_LANGUAGE_ID) values (2,1);
insert into DS_GLOBAL.MD_APPLICATION_LANGUAGE (MD_APPLICATION_ID, MD_LANGUAGE_ID) values (3,2);
-- CURRENCIES
insert into DS_GLOBAL.MD_CURRENCY (MD_CURRENCY_ID, MD_CURRENCY_NAME_KEY, ISO_SHORT) values (DS_GLOBAL.SEQ_MD_CURRENCY.NEXTVAL, 'CURRENCY_1', 'C1');
insert into DS_GLOBAL.MD_CURRENCY (MD_CURRENCY_ID, MD_CURRENCY_NAME_KEY, ISO_SHORT) values (DS_GLOBAL.SEQ_MD_CURRENCY.NEXTVAL, 'CURRENCY_2', 'C2');
-- COUNTRIES
insert into DS_GLOBAL.MD_COUNTRY (MD_COUNTRY_ID, MD_COUNTRY_NAME_KEY, ISO_SHORT, ISO_LONG, MD_CURRENCY_ID) values (DS_GLOBAL.SEQ_MD_COUNTRY.NEXTVAL, 'COUNTRY_1', 'C1', 'CO1', 1);
insert into DS_GLOBAL.MD_COUNTRY (MD_COUNTRY_ID, MD_COUNTRY_NAME_KEY, ISO_SHORT, ISO_LONG, MD_CURRENCY_ID) values (DS_GLOBAL.SEQ_MD_COUNTRY.NEXTVAL, 'COUNTRY_2', 'C2', 'CO2', 2);
insert into DS_GLOBAL.MD_COUNTRY (MD_COUNTRY_ID, MD_COUNTRY_NAME_KEY, ISO_SHORT, ISO_LONG) values (DS_GLOBAL.SEQ_MD_COUNTRY.NEXTVAL, 'COUNTRY_3', 'C3', 'CO3');
insert into DS_GLOBAL.MD_COUNTRY (MD_COUNTRY_ID, MD_COUNTRY_NAME_KEY, ISO_SHORT, ISO_LONG) values (DS_GLOBAL.SEQ_MD_COUNTRY.NEXTVAL, 'COUNTRY_4', 'C4', 'CO4');
-- CLIENTS
insert into DS_GLOBAL.MD_CLIENT (MD_CLIENT_ID, CLIENT_NAME) values (DS_GLOBAL.SEQ_MD_CLIENT.NEXTVAL, 'CLIENT_1');
insert into DS_GLOBAL.MD_CLIENT (MD_CLIENT_ID, CLIENT_NAME) values (DS_GLOBAL.SEQ_MD_CLIENT.NEXTVAL, 'CLIENT_2');
-- COUNTRY TYPES
insert into DS_GLOBAL.MD_COUNTRY_TYPE (MD_COUNTRY_TYPE_ID, COUNTRY_TYPE_NAME_KEY) values (DS_GLOBAL.SEQ_MD_COUNTRY_TYPE.NEXTVAL, 'COUNTRY_TYPE_1');
insert into DS_GLOBAL.MD_COUNTRY_TYPE (MD_COUNTRY_TYPE_ID, COUNTRY_TYPE_NAME_KEY) values (DS_GLOBAL.SEQ_MD_COUNTRY_TYPE.NEXTVAL, 'COUNTRY_TYPE_2');
-- COUNTRIES <-> COUNTRY TYPES
insert into DS_GLOBAL.MD_COUNTRY_COUNTRY_TYPE (MD_COUNTRY_COUNTRY_TYPE_ID, MD_COUNTRY_ID, MD_COUNTRY_TYPE_ID, MD_CLIENT_ID) values (DS_GLOBAL.SEQ_MD_COUNTRY_COUNTRY_TYPE.NEXTVAL, 1, 1, 1);
insert into DS_GLOBAL.MD_COUNTRY_COUNTRY_TYPE (MD_COUNTRY_COUNTRY_TYPE_ID, MD_COUNTRY_ID, MD_COUNTRY_TYPE_ID, MD_CLIENT_ID) values (DS_GLOBAL.SEQ_MD_COUNTRY_COUNTRY_TYPE.NEXTVAL, 1, 2, 1);
insert into DS_GLOBAL.MD_COUNTRY_COUNTRY_TYPE (MD_COUNTRY_COUNTRY_TYPE_ID, MD_COUNTRY_ID, MD_COUNTRY_TYPE_ID, MD_CLIENT_ID) values (DS_GLOBAL.SEQ_MD_COUNTRY_COUNTRY_TYPE.NEXTVAL, 2, 1, 2);
insert into DS_GLOBAL.MD_COUNTRY_COUNTRY_TYPE (MD_COUNTRY_COUNTRY_TYPE_ID, MD_COUNTRY_ID, MD_COUNTRY_TYPE_ID, MD_CLIENT_ID) values (DS_GLOBAL.SEQ_MD_COUNTRY_COUNTRY_TYPE.NEXTVAL, 2, 2, 2);
insert into DS_GLOBAL.MD_COUNTRY_COUNTRY_TYPE (MD_COUNTRY_COUNTRY_TYPE_ID, MD_COUNTRY_ID, MD_COUNTRY_TYPE_ID, MD_CLIENT_ID) values (DS_GLOBAL.SEQ_MD_COUNTRY_COUNTRY_TYPE.NEXTVAL, 3, 1, 1);
insert into DS_GLOBAL.MD_COUNTRY_COUNTRY_TYPE (MD_COUNTRY_COUNTRY_TYPE_ID, MD_COUNTRY_ID, MD_COUNTRY_TYPE_ID, MD_CLIENT_ID) values (DS_GLOBAL.SEQ_MD_COUNTRY_COUNTRY_TYPE.NEXTVAL, 4, 2, 1);
-- LOCALES
insert into DS_GLOBAL.MD_LOCALE (MD_LOCALE_ID, MD_LOCALE_NAME_KEY, MD_COUNTRY_ID, MD_LANGUAGE_ID) values (DS_GLOBAL.SEQ_MD_LOCALE.NEXTVAL, 'LOCALE_1', 1, 1);
insert into DS_GLOBAL.MD_LOCALE (MD_LOCALE_ID, MD_LOCALE_NAME_KEY, MD_COUNTRY_ID, MD_LANGUAGE_ID) values (DS_GLOBAL.SEQ_MD_LOCALE.NEXTVAL, 'LOCALE_2', 1, 2);
insert into DS_GLOBAL.MD_LOCALE (MD_LOCALE_ID, MD_LOCALE_NAME_KEY, MD_COUNTRY_ID, MD_LANGUAGE_ID) values (DS_GLOBAL.SEQ_MD_LOCALE.NEXTVAL, 'LOCALE_3', 2, 1);
insert into DS_GLOBAL.MD_LOCALE (MD_LOCALE_ID, MD_LOCALE_NAME_KEY, MD_COUNTRY_ID, MD_LANGUAGE_ID) values (DS_GLOBAL.SEQ_MD_LOCALE.NEXTVAL, 'LOCALE_4', 3, 2);