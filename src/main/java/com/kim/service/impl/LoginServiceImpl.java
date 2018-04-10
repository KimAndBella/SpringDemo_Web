package com.kim.service.impl;

import com.kim.service.LoginService;
import org.springframework.stereotype.Service;

/**
 * Created by pan.sun on 2018/4/10.
 */
@Service
public class LoginServiceImpl implements LoginService {
    @Override
    public boolean loginCheck(String name, String pass) {
        //TODO 进行ldap校验
        System.out.println("login-loginCheck-run");
        if("admin".equals(name) && "123".equals(pass)){
            return true;
        }
        return false;
    }
}
