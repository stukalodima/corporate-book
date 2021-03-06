-- begin CB_GLOSARIJ
alter table CB_GLOSARIJ add constraint FK_CB_GLOSARIJ_ON_CATEGORY foreign key (CATEGORY_ID) references CB_CATEGORY(ID)^
alter table CB_GLOSARIJ add constraint FK_CB_GLOSARIJ_ON_INDEX foreign key (INDEX_ID) references CB_INDEX_GL(ID)^
create index IDX_CB_GLOSARIJ_ON_CATEGORY on CB_GLOSARIJ (CATEGORY_ID)^
create index IDX_CB_GLOSARIJ_ON_INDEX on CB_GLOSARIJ (INDEX_ID)^
-- end CB_GLOSARIJ
-- begin CB_STRUCTURE
alter table CB_STRUCTURE add constraint FK_CB_STRUCTURE_ON_FILE_NAME foreign key (FILE_NAME_ID) references SYS_FILE(ID)^
alter table CB_STRUCTURE add constraint FK_CB_STRUCTURE_ON_PARENT foreign key (PARENT_ID) references CB_STRUCTURE(ID)^
create index IDX_CB_STRUCTURE_ON_FILE_NAME on CB_STRUCTURE (FILE_NAME_ID)^
create index IDX_CB_STRUCTURE_ON_PARENT on CB_STRUCTURE (PARENT_ID)^
-- end CB_STRUCTURE
-- begin CB_DOCUMENT_IN_STRUCTURE
alter table CB_DOCUMENT_IN_STRUCTURE add constraint FK_CB_DOCUMENT_IN_STRUCTURE_ON_TYPE foreign key (TYPE_ID) references CB_STRUCTURE(ID)^
alter table CB_DOCUMENT_IN_STRUCTURE add constraint FK_CB_DOCUMENT_IN_STRUCTURE_ON_FILE foreign key (FILE_ID) references SYS_FILE(ID)^
create index IDX_CB_DOCUMENT_IN_STRUCTURE_ON_TYPE on CB_DOCUMENT_IN_STRUCTURE (TYPE_ID)^
create index IDX_CB_DOCUMENT_IN_STRUCTURE_ON_FILE on CB_DOCUMENT_IN_STRUCTURE (FILE_ID)^
-- end CB_DOCUMENT_IN_STRUCTURE
