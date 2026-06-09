package org.example;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;

public class Conection {

    private static MongoClient mongoClient;
    private static MongoDatabase database;

    public static MongoDatabase conect(String uri) {

        if(mongoClient == null) {
            MongoClient mongoClient = MongoClients.create(uri);
            MongoDatabase database = mongoClient.getDatabase("app");
        }
        
        return database;
    }

    public static void close() {
        if(MongoClient != null) MongoClient.close();
    }
}


