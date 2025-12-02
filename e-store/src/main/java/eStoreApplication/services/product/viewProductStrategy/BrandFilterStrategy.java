package eStoreApplication.services.product.viewProductStrategy;

import eStoreApplication.data.models.Product;
import eStoreApplication.data.repository.ProductRepository;
import eStoreApplication.dtos.requests.ViewProductRequest;

import java.util.List;

public class BrandFilterStrategy implements ProductFilterStrategy {
    @Override
    public List<Product> filter(ProductRepository repository, ViewProductRequest request) {
        if(request.getProductBrand() != null){
            return repository.findAllByBrand(request.getProductBrand().toUpperCase());
        }

        return List.of();
    }
}
