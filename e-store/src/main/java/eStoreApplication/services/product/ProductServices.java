package eStoreApplication.services.product;

import eStoreApplication.dtos.requests.*;
import eStoreApplication.dtos.responses.*;

public interface ProductServices {
    ViewProductResponse viewProduct(ViewProductRequest request);
    ViewAllProductResponse viewAllProducts(ViewAllProductRequest request);
    DeleteProductResponse deleteProductById(DeleteProductRequest request);
    FindProductResponse findProduct(FindProductRequest request);
    PaymentResponse productPrice(PaymentRequest request);
    UpdateProductResponse updateProductPrice(UpdateProductRequest request);
    UploadProductResponse uploadProduct(UploadProductRequest request);

}
