package com.itk.cb.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Table(name = "CB_CATEGORY")
@Entity(name = "cb_Category")
@NamePattern("%s|name")
public class Category extends StandardEntity {
    private static final long serialVersionUID = -327762669853355423L;

    @Column(name = "NAME", nullable = false)
    @NotNull
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}