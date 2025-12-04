package eStoreApplication.dtos.requests;

import lombok.Data;

@Data
public class RemoveFromCartRequest {
    String userId;
    String productId;
}
