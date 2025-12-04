package eStoreApplication.controller;

import eStoreApplication.dtos.requests.*;
import eStoreApplication.dtos.responses.*;
import eStoreApplication.services.cashier.CashierServicesInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("cashier")
public class CashierController {
    @Autowired
     CashierServicesInterface cashierServices;



    @PutMapping("/product/update")
    public ResponseEntity<?> updateProduct(@RequestBody UpdateProductRequest request) {
        try{
            UpdateProductResponse updateProductResponse = cashierServices.updateProduct(request);
            return new ResponseEntity<>(new ApiResponse(true, updateProductResponse), HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(new ApiResponse(false,e.getMessage()),HttpStatus.BAD_REQUEST);
        }

    }

    @PostMapping("/product/find")
    public ResponseEntity<?> findProduct(@RequestBody FindProductRequest request) {
        try{
            FindProductResponse findProductResponse = cashierServices.findProducts(request);
            return new ResponseEntity<>(new ApiResponse(true, findProductResponse), HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(new ApiResponse(false,e.getMessage()),HttpStatus.BAD_REQUEST);
        }

    }

    @PostMapping("/payment/confirm")
    public ResponseEntity<?> confirmPayment(@RequestBody ConfirmPaymentRequest request) {
        try{
            ConfirmPaymentResponse confirmPaymentResponse = cashierServices.confirmPayment(request);
            return new ResponseEntity<>(new ApiResponse(true, confirmPaymentResponse), HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(new ApiResponse(false,e.getMessage()),HttpStatus.BAD_REQUEST);
        }

    }

    @PostMapping("/receipt/all")
    public ResponseEntity<?> findAllReceipts(@RequestBody FindAllRecieptRequest request) {
        try{
            FindAllRecieptsResponse findAllRecieptsResponse = cashierServices.findAllReceipts(request);
            return new ResponseEntity<>(new ApiResponse(true, findAllRecieptsResponse), HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(new ApiResponse(false,e.getMessage()),HttpStatus.BAD_REQUEST);
        }
    }

    @PostMapping("/receipt/find")
    public ResponseEntity<?> findReceipt(@RequestBody FindRecieptRequest request) {
        try{
            FindRecieptResponse findRecieptResponse = cashierServices.findReceipt(request);
            return new ResponseEntity<>(new ApiResponse(true, findRecieptResponse), HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(new ApiResponse(false,e.getMessage()),HttpStatus.BAD_REQUEST);
        }
    }



}
