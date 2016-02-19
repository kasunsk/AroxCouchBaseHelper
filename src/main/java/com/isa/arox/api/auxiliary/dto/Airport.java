package com.isa.arox.api.auxiliary.dto;


import java.io.Serializable;

/**
 * @author Thushara Ariyasena
 */
@SuppressWarnings("serial")
public class Airport implements Serializable {

    private String airportCode;
    private String name;
    private String timeZoneOffsetInMinutes;


    public String getAirportCode() {

        return airportCode;
    }


    public void setAirportCode(String airportCode) {

        this.airportCode = airportCode;
    }


    public String getName() {

        return name;
    }


    public void setName(String name) {

        this.name = name;
    }


    public String getTimeZoneOffsetInMinutes() {

        return timeZoneOffsetInMinutes;
    }


    public void setTimeZoneOffsetInMinutes(String timeZoneOffsetInMinutes) {

        this.timeZoneOffsetInMinutes = timeZoneOffsetInMinutes;
    }


}
