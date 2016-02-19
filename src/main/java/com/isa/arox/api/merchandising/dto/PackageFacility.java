package com.isa.arox.api.merchandising.dto;

import java.io.Serializable;

/**
 * @author Thushara Ariyasena
 */
@SuppressWarnings("serial")
public class PackageFacility implements Serializable {

    private String facilityCode;
    private String name;
    private String description;
    private int invConsumptionQty;
    private String invConsumptionUnit;
    private boolean perPax;
    private boolean optional;


    public void fromService(AirportFacility service) {

        if (service != null) {
            this.facilityCode = service.getFacilityCode();
            this.name = service.getName();
            this.description = service.getDescription();
            this.invConsumptionUnit = service.getInvConsumptionUnit();
        }
    }


    public String getFacilityCode() {

        return facilityCode;
    }


    public void setFacilityCode(String facilityCode) {

        this.facilityCode = facilityCode;
    }


    public String getName() {

        return name;
    }


    public void setName(String name) {

        this.name = name;
    }


    public String getDescription() {

        return description;
    }


    public void setDescription(String description) {

        this.description = description;
    }


    public int getInvConsumptionQty() {

        return invConsumptionQty;
    }


    public void setInvConsumptionQty(int invConsumptionQty) {

        this.invConsumptionQty = invConsumptionQty;
    }


    public String getInvConsumptionUnit() {

        return invConsumptionUnit;
    }


    public void setInvConsumptionUnit(String invConsumptionUnit) {

        this.invConsumptionUnit = invConsumptionUnit;
    }


    public boolean isPerPax() {

        return perPax;
    }


    public void setPerPax(boolean perPax) {

        this.perPax = perPax;
    }


    public boolean isOptional() {

        return optional;
    }


    public void setOptional(boolean optional) {

        this.optional = optional;
    }

}
