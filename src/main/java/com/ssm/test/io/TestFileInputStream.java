package com.ssm.test.io;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author lenovo
 * @version 1.0
 * @description: TODO
 * @date 2020/8/12 14:36
 */
public class TestFileInputStream {
    
    public static void main(String[] args)  {
        byte[] bt = new byte[5];
        int i ;
        FileInputStream fileInputStream = null;
        try {
             fileInputStream = new FileInputStream("F://test.txt");
            while ( (i = (fileInputStream.read(bt)))!=-1){
                for (int j = 0;j<i;j++){
                    System.out.print((char)bt[j]);
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally{
            if(fileInputStream!=null){
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
