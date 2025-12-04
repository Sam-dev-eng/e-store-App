package eStoreApplication.dtos.responses;

import lombok.Data;

import java.util.Map;
@Data
public class ViewCartResponse {
    Map<String,Integer> cart;
}
