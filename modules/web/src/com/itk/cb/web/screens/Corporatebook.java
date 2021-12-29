package com.itk.cb.web.screens;

import com.haulmont.cuba.core.global.DataManager;
import com.haulmont.cuba.core.global.FileLoader;
import com.haulmont.cuba.core.global.FileStorageException;
import com.haulmont.cuba.core.global.View;
import com.haulmont.cuba.gui.components.BrowserFrame;
import com.haulmont.cuba.gui.components.StreamResource;
import com.haulmont.cuba.gui.components.Tree;
import com.haulmont.cuba.gui.components.UrlResource;
import com.haulmont.cuba.gui.model.CollectionLoader;
import com.haulmont.cuba.gui.screen.Screen;
import com.haulmont.cuba.gui.screen.Subscribe;
import com.haulmont.cuba.gui.screen.UiController;
import com.haulmont.cuba.gui.screen.UiDescriptor;
import com.itk.cb.entity.DocumentInStructure;
import com.itk.cb.entity.Structure;

import javax.inject.Inject;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.function.Supplier;

@UiController("cb_Corporatebook")
@UiDescriptor("corporateBook.xml")
public class Corporatebook extends Screen {
    @Inject
    private CollectionLoader<Structure> structuresDl;

    @Inject
    private BrowserFrame frameDoc;
    @Inject
    private FileLoader fileLoader;

    @Subscribe
    public void onInit(InitEvent event) {
        structuresDl.load();
    }

    @Subscribe("treeMenu")
    public void onTreeMenuSelection(Tree.SelectionEvent<Structure> event) {

        Structure el = null;

        for (Structure structure : event.getSelected()){
            el = structure;
        }
        if (el.getFileName()==null) {
            frameDoc.reset();
        } else {
        InputStream fl = null;
        try {
            fl = fileLoader.openStream(el.getFileName());
        } catch (FileStorageException e) {
            e.printStackTrace();
        }

        InputStream finalFl = fl;
            frameDoc.setSource(StreamResource.class)
                    .setStreamSupplier(() -> finalFl)
                    .setMimeType("application/pdf");
        }
    }

}