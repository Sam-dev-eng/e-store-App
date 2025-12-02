package eStoreApplication.services.product.viewProductStrategy;

import eStoreApplication.data.models.Product;
import eStoreApplication.data.repository.ProductRepository;
import eStoreApplication.dtos.requests.ViewProductRequest;

import java.util.List;

public interface ProductFilterStrategy {
    List<Product> filter(ProductRepository repository, ViewProductRequest request);
}
