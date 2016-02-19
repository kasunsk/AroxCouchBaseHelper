package com.isa.arox.api.auxiliary.dto;

import java.io.Serializable;

/**
 * @author Thushara Ariyasena
 */

public class Country implements Serializable {

	private static final long serialVersionUID = -910885663753641824L;
	private String countryCode;
    private String name;

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
