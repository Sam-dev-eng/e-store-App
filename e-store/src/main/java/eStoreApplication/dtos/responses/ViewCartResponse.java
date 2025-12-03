package eStoreApplication.dtos.responses;

public class ViewCartResponse {
    private String message;

    public ViewCartResponse(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
