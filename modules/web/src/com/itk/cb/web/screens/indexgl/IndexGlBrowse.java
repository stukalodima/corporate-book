package com.itk.cb.web.screens.indexgl;

import com.haulmont.cuba.gui.screen.*;
import com.itk.cb.entity.IndexGl;

@UiController("cb_IndexGl.browse")
@UiDescriptor("index-gl-browse.xml")
@LookupComponent("indexGlsTable")
@LoadDataBeforeShow
public class IndexGlBrowse extends StandardLookup<IndexGl> {
}