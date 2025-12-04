package eStoreApplication.utils;

import eStoreApplication.data.models.Categories;
import eStoreApplication.data.models.Product;
import eStoreApplication.data.models.User;
import eStoreApplication.dtos.requests.RegisterCashierRequest;
import eStoreApplication.dtos.requests.UploadProductRequest;
import eStoreApplication.dtos.responses.*;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Mapper {

    public static ViewProductResponse mapViewResponse(List<Product> productList){
        ViewProductResponse response = new ViewProductResponse();
        List<String> productResponse = new ArrayList<>();
        for (Product product : productList){
            productResponse.add(product.toString());
        }
        response.setProducts(productResponse);
        return response;
    }

    public static ViewAllProductResponse mapViewAllResponse(List<Product> productList){
        ViewAllProductResponse response = new ViewAllProductResponse();
        List<String> productResponse = new ArrayList<>();
        for (Product product : productList)productResponse.add(product.toString());
        response.setProducts(productResponse);
        return response;
    }

    public static Product createProduct(UploadProductRequest request){
        Product product = new Product();
        product.setBrand(request.getBrand().toUpperCase());
        product.setProductNameDescription(request.getProductName().toUpperCase());
        product.setCategory(Categories.valueOf(request.getCategory().toUpperCase()));
        product.setType(request.getType().toUpperCase());
        product.setPrice(request.getPrice());
        String date = DateTimeFormatter.ofPattern("EEEE, MMMM dd, yyyy").format(LocalDateTime.now());
        product.setCreatedOn(date);
        product.setOwner("null");
        return product;
    }

    public static UploadProductResponse uploadResponse(Product saved){
        UploadProductResponse response = new UploadProductResponse();
        response.setBrand(saved.getBrand());
        response.setPrice(saved.getPrice());
        response.setCategory(saved.getCategory().toString());
        response.setType(saved.getType());
        response.setProductName(saved.getProductNameDescription());
        response.setCreatedOn(saved.getCreatedOn());
        response.setId(saved.getId());
        return response;
    }

    public static UpdateProductResponse updatedResponse(List<Product> products){
        UpdateProductResponse response = new UpdateProductResponse();
        List<String> productResponse = new ArrayList<>();
        for(Product product : products) productResponse.add(product.toString());
        response.setProduct(productResponse);
        return response;
    }

    public static PaymentResponse buyProductResponse(Product product){
        PaymentResponse response = new PaymentResponse();
        response.setProductPrice(product.getPrice());
        return response;
    }
    public static FindProductResponse foundProductResponse(Product product){
        FindProductResponse response = new FindProductResponse();
        response.setBrand(product.getBrand());
        response.setCategory(product.getCategory().toString());
        response.setType(product.getType());
        response.setPrice(product.getPrice());
        response.setCreatedOn(product.getCreatedOn());
        response.setDelivered(product.isDelivered());
        response.setOwner(product.getOwner());
        response.setProductNameDescription(product.getProductNameDescription());
        response.setLastUpdated(product.getLastUpdated());
        response.setDescriptions(product.getDescriptions());
        response.setConfirmPayment(product.getConfirmPayment());
        return response;
    }
    public static DeleteProductResponse deleteResponse(){
        DeleteProductResponse response = new DeleteProductResponse();
        response.setMessage("Deleted successfully");
        return response;
    }

    public static AddToCartResponse  addToCartResponse(int total){
        AddToCartResponse response = new AddToCartResponse();
        response.setTotalPrice(total);
        return response;
    }
    public static User mapCart(User user, Product product){
        user.getCart().remove(product);
        return user;
    }

    public static RemoveFromCartResponse removalResponse(User user){
        RemoveFromCartResponse response = new RemoveFromCartResponse();
        HashMap<String,Integer> map = new HashMap<>();
        for(var products: user.getCart().entrySet())map.put(products.getValue().toString(),products.getValue());
        response.setCart(map);
        return response;
    }

    public static User mapCashier(RegisterCashierRequest request){
        User user = new User();
        user.setName(request.getName());
        user.setRole("CASHIER");
        user.setPhoneNumber(request.getPhoneNumber());
        user.setEmail(request.getEmail());
        user.setPassword(request.getPassword());
        return user;
    }

    public static RegisterCashierResponse registerResponse(User saved){
        RegisterCashierResponse response = new RegisterCashierResponse();
        response.setEmail(saved.getEmail());
        response.setPassword(saved.getPassword());
        return response;
    }


}
