package com.isa.arox.impl.merchandising.model;

import com.isa.arox.api.auxiliary.dto.Airport;
import com.isa.arox.api.merchandising.dto.JourneyType;
import com.isa.arox.api.merchandising.dto.PackageFacility;
import com.isa.arox.api.merchandising.dto.PackageStatus;
import com.isa.arox.api.merchandising.dto.PaxConstrains;
import com.isa.arox.api.merchandising.dto.PurchaseMode;
import java.util.List;
import org.springframework.data.annotation.Id;

/**
 * @author Thushara Ariyasena
 */

public class PackageDoc {

    public static final String PREFIX = "package_";

    @Id
    private String key;
    private String packageCode;
    private PackageStatus status;
    private List<JourneyType> applicableCategories;
    private List<PackageFacility> packageFacilities;
    private PaxConstrains paxConstrains;
    private int rank;
    private int cancellationCutOverTime;
    private String cancellationPolicy;
    private int modificationCutOverTime;
    private String modificationPolicy;
    private String title;
    private String description;
    private String mainImage;
    private String detailedUrl;
    private List<Airport> airports;
    private List<PurchaseMode> purchaseModes;
    private String priceTagPrefix;
    private String priceTagSuffix;
    private List<String> gallaryImages;
    private List<String> moreDetailPoints;
    private String moreDetailDescription;

    public PackageDoc() {

        rank = Integer.MAX_VALUE;
        paxConstrains = new PaxConstrains();
    }


    public static String toKey(String code) {

        return DocUtil.toKey(PREFIX, code);
    }


    public String getPackageCode() {

        return packageCode;
    }


    public String getKey() {

        return this.key;
    }


    public void setPackageCode(String packageCode) {

        this.key = toKey(packageCode);
        this.packageCode = packageCode;
    }


    public PackageStatus getStatus() {

        return status;
    }


    public void setStatus(PackageStatus status) {

        this.status = status;
    }


    public List<JourneyType> getApplicableCategories() {

        return applicableCategories;
    }


    public void setApplicableCategories(List<JourneyType> applicableCategories) {

        this.applicableCategories = applicableCategories;
    }


    public List<PackageFacility> getPackageFacilities() {

        return packageFacilities;
    }


    public void setPackageFacilities(List<PackageFacility> packageFacilities) {

        this.packageFacilities = packageFacilities;
    }


    public PaxConstrains getPaxConstrains() {

        return paxConstrains;
    }


    public void setPaxConstrains(PaxConstrains paxConstrains) {

        this.paxConstrains = paxConstrains;
    }


    public int getMinAdult() {

        return paxConstrains.getMinAdult();
    }


    public void setMinAdult(int minAdult) {

        this.paxConstrains.setMinAdult(minAdult);
    }


    public int getMaxAdult() {

        return paxConstrains.getMaxAdult();
    }


    public void setMaxAdult(int maxAdult) {

        this.paxConstrains.setMaxAdult(maxAdult);
    }


    public int getMinChild() {

        return paxConstrains.getMinChild();
    }


    public void setMinChild(int minChild) {

        this.paxConstrains.setMinChild(minChild);
    }


    public int getMaxChild() {

        return paxConstrains.getMaxChild();
    }


    public void setMaxChild(int maxChild) {

        this.paxConstrains.setMaxChild(maxChild);
    }


    public int getMinInfant() {

        return paxConstrains.getMinInfant();
    }


    public void setMinInfant(int minInfant) {

        this.paxConstrains.setMinInfant(minInfant);
    }


    public int getMaxInfant() {

        return paxConstrains.getMaxInfant();
    }


    public void setMaxInfant(int maxInfant) {

        this.paxConstrains.setMaxInfant(maxInfant);
    }


    public int getCancellationCutOverTime() {

        return cancellationCutOverTime;
    }


    public void setCancellationCutOverTime(int cancellationCutOverTime) {

        this.cancellationCutOverTime = cancellationCutOverTime;
    }


    public String getCancellationPolicy() {

        return cancellationPolicy;
    }


    public void setCancellationPolicy(String cancellationPolicy) {

        this.cancellationPolicy = cancellationPolicy;
    }


    public int getModificationCutOverTime() {

        return modificationCutOverTime;
    }


    public void setModificationCutOverTime(int modificationCutOverTime) {

        this.modificationCutOverTime = modificationCutOverTime;
    }


    public String getModificationPolicy() {

        return modificationPolicy;
    }


    public void setModificationPolicy(String modificationPolicy) {

        this.modificationPolicy = modificationPolicy;
    }


    public String getTitle() {

        return title;
    }


    public void setTitle(String title) {

        this.title = title;
    }


    public String getDescription() {

        return description;
    }


    public void setDescription(String description) {

        this.description = description;
    }


    public String getMainImage() {

        return mainImage;
    }


    public void setMainImage(String mainImage) {

        this.mainImage = mainImage;
    }


    public String getDetailedUrl() {

        return detailedUrl;
    }


    public void setDetailedUrl(String detailedUrl) {

        this.detailedUrl = detailedUrl;
    }


    public List<Airport> getAirports() {

        return airports;
    }


    public void setAirports(List<Airport> airports) {

        this.airports = airports;
    }


    public List<PurchaseMode> getPurchaseModes() {

        return purchaseModes;
    }


    public void setPurchaseModes(List<PurchaseMode> purchaseModes) {

        this.purchaseModes = purchaseModes;
    }


    public int getRank() {

        if (rank == Integer.MAX_VALUE) {
            return -1;

        } else {
            return rank;
        }
    }


    public void setRank(int rank) {

        if (rank > 0) {
            this.rank = rank;

        } else {
            this.rank = Integer.MAX_VALUE;
        }
    }


    public String getPriceTagPrefix() {

        return priceTagPrefix;
    }


    public void setPriceTagPrefix(String priceTagPrefix) {

        this.priceTagPrefix = priceTagPrefix;
    }


    public String getPriceTagSuffix() {

        return priceTagSuffix;
    }


    public void setPriceTagSuffix(String priceTagSuffix) {

        this.priceTagSuffix = priceTagSuffix;
    }


    public List<String> getGallaryImages() {

        return gallaryImages;
    }


    public void setGallaryImages(List<String> gallaryImages) {

        this.gallaryImages = gallaryImages;
    }


    public List<String> getMoreDetailPoints() {

        return moreDetailPoints;
    }


    public void setMoreDetailPoints(List<String> moreDetailPoints) {

        this.moreDetailPoints = moreDetailPoints;
    }


    public String getMoreDetailDescription() {

        return moreDetailDescription;
    }


    public void setMoreDetailDescription(String moreDetailDescription) {

        this.moreDetailDescription = moreDetailDescription;
    }


}
