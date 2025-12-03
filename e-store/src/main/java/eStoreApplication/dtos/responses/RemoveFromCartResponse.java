package eStoreApplication.dtos.responses;

public class RemoveFromCartResponse {
    private String message;

    public RemoveFromCartResponse(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }   

}
