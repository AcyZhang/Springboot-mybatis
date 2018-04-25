package com.example.controller;

import com.example.pojo.User;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by AcY on 2018/4/25.
 */
@RestController
@RequestMapping("/boot")
public class userController {
    @Autowired
    private UserService userService;

    @RequestMapping(value ="/list")
    @ResponseBody
    public List<User> getUsersd(){
        return userService.getUsers() ;

    }
}
