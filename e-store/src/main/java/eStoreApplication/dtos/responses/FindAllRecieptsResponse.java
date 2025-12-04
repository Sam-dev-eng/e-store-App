package eStoreApplication.dtos.responses;

import lombok.Data;

@Data
public class FindAllRecieptsResponse {
    private boolean success;
    private String message;
    private List<Receipt> receipts;
}
