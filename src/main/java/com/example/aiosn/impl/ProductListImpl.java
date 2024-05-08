package com.example.aiosn.impl;

import com.example.aiosn.model.ProductListingModel;
import com.example.aiosn.repository.ProductListingRepository;
import com.example.aiosn.service.ProductListingService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class ProductListImpl implements ProductListingService {

    ProductListingRepository productListingRepository;

    public ProductListImpl(ProductListingRepository productListingRepository) {
        this.productListingRepository = productListingRepository;
    }

    @Override
    public ProductListingModel getProduct(String id)  {
        return productListingRepository.findById(id).get();
    }

    @Override
    public ProductListingModel createProduct(ProductListingModel productListingModel) {
        return productListingRepository.save(productListingModel);
    }

    @Override
    public ProductListingModel updateProduct(ProductListingModel productListingModel) {
        return productListingRepository.save(productListingModel);
    }

    @Override
    public String deleteProduct(String id) {
        productListingRepository.deleteById(id);
        return "Deleted";
    }

    @Override
    public List<ProductListingModel> getallProducts() {
        return productListingRepository.findAll();
    }
}
