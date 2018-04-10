package com.kim.controller;

import com.kim.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by pan.sun on 2018/4/10.
 */
@Controller
public class LoginController {

    @Autowired
    LoginService loginService;

    @RequestMapping("/index")
    public String index(){
        return "index";
    }

    @RequestMapping(value = "/login",method= RequestMethod.POST)
    public String login(@RequestParam("name")String username, @RequestParam("password")String password, ModelMap modelMap){
        System.out.println("login-run");
       if(loginService.loginCheck(username,password)){
           System.out.println("-----username = "+username);
           modelMap.addAttribute("name",username);
           return "home";
       }else{
           return "";
       }
    }
}
