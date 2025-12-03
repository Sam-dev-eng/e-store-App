package eStoreApplication.dtos.requests;

import lombok.Data;

@Data
public class PaymentRequest {
    String productId;
    int quantity;
    String paymentMethod;
    double amount;
    String userId;

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public double getAmount() {
        return amount;
    }   

    public void setAmount(double amount) {
        this.amount = amount;
    }   

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

}
