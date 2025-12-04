package eStoreApplication.dtos.responses;

import eStoreApplication.data.models.Categories;
import eStoreApplication.data.models.User;
import lombok.Data;

import java.util.List;
import java.util.Map;
@Data
public class FindProductResponse {
    String productNameDescription;
    String type;
    String category;
    String brand;
    String price;
    String createdOn;
    String lastUpdated;
    String confirmPayment;

    String owner;
    boolean isDelivered;
    Map<User, List<String>> descriptions;
}
