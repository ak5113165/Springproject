package com.javatechie.controller;

import com.javatechie.entity.UserInfo;
import com.javatechie.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping({"/user"})
public class usercontroller {

    @Autowired
    private ProductService service;

    public usercontroller{

    }
    @PostMapping({"/new"})
    public String addNewUser(@RequestBody UserInfo userInfo) {
        return this.service.addUser(userInfo);
    }
}
