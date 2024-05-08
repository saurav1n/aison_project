package com.example.aiosn.impl;

import com.example.aiosn.model.EmailOTPVerifyModel;
import com.example.aiosn.repository.EmailOTPVerifyRepository;
import com.example.aiosn.service.EmailOTPVerifyService;
import org.springframework.stereotype.Service;

@Service
public class EmailOTPVerifyImpl implements EmailOTPVerifyService {

    EmailOTPVerifyRepository emailOTPVerifyRepository;

    public EmailOTPVerifyImpl(EmailOTPVerifyRepository emailOTPVerifyRepository) {
        this.emailOTPVerifyRepository = emailOTPVerifyRepository;
    }

    @Override
    public EmailOTPVerifyModel verifyOTP(EmailOTPVerifyModel emailOTPVerifyModel) {

        if (emailOTPVerifyModel.getOtp().equals(emailOTPVerifyRepository.findById(emailOTPVerifyModel.getUserId()).get().getOtp())){
            emailOTPVerifyModel.setMessage("Your Email Verified.. Enjoy");
            emailOTPVerifyModel.setStatus(true);
            return emailOTPVerifyModel;
        }
        else {
            emailOTPVerifyModel.setMessage("Email Verification failed...");
            emailOTPVerifyModel.setOtp("Fail");
            emailOTPVerifyModel.setStatus(false);
            emailOTPVerifyModel.setEmail(emailOTPVerifyModel.getEmail());
            return emailOTPVerifyModel;
        }

    }
}
