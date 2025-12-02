package eStoreApplication.dtos.responses;

import lombok.Data;

@Data
public class UploadProductResponse {
    String productName;
    String type;
    String category;
    String brand;
    String price;
    String createdOn;
    String id;
}
