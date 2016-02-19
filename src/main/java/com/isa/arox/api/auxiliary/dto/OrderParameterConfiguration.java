package com.isa.arox.api.auxiliary.dto;

import java.io.Serializable;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

/**
 * Created by kasun on 6/29/15.
 */

@SuppressWarnings("serial")
public class OrderParameterConfiguration implements Serializable {

    private final String KEY_PURCHASE_MANDATORY = "purchase-mandatory";
    private final String KEY_PURCHASE_OPTIONAL = "purchase-optional";
    private final String KEY_MODIFY_MANDATORY = "modify-mandatory";
    private final String KEY_MODIFY_OPTIONAL = "modify-optional";
    private Map<String, Set<String>> fieldConfigurations = new Hashtable<>();


    public void setPurchaseMandatoryFields(Set<String> purchaseMandatoryFields) {

        if (purchaseMandatoryFields != null) {
            fieldConfigurations.put(KEY_PURCHASE_MANDATORY, purchaseMandatoryFields);
        }
    }


    public void setPurchaseOptionalFields(Set<String> purchaseOptionalFields) {

        if (purchaseOptionalFields != null) {
            fieldConfigurations.put(KEY_PURCHASE_OPTIONAL, purchaseOptionalFields);
        }
    }


    public void setModifyMandatoryFields(Set<String> modifyMandatoryFields) {

        if (modifyMandatoryFields != null) {
            fieldConfigurations.put(KEY_MODIFY_MANDATORY, modifyMandatoryFields);
        }
    }


    public void setModifyOptionalFields(Set<String> modifyOptionalFields) {

        if (modifyOptionalFields != null) {
            fieldConfigurations.put(KEY_MODIFY_OPTIONAL, modifyOptionalFields);
        }
    }


    public Set<String> getPurchaseMandatoryFields() {

        return fieldConfigurations.get(KEY_PURCHASE_MANDATORY);
    }


    public Set<String> getPurchaseOptionalFields() {

        return fieldConfigurations.get(KEY_PURCHASE_OPTIONAL);
    }


    public Set<String> getModifyMandatoryFields() {

        return fieldConfigurations.get(KEY_MODIFY_MANDATORY);
    }


    public Set<String> getModifyOptionalFields() {

        return fieldConfigurations.get(KEY_MODIFY_OPTIONAL);
    }


    public Map<String, Set<String>> getFieldConfigurations() {

        return fieldConfigurations;
    }


    public void setFieldConfigurations(Map<String, Set<String>> fieldConfigurations) {

        this.fieldConfigurations = fieldConfigurations;
    }
}
