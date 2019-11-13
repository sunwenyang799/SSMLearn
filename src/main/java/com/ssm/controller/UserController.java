/*
 * @(#)UserController.java 2019年10月16日下午4:55:45 SSMLearn Copyright 2019
 * Thuisoft, Inc. All rights reserved. THUNISOFT PROPRIETARY/CONFIDENTIAL. Use
 * is subject to license terms.
 */
package com.ssm.controller;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.collections.map.HashedMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    //  有@ResponseBody以json,string格式返回;无@ResponseBody以页面形式返回
    @ResponseBody
    @RequestMapping(value = "login")
    public Map<String, Object> login(HttpServletRequest request, HttpSession httpSession, HttpServletResponse response) throws IOException {
        Map<String, Object> result = new HashedMap();
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        user = userService.login(user);
        result.put("user", user);
        httpSession.setAttribute("user", user);
        if (userService.login(user) != null) {
            result.put("success", true);
            logger.info(result.toString());
        } else {
            result.put("success", false);
            logger.error("登录失败");
        }
        return result;
    }

    @ResponseBody
    @RequestMapping(value = "/selectAll", method = RequestMethod.GET)
    public List<User> selectAll() {
        return userService.selectAll();

    }

    @ResponseBody
    @RequestMapping(value = "/register")
    public Map<String, Object> register(HttpServletRequest request, HttpSession httpSession,
            HttpServletResponse response) throws Exception {
        Map<String, Object> result = new HashedMap();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String name = request.getParameter("name");
        String age = request.getParameter("age");
        String sex = request.getParameter("sex");
        String birthday = request.getParameter("birthday");
        User user = new User();
        user.setId(UUID.randomUUID().toString().replace("-", ""));
        user.setUsername(username);
        user.setPassword(password);
        user.setName(name);
        user.setAge(Integer.parseInt(age));
        user.setSex(sex);
        user.setBirthday(simpleDateFormat.parse(birthday));
        logger.info(user.toString());

        result.put("user", user);
        int a = userService.addUser(user);
        if (a == 1) {
            logger.info("注册成功");
            result.put("success", true);
        } else {
            logger.info("注册失败");
            result.put("success", false);
        }
        return result;
    }
}
