package com.DakotaHeizman.springApp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.DakotaHeizman.springApp.model.User;

public interface UserRepository extends JpaRepository<User, String>{

        List<User> findByUserName(String username);
}
