package com.itk.cb.web.screens.category;

import com.haulmont.cuba.gui.screen.*;
import com.itk.cb.entity.Category;

@UiController("cb_Category.browse")
@UiDescriptor("category-browse.xml")
@LookupComponent("categoriesTable")
@LoadDataBeforeShow
public class CategoryBrowse extends StandardLookup<Category> {
}