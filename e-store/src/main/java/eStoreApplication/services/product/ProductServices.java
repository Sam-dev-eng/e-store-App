package eStoreApplication.services.product;

import eStoreApplication.dtos.requests.*;
import eStoreApplication.dtos.responses.*;
import org.eStoreApplication.dtos.requests.*;
import org.eStoreApplication.dtos.responses.*;

public interface ProductServices {
    ViewProductResponse viewProduct(ViewProductRequest request);
    ViewAllProductResponse viewAllProducts(ViewAllProductRequest request);
    DeleteProductResponse deleteProduct(DeleteProductRequest request);
    FindProductResponse findProduct(FindProductRequest request);
    PaymentResponse makePayment(PaymentRequest request);
    UpdateProductResponse updateProduct(UpdateProductRequest request);
    UploadProductResponse uploadProduct(UploadProductRequest request);

}
