alter table CB_STRUCTURE add constraint FK_CB_STRUCTURE_ON_FILE_NAME foreign key (FILE_NAME_ID) references SYS_FILE(ID);
create index IDX_CB_STRUCTURE_ON_FILE_NAME on CB_STRUCTURE (FILE_NAME_ID);
