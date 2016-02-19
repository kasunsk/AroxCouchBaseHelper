package com.isa.arox.api.merchandising.dto;

import java.io.Serializable;
import java.util.Comparator;

/**
 * @author Thushara Ariyasena
 */
public enum AirportFacilityComparator implements Comparator<AirportFacility>, Serializable {

    BY_FACILITY_NAME_ASC,
    BY_FACILITY_NAME_DES;


    @Override
    public int compare(AirportFacility o1, AirportFacility o2) {

        switch (this) {

        case BY_FACILITY_NAME_ASC:
            return compareStringIgnoreCase(o1.getName(), o2.getName());

        case BY_FACILITY_NAME_DES:
            return compareStringIgnoreCase(o2.getName(), o1.getName());

        }

        return 0;
    }


    private int compareStringIgnoreCase(String st1, String st2) {

        return st1.toLowerCase().compareTo(st2.toLowerCase());
    }
}
