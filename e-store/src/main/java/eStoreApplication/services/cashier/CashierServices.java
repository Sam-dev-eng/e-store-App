package eStoreApplication.services.cashier;

import eStoreApplication.dtos.requests.*;
import eStoreApplication.dtos.responses.*;

public interface CashierServices {
    UpdateProductResponse updateProduct(UpdateProductRequest request);
    FindProductResponse findProducts(FindProductRequest request);
    ConfirmPaymentResponse comfirmPayment(ConfirmPaymentRequest request);
    FindAllRecieptsResponse findAllReciepts(FindAllRecieptRequest request);
    FindRecieptResponse findReciept(FindRecieptRequest request);
}
