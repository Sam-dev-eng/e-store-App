package eStoreApplication.services.customer;

import eStoreApplication.data.models.Product;
import eStoreApplication.data.models.User;
import eStoreApplication.data.repository.ProductRepository;
import eStoreApplication.data.repository.UserRepository;
import eStoreApplication.dtos.requests.*;
import eStoreApplication.dtos.responses.*;
import eStoreApplication.exceptions.ProductNotFoundException;
import eStoreApplication.exceptions.UserNotFoundException;
import eStoreApplication.services.cashier.CashierServices;
import eStoreApplication.services.product.ProductServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

import static eStoreApplication.utils.Mapper.*;

@Service
public class customerServicesClass implements CustomerServices{
    @Autowired
    ProductServices productServices;
    @Autowired
    UserRepository userRepository;
    @Autowired
    ProductRepository  productRepository;
    @Autowired
    CashierServices cashierServices;


    @Override
    public ViewProductResponse viewProduct(ViewProductRequest request) {
        return productServices.viewProduct(request);
    }

    @Override
    public AddToCartResponse addToCart(AddToCartRequest request) {
        Optional<User> found = userRepository.findById(request.getUserId());
        if(found.isEmpty()) throw new UserNotFoundException("User not found");
        User user =  found.get();
        Optional<Product> productFound = productRepository.findById(request.getProductId());
        if(productFound.isEmpty()) throw new ProductNotFoundException("Product not found");
        Product product = productFound.get();
        int productPrice = Integer.parseInt(product.getPrice());
        int initialPrice = user.getCart().get(product);
        if(user.getCart().containsKey(product)) user.getCart().put(product,initialPrice+productPrice);
        user.getCart().put(product,productPrice);
        int total= 0;
        for(var products: user.getCart().entrySet())total += products.getValue();
        return addToCartResponse(total);
    }

    @Override
    public ViewAllProductResponse viewAllProducts(ViewAllProductRequest request) {
        return productServices.viewAllProducts(request);
    }

    @Override
    public FindProductResponse findProduct(FindProductRequest request) {
        return productServices.findProduct(request);
    }

    @Override
    public MakePaymentInCartResponse makePayment(String id) {
        Optional<User> user = userRepository.findById(id);
        if(user.isEmpty()) throw new UserNotFoundException("User not found");
        int totalPrice = 0;
        for(var products: user.get().getCart().entrySet()) totalPrice += products.getValue();
        MakePaymentInCartResponse response = new MakePaymentInCartResponse();
        response.setTotalPrice(totalPrice);
        return response;
    }

    @Override
    public ConfirmPaymentResponse comfirmPayment(ConfirmPaymentRequest request) {
        return cashierServices.confirmPayment(request);
    }

    @Override
    public ViewCartResponse viewCart(String id) {
        Optional<User> user = userRepository.findById(id);
        if(user.isEmpty()) throw new UserNotFoundException("User not found");
        ViewCartResponse response = new ViewCartResponse();
        HashMap<String,Integer> map = new HashMap<>();
        for(var products: user.get().getCart().entrySet())map.put(products.getValue().toString(),products.getValue());
        response.setCart(map);
        return response;
    }

    @Override
    public RemoveFromCartResponse removeFromCart(RemoveFromCartRequest request) {
        Optional<User> user = userRepository.findById(request.getUserId());
        Optional<Product> productFound = productRepository.findById(request.getProductId());
        if(productFound.isEmpty()) throw new ProductNotFoundException("Product not found");
        if(user.isEmpty()) throw new UserNotFoundException("User not found");
        User updated = mapCart(user.get(),productFound.get());
        return removalResponse(updated);
    }

    @Override
    public TrackProductResponse trackProductStatus(TrackProductRequest request) {
        return null;
    }

    @Override
    public ConfirmDeliveryResponse confirmDelivery(ConFirmDeliveryRequest request) {
        Optional<User> user = userRepository.findById(request.getUserId());
        if(user.isEmpty()) throw new UserNotFoundException("User not found");
        user.get().getDeliveryDescription().add(request.getDescription());
        ConfirmDeliveryResponse response = new ConfirmDeliveryResponse();
        response.setMessage(user.get().getName().toUpperCase() +" THANKS FOR YOUR PATRONAGE");
        return response;
    }

    @Override
    public AddDescriptionResponse addProductDescription(AddDescriptionRequest request) {
        Optional<Product> productFound = productRepository.findById(request.getProductId());
        Optional<User> user = userRepository.findById(request.getUserId());
        if(user.isEmpty()) throw new UserNotFoundException("User not found");
        if(productFound.isEmpty()) throw new ProductNotFoundException("Product not found");
        Product product = productFound.get();
        if(product.getDescriptions().containsKey(user.get())) {
            product.getDescriptions().get(user.get()).add(request.getDescription());
        }
        product.getDescriptions().put(user.get(), List.of(request.getDescription()));
        AddDescriptionResponse response = new AddDescriptionResponse();
        response.setMessage(user.get().getName().toUpperCase()+" THANKS FOR YOUR REVIEWS");
        return response;
    }
}
