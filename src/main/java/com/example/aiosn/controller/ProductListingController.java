package com.example.aiosn.controller;

import com.example.aiosn.CommonActivity;
import com.example.aiosn.model.ProductListingModel;
import com.example.aiosn.service.ProductListingService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/aiosn/product/")
public class ProductListingController extends CommonActivity {

    ProductListingService productListingService;

    public ProductListingController(ProductListingService productListingService) {
        this.productListingService = productListingService;
    }

    @GetMapping("{id}")
    public ProductListingModel getDetails(@PathVariable("id") String id) {
        return productListingService.getProduct(id);
    }

    @PostMapping()
    public ProductListingModel createDetails(@RequestBody ProductListingModel productListingModel) {
        return productListingService.createProduct(productListingModel);
    }

    @PutMapping
    public ProductListingModel updateDetails(@RequestBody ProductListingModel productListingModel) {
        return productListingService.updateProduct(productListingModel);

    }

    @DeleteMapping("{id}")
    public String deleteDetails(@PathVariable("id") String id) {
        productListingService.deleteProduct(id);
        return "Deleted Successfully";
    }


    @GetMapping()
    public List<ProductListingModel> getAllDetails() {
        return productListingService.getallProducts();
    }

}