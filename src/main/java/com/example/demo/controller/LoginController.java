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
        return "{\"status\":\"ok\"}";
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
    public String deleteUser(String username) {
        if (username == null) {
            return null;

        } else {
            int number = userDao.deleteByUserName(username);//number 删除几条数据
            return "{\"status\":\" " + number + " \"}";
        }
    }

    @PostMapping("/update")
    public String updateUser(User user) {

        userDao.updateByUserName(user);
        System.out.println("user = [" + user + "]");
        return "{\"status\":\"ok\"}";

    }
}


