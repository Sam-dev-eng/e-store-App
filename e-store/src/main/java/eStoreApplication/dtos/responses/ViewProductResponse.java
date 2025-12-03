package eStoreApplication.dtos.responses;

import eStoreApplication.data.models.Product;
import lombok.Data;

import java.util.List;
@Data
public class ViewProductResponse {

    List<String> products;
    String message;

    public List<String> getProducts() {
        return products;
    }

    public void setProducts(List<String> products) {
        this.products = products;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
