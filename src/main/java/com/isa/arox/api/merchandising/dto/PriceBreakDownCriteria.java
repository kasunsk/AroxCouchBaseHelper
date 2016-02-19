package com.isa.arox.api.merchandising.dto;

import java.io.Serializable;

/**
 * @author Thushara Ariyasena
 */
@SuppressWarnings("serial")
public class PriceBreakDownCriteria implements Serializable {

    private String pricePlanCode;
    private PaxSelection paxSelection;


    public String getPricePlanCode() {

        return pricePlanCode;
    }


    public void setPricePlanCode(String pricePlanCode) {

        this.pricePlanCode = pricePlanCode;
    }


    public PaxSelection getPaxSelection() {

        return paxSelection;
    }


    public void setPaxSelection(PaxSelection paxSelection) {

        this.paxSelection = paxSelection;
    }
}
