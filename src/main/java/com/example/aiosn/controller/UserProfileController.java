package com.example.aiosn.controller;

import com.example.aiosn.model.UserProfileModel;
import com.example.aiosn.service.UserProfileService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/aiosn/profile")
public class UserProfileController {

    UserProfileService userProfileService;

    public UserProfileController(UserProfileService userProfileService) {
        this.userProfileService = userProfileService;
    }

    @GetMapping("{id}")
    public UserProfileModel getDetails(@PathVariable("id") Integer id) {
         return userProfileService.getProfile(id);
    }

    @PostMapping()
    public UserProfileModel updateDetails(@RequestBody UserProfileModel userProfileModel) {
        return userProfileService.editProfile(userProfileModel);
    }

}
