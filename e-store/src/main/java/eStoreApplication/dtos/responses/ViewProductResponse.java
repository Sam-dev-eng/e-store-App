package eStoreApplication.dtos.responses;

import eStoreApplication.data.models.Product;
import lombok.Data;

import java.util.List;
@Data
public class ViewProductResponse {

    List<String> products;
    String message;

}
