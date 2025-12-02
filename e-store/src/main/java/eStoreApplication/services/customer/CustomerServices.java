package eStoreApplication.services.customer;

import eStoreApplication.dtos.requests.*;
import eStoreApplication.dtos.responses.*;

public interface CustomerServices {
    ViewProductResponse viewProduct(ViewProductRequest request);
    AddToCartResponse addToCart(AddToCartRequest request);
    ViewAllProductResponse viewAllProducts(ViewAllProductRequest request);
    FindProductResponse findProduct(FindProductRequest request);
    PaymentResponse makePayment(PaymentRequest request);
    ConfirmPaymentResponse comfirmPayment(ConfirmPaymentRequest request);
    ViewCartResponse viewCart(ViewCartRequest request);
    RemoveFromCartResponse removeFromCart(RemoveFromCartRequest request);
    TrackProductResponse trackProductStatus(TrackProductRequest request);
    ConfirmDeliveryResponse confirmDelivery(ConFirmDeliveryRequest request);
    AddDescriptionResponse addDescription(AddDescriptionRequest request);
}
