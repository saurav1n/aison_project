package com.example.aiosn.model;

import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class LoginModel {
    @Id
    @GeneratedValue
    private Integer userId;
    private String message;
    private String email;
    private String otp;
    private boolean status;


    public LoginModel(Integer userId, String message, String email, String otp, boolean status) {
        this.userId = userId;
        this.message = message;
        this.email = email;
        this.otp = otp;
        this.status = status;
    }

    public LoginModel() {

    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getOtp() {
        return otp;
    }

    public void setOtp(String otp) {
        this.otp = otp;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
