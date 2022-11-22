package com.example.demoAPI;

import org.springframework.stereotype.Service;

@Service
public class UserService {

    public String returnAsUpperCase(String name) {
        System.out.println("in the anyString fn");
        return name.toUpperCase();
    }

    public UserModel returnUser(UserModel user) {
        System.out.println("in the anyString fn--"); //logger
        return user;
    }


}

