package eStoreApplication.dtos.responses;
import eStoreApplication.data.models.Receipt;
import lombok.Data;

@Data
public class ConfirmPaymentResponse {
    private boolean success;
    private String message;
    private Receipt receipt;
}
