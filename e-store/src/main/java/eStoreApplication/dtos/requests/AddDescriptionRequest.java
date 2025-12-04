package eStoreApplication.dtos.requests;

import lombok.Data;

@Data
public class AddDescriptionRequest {
    String productId;
    String description;
    String userId;
}
