package eStoreApplication.dtos.responses;

import lombok.Data;

import java.util.List;
@Data
public class ViewAllProductResponse {
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
