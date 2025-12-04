package eStoreApplication.services.auth;

import eStoreApplication.dtos.requests.RegisterCustomerRequest;

public interface AuthServices {
    String login(String email,String password);
    String register(RegisterCustomerRequest request);
}
