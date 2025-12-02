package eStoreApplication.services.product.viewProductStrategy;

import eStoreApplication.data.models.Product;
import eStoreApplication.data.repository.ProductRepository;
import eStoreApplication.dtos.requests.ViewProductRequest;

import java.util.List;

public class CategoryFilterStrategy implements ProductFilterStrategy {
    @Override
    public List<Product> filter(ProductRepository repository, ViewProductRequest request) {
        if(request.getProductCategory() != null){
            return repository.findAllByCategory(request.getProductCategory());
        }
        return List.of();
    }
}
