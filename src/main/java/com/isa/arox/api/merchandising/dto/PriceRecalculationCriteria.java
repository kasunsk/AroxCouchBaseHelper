package com.isa.arox.api.merchandising.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @author Thushara Ariyasena
 */
@SuppressWarnings("serial")
public class PriceRecalculationCriteria implements Serializable {

    private String packageCode;
    private String pricePlanCode;
    private Date salesDate;
    private Date consumptionDate;
    private List<String> optionalFacilityCodes;
    private PaxSelection paxSelection;


    public String getPackageCode() {

        return packageCode;
    }


    public void setPackageCode(String packageCode) {

        this.packageCode = packageCode;
    }


    public String getPricePlanCode() {

        return pricePlanCode;
    }


    public void setPricePlanCode(String pricePlanCode) {

        this.pricePlanCode = pricePlanCode;
    }


    public List<String> getOptionalFacilityCodes() {

        return optionalFacilityCodes;
    }


    public void setOptionalFacilityCodes(List<String> optionalFacilityCodes) {

        this.optionalFacilityCodes = optionalFacilityCodes;
    }


    public PaxSelection getPaxSelection() {

        return paxSelection;
    }


    public void setPaxSelection(PaxSelection paxSelection) {

        this.paxSelection = paxSelection;
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


    @Override
    public String toString() {

        StringBuffer out = new StringBuffer();
        out.append("[pricePlanCode: ").append(pricePlanCode).append(",");
        out.append("optionalFacilityCodes: ").append(optionalFacilityCodes).append(",");
        out.append("adultPaxCount: ").append(paxSelection.getAdultPaxCount()).append(",");
        out.append("childPaxCount: ").append(paxSelection.getChildPaxCount()).append(",");
        out.append("infantPaxCount: ").append(paxSelection.getInfantPaxCount()).append("]");
        out.append("salesDate: ").append(salesDate).append("]");
        out.append("ConsumptionDate: ").append(consumptionDate).append("]");
        return out.toString();
    }
}
