package com.itk.cb.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Table(name = "CB_GLOSARIJ")
@Entity(name = "cb_Glosarij")
@NamePattern("%s|name")
public class Glosarij extends StandardEntity {
    private static final long serialVersionUID = -3834199636855137236L;

    @Column(name = "NAME")
    private String name;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "CATEGORY_ID")
    private Category category;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "INDEX_ID")
    private IndexGl index;

    @Lob
    @Column(name = "INFO")
    private String info;

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public IndexGl getIndex() {
        return index;
    }

    public void setIndex(IndexGl index) {
        this.index = index;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}