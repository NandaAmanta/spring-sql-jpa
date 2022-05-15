package com.example.demo.service;

import com.example.demo.dto.ServiceResult;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    @Autowired
    UserRepository userRepository;

    public ServiceResult login(){
        return null;
    }

    public ServiceResult signUp(){
        return null;
    }

    public ServiceResult logout(){
        return null;
    }
}
