package com.ssm.test.io;

import java.io.*;

/**
 * @author lenovo
 * @version 1.0
 * @description: TODO
 * @date 2020/8/12 15:10
 */
public class TestBufferCopy {

    public static void main(String[] args){
        byte[] bytes =  new byte[1024];
        int i;
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        BufferedInputStream bufferedInputStream = null;
        BufferedOutputStream bufferedOutputStream = null;
        try {
             fileInputStream = new FileInputStream("F://test.txt");
             fileOutputStream = new FileOutputStream("F://test1.txt");
             bufferedInputStream = new BufferedInputStream(fileInputStream);
             bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
            while ((i=bufferedInputStream.read(bytes))!=-1){
                 bufferedOutputStream.write(bytes,0,i);
            }
            bufferedOutputStream.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                if (bufferedInputStream!=null){
                    bufferedInputStream.close();
                }
                if (bufferedOutputStream!=null){
                    bufferedOutputStream.close();
                }
                if(fileInputStream!=null) {
                    fileInputStream.close();
                }
                if (bufferedInputStream!=null){
                    bufferedInputStream.close();
                }
                } catch (IOException e) {
                e.printStackTrace();
                }
        }
    }
}
