package com.example.aiosn.repository;

import com.example.aiosn.model.EmailOTPVerifyModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmailOTPVerifyRepository extends JpaRepository<EmailOTPVerifyModel,Integer> {
}
