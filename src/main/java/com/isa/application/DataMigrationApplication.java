package com.isa.application;

import com.isa.migration.PackageMigration;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by kasun on 2/18/16.
 */
public class DataMigrationApplication {

    public static void main(String [] args) throws IOException {

        Scanner reader = new Scanner(System.in);
        System.out.println();

        System.out.print("Enter the couchbase server ip address: ");
        String couchbaseServerIp = reader.nextLine();

        System.out.print("Enter the bucket name: ");
        String bucketName = reader.nextLine();

        System.out.print("Enter the bucket password: ");
        String bucketPassword = reader.nextLine();

        System.out.print("Enter ftp url ");
        String ftpUrl = reader.nextLine();

        PackageMigration.packageDataMigration(couchbaseServerIp, bucketName, bucketPassword, ftpUrl);
        PackageMigration.print("Package data migration successfully completed");
        reader.close();
    }
}
