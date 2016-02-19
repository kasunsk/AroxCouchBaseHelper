package com.isa.arox.api.auxiliary.dto;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Thushara Ariyasena
 */
@SuppressWarnings("serial")
public class AirportTimeParam implements Serializable {

    private Date currentTime;
    private String currentTimeZone;
    private String airportCode;


    public Date getCurrentTime() {

        return currentTime;
    }


    public void setCurrentTime(Date currentTime) {

        this.currentTime = currentTime;
    }


    public String getCurrentTimeZone() {

        return currentTimeZone;
    }


    public void setCurrentTimeZone(String currentTimeZone) {

        this.currentTimeZone = currentTimeZone;
    }


    public String getAirportCode() {

        return airportCode;
    }


    public void setAirportCode(String airportCode) {

        this.airportCode = airportCode;
    }
}
