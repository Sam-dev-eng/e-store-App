package eStoreApplication.services.product.viewProductStrategy;

import eStoreApplication.data.models.Product;
import eStoreApplication.data.repository.ProductRepository;
import eStoreApplication.dtos.requests.ViewProductRequest;

import java.util.List;

public class TypeFilterStrategy implements ProductFilterStrategy {
    @Override
    public List<Product> filter(ProductRepository repository, ViewProductRequest request) {
        if(request.getProductType() != null){
            return repository.findAllByType(request.getProductType().toUpperCase());
        }
        return List.of();
    }
}
