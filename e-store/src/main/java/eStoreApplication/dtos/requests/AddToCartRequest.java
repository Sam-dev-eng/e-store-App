package eStoreApplication.dtos.requests;

import lombok.Data;

@Data
public class AddToCartRequest {
    String userId;
    String productId;


}
