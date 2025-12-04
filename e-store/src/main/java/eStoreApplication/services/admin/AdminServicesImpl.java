package eStoreApplication.services.admin;
import eStoreApplication.data.models.User;
import eStoreApplication.data.repository.UserRepository;
import eStoreApplication.dtos.requests.*;
import eStoreApplication.dtos.responses.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static eStoreApplication.utils.Mapper.mapCashier;
import static eStoreApplication.utils.Mapper.registerResponse;


@Service
public class AdminServicesImpl implements AdminServices{
    @Autowired
    UserRepository userRepository;

    @Override
    public RegisterCashierResponse registerCashier(RegisterCashierRequest request) {
        User user = mapCashier(request);
        User saved = userRepository.save(user);
        return registerResponse(saved);
    }

    @Override
    public UpdateProductResponse updateProduct(UpdateProductRequest request) {
        return null;
    }

    @Override
    public FindProductResponse findProducts(FindProductRequest request) {
        return null;
    }

    @Override
    public ConfirmPaymentResponse confirmPayment(ConfirmPaymentRequest request) {
        return null;
    }

    @Override
    public FindAllRecieptsResponse findAllReceipts(FindAllRecieptRequest request) {
        return null;
    }

    @Override
    public FindRecieptResponse findReceipt(FindRecieptRequest request) {
        return null;
    }
}
