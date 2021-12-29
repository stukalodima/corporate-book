alter table CB_GLOSARIJ add constraint FK_CB_GLOSARIJ_ON_CATEGORY foreign key (CATEGORY_ID) references CB_CATEGORY(ID);
alter table CB_GLOSARIJ add constraint FK_CB_GLOSARIJ_ON_INDEX foreign key (INDEX_ID) references CB_INDEX_GL(ID);
create index IDX_CB_GLOSARIJ_ON_CATEGORY on CB_GLOSARIJ (CATEGORY_ID);
create index IDX_CB_GLOSARIJ_ON_INDEX on CB_GLOSARIJ (INDEX_ID);
