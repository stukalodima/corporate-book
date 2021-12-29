package com.itk.cb.web.screens.glosarij;

import com.haulmont.cuba.gui.screen.*;
import com.itk.cb.entity.Glosarij;

@UiController("cb_Glosarij.browse")
@UiDescriptor("glosarij-browse.xml")
@LookupComponent("glosarijsTable")
@LoadDataBeforeShow
public class GlosarijBrowse extends StandardLookup<Glosarij> {
}