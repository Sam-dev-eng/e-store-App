package org.eStoreApplication.services.reciept;

import org.eStoreApplication.dtos.requests.*;
import org.eStoreApplication.dtos.responses.*;

public interface RecieptServices {
    ConfirmPaymentResponse comfirmPayment(ConfirmPaymentRequest request);
    FindAllRecieptsResponse findAllReciepts(FindAllRecieptRequest request);
    DeleteRecieptResponse deleteReciept(DeleteRecieptRequest request);
    FindRecieptResponse findReciept(FindRecieptRequest request);

}
