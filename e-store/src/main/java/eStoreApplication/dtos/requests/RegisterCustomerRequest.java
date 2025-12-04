package eStoreApplication.dtos.requests;

import lombok.Data;

@Data
public class RegisterCustomerRequest {
    String name;
    String email;
    String phoneNumber;
    String password;
}
