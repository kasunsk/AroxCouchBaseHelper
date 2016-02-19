package com.isa.arox.api.merchandising.dto;

import com.isa.arox.api.auxiliary.dto.Agent;
import com.isa.arox.api.auxiliary.dto.SalesChannel;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @author Thushara Ariyasena
 */
@SuppressWarnings("serial")
public class PricePlan implements Serializable {

    public static final String STATUS_VALID = "VALID";
    public static final String STATUS_INVALID = "INVALID";
    public static final String STATUS_VALIDITY_EXPIRED = "VALIDITY_EXPIRED";
    public static final String STATUS_SALES_EXPIRED = "SALES_EXPIRED";
    private String pricePlanCode;
    private String pricePlanName;
    private String packageCode;
    private String packageName;
    private List<Agent> applicableAgents;
    private List<SalesChannel> applicableSalesChannels;
    private List<FacilityPrice> facilityPrices;
    private Date validFromDate;
    private Date validToDate;
    private Date salesStartDate;
    private Date salesEndDate;
    private double agentCommission;
    private boolean percentageCommission;
    private String status;
    // Redundant data from Package
    private PaxConstrains paxConstrains = new PaxConstrains();
    private long version;


    public String getPricePlanCode() {

        return pricePlanCode;
    }


    public void setPricePlanCode(String pricePlanCode) {

        this.pricePlanCode = pricePlanCode;
    }


    public String getPackageCode() {

        return packageCode;
    }


    public void setPackageCode(String packageCode) {

        this.packageCode = packageCode;
    }


    public List<Agent> getApplicableAgents() {

        return applicableAgents;
    }


    public void setApplicableAgents(List<Agent> applicableAgents) {

        this.applicableAgents = applicableAgents;
    }


    public List<SalesChannel> getApplicableSalesChannels() {

        return applicableSalesChannels;
    }


    public void setApplicableSalesChannels(List<SalesChannel> applicableSalesChannels) {

        this.applicableSalesChannels = applicableSalesChannels;
    }


    public List<FacilityPrice> getFacilityPrices() {

        return facilityPrices;
    }


    public void setFacilityPrices(List<FacilityPrice> facilityPrices) {

        this.facilityPrices = facilityPrices;
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


    public double getAgentCommission() {

        return agentCommission;
    }


    public void setAgentCommission(double agentCommission) {

        this.agentCommission = agentCommission;
    }


    public boolean isPercentageCommission() {

        return percentageCommission;
    }


    public void setPercentageCommission(boolean percentageCommission) {

        this.percentageCommission = percentageCommission;
    }


    public String getPackageName() {

        return packageName;
    }


    public void setPackageName(String packageName) {

        this.packageName = packageName;
    }


    public String getPricePlanName() {

        return pricePlanName;
    }


    public void setPricePlanName(String pricePlanName) {

        this.pricePlanName = pricePlanName;
    }


    public String getStatus() {

        return status;
    }


    public void setStatus(String status) {

        this.status = status;
    }


    public PaxConstrains getPaxConstrains() {

        return paxConstrains;
    }


    public void setPaxConstrains(PaxConstrains paxConstrains) {

        this.paxConstrains = paxConstrains;
    }


    public long getVersion() {

        return version;
    }


    public void setVersion(long version) {

        this.version = version;
    }


}
