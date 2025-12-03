package eStoreApplication.dtos.responses;

public class ConfirmDeliveryResponse {
    private String message;

    public ConfirmDeliveryResponse(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
