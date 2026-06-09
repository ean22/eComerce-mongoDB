package org.example;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
        
        MongoDatabase db = Conection.conect("mongodb://localhost:27017");



        Conection.close();
    }
}
