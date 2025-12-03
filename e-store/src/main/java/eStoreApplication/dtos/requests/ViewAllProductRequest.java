package eStoreApplication.dtos.requests;

import lombok.Data;

@Data
public class ViewAllProductRequest {
    String userId;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

}
