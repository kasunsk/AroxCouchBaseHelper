package com.isa.arox.api.merchandising.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * @author Thushara Ariyasena
 */
@SuppressWarnings("serial")
public class DetailPackagePrice implements Serializable {

    private String pricePlanCode;
    private Date validFromDate;
    private Date validToDate;
    private Date salesStartDate;
    private Date salesEndDate;
    private BigDecimal agentCommission;
    private boolean commissionPercentage;
    private List<FacilityPrice> facilityPrices;


    public DetailPackagePrice() {

    }


    public DetailPackagePrice(PricePlan pricePlan) {

        if (pricePlan != null) {
            this.pricePlanCode = pricePlan.getPricePlanCode();
            this.validFromDate = pricePlan.getValidFromDate();
            this.validToDate = pricePlan.getValidToDate();
            this.salesStartDate = pricePlan.getSalesStartDate();
            this.salesEndDate = pricePlan.getSalesEndDate();
            this.agentCommission = new BigDecimal(pricePlan.getAgentCommission());
            this.commissionPercentage = pricePlan.isPercentageCommission();
            this.facilityPrices = pricePlan.getFacilityPrices();
        }
    }


    public String getPricePlanCode() {

        return pricePlanCode;
    }


    public void setPricePlanCode(String pricePlanCode) {

        this.pricePlanCode = pricePlanCode;
    }


    public Date getValidFromDate() {

        return validFromDate;
    }


    public void setValidFromDate(Date validFromDate) {

        this.validFromDate = validFromDate;
    }


    public Date getValidToDate() {

        return validToDate;
    }


    public void setValidToDate(Date validToDate) {

        this.validToDate = validToDate;
    }


    public Date getSalesStartDate() {

        return salesStartDate;
    }


    public void setSalesStartDate(Date salesStartDate) {

        this.salesStartDate = salesStartDate;
    }


    public Date getSalesEndDate() {

        return salesEndDate;
    }


    public void setSalesEndDate(Date salesEndDate) {

        this.salesEndDate = salesEndDate;
    }


    public BigDecimal getAgentCommission() {

        return agentCommission;
    }


    public void setAgentCommission(BigDecimal agentCommission) {

        this.agentCommission = agentCommission;
    }


    public boolean isCommissionPercentage() {

        return commissionPercentage;
    }


    public void setCommissionPercentage(boolean commissionPercentage) {

        this.commissionPercentage = commissionPercentage;
    }


    public List<FacilityPrice> getFacilityPrices() {

        return facilityPrices;
    }


    public void setFacilityPrices(List<FacilityPrice> facilityPrices) {

        this.facilityPrices = facilityPrices;
    }
}
