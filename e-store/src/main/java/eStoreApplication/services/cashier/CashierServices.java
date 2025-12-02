package eStoreApplication.services.cashier;

import eStoreApplication.dtos.requests.*;
import eStoreApplication.dtos.responses.*;
import eStoreApplication.services.product.ProductServiceImpl;
import eStoreApplication.services.product.ProductServices;
import eStoreApplication.services.reciept.RecieptServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CashierServices implements CashierServicesInterface{
    @Autowired
    ProductServices productService;
    @Autowired
    RecieptServices recieptService;

    @Override
    public UpdateProductResponse updateProduct(UpdateProductRequest request) {
        return productService.updateProductPrice(request);
    }

    @Override
    public FindProductResponse findProducts(FindProductRequest request) {
        return productService.findProduct(request);
    }

    @Override
    public ConfirmPaymentResponse confirmPayment(ConfirmPaymentRequest request) {
        return recieptService.comfirmPayment(request);

    }

    @Override
    public FindAllRecieptsResponse findAllReciepts(FindAllRecieptRequest request) {
        return recieptService.findAllReciepts(request);
    }

    @Override
    public FindRecieptResponse findReciept(FindRecieptRequest request) {
        return recieptService.findReciept(request);
    }
}
