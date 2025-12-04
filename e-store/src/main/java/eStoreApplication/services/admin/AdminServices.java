package eStoreApplication.services.admin;

import eStoreApplication.dtos.requests.RegisterCashierRequest;
import eStoreApplication.dtos.responses.RegisterCashierResponse;
import eStoreApplication.services.cashier.CashierServices;
import eStoreApplication.services.cashier.CashierServicesInterface;

public interface AdminServices extends CashierServicesInterface {
        RegisterCashierResponse registerCashier(RegisterCashierRequest request);
}
