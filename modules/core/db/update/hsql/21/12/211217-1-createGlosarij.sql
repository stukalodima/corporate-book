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
);