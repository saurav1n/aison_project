package com.example.aiosn.controller;

import com.example.aiosn.CommonActivity;
import com.example.aiosn.model.LoginModel;
import com.example.aiosn.service.LoginService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/aiosn")
public class LoginController extends CommonActivity {

    LoginService loginService;

    public LoginController(LoginService loginService) {
        this.loginService = loginService;
    }

    @PostMapping("/login")
    public LoginModel login(@RequestBody LoginModel loginModel){
      return   loginService.login(loginModel);
    }

}
