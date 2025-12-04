package eStoreApplication.dtos.requests;

import lombok.Data;

@Data
public class PaymentRequest {
    String productId;
    int quantity;
    String paymentMethod;
    double amount;
    String userId;

}
