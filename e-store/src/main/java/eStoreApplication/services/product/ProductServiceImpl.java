package eStoreApplication.services.product;

import eStoreApplication.data.models.Product;
import eStoreApplication.data.models.User;
import eStoreApplication.data.repository.ProductRepository;
import eStoreApplication.data.repository.UserRepository;
import eStoreApplication.dtos.requests.*;
import eStoreApplication.dtos.responses.*;
import eStoreApplication.exceptions.ProductNotFoundException;
import eStoreApplication.exceptions.ProductOutOfStockException;
import eStoreApplication.exceptions.UserNotFoundException;
import eStoreApplication.services.product.viewProductStrategy.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import static eStoreApplication.utils.Mapper.*;

@Service
public class ProductServiceImpl implements ProductServices{
    @Autowired
    ProductRepository productRepository;
    @Autowired
    UserRepository userRepository;


    @Override
    public ViewProductResponse viewProduct(ViewProductRequest request) {
        List<ProductFilterStrategy> productStrategies = List.of(new NameFilterStrategy(), new CategoryFilterStrategy(),new TypeFilterStrategy(),new BrandFilterStrategy());
        ProductFilterContext productFilter = new ProductFilterContext(productStrategies);
        List<Product> products = productFilter.applyFilter(productRepository,request);
        return mapViewResponse(products);
    }

    @Override
    public ViewAllProductResponse viewAllProducts(ViewAllProductRequest request) {
        Optional<User> user = userRepository.findById(request.getUserId());
        if(user.isEmpty()) throw new UserNotFoundException("user is not found");
        if(user.get().getRole().equals("CUSTOMER")) return null;
        return mapViewAllResponse(productRepository.findAll());
    }

    @Override
    public DeleteProductResponse deleteProductById(DeleteProductRequest request) {
        Optional<Product> product = productRepository.findById(request.getId());
        if(product.isEmpty()) throw new ProductNotFoundException("product not found");
        productRepository.delete(product.get());
        return deleteResponse();
    }

    @Override
    public FindProductResponse findProduct(FindProductRequest request) {
        Optional<Product> product = productRepository.findById(request.getId());
        if(product.isEmpty()) throw new ProductNotFoundException("Wrong id Product not found");
        return foundProductResponse(product.get());
    }

    @Override
    public PaymentResponse productPrice(PaymentRequest request) {
        Optional<Product> product = productRepository.findById(request.getProductId());
        if(product.isEmpty()) throw new ProductOutOfStockException("This product is out of stock");
        return buyProductResponse(product.get());
    }

    @Override
    public UpdateProductResponse updateProductPrice(UpdateProductRequest request) {
        List<Product> products = productRepository.findAllByProductNameDescription(request.getProductNameDescription().toUpperCase());
        List<Product> updated = changePrices(products, request.getNewPrice());
        List<Product> saved = productRepository.saveAll(updated);
        return updatedResponse(saved);
    }

    private List<Product> changePrices(List<Product> products,String price){
        for(Product product : products){
            product.setPrice(price);
        }
        return products;
    }

    @Override
    public UploadProductResponse uploadProduct(UploadProductRequest request) {
        Product product = createProduct(request);
        Product saved = productRepository.save(product);
        return uploadResponse(saved);
    }
}
