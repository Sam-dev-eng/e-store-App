package eStoreApplication.dtos.responses;

import eStoreApplication.data.models.Receipt;
import lombok.Data;

import java.util.List;

@Data
public class FindAllRecieptsResponse {
    private boolean success;
    private String message;
    private List<Receipt> receipts;
}
