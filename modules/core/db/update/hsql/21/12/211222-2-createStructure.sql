alter table CB_STRUCTURE add constraint FK_CB_STRUCTURE_ON_PARENT foreign key (PARENT_ID) references CB_STRUCTURE(ID);
create index IDX_CB_STRUCTURE_ON_PARENT on CB_STRUCTURE (PARENT_ID);
