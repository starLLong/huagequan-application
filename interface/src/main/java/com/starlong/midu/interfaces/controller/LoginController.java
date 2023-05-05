package com.starlong.midu.interfaces.controller;

import com.starlong.midu.application.LoginApplication;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RequestMapping("/test")
@RestController
public class LoginController {
    @Resource
    LoginApplication loginApplication;

    @GetMapping("/test")
    public int test(){
        int test = loginApplication.test();
        return test;
    }
}
