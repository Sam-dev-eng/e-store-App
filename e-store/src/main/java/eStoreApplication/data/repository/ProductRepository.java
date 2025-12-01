package eStoreApplication.data.repository;

import eStoreApplication.data.models.Product;
import org.jspecify.annotations.NonNull;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;

public interface ProductRepository extends MongoRepository<@NonNull Product,@NonNull String> {
    List<Product> findAllByProductName(String productName);
    List<Product> findAllByType(String type);
    List<Product> findAllByCategory(String category);
    List<Product> findAllByBrand(String brand);
}
