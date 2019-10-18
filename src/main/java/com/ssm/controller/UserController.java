/*
 * @(#)UserController.java 2019年10月16日下午4:55:45 SSMLearn Copyright 2019
 * Thuisoft, Inc. All rights reserved. THUNISOFT PROPRIETARY/CONFIDENTIAL. Use
 * is subject to license terms.
 */
package com.ssm.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ssm.model.User;
import com.ssm.service.UserService;

/**
 * UserController
 * @author lenovo
 * @version 1.0
 *
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @ResponseBody
    @RequestMapping(value = "login")
    public String login(@RequestParam("username") String username, @RequestParam("password") String password, HttpSession session) {
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        if (userService.login(user) != null) {
            user = userService.login(user);
            session.setAttribute("user", user);
            return "login";
        }
        return "erro";
    }

    @ResponseBody
    @RequestMapping(value = "/selectAll", method = RequestMethod.GET)
    public List<User> selectAll() {
        return userService.selectAll();

    }

    @ResponseBody
    @RequestMapping(value = "/register")
    public String register(User user) {

        int a = userService.addUser(user);
        if (a == 1) {

            return "/user/login";
        } else {
            return "fail";
        }

    }
}
