/*
 * @(#)TestJDBC.java 2019年10月11日上午10:36:09 SSMLearn Copyright 2019 Thuisoft,
 * Inc. All rights reserved. THUNISOFT PROPRIETARY/CONFIDENTIAL. Use is subject
 * to license terms.
 */
package com.ssm.test;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.ssm.model.User;

/**
 * TestJDBC
 * @author lenovo
 * @version 1.0
 *
 */
public class TestJDBC {

    /**
     * @param args
     * @throws Exception 
     */
    public static void main(String[] args) throws Exception {
        //        指定全局配置文件
        String resource = "mybatis.xml";
        //        读取配置文件
        InputStream inputStream = Resources.getResourceAsStream(resource);
        //        构建SqlSessionFactory
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //        获取SqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //        操作CURD(增删改查)

        //查询全部用户
        System.out.println("查询全部用户");
        List<User> userList = sqlSession.selectList("com.ssm.dao.UserDao.selectAll");
        for (int i = 0; i < userList.size(); i++) {
            System.out.println(userList.get(i));
        }
        //       根据用户id查询用户
        System.out.println("根据用户id查询用户");
        User user = sqlSession.selectOne("com.ssm.dao.UserDao.selectById", "1");
        System.out.println(user);

        //        增加用户
        //        System.out.println("增加用户");
        //        User user1 = new User();
        //        user1.setId("3");
        //        user1.setUsername("xiaoming");
        //        user1.setPassword("123456");
        //        user1.setName("小明");
        //        user1.setAge(18);
        //        user1.setSex("男");
        //        user1.setBirthday(new Date());
        //        System.out.println(user1);
        //        int a = sqlSession.insert("com.ssm.dao.UserDao.addUser", user1);
        //        System.out.println(a);
        //        System.out.println("查询添加后用户");
        //        List<User> userList1 = sqlSession.selectList("com.ssm.dao.UserDao.selectAll");
        //        for (int i = 0; i < userList1.size(); i++) {
        //            System.out.println(userList1.get(i));
        //        }

        //      修改用户
        /*
         * System.out.println("修改用户"); User user2 = new User();
         * user2.setId("3"); user2.setAge(100); System.out.println(user2); int b
         * = sqlSession.update("com.ssm.dao.UserDao.updateUser", user2);
         * System.out.println(b); System.out.println("查询修改后用户"); List<User>
         * userList2 = sqlSession.selectList("com.ssm.dao.UserDao.selectAll");
         * for (int i = 0; i < userList2.size(); i++) {
         * System.out.println(userList2.get(i)); }
         */

        //        删除用户

        //        System.out.println("删除用户");
        //        User user3 = new User();
        //        user3.setId("3");
        //        System.out.println(user3);
        //        int c = sqlSession.delete("com.ssm.dao.UserDao.deleteUser", user3);
        //        System.out.println(c);
        //        System.out.println("查询删除后用户");
        //        List<User> userList3 = sqlSession.selectList("com.ssm.dao.UserDao.selectAll");
        //        for (int i = 0; i < userList3.size(); i++) {
        //            System.out.println(userList3.get(i));
        //        }

        //        sql语句保存,如果不写无法插入数据
        sqlSession.commit();
        sqlSession.close();

    }

}
