package com.isa.arox.api.merchandising.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @author Thushara Ariyasena
 */
@SuppressWarnings("serial")
public class BestPriceCalculationCriteria implements Serializable {

    private String packageCode;
    private Date consumptionDate;
    private Date salesDate;
    private PaxSelection paxSelection;
    private List<String> optionalFacilityCodes;
    private boolean considerExpiredPlansAlso;


    public String getPackageCode() {

        return packageCode;
    }


    public void setPackageCode(String packageCode) {

        this.packageCode = packageCode;
    }


    public Date getConsumptionDate() {

        return consumptionDate;
    }


    public void setConsumptionDate(Date consumptionDate) {

        this.consumptionDate = consumptionDate;
    }


    public Date getSalesDate() {

        return salesDate;
    }


    public void setSalesDate(Date salesDate) {

        this.salesDate = salesDate;
    }


    public PaxSelection getPaxSelection() {

        return paxSelection;
    }


    public void setPaxSelection(PaxSelection paxSelection) {

        this.paxSelection = paxSelection;
    }


    public List<String> getOptionalFacilityCodes() {

        return optionalFacilityCodes;
    }


    public void setOptionalFacilityCodes(List<String> optionalFacilityCodes) {

        this.optionalFacilityCodes = optionalFacilityCodes;
    }


    public boolean considerExpiredPlansAlso() {

        return considerExpiredPlansAlso;
    }


    public void setConsiderExpiredPlansAlso(boolean considerExpiredPlansAlso) {

        this.considerExpiredPlansAlso = considerExpiredPlansAlso;
    }
}





