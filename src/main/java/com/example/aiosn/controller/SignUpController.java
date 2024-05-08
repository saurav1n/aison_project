package com.example.aiosn.controller;

import com.example.aiosn.CommonActivity;
import com.example.aiosn.model.SignUpModel;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/aiosn")
public class SignUpController extends CommonActivity {

    SignUpModel signUpModel;


    @PostMapping("/signup")
    public SignUpModel signup(@RequestBody SignUpModel signUpModel) {


        if (signUpModel.getFirstName().isEmpty()){
            signUpModel.setMessage("Please Provide your First name");
        }
        else if (signUpModel.getLastName().isEmpty()){
            signUpModel.setMessage("Please Provide your Last name");
        }
        else if (signUpModel.getEmail().isEmpty()){
            signUpModel.setMessage("Please Provide your Email");
        }
        else if (!isValidEmail(signUpModel.getEmail())){
            signUpModel.setMessage("Please Provide valid Email");
        }
        else if (signUpModel.getPassword().isEmpty()){
            signUpModel.setMessage("Please Provide Password");
        }
        else if (signUpModel.getConfirmPassword().isEmpty()){
            signUpModel.setMessage("Please Provide ConfirmPassword");
        }
        else {
            signUpModel.setMessage("Sign-up Successfull");
        }


        this.signUpModel = signUpModel;
        return this.signUpModel;
    }

}
