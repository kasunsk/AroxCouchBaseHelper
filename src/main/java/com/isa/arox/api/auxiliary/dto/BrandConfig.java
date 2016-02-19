package com.isa.arox.api.auxiliary.dto;

import java.io.Serializable;
import java.util.List;

@SuppressWarnings("serial")
public class BrandConfig implements Serializable {

    private String logoUrl;

    private String homeUrl;

    private String termsUrl;

    private String privacyPolicyUrl;

    private String returnPolicyUrl;

    private String contactUrl;

    private String reservationUrl;

    private String cssUrl;

    private String backgroundColor;

    private String primaryColor;

    private String secondaryColor;

    private String linkColor;

    private String reservationEmail;

    private List<String> reservationCcEmails;

    private List<String> reservationBccEmails;

    private String contactEmail;

    private String contactFax;

    private String contactPhone;

    private String tenantName;


    public String getLogoUrl() {

        return logoUrl;
    }


    public void setLogoUrl(String logoUrl) {

        this.logoUrl = logoUrl;
    }


    public String getHomeUrl() {

        return homeUrl;
    }


    public void setHomeUrl(String homeUrl) {

        this.homeUrl = homeUrl;
    }


    public String getReservationUrl() {

        return reservationUrl;
    }


    public void setReservationUrl(String reservationUrl) {

        this.reservationUrl = reservationUrl;
    }


    public String getBackgroundColor() {

        return backgroundColor;
    }


    public void setBackgroundColor(String backgroundColor) {

        this.backgroundColor = backgroundColor;
    }


    public String getPrimaryColor() {

        return primaryColor;
    }


    public void setPrimaryColor(String primaryColor) {

        this.primaryColor = primaryColor;
    }


    public String getSecondaryColor() {

        return secondaryColor;
    }


    public void setSecondaryColor(String secondaryColor) {

        this.secondaryColor = secondaryColor;
    }


    public String getLinkColor() {

        return linkColor;
    }


    public void setLinkColor(String linkColor) {

        this.linkColor = linkColor;
    }


    public String getReservationEmail() {

        return reservationEmail;
    }


    public void setReservationEmail(String reservationEmail) {

        this.reservationEmail = reservationEmail;
    }


    public String getTermsUrl() {

        return termsUrl;
    }


    public void setTermsUrl(String termsUrl) {

        this.termsUrl = termsUrl;
    }


    public String getPrivacyPolicyUrl() {

        return privacyPolicyUrl;
    }


    public void setPrivacyPolicyUrl(String privacyPolicyUrl) {

        this.privacyPolicyUrl = privacyPolicyUrl;
    }


    public String getReturnPolicyUrl() {

        return returnPolicyUrl;
    }


    public void setReturnPolicyUrl(String returnPolicyUrl) {

        this.returnPolicyUrl = returnPolicyUrl;
    }


    public String getContactUrl() {

        return contactUrl;
    }


    public void setContactUrl(String contactUrl) {

        this.contactUrl = contactUrl;
    }


    public String getCssUrl() {

        return cssUrl;
    }


    public void setCssUrl(String cssUrl) {

        this.cssUrl = cssUrl;
    }


    public String getTenantName() {

        return tenantName;
    }


    public void setTenantName(String tenantName) {

        this.tenantName = tenantName;
    }


    public String getContactEmail() {

        return contactEmail;
    }


    public void setContactEmail(String contactEmail) {

        this.contactEmail = contactEmail;
    }


    public String getContactFax() {

        return contactFax;
    }


    public void setContactFax(String contactFax) {

        this.contactFax = contactFax;
    }


    public String getContactPhone() {

        return contactPhone;
    }


    public void setContactPhone(String contactPhone) {

        this.contactPhone = contactPhone;
    }


    public List<String> getReservationCcEmails() {

        return reservationCcEmails;
    }


    public void setReservationCcEmails(List<String> reservationCcEmails) {

        this.reservationCcEmails = reservationCcEmails;
    }


    public List<String> getReservationBccEmails() {

        return reservationBccEmails;
    }


    public void setReservationBccEmails(List<String> reservationBccEmails) {

        this.reservationBccEmails = reservationBccEmails;
    }
}
