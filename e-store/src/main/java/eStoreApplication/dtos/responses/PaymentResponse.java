package eStoreApplication.dtos.responses;

import lombok.Data;

@Data
public class PaymentResponse {
    String productPrice;
    String message;

    public String getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(String productPrice) {
        this.productPrice = productPrice;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
