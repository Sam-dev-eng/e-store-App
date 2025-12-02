package eStoreApplication.data.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Map;
@Data
@Document("E-STORE-USERS")
public class User {
    @Id
    String id;
    String name;
    String email;
    String phoneNumber;
    String role;
    Map<Product,Integer> cart;
}
