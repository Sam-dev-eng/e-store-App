package eStoreApplication.dtos.requests;
import lombok.Data;
@Data

public class ConfirmPaymentRequest {
    private String payerName;
    private String payerNumber;
    private String payerEmail;
    private String amountPaid;
    private String proofOfPayment;
}
