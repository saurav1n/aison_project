package com.example.aiosn.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "products")
public class ProductListingModel {

    @Id
    private String id;
    private String title;
    private String image;
    private String short_description;
    private String full_description;
    private String price;
    private String price_per_kg;
    private String category;


    public ProductListingModel(String id, String title, String image, String short_description, String full_description, String price, String price_per_kg, String category) {
        this.id = id;
        this.title = title;
        this.image = image;
        this.short_description = short_description;
        this.full_description = full_description;
        this.price = price;
        this.price_per_kg = price_per_kg;
        this.category = category;
    }

    public ProductListingModel() {

    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getShort_description() {
        return short_description;
    }

    public void setShort_description(String short_description) {
        this.short_description = short_description;
    }

    public String getFull_description() {
        return full_description;
    }

    public void setFull_description(String full_description) {
        this.full_description = full_description;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getPrice_per_kg() {
        return price_per_kg;
    }

    public void setPrice_per_kg(String price_per_kg) {
        this.price_per_kg = price_per_kg;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
