package eStoreApplication.data.repository;

import eStoreApplication.data.models.Product;
import org.jspecify.annotations.NonNull;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ProductRepository extends MongoRepository<@NonNull Product,@NonNull String> {
    List<Product> findAllByProductNameDescription(String productName);
    List<Product> findAllByType(String type);
    List<Product> findAllByCategory(String category);
    List<Product> findAllByBrand(String brand);
}
