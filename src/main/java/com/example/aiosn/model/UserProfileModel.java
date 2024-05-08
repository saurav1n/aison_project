package com.example.aiosn.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
public class UserProfileModel {

    @Id
    private Integer userId;
    private String email;
    private String phoneNumber;
    private String company;
    private String country;
    private String StreetAndHouseNumber;
    private String additionalAddress;
    private String postalCode;
    private String city;
    private String bannerImage;
    private String profileImage;

    private boolean status;
    private String message;


    public UserProfileModel() {
    }


    public UserProfileModel(Integer userId, String email, String phoneNumber, String company, String country, String streetAndHouseNumber, String additionalAddress, String postalCode, String city, String bannerImage, String profileImage, boolean status, String message) {
        this.userId = userId;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.company = company;
        this.country = country;
        StreetAndHouseNumber = streetAndHouseNumber;
        this.additionalAddress = additionalAddress;
        this.postalCode = postalCode;
        this.city = city;
        this.bannerImage = bannerImage;
        this.profileImage = profileImage;
        this.status = status;
        this.message = message;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getStreetAndHouseNumber() {
        return StreetAndHouseNumber;
    }

    public void setStreetAndHouseNumber(String streetAndHouseNumber) {
        StreetAndHouseNumber = streetAndHouseNumber;
    }

    public String getAdditionalAddress() {
        return additionalAddress;
    }

    public void setAdditionalAddress(String additionalAddress) {
        this.additionalAddress = additionalAddress;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getBannerImage() {
        return bannerImage;
    }

    public void setBannerImage(String bannerImage) {
        this.bannerImage = bannerImage;
    }

    public String getProfileImage() {
        return profileImage;
    }

    public void setProfileImage(String profileImage) {
        this.profileImage = profileImage;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
