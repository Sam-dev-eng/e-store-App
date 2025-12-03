package eStoreApplication.dtos.requests;

import lombok.Data;

@Data
public class UpdateProductRequest {
    String productNameDescription;
    String newPrice;
    String productId;
    
    public String getProductNameDescription() {
        return productNameDescription;
    }

    public String getNewPrice() {
        return newPrice;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductNameDescription(String productNameDescription) {
        this.productNameDescription = productNameDescription;
    }

    public void setNewPrice(String newPrice) {
        this.newPrice = newPrice;
    }   

    public void setProductId(String productId) {
        this.productId = productId;
    }   

}       
