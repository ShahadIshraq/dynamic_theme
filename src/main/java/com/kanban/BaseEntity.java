package com.kanban;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.util.Date;

/**
 * This is the to be the superclass for the other entities of the kanban boar.
 */

@MappedSuperclass
public class BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected Long id;

    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd/MM/yyyy")
    private Date createdDate;
    @PrePersist
    protected void onCreateDate() {
        createdDate = new Date();
    }

    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd/MM/yyyy")
    private Date lastModifiedDate;
    @PreUpdate
    protected void onModified(){
        lastModifiedDate = new Date();
    }


}