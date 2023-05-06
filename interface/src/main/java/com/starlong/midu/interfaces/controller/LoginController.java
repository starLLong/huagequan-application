package com.starlong.midu.interfaces.controller;

import com.starlong.midu.application.LoginApplication;
import com.starlong.midu.infrastructure.Result;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;


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

    @PostMapping("/login")
    public Result login(@RequestParam String username, @RequestParam String password) {

        Result result = new Result();
        return result;
    }
}
