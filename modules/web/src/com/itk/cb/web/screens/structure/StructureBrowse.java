package com.itk.cb.web.screens.structure;

import com.haulmont.cuba.gui.screen.*;
import com.itk.cb.entity.Structure;

@UiController("cb_Structure.browse")
@UiDescriptor("structure-browse.xml")
@LookupComponent("structuresTable")
@LoadDataBeforeShow
public class StructureBrowse extends StandardLookup<Structure> {
}