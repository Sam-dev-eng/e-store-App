package eStoreApplication.dtos.responses;

import lombok.Data;

import java.util.List;
@Data
public class UpdateProductResponse {
    List<String> product;
    String message;

    public List<String> getProduct() {
        return product;
    }

    public void setProduct(List<String> product) {
        this.product = product;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
