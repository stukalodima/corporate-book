package com.itk.cb.web.screens.category;

import com.haulmont.cuba.gui.screen.*;
import com.itk.cb.entity.Category;

@UiController("cb_Category.edit")
@UiDescriptor("category-edit.xml")
@EditedEntityContainer("categoryDc")
@LoadDataBeforeShow
public class CategoryEdit extends StandardEditor<Category> {
}