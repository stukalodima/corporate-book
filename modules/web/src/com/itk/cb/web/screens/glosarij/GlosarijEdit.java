package com.itk.cb.web.screens.glosarij;

import com.haulmont.cuba.gui.screen.*;
import com.itk.cb.entity.Glosarij;

@UiController("cb_Glosarij.edit")
@UiDescriptor("glosarij-edit.xml")
@EditedEntityContainer("glosarijDc")
@LoadDataBeforeShow
public class GlosarijEdit extends StandardEditor<Glosarij> {
}