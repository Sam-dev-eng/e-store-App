package eStoreApplication.dtos.responses;

import lombok.Data;

import java.util.List;
@Data
public class ViewAllProductResponse {
    List<String> products;
    String message;

}
