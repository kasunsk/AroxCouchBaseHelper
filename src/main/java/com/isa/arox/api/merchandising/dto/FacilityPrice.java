package com.isa.arox.api.merchandising.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Thushara Ariyasena
 */
@SuppressWarnings("serial")
public class FacilityPrice implements Serializable {

    //Redundant data form PackageFacility
    private String facilityCode;
    private String facilityName;
    private Boolean perPaxFacility = Boolean.FALSE;
    private Boolean optionalFacility = Boolean.FALSE;
    private String adultPrice;
    private String childPrice;
    private String infantPrice;

    // When price plan is invalidated mark this facility price to ADD or REMOVE to make it a valid price plan
    private String markFor;
    private List<String> messages;


    public String getFacilityCode() {

        return facilityCode;
    }


    public void setFacilityCode(String facilityCode) {

        this.facilityCode = facilityCode;
    }


    public String getAdultPriceString() {

        return adultPrice;
    }


    public String getChildPriceString() {

        return childPrice;
    }


    public String getInfantPriceString() {

        return infantPrice;
    }


    public BigDecimal getAdultPrice() {

        return (adultPrice == null || adultPrice.isEmpty() ? BigDecimal.ZERO : new BigDecimal(adultPrice));
    }


    public void setAdultPrice(String adultPrice) {

        this.adultPrice = adultPrice;
    }


    public BigDecimal getChildPrice() {

        return (childPrice == null || childPrice.isEmpty() ? BigDecimal.ZERO : new BigDecimal(childPrice));
    }


    public void setChildPrice(String childPrice) {

        this.childPrice = childPrice;
    }


    public BigDecimal getInfantPrice() {

        return (infantPrice == null || infantPrice.isEmpty() ? BigDecimal.ZERO : new BigDecimal(infantPrice));
    }


    public void setInfantPrice(String infantPrice) {

        this.infantPrice = infantPrice;
    }


    public boolean isPerPaxFacility() {

        return perPaxFacility;
    }


    public void setPerPaxFacility(boolean perPaxFacility) {

        this.perPaxFacility = perPaxFacility;
    }


    public boolean isOptionalFacility() {

        return optionalFacility;
    }


    public void setOptionalFacility(boolean optionalFacility) {

        this.optionalFacility = optionalFacility;
    }


    public String getFacilityName() {

        return facilityName;
    }


    public void setFacilityName(String facilityName) {

        this.facilityName = facilityName;
    }


    public String getMarkFor() {

        return markFor;
    }


    public void setMarkFor(String markFor) {

        this.markFor = markFor;
    }


    public List<String> getMessages() {

        return messages;
    }


    public void setMessages(List<String> messages) {

        if (this.messages == null) {
            this.messages = messages;

        } else {
            this.messages.addAll(messages);
        }
    }


    public void addMessage(String message) {

        if (messages == null) {
            messages = new ArrayList<>();
        }

        messages.add(message);
    }


}
