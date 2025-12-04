package eStoreApplication.controller;

import eStoreApplication.dtos.requests.*;
import eStoreApplication.dtos.responses.*;
import eStoreApplication.services.reciept.RecieptServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;   

@RestController
@RequestMapping("/receipts")
public class ReceiptController {
    @Autowired
    RecieptServices receiptService;

    @GetMapping("/findAll")
    public FindAllRecieptsResponse findAllReceipts(@RequestBody FindAllRecieptRequest request){
        return receiptService.findAllReceipts(request);
    }

    @PostMapping("/comfirmPayment")
    public ConfirmPaymentResponse comfirmPayment(@RequestBody ConfirmPaymentRequest request){
        return receiptService.confirmPayment(request);
    }

    @DeleteMapping("/deleteReciept")
    public DeleteRecieptResponse deleteReciept(@RequestBody DeleteRecieptRequest request){
        return receiptService.deleteReceipt(request);
    }

    @GetMapping("/findReceipt")
    public FindRecieptResponse findReceipt(@RequestBody FindRecieptRequest request){
        return receiptService.findReceipt(request);
    }
}   
