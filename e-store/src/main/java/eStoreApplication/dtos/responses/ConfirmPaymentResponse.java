package eStoreApplication.dtos.responses;
import lombok.Data;

@Data
public class ConfirmPaymentResponse {
    private boolean success;
    private String message;
    private Receipt receipt;
}
