package eStoreApplication.controller;

import eStoreApplication.dtos.requests.*;
import eStoreApplication.dtos.responses.*;
import eStoreApplication.services.ReceiptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;   

@RestController
@RequestMapping("/receipts")
public class ReceiptController {
    @Autowired
    ReceiptService receiptService;

    @GetMapping("/findAll")
    public FindAllRecieptResponse findAllReceipts(@RequestBody FindAllRecieptRequest request){
        return receiptService.findAllReceipts(request);
    }

    @PostMapping("/comfirmPayment")
    public ConfirmPaymentResponse comfirmPayment(@RequestBody ConfirmPaymentRequest request){
        return receiptService.comfirmPayment(request);
    }

    @DeleteMapping("/deleteReciept")
    public DeleteRecieptResponse deleteReciept(@RequestBody DeleteRecieptRequest request){
        return receiptService.deleteReciept(request);
    }

    @GetMapping("/findReceipt")
    public FindRecieptResponse findReceipt(@RequestBody FindRecieptRequest request){
        return receiptService.findReceipt(request);
    }
}   
