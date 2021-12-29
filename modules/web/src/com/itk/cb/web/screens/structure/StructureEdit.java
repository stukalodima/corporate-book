package com.itk.cb.web.screens.structure;

import com.haulmont.cuba.gui.screen.*;
import com.itk.cb.entity.Structure;

@UiController("cb_Structure.edit")
@UiDescriptor("structure-edit.xml")
@EditedEntityContainer("structureDc")
@LoadDataBeforeShow
public class StructureEdit extends StandardEditor<Structure> {
}