package eStoreApplication.dtos.requests;

import lombok.Data;

@Data
public class RegisterCashierRequest {
    String name;
    String email;
    String phoneNumber;
    String password;

}
