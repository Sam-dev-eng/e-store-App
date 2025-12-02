package eStoreApplication.data.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
import java.util.Map;
@Data
@Document("E-STORE-PRODUCTS")
public class Product {
    @Id
    String id;
    String productNameDescription;
    String type;
    Categories category;
    String brand;
    String price;
    String createdOn;
    String lastUpdated;

    String confirmPayment;

    String owner;
    boolean isDelivered;
    Map<User, List<String>> descriptions;

    @Override
    public String toString() {
        return "Product{" +
                "productNameDescription='" + productNameDescription + '\'' +
                ", type='" + type + '\'' +
                ", category=" + category +
                ", brand='" + brand + '\'' +
                ", price='" + price + '\'' +
                ", descriptions=" + descriptions +
                '}';
    }
}
