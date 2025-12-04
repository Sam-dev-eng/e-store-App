package eStoreApplication.dtos.responses;

import eStoreApplication.data.models.Receipt;
import lombok.Data;

@Data
public class FindRecieptResponse {
    private boolean success;
    private String message;
    private Receipt receipt;
}
