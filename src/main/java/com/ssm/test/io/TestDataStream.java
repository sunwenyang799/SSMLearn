package com.ssm.test.io;

import java.io.*;

/**
 * @author lenovo
 * @version 1.0
 * @description: TODO
 * @date 2020/8/12 15:37
 */
public class TestDataStream {

    public static void main(String[] args){
        byte[] bytes =  new byte[1024];
        int i;
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        DataInputStream dataInputStream  = null;
        DataOutputStream dataOutputStream = null;
        try {
            fileInputStream = new FileInputStream("F://test1.txt");
            fileOutputStream = new FileOutputStream("F://test1.txt");
             dataInputStream = new DataInputStream(fileInputStream);
             dataOutputStream = new DataOutputStream(fileOutputStream);

            dataOutputStream.writeByte(10);
            dataOutputStream.writeBoolean(true);
            dataOutputStream.writeInt(11);
            dataOutputStream.writeFloat(12);
            dataOutputStream.writeLong(13L);
            dataOutputStream.flush();

            System.out.println(dataInputStream.readByte());
            System.out.println(dataInputStream.readBoolean());
            System.out.println(dataInputStream.readInt());
            System.out.println(dataInputStream.readFloat());
            System.out.println(dataInputStream.readLong());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
