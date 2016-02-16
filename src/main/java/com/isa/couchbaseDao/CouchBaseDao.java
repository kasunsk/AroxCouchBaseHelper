package com.isa.couchbaseDao;


import com.couchbase.client.java.Bucket;
import com.couchbase.client.java.Cluster;
import com.couchbase.client.java.CouchbaseCluster;
import com.couchbase.client.java.document.JsonDocument;
import com.couchbase.client.java.document.json.JsonObject;

/**
 * Created by kasun on 2/16/16.
 */
public class CouchBaseDao {

    public void updateDatabase() {

        Cluster cluster = CouchbaseCluster.create();

        Bucket bucket = cluster.openBucket("bucket", "password");

        JsonObject user = JsonObject.empty()
                .put("firstname", "Walter")
                .put("lastname", "White")
                .put("job", "chemistry teacher")
                .put("age", 50);


        JsonDocument doc = JsonDocument.create("walter", user);
        JsonDocument response = bucket.upsert(doc);

        JsonDocument walter = bucket.get("walter");

        JsonDocument loaded = bucket.get("walter");

        if (loaded == null) {
            System.err.println("Document not found!");
        } else {
            loaded.content().put("age", 52);
            JsonDocument updated = bucket.replace(loaded);
            System.out.println("Updated: " + updated.id());
        }

        cluster.disconnect();
    }
}
