package com.ssm.test.io;

import com.ssm.model.User;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Date;

/**
 * @author lenovo
 * @version 1.0
 * @description: TODO
 * @date 2020/8/12 16:01
 */
public class TestObjStream {

    public static void main(String[] args){
        try {

            FileOutputStream outputStream = new FileOutputStream("F://test.txt");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
            User user = new User("1","1","1","1",1,"1",new Date());
            User user1 = new User("2","2","2","2",2,"2",new Date());
            User user2 = new User("是是是","3","3","3",1,"3",new Date());
            ArrayList<User> list = new ArrayList<User>();
            list.add(user);
            list.add(user1);
            list.add(user2);
            objectOutputStream.writeObject(list);
            objectOutputStream.flush();
            System.out.println("对象写入成功");
            FileInputStream inputStream = new FileInputStream("F://test.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);

            Object o = objectInputStream.readObject();
            System.out.println(o.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
