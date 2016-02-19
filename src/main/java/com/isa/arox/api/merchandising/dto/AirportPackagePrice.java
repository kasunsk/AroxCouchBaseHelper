package com.isa.arox.api.merchandising.dto;

import com.isa.arox.api.auxiliary.dto.Airport;
import java.io.Serializable;
import java.util.List;

/**
 * @author Thushara Ariyasena
 */
@SuppressWarnings("serial")
public class AirportPackagePrice implements Serializable{

	private List<Airport> availableAirports;
    private DetailPackagePrice packagePrice;

    public List<Airport> getAvailableAirports() {
        return availableAirports;
    }

    public void setAvailableAirports(List<Airport> availableAirports) {
        this.availableAirports = availableAirports;
    }

    public DetailPackagePrice getPackagePrice() {
        return packagePrice;
    }

    public void setPackagePrice(DetailPackagePrice packagePrice) {
        this.packagePrice = packagePrice;
    }
}
