package org.example.config;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;

public class Conection {

    private static MongoClient mongoClient;
    private static MongoDatabase database;

    public static MongoDatabase conect(String uri) {

        if(mongoClient == null) {
            mongoClient = MongoClients.create(uri);
            database = mongoClient.getDatabase("app");
        }
        
        return database;
    }

    public static void close() {
        if(mongoClient != null) mongoClient.close();
    }
}


