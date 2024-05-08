package com.example.aiosn.service;

import com.example.aiosn.model.ProductListingModel;
import java.util.List;

public interface ProductListingService {

    public ProductListingModel getProduct(String id);
    public ProductListingModel createProduct(ProductListingModel productListingModel);
    public ProductListingModel updateProduct(ProductListingModel productListingModel);
    public String deleteProduct(String id);
    public List<ProductListingModel> getallProducts();

}
