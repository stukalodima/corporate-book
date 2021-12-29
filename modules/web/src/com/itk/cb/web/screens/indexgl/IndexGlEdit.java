package com.itk.cb.web.screens.indexgl;

import com.haulmont.cuba.gui.screen.*;
import com.itk.cb.entity.IndexGl;

@UiController("cb_IndexGl.edit")
@UiDescriptor("index-gl-edit.xml")
@EditedEntityContainer("indexGlDc")
@LoadDataBeforeShow
public class IndexGlEdit extends StandardEditor<IndexGl> {
}