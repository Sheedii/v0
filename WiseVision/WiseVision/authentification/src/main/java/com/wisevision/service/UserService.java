package com.wisevision.service;


import com.wisevision.dao.UserDao;
import com.wisevision.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;
    public User registerNewUser(User user){
        return userDao.save(user);
    }
}
