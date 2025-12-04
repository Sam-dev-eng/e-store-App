package eStoreApplication.dtos.requests;

import lombok.Data;

@Data
public class UploadProductRequest {
    String productName;
    String type;
    String category;
    String brand;
    String price;
    String ownerId;

}
