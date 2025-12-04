package eStoreApplication.controller;

import eStoreApplication.dtos.requests.*;
import eStoreApplication.dtos.responses.*;
import eStoreApplication.services.customer.CustomerServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customers")
public class CustomerController {
    @Autowired
    CustomerServices services;

    @GetMapping("/viewProducts")
    public ViewProductResponse viewProduct(@RequestBody ViewProductRequest request) {
        return services.viewProduct(request);
    }
    @PatchMapping("/addsToCart")
    public AddToCartResponse addToCart(@RequestBody AddToCartRequest request) {
        return services.addToCart(request);
    }
    @PatchMapping("/viewsAllProduct")
    public ViewAllProductResponse viewAllProducts(@RequestBody ViewAllProductRequest request) {
        return services.viewAllProducts(request);
    }
    @GetMapping("/findsProduct")
    public FindProductResponse findProduct(@RequestBody FindProductRequest request) {
        return services.findProduct(request);
    }
    @GetMapping("/payments/{id}")
    public MakePaymentInCartResponse makeInCartPayment(@PathVariable("id") String id) {
        return services.makePayment(id);
    }
    @GetMapping("/confirms")
    public ConfirmPaymentResponse confirmPayment(@RequestBody ConfirmPaymentRequest request) {
        return services.comfirmPayment(request);
    }
    @GetMapping("/viewsCart/{id}")
    public ViewCartResponse viewCarts(@PathVariable("id") String id) {
       return services.viewCart(id);
    }
    @PatchMapping("/removeFromCart")
    public RemoveFromCartResponse  removeFromCart(@RequestBody RemoveFromCartRequest request) {
        return services.removeFromCart(request);
    }
    @GetMapping("/tracks")
    public TrackProductResponse trackProduct(@RequestBody TrackProductRequest request) {
        return services.trackProductStatus(request);
    }
    @GetMapping("/confirmsDelivery")
    public ConfirmDeliveryResponse confirmDelivery(@RequestBody ConFirmDeliveryRequest request) {
        return services.confirmDelivery(request);
    }
    @PatchMapping("/addsDescription")
    public AddDescriptionResponse addDescription(@RequestBody AddDescriptionRequest request) {
        return services.addProductDescription(request);
    }
}
