package com.isa.arox.api.merchandising.dto;

import com.isa.arox.api.auxiliary.dto.Agent;
import com.isa.arox.api.auxiliary.dto.SalesChannel;
import java.util.Date;

/**
 * @author Thushara Ariyasena
 */

public class PricePlanValidationCriteria {

    private String pricePlanCode;
    private String packageCode;
    private Date salesDate;
    private Date consumptionDate;
    private Agent requestedAgent;
    private SalesChannel requestedSalesChannel;
    private boolean skipDateExpiration;


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


    public Agent getRequestedAgent() {

        return requestedAgent;
    }


    public void setRequestedAgent(Agent requestedAgent) {

        this.requestedAgent = requestedAgent;
    }


    public SalesChannel getRequestedSalesChannel() {

        return requestedSalesChannel;
    }


    public void setRequestedSalesChannel(SalesChannel requestedSalesChannel) {

        this.requestedSalesChannel = requestedSalesChannel;
    }


    public boolean isSkipDateExpiration() {

        return skipDateExpiration;
    }


    public void setSkipDateExpiration(boolean skipDateExpiration) {

        this.skipDateExpiration = skipDateExpiration;
    }
}
