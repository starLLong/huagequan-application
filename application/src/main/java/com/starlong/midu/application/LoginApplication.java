package com.starlong.midu.application;

import com.starlong.midu.domain.ILoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginApplication {
    @Autowired
    ILoginService loginService;

    public int test(){
        return loginService.test();
    }

}
