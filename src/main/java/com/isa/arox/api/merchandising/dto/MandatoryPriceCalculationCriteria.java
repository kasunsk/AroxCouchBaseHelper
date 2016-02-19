package com.isa.arox.api.merchandising.dto;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Thushara Ariyasena
 */
@SuppressWarnings("serial")
public class MandatoryPriceCalculationCriteria implements Serializable {

    private String packageCode;
    private PaxSelection paxSelection;
    private Date salesDate;
    private Date consumptionDate;
    private boolean priceBreakDownNeeded;


    public String getPackageCode() {

        return packageCode;
    }


    public void setPackageCode(String packageCode) {

        this.packageCode = packageCode;
    }


    public PaxSelection getPaxSelection() {

        return paxSelection;
    }


    public void setPaxSelection(PaxSelection paxSelection) {

        this.paxSelection = paxSelection;
    }


    public boolean isPriceBreakDownNeeded() {

        return priceBreakDownNeeded;
    }


    public void setPriceBreakDownNeeded(boolean priceBreakDownNeeded) {

        this.priceBreakDownNeeded = priceBreakDownNeeded;
    }


    public Date getSalesDate() {

        return salesDate;
    }


    public void setSalesDate(Date salesDate) {

        this.salesDate = salesDate;
    }


    public Date getConsumptionDate() {

        return consumptionDate;
    }


    public void setConsumptionDate(Date consumptionDate) {

        this.consumptionDate = consumptionDate;
    }
}
