package eStoreApplication.services.reciept;

import eStoreApplication.dtos.requests.ConfirmPaymentRequest;
import eStoreApplication.dtos.requests.DeleteRecieptRequest;
import eStoreApplication.dtos.requests.FindAllRecieptRequest;
import eStoreApplication.dtos.requests.FindRecieptRequest;
import eStoreApplication.dtos.responses.ConfirmPaymentResponse;
import eStoreApplication.dtos.responses.DeleteRecieptResponse;
import eStoreApplication.dtos.responses.FindAllRecieptsResponse;
import eStoreApplication.dtos.responses.FindRecieptResponse;
import org.eStoreApplication.dtos.requests.*;
import org.eStoreApplication.dtos.responses.*;

public interface RecieptServices {
    ConfirmPaymentResponse comfirmPayment(ConfirmPaymentRequest request);
    FindAllRecieptsResponse findAllReciepts(FindAllRecieptRequest request);
    DeleteRecieptResponse deleteReciept(DeleteRecieptRequest request);
    FindRecieptResponse findReciept(FindRecieptRequest request);

}
