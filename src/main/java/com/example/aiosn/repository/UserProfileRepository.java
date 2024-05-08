package com.example.aiosn.repository;

import com.example.aiosn.model.UserProfileModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserProfileRepository extends JpaRepository<UserProfileModel,Integer> {

}
