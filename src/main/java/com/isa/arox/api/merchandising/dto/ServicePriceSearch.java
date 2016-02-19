package com.isa.arox.api.merchandising.dto;

import java.io.Serializable;

public class ServicePriceSearch implements Serializable {

	private static final long serialVersionUID = -6465011289757880447L;

	private String packageCode;

    private String serviceCode;

    public String getPackageCode() {
        return packageCode;
    }

    public void setPackageCode(String packageCode) {
        this.packageCode = packageCode;
    }

    public String getServiceCode() {
        return serviceCode;
    }

    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }
}
