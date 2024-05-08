package com.example.aiosn.impl;

import com.example.aiosn.model.UserProfileModel;
import com.example.aiosn.repository.UserProfileRepository;
import com.example.aiosn.service.UserProfileService;
import org.springframework.stereotype.Service;

@Service
public class UserProfileServiceImpl implements UserProfileService {

    UserProfileRepository userProfileRepository;

    public UserProfileServiceImpl(UserProfileRepository userProfileRepository) {
        this.userProfileRepository = userProfileRepository;
    }

    @Override
    public UserProfileModel getProfile(Integer id) {
        return userProfileRepository.findById(id).get();
    }

    @Override
    public UserProfileModel editProfile(UserProfileModel userProfileModel) {
        return userProfileRepository.save(userProfileModel);
    }
}
