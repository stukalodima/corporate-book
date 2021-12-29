package com.itk.cb.web.screens.documents;

import com.haulmont.cuba.gui.screen.*;
import com.itk.cb.entity.Documents;

@UiController("cb_Documents.browse")
@UiDescriptor("documents-browse.xml")
@LookupComponent("documentsesTable")
@LoadDataBeforeShow
public class DocumentsBrowse extends StandardLookup<Documents> {
}