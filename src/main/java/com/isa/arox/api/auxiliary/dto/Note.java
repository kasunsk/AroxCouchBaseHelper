package com.isa.arox.api.auxiliary.dto;

import java.io.Serializable;

/**
 * @author Thushara Ariyasena
 */
@SuppressWarnings("serial")
public class Note implements Serializable {

    private String id;
    private String owner;
    private String ownerReference;
    private String category;
    private String note;


    public String getId() {

        return id;
    }


    public void setId(String id) {

        this.id = id;
    }


    public String getOwner() {

        return owner;
    }


    public void setOwner(String owner) {

        this.owner = owner;
    }


    public String getOwnerReference() {

        return ownerReference;
    }


    public void setOwnerReference(String ownerReference) {

        this.ownerReference = ownerReference;
    }


    public String getCategory() {

        return category;
    }


    public void setCategory(String category) {

        this.category = category;
    }


    public String getNote() {

        return note;
    }


    public void setNote(String note) {

        this.note = note;
    }

}
