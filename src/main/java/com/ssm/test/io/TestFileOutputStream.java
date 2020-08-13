package com.ssm.test.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author lenovo
 * @version 1.0
 * @description: TODO
 * @date 2020/8/12 14:56
 */
public class TestFileOutputStream {

    public static void main(String[] args){
        FileOutputStream fileOutputStream = null;
        FileInputStream fileInputStream = null;
        byte[] bytes = new byte[1024];
        int i = 0;
        try {
            fileInputStream = new FileInputStream("F://test.txt");
            fileOutputStream = new FileOutputStream("F://test1.txt");
            while ((i = fileInputStream.read(bytes))!=-1){
                fileOutputStream.write(bytes,0,i);
            }
            fileOutputStream.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            if (fileInputStream!=null){
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fileOutputStream!=null){
                try {
                    fileOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
