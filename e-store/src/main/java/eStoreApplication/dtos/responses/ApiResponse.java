package eStoreApplication.dtos.responses;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ApiResponse{
    private boolean message;
    private Object data;
}
