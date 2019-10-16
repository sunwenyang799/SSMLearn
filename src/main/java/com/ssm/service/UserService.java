/*
 * @(#)UserService.java 2019年10月16日下午2:19:01 SSMLearn Copyright 2019 Thuisoft,
 * Inc. All rights reserved. THUNISOFT PROPRIETARY/CONFIDENTIAL. Use is subject
 * to license terms.
 */
package com.ssm.service;

import java.util.List;

import com.ssm.model.User;

/**
 * UserService
 * @author lenovo
 * @version 1.0
 *
 */
public interface UserService {
    //  查询全部用户
    public List<User> selectAll();

    //  根据用户id查询用户
    public User selectById(String id);

    //    添加用户
    public int addUser(User user);

    //    修改用户
    public int updateUser(User user);

    //    删除用户
    public int deleteUser(User user);
}
