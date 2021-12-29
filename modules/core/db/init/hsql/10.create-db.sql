-- begin CB_DOCUMENTS
create table CB_DOCUMENTS (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    SHORT_NAME varchar(255) not null,
    ON_DATE timestamp not null,
    NAME longvarchar,
    TERMINU longvarchar,
    TEXT longvarchar,
    CELI_DOCUMENTA longvarchar,
    OBLAST_DEJSTVIYA longvarchar,
    SFERA_PRIMENENIYA longvarchar,
    VLADELEC_DOCUMENTA longvarchar,
    RAZRAB_DOCUMENTA longvarchar,
    VNESHNIE_NORMU longvarchar,
    PORYADOK_RESHENIYA longvarchar,
    KONTROL_ZA_ISPOLNENIEM longvarchar,
    OTVETSTVINNOST longvarchar,
    DOSTYP longvarchar,
    SODERJANIE_POLITIKI varchar(255),
    PRINCUP1 longvarchar,
    PRINCUP2 longvarchar,
    PRINCUP3 longvarchar,
    PRINCUP4 longvarchar,
    PRINCUP5 longvarchar,
    PRINCUP6 longvarchar,
    SISTEMU longvarchar,
    ZAKLUSHENIE longvarchar,
    PRILOJENIYA longvarchar,
    STATUS longvarchar,
    ISTORIYA longvarchar,
    SVYAZ longvarchar,
    --
    primary key (ID)
)^
-- end CB_DOCUMENTS
-- begin CB_CATEGORY
create table CB_CATEGORY (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255) not null,
    --
    primary key (ID)
)^
-- end CB_CATEGORY
-- begin CB_INDEX_GL
create table CB_INDEX_GL (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255),
    --
    primary key (ID)
)^
-- end CB_INDEX_GL
-- begin CB_GLOSARIJ
create table CB_GLOSARIJ (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255),
    CATEGORY_ID varchar(36) not null,
    INDEX_ID varchar(36) not null,
    INFO longvarchar,
    --
    primary key (ID)
)^
-- end CB_GLOSARIJ
-- begin CB_STRUCTURE
create table CB_STRUCTURE (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255),
    FILE_NAME_ID varchar(36),
    PARENT_ID varchar(36),
    ORDER_ integer,
    --
    primary key (ID)
)^
-- end CB_STRUCTURE
-- begin CB_DOCUMENT_IN_STRUCTURE
create table CB_DOCUMENT_IN_STRUCTURE (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255) not null,
    TYPE_ID varchar(36),
    FILE_ID varchar(36),
    --
    primary key (ID)
)^
-- end CB_DOCUMENT_IN_STRUCTURE
