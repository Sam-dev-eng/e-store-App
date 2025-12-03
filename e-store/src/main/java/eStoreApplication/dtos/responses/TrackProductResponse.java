package eStoreApplication.dtos.responses;

public class TrackProductResponse {
    private String message;

    public TrackProductResponse(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
