package com.example.aiosn.repository;


import com.example.aiosn.model.ProductListingModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductListingRepository extends JpaRepository<ProductListingModel, String> {}
