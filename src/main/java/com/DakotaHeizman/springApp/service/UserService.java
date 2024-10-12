package com.DakotaHeizman.springApp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.DakotaHeizman.springApp.repository.UserRepository;

@Service
public class UserService{
    @Autowired
    UserRepository userRepository;



    
}
