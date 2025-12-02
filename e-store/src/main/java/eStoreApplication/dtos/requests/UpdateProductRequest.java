package eStoreApplication.dtos.requests;

import lombok.Data;

@Data
public class UpdateProductRequest {
    String productNameDescription;
    String newPrice;
}
