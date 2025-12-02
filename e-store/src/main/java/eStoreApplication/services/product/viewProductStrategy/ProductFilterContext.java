package eStoreApplication.services.product.viewProductStrategy;

import eStoreApplication.data.models.Product;
import eStoreApplication.data.repository.ProductRepository;
import eStoreApplication.dtos.requests.ViewProductRequest;
import lombok.AllArgsConstructor;

import java.util.ArrayList;
import java.util.List;
@AllArgsConstructor
public class ProductFilterContext {
    List<ProductFilterStrategy> strategies;

    public List<Product> applyFilter(ProductRepository repository, ViewProductRequest request){
        List<Product> result = new ArrayList<>();
        for (ProductFilterStrategy strategy : strategies){
            result.addAll(strategy.filter(repository,request));
        }
        return result;
    }
}
