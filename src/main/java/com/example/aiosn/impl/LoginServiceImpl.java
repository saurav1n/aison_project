package com.example.aiosn.impl;

import com.example.aiosn.CommonActivity;
import com.example.aiosn.model.LoginModel;
import com.example.aiosn.repository.LoginRepository;
import com.example.aiosn.service.LoginService;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl extends CommonActivity implements LoginService {

    LoginRepository loginRepository;

    public LoginServiceImpl(LoginRepository loginRepository) {
        this.loginRepository = loginRepository;
    }

    @Override
    public LoginModel login(LoginModel loginModel) {
        // business Logic here

        if (isValidEmail(loginModel.getEmail())) {
            loginModel.setMessage("Email Registered Successfully");
            loginModel.setOtp(getOTP());
            loginModel.setStatus(true);
            loginRepository.save(loginModel);

            return loginModel;

        } else {
            return new LoginModel(0, "Please Provide valid email.", "","",false);
        }
    }
}
