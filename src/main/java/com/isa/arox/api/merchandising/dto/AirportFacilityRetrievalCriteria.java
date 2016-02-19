package com.isa.arox.api.merchandising.dto;

import java.io.Serializable;

/**
 * @author Thushara Ariyasena
 */
@SuppressWarnings("serial")
public class AirportFacilityRetrievalCriteria implements Serializable {

    private String name, code;


    private AirportFacilityRetrievalCriteria() {

    }


    public static AirportFacilityRetrievalCriteria byName(String name) {

        AirportFacilityRetrievalCriteria criteria = new AirportFacilityRetrievalCriteria();
        criteria.name = name;
        return criteria;
    }


    public static AirportFacilityRetrievalCriteria byCode(String code) {

        AirportFacilityRetrievalCriteria criteria = new AirportFacilityRetrievalCriteria();
        criteria.code = code;
        return criteria;

    }


    public String getName() {

        return name;
    }


    public String getCode() {

        return code;
    }
}
