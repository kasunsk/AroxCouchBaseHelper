package com.isa.arox.api.auxiliary.dto;

import java.io.Serializable;

/**
 * @author Kasun Kariyawasam
 *         <p/>
 *         Jan 19, 2015
 */
@SuppressWarnings("serial")
public class ApplicationSettings implements Serializable {

    private String onHoldTimeDuration;
    private String onHoldBufferTime;


    public String getOnHoldTimeDuration() {

        return onHoldTimeDuration;
    }


    public void setOnHoldTimeDuration(String onHoldTimeDuration) {

        this.onHoldTimeDuration = onHoldTimeDuration;
    }


    public String getOnHoldBufferTime() {

        return onHoldBufferTime;
    }


    public void setOnHoldBufferTime(String onHoldBufferTime) {

        this.onHoldBufferTime = onHoldBufferTime;
    }
}
