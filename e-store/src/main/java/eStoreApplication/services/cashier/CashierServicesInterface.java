package eStoreApplication.services.cashier;

import eStoreApplication.dtos.requests.*;
import eStoreApplication.dtos.responses.*;

public interface CashierServicesInterface {
    UpdateProductResponse updateProduct(UpdateProductRequest request);
    FindProductResponse findProducts(FindProductRequest request);
    ConfirmPaymentResponse confirmPayment(ConfirmPaymentRequest request);
    FindAllRecieptsResponse findAllReceipts(FindAllRecieptRequest request);
    FindRecieptResponse findReceipt(FindRecieptRequest request);
}
