package eStoreApplication.controller;

import eStoreApplication.dtos.requests.*;
import eStoreApplication.dtos.responses.*;
import eStoreApplication.services.product.ProductServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
public class ProductController {
    @Autowired
    ProductServices productServices;

    @GetMapping("viewProducts")
    public ViewProductResponse viewPrducts(@RequestBody ViewProductRequest request){
       return productServices.viewProduct(request);
    }
    @PutMapping("/uploads")
    public UploadProductResponse uploadProduct(@RequestBody UploadProductRequest request){
        return productServices.uploadProduct(request);
    }
    @PatchMapping("/updates")
    public UpdateProductResponse updatePrice(@RequestBody UpdateProductRequest request){
        return productServices.updateProductPrice(request);
    }
    @GetMapping("/price")
    public PaymentResponse productPrice(@RequestBody PaymentRequest request){
        return productServices.productPrice(request);
    }
    @GetMapping("/finds")
    public FindProductResponse findProduct(@RequestBody FindProductRequest request){
        return productServices.findProduct(request);
    }
    @DeleteMapping("/deleteId")
    public DeleteProductResponse deleteProductById(@RequestBody DeleteProductRequest request){
        return productServices.deleteProductById(request);
    }
    @GetMapping("/viewAll")
    public ViewAllProductResponse viewAllproductsByName(@RequestBody ViewAllProductRequest request){
        return productServices.viewAllProductsByName(request);
    }
}