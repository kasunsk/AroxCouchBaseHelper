package com.isa.arox.api.merchandising.dto;

import java.io.Serializable;

/**
 * @author Thushara Ariyasena
 */
@SuppressWarnings("serial")
public class PaxSelection implements Serializable {

    private int adultPaxCount;
    private int childPaxCount;
    private int infantPaxCount;


    public PaxSelection() {

    }


    public PaxSelection(Integer adultPaxCount, Integer childPaxCount, Integer infantPaxCount) {

        this.adultPaxCount = adultPaxCount != null ? adultPaxCount : 0;
        this.childPaxCount = childPaxCount != null ? childPaxCount : 0;
        this.infantPaxCount = infantPaxCount != null ? infantPaxCount : 0;
    }


    public int getAdultPaxCount() {

        return adultPaxCount;
    }


    public int getChildPaxCount() {

        return childPaxCount;
    }


    public int getInfantPaxCount() {

        return infantPaxCount;
    }


    public void setAdultPaxCount(int adultPaxCount) {

        this.adultPaxCount = adultPaxCount;
    }


    public void setChildPaxCount(int childPaxCount) {

        this.childPaxCount = childPaxCount;
    }


    public void setInfantPaxCount(int infantPaxCount) {

        this.infantPaxCount = infantPaxCount;
    }


    public int getTotalPaxCount() {

        return adultPaxCount + childPaxCount + infantPaxCount;
    }
}
