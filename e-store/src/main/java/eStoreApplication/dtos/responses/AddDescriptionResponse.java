package eStoreApplication.dtos.responses;

public class AddDescriptionResponse {
    private String message;

    public AddDescriptionResponse(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
