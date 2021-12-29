package com.itk.cb.web.screens.documents;

import com.haulmont.cuba.gui.components.HasValue;
import com.haulmont.cuba.gui.components.RichTextArea;
import com.haulmont.cuba.gui.screen.*;
import com.itk.cb.entity.Documents;

import javax.inject.Inject;

@UiController("cb_Documents.edit")
@UiDescriptor("documents-edit.xml")
@EditedEntityContainer("documentsDc")
@LoadDataBeforeShow
public class DocumentsEdit extends StandardEditor<Documents> {
    @Inject
    private RichTextArea richText;

    @Subscribe("taName")
    public void onTaNameValueChange(HasValue.ValueChangeEvent<String> event) {

    }

    public void onRefreshDocClick() {
        getEditedEntity().setText(getEditedEntity().getName() + getEditedEntity().getTerminu() + getEditedEntity().getCeliDocumenta() + getEditedEntity().getOblastDejstviya()
        + getEditedEntity().getSferaPrimeneniya() + getEditedEntity().getVladelecDocumenta()+getEditedEntity().getRazrabDocumenta());
    }
}