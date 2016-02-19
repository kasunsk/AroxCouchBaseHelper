package com.isa.arox.api.auxiliary.dto;

import java.io.Serializable;

/**
 * @author Thushara Ariyasena
 */
@SuppressWarnings("serial")
public class SalesChannel implements Serializable {

    private String salesChannelCode;
    private String name;


    public String getSalesChannelCode() {

        return salesChannelCode;
    }


    public void setSalesChannelCode(String salesChannelCode) {

        this.salesChannelCode = salesChannelCode;
    }


    public String getName() {

        return name;
    }


    public void setName(String name) {

        this.name = name;
    }


    @Override
    public boolean equals(Object o) {

        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        SalesChannel that = (SalesChannel) o;

        if (name != null ? !name.equals(that.name) : that.name != null) {
            return false;
        }
        if (salesChannelCode != null ? !salesChannelCode.equals(that.salesChannelCode) : that.salesChannelCode != null) {
            return false;
        }

        return true;
    }


    @Override
    public int hashCode() {

        int result = salesChannelCode != null ? salesChannelCode.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}
