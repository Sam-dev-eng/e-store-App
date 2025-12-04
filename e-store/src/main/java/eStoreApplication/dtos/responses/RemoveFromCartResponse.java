package eStoreApplication.dtos.responses;

import lombok.Data;

import java.util.Map;
@Data
public class RemoveFromCartResponse {
    Map<String,Integer> cart;
}
