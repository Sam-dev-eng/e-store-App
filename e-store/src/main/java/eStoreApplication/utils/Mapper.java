package eStoreApplication.utils;

import eStoreApplication.data.models.Categories;
import eStoreApplication.data.models.Product;
import eStoreApplication.data.models.User;
import eStoreApplication.dtos.requests.UploadProductRequest;
import eStoreApplication.dtos.responses.*;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
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
        product.setBrand(request.getBrand());
        product.setProductNameDescription(request.getProductName());
        product.setCategory(Categories.valueOf(request.getCategory().toUpperCase()));
        product.setType(request.getType());
        product.setPrice(request.getPrice());
        String date = DateTimeFormatter.ofPattern("EEEE, MMMM dd, yyyy").format(LocalDateTime.now());
        product.setCreatedOn(date);
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
        response.setOwner(product.getOwner().toString());
        response.setProductNameDescription(product.getProductNameDescription());
        response.setLastUpdated(product.getLastUpdated());
        response.setDescriptions(product.getDescriptions());
        response.setConfirmPayment(product.getConfirmPayment().toString());
        return response;
    }
    public static DeleteProductResponse deleteResponse(){
        DeleteProductResponse response = new DeleteProductResponse();
        response.setMessage("Deleted successfully");
        return response;
    }
}
