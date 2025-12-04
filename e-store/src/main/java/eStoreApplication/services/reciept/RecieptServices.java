package eStoreApplication.services.reciept;

import eStoreApplication.dtos.requests.ConfirmPaymentRequest;
import eStoreApplication.dtos.requests.DeleteRecieptRequest;
import eStoreApplication.dtos.requests.FindAllRecieptRequest;
import eStoreApplication.dtos.requests.FindRecieptRequest;
import eStoreApplication.dtos.responses.ConfirmPaymentResponse;
import eStoreApplication.dtos.responses.DeleteRecieptResponse;
import eStoreApplication.dtos.responses.FindAllRecieptsResponse;
import eStoreApplication.dtos.responses.FindRecieptResponse;

public interface RecieptServices {
    ConfirmPaymentResponse confirmPayment(ConfirmPaymentRequest request);
    FindAllRecieptsResponse findAllReceipts(FindAllRecieptRequest request);
    DeleteRecieptResponse deleteReceipt(DeleteRecieptRequest request);
    FindRecieptResponse findReceipt(FindRecieptRequest request);

}
