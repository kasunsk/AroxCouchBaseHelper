package com.isa.arox.api.merchandising.dto;

import com.isa.arox.api.auxiliary.dto.Airport;
import java.io.Serializable;
import java.util.List;

/**
 * @author Thushara Ariyasena
 */
@SuppressWarnings("serial")
public class AirportFacility implements Serializable {

    private String facilityCode;
    private String name;
    private Boolean nameOptional;
    private String invConsumptionUnit;
    private String description;
    private List<Airport> availableAirports;
    private AirportFacilityStatus status;
    private Long version;


    public AirportFacility(Long version) {

        this.version = version;
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


    public String getInvConsumptionUnit() {

        return invConsumptionUnit;
    }


    public void setInvConsumptionUnit(String invConsumptionUnit) {

        this.invConsumptionUnit = invConsumptionUnit;
    }


    public String getDescription() {

        return description;
    }


    public void setDescription(String description) {

        this.description = description;
    }


    public List<Airport> getAvailableAirports() {

        return availableAirports;
    }


    public void setAvailableAirports(List<Airport> availableAirports) {

        this.availableAirports = availableAirports;
    }


    public AirportFacilityStatus getStatus() {

        return status;
    }


    public void setStatus(AirportFacilityStatus status) {

        this.status = status;
    }


    public Boolean getNameOptional() {

        return nameOptional;
    }


    public void setNameOptional(Boolean nameOptional) {

        this.nameOptional = nameOptional;
    }


    public Long getVersion() {

        return version;
    }
}
