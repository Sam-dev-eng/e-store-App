package eStoreApplication.services.reciept;

import eStoreApplication.dtos.requests.ConfirmPaymentRequest;
import eStoreApplication.dtos.requests.DeleteRecieptRequest;
import eStoreApplication.dtos.requests.FindAllRecieptRequest;
import eStoreApplication.dtos.requests.FindRecieptRequest;
import eStoreApplication.dtos.responses.ConfirmPaymentResponse;
import eStoreApplication.dtos.responses.DeleteRecieptResponse;
import eStoreApplication.dtos.responses.FindAllRecieptsResponse;
import eStoreApplication.dtos.responses.FindRecieptResponse;

public class RecieptServicesProxy implements RecieptServices {
    private RecieptServicesImpl realService;

    public RecieptServicesProxy() {
        this.realService = new RecieptServicesImpl();
    }

    @Override
    public ConfirmPaymentResponse confirmPayment(ConfirmPaymentRequest request) {
        System.out.println("[PROXY] Confirming payment");
        
        if (request == null) {
            System.out.println("[PROXY] ERROR: Request is null");
            ConfirmPaymentResponse response = new ConfirmPaymentResponse();
            response.setSuccess(false);
            response.setMessage("Request is null");
            return response;
        }

        ConfirmPaymentResponse response = realService.confirmPayment(request);
        
        if (response.isSuccess()) {
            System.out.println("[PROXY] SUCCESS: Payment confirmed - Receipt ID: " + response.getReceipt().getId());
        } else {
            System.out.println("[PROXY] FAILED: " + response.getMessage());
        }
        
        return response;
    }

    @Override
    public FindAllRecieptsResponse findAllReceipts(FindAllRecieptRequest request) {
        System.out.println("[PROXY] Finding all receipts");
        
        FindAllRecieptsResponse response = realService.findAllReceipts(request);
    
        
        return response;
    }

    @Override
    public DeleteRecieptResponse deleteReceipt(DeleteRecieptRequest request) {
        System.out.println("[PROXY] Deleting receipt");
        
        if (request == null) {
            System.out.println("[PROXY] ERROR: Request is null");
            DeleteRecieptResponse response = new DeleteRecieptResponse();
            response.setSuccess(false);
            response.setMessage("Request is null");
            return response;
        }

        if (request.getReceiptId() == null || request.getReceiptId().isEmpty()) {
            System.out.println("[PROXY] ERROR: Receipt ID is empty");
            DeleteRecieptResponse response = new DeleteRecieptResponse();
            response.setSuccess(false);
            response.setMessage("Receipt ID is required");
            return response;
        }

        System.out.println("[PROXY] Receipt ID: " + request.getReceiptId());
        
        DeleteRecieptResponse response = realService.deleteReceipt(request);
        
        if (response.isSuccess()) {
            System.out.println("[PROXY] SUCCESS: Receipt deleted");
        } else {
            System.out.println("[PROXY] FAILED: " + response.getMessage());
        }
        
        return response;
    }

    @Override
    public FindRecieptResponse findReceipt(FindRecieptRequest request) {
        System.out.println("[PROXY] Finding receipt");
        
        if (request == null) {
            System.out.println("[PROXY] ERROR: Request is null");
            FindRecieptResponse response = new FindRecieptResponse();
            response.setSuccess(false);
            response.setMessage("Request is null");
            return response;
        }

        if (request.getReceiptId() == null || request.getReceiptId().isEmpty()) {
            System.out.println("[PROXY] ERROR: Receipt ID is empty");
            FindRecieptResponse response = new FindRecieptResponse();
            response.setSuccess(false);
            response.setMessage("Receipt ID is required");
            return response;
        }

        System.out.println("[PROXY] Receipt ID: " + request.getReceiptId());
        
        FindRecieptResponse response = realService.findReceipt(request);
        
        if (response.isSuccess()) {
            System.out.println("[PROXY] SUCCESS: Receipt found");
        } else {
            System.out.println("[PROXY] NOT FOUND: " + response.getMessage());
        }
        
        return response;
    }
}
