package com.ssm.controller;

import com.ssm.entity.User;
import com.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/user/{id}")
    private ModelAndView findUserById(@PathVariable Long id){
        return null;
    }

    @RequestMapping("/user/add")
    private ModelAndView addUser(){
        return null;
    }

    @RequestMapping("/user/u_login")
    private String login(HttpServletRequest httpServletRequest, Model model){
        String username = httpServletRequest.getParameter("username");
        String password = httpServletRequest.getParameter("password");
        System.out.println(username + " " + password);
        User user = null;

        if(username.equals("admin") && password.equals("123")){
            user = new User();
            user.setMemberNum(username);
        }
        model.addAttribute("user",user);
        return "main";
    }
}
