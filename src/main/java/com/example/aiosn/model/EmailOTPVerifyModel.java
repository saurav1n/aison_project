package com.example.aiosn.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
public class EmailOTPVerifyModel {
    private String message;
    private String otp;
    private String email;
    @Id
    private Integer userId;
    private boolean status;

    public EmailOTPVerifyModel() {
    }

    public EmailOTPVerifyModel(String message, String otp, String email, Integer userId, boolean status) {
        this.message = message;
        this.otp = otp;
        this.email = email;
        this.userId = userId;
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getOtp() {
        return otp;
    }

    public void setOtp(String otp) {
        this.otp = otp;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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
