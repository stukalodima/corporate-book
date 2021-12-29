package com.itk.cb.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.FileDescriptor;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.OnDelete;
import com.haulmont.cuba.core.entity.annotation.OnDeleteInverse;
import com.haulmont.cuba.core.global.DeletePolicy;

import javax.persistence.*;

@Table(name = "CB_STRUCTURE")
@Entity(name = "cb_Structure")
@NamePattern("%s|name")
public class Structure extends StandardEntity {
    private static final long serialVersionUID = 7214384318934465629L;

    @Column(name = "NAME")
    private String name;

    @OnDeleteInverse(DeletePolicy.DENY)
    @OnDelete(DeletePolicy.CASCADE)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "FILE_NAME_ID")
    private FileDescriptor fileName;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PARENT_ID")
    private Structure parent;

    @Column(name = "ORDER_")
    private Integer order;

    public FileDescriptor getFileName() {
        return fileName;
    }

    public void setFileName(FileDescriptor fileName) {
        this.fileName = fileName;
    }

    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

    public Structure getParent() {
        return parent;
    }

    public void setParent(Structure parent) {
        this.parent = parent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}