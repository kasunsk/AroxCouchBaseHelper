package com.isa.migration;

import com.couchbase.client.CouchbaseClient;
import com.couchbase.client.protocol.views.Query;
import com.couchbase.client.protocol.views.Stale;
import com.isa.arox.impl.merchandising.model.PackageDoc;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.couchbase.core.CouchbaseTemplate;

import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

/**
 * Created by kasun on 2/17/16.
 */
public class PackageMigration {

    private static final String S3_BASE_URL = "https://s3-ap-southeast-1.amazonaws.com/sas-hala-images";
    private static final String S3_BASE_URL_2 = "https://arox-files-prod.s3.amazonaws.com/";
    private static final String S3_BASE_URL_3 = "https://s3-ap-southeast-1.amazonaws.com/sas-hala-images/amored/";

    private static String newBaseUrl = "http://10.20.3.104/arox-files-dev/";

    private static final Logger log = LoggerFactory.getLogger(PackageMigration.class);
    private static CouchbaseClient couchbaseClient;


    public static void packageDataMigration(String couchbaseServerIp, String bucketName, String bucketPassword, String ftpUrl)
            throws IOException {

        if (ftpUrl != null) {
            newBaseUrl = ftpUrl;
        }

        CouchbaseTemplate couchbaseTemplate = constructCouhbaseTemplate(couchbaseServerIp, bucketName, bucketPassword);
        System.out.println();
        List<PackageDoc> packageDocs = retrieveAllPackageDocs(couchbaseTemplate);
        System.out.println();

        if (packageDocs != null && !packageDocs.isEmpty()) {

            for (PackageDoc packageDoc : packageDocs) {

                String tenantCode = getTenant(bucketName);
                print("Updating package [code: #] [name: #]", packageDoc.getPackageCode(), packageDoc.getDescription());
                updateMainImageUrl(packageDoc, tenantCode);
                updateMoreDetailUrl(packageDoc, tenantCode);
                updateGalleryImageUrls(packageDoc, tenantCode);
                couchbaseTemplate.update(packageDoc);
                System.out.println();
            }
        } else {
            print("No packages found");
        }
        finalizeApplication();
    }


    private static String getTenant(String bucketName) {

        return bucketName.replace("arox_", "").toLowerCase();
    }


    private static void finalizeApplication() {

        couchbaseClient.shutdown();
    }


    private static void updateGalleryImageUrls(PackageDoc packageDoc, String tenantCode) {

        List<String> updatedGalleryImages = new ArrayList<>();
        List<String> galleryImages = packageDoc.getGallaryImages();

        if (galleryImages != null && !galleryImages.isEmpty()) {

            for (String galleryImage : packageDoc.getGallaryImages()) {

                String newGalleryImageUrl = galleryImage;

                print("Gallery Image old url [#]", galleryImage);

                if (isStartWith(galleryImage, S3_BASE_URL_3) || isStartWith(galleryImage, S3_BASE_URL) || isStartWith(galleryImage, S3_BASE_URL_2)) {

                    if (isStartWith(galleryImage, S3_BASE_URL_3)) {
                        newGalleryImageUrl = galleryImage.replace(S3_BASE_URL_3, newBaseUrl + additionToUrl(tenantCode));
                    } else if (isStartWith(galleryImage, S3_BASE_URL)) {
                        newGalleryImageUrl = galleryImage.replace(S3_BASE_URL, newBaseUrl + addImageUrl(tenantCode));
                    } else {
                        newGalleryImageUrl = galleryImage.replace(S3_BASE_URL_2, newBaseUrl);
                    }
                    print("Gallery Image new url [#]", newGalleryImageUrl);

                } else {
                    print("Gallery image Not Updated");
                }

                updatedGalleryImages.add(newGalleryImageUrl);

            }
        } else {
            print("No gallery images found");
        }
        packageDoc.setGallaryImages(updatedGalleryImages);
    }


    private static void updateMoreDetailUrl(PackageDoc packageDoc, String tenantCode) {

        print("More detail old url [#]", packageDoc.getDetailedUrl());
        String detailedUrl = packageDoc.getDetailedUrl();

        if (isStartWith(detailedUrl, S3_BASE_URL_3) || isStartWith(detailedUrl, S3_BASE_URL) || isStartWith(detailedUrl,
                S3_BASE_URL_2)) {

            String newDetailedUrl;

            if (isStartWith(detailedUrl, S3_BASE_URL_3)) {
                newDetailedUrl = detailedUrl.replace(S3_BASE_URL_3, newBaseUrl + additionToUrl(tenantCode));
            } else if (isStartWith(detailedUrl, S3_BASE_URL)) {
                newDetailedUrl = detailedUrl.replace(S3_BASE_URL, newBaseUrl + addImageUrl(tenantCode));
            } else {
                newDetailedUrl = detailedUrl.replace(S3_BASE_URL_2, newBaseUrl);
            }
            print("More detail new url [#]", newDetailedUrl);
            packageDoc.setDetailedUrl(newDetailedUrl);
        } else {
            print("More detailed url Not Updated");
        }
    }


    private static void updateMainImageUrl(PackageDoc packageDoc, String tenantCode) {

        print("Main image old url [#]", packageDoc.getMainImage());
        String mainImage = packageDoc.getMainImage();

        if (isStartWith(mainImage, S3_BASE_URL_3) || isStartWith(mainImage, S3_BASE_URL) || isStartWith(mainImage,
                S3_BASE_URL_2)) {
            String newMainImageUrl;

            if (isStartWith(mainImage, S3_BASE_URL_3)) {
                newMainImageUrl = mainImage.replace(S3_BASE_URL_3, newBaseUrl + additionToUrl(tenantCode));
            } else if (isStartWith(mainImage, S3_BASE_URL)) {
                newMainImageUrl = mainImage.replace(S3_BASE_URL, newBaseUrl + addImageUrl(tenantCode));
            } else {
                newMainImageUrl = mainImage.replace(S3_BASE_URL_2, newBaseUrl);
            }
            print("Main image new url " + newMainImageUrl);
            packageDoc.setMainImage(newMainImageUrl);
        } else {
            print("Main url Not Updated");
        }
    }


    private static String addImageUrl(String tenantCode) {

        return tenantCode + "/images";
    }


    private static String additionToUrl(String tenant) {

        return tenant + "/custom/";
    }


    private static List<PackageDoc> retrieveAllPackageDocs(CouchbaseTemplate couchbaseTemplate) {

        print("Loading packages form Couchbase..");
        Query query = new Query();
        query.setStale(Stale.FALSE);
        query.setReduce(false);
        query.setIncludeDocs(true);
        List<PackageDoc> packageDocs = couchbaseTemplate.findByView("package", "list", query, PackageDoc.class);

        if (packageDocs == null || packageDocs.isEmpty()) {
            print("No packages fond for migration.");

        } else {
            print("# number of packages loaded.", packageDocs.size());
        }
        return packageDocs;
    }


    private static CouchbaseTemplate constructCouhbaseTemplate(String couchbaseServerIp, String bucketName, String password)
            throws IOException {

        URI uri = URI.create("http://" + couchbaseServerIp + ":8091/pools");
        couchbaseClient = new CouchbaseClient(Arrays.asList(uri), bucketName, password);
        return new CouchbaseTemplate(couchbaseClient);
    }


    public static void print(String formatStr, Object... args) {

        if (formatStr != null) {

            if (args != null) {
                String placeHolder = Pattern.compile("#", Pattern.LITERAL).pattern();

                for (Object arg : args) {
                    formatStr = formatStr.replaceFirst(placeHolder, arg.toString());
                }
            }
            System.out.println(formatStr);
            log.info(formatStr);
        }
    }


    private static Boolean isStartWith(String url, String preFix) {

        return url.startsWith(preFix);
    }

}
