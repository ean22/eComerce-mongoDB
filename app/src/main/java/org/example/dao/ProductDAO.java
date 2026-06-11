// package org.example.dao;

// import com.mongodb.client.MongoCollection;
// import com.mongodb.client.MongoDatabase;

// import org.bson.Document;

// import org.example.models.Product;


// import java.util.ArrayList;
// import java.util.List;

// public class ProductDAO {

//     private final MongoCollection<Document> collection;

//     public ProductDAO(MongoDatabase database) {
//         this.collection = database.getCollection("products");
//     }

//     // CREATE
//     public void insert(Product product) {
//         Document doc = new Document("name", product.name)
//                 .append("price", product.price);

//         collection.insertOne(doc);
//         System.out.println("Produto inserido");
//     }

//     // READ ALL
//     public List<Product> findAll() {
//         List<Product> products = new ArrayList<>();

//         for (Document doc : collection.find()) {
//             Product p = new Product(
//                     doc.getString("name"),
//                     doc.getDouble("price")
//             );
//             products.add(p);
//         }

//         return products;
//     }

//     // UPDATE
//     public void updatePrice(String name, double newPrice) {
//         collection.updateOne(
//                 new Document("name", name),
//                 new Document("$set", new Document("price", newPrice))
//         );
//     }

//     // DELETE
//     public void delete(String name) {
//         collection.deleteOne(new Document("name", name));
//     }
// }