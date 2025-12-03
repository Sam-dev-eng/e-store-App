package eStoreApplication.dtos.responses;

public class AddToCartResponse {
    private String message;

    public AddToCartResponse(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
