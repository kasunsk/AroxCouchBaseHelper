package com.isa.arox.api.auxiliary.dto;

import java.io.Serializable;

/**
 * @author Thushara Ariyasena
 */
@SuppressWarnings("serial")
public class NoteSearchCriteria implements Serializable {

    private String owner;
    private String ownerReference;


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
}
