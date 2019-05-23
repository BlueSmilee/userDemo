package com.example.demo.controller;


import com.example.demo.dao.UserDao;
import com.example.demo.model.PO.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class LoginController {

    @Autowired
    private UserDao userDao;

    @PostMapping("/register")
    public String loginVefify(User user) {

        userDao.addUser(user);
        System.out.println("user = [" + user + "]");
        return "ok";
    }

    @GetMapping("/select")
    public User selectUser(String username) {
        if (username == null) {
            return null;

        } else {
            User userByUserName = userDao.getUserByUserName(username);
            return userByUserName;
        }
    }
    @DeleteMapping("/delete")
    public User deleteUser(String username) {
        if (username == null) {
            return null;

        } else {
            User userByUserName = userDao.deleteByUserName(username);
            return null;
        }
    }

}

