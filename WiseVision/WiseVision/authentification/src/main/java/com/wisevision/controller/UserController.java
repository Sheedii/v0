package com.wisevision.controller;

import com.wisevision.entity.User;
import com.wisevision.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;


    //@Autowired
    //private PasswordEncoder passwordEncoder;



    @PostMapping({"/registerNewUser"})
    public User registerNewUser(@RequestBody User user) {
       // user.setUserPassword(passwordEncoder.encode(user.getUserPassword()));
        return userService.registerNewUser(user);
    }

    @GetMapping({"/forAdmin"})
    public String forAdmin() {
        return "this URL is for admin";
    }

    @GetMapping({"/forUser"})
    public String forUser() {
        return "this URL is for user";
    }

}
