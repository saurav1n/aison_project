package com.example.aiosn.service;

import com.example.aiosn.model.UserProfileModel;

public interface UserProfileService {
    public UserProfileModel getProfile(Integer id);
    public UserProfileModel editProfile(UserProfileModel userProfileModel);
}
