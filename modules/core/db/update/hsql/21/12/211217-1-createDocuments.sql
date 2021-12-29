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
    TERMIN1_NAME varchar(255),
    TERMIN1_INFO longvarchar,
    TERMIN2_NAME varchar(255),
    TERMIN2_INFO longvarchar,
    TERMIN3_NAME varchar(255),
    TERMIN3_INFO longvarchar,
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
);