/*
 * @(#)UserDao.java 2019年9月23日下午4:27:32 SSMLearn Copyright 2019 Thuisoft, Inc.
 * All rights reserved. THUNISOFT PROPRIETARY/CONFIDENTIAL. Use is subject to
 * license terms.
 */
package com.ssm.dao;

import java.util.List;

import com.ssm.model.User;

/**
 * UserDao
 * @author lenovo
 * @version 1.0
 *
 */
public interface UserDao {
    //        查询全部用户
    public List<User> selectAll();

    //  根据用户id查询用户
    public User selectById(String id);

    //  根据用户名,密码 登录
    public User login(User user);

    //    添加用户
    public int addUser(User user);

    //    修改用户
    public int updateUser(User user);

    //    删除用户
    public int deleteUser(User user);
}
