package eStoreApplication.dtos.requests;

import lombok.Data;

@Data
public class ViewProductRequest {
    String productName;
    String productType;
    String productCategory;
    String productBrand;
    String priceRange;
    String sortBy;
    String userId;

}
