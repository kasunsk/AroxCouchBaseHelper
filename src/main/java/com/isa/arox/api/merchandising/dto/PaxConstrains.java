package com.isa.arox.api.merchandising.dto;

import java.io.Serializable;

/**
 * @author Thushara Ariyasena
 */
@SuppressWarnings("serial")
public class PaxConstrains implements Serializable {

    private int minAdult;
    private int maxAdult;
    private int minChild;
    private int maxChild;
    private int minInfant;
    private int maxInfant;


    public int getMinAdult() {

        return minAdult;
    }


    public void setMinAdult(int minAdult) {

        this.minAdult = minAdult;
    }


    public int getMaxAdult() {

        return maxAdult;
    }


    public void setMaxAdult(int maxAdult) {

        this.maxAdult = maxAdult;
    }


    public int getMinChild() {

        return minChild;
    }


    public void setMinChild(int minChild) {

        this.minChild = minChild;
    }


    public int getMaxChild() {

        return maxChild;
    }


    public void setMaxChild(int maxChild) {

        this.maxChild = maxChild;
    }


    public int getMinInfant() {

        return minInfant;
    }


    public void setMinInfant(int minInfant) {

        this.minInfant = minInfant;
    }


    public int getMaxInfant() {

        return maxInfant;
    }


    public void setMaxInfant(int maxInfant) {

        this.maxInfant = maxInfant;
    }

    public int getTotalMaxPax() {
        return maxAdult + maxChild + maxInfant;
    }
}
