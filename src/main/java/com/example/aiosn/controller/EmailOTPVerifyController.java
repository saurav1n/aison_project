package com.example.aiosn.controller;

import com.example.aiosn.model.EmailOTPVerifyModel;
import com.example.aiosn.service.EmailOTPVerifyService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/aiosn")
public class EmailOTPVerifyController {

    EmailOTPVerifyService emailOTPVerifyService;

    public EmailOTPVerifyController(EmailOTPVerifyService emailOTPVerifyService) {
        this.emailOTPVerifyService = emailOTPVerifyService;
    }

    @PostMapping("/email_otp_verify")
    public EmailOTPVerifyModel emailOTPVerify(@RequestBody EmailOTPVerifyModel emailOTPVerifyModel){
        return emailOTPVerifyService.verifyOTP(emailOTPVerifyModel);
    }

}
