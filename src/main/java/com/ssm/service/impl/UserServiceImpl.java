/*
 * @(#)UserServiceImpl.java 2019年10月16日下午4:50:09 SSMLearn Copyright 2019
 * Thuisoft, Inc. All rights reserved. THUNISOFT PROPRIETARY/CONFIDENTIAL. Use
 * is subject to license terms.
 */
package com.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssm.model.User;
import com.ssm.service.UserService;

/**
 * UserServiceImpl
 * @author lenovo
 * @version 1.0
 *
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserService userServcie;

    /**查询全部用户
     * @see com.ssm.service.UserService#selectAll()
     */
    public List<User> selectAll() {

        return userServcie.selectAll();
    }

    /** 根据id查询用户
     * @see com.ssm.service.UserService#selectById(java.lang.String)
     */
    public User selectById(String id) {

        return userServcie.selectById(id);
    }

    /** 添加用户
     * @see com.ssm.service.UserService#addUser(com.ssm.model.User)
     */
    public int addUser(User user) {

        return userServcie.addUser(user);
    }

    /** 修改用户
     * @see com.ssm.service.UserService#updateUser(com.ssm.model.User)
     */
    public int updateUser(User user) {

        return userServcie.updateUser(user);
    }

    /** 删除用户
     * @see com.ssm.service.UserService#deleteUser(com.ssm.model.User)
     */
    public int deleteUser(User user) {

        return userServcie.deleteUser(user);
    }

}
