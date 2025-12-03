package eStoreApplication.dtos.requests;

import lombok.Data;

@Data
public class DeleteProductRequest {
    String id;

    public String getId() {
        return id;
    }
    
    public void setId(String id) {
        this.id = id;
    }
}
