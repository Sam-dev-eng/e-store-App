package eStoreApplication.services.product.viewProductStrategy;

import eStoreApplication.data.models.Product;
import eStoreApplication.data.repository.ProductRepository;
import eStoreApplication.dtos.requests.ViewProductRequest;
import java.util.List;

public class NameFilterStrategy implements ProductFilterStrategy {
    @Override
    public List<Product> filter(ProductRepository repository, ViewProductRequest request) {
        if(request.getProductName() != null){
            return repository.findAllByProductNameDescription(request.getProductName().toUpperCase());
        }
        return List.of();
    }
}
