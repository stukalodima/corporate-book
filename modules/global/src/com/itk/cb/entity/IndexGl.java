package com.itk.cb.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Table(name = "CB_INDEX_GL")
@Entity(name = "cb_IndexGl")
@NamePattern("%s|name")
public class IndexGl extends StandardEntity {
    private static final long serialVersionUID = 5554825678316197669L;

    @Column(name = "NAME")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}