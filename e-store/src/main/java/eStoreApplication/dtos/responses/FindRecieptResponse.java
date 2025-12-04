package eStoreApplication.dtos.responses;

import lombok.Data;

@Data
public class FindRecieptResponse {
    private boolean success;
    private String message;
    private Receipt receipt;
}
