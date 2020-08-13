package com.ssm.test;


/**
 * @author lenovo
 * @version 1.0
 * @description: TODO
 * @date 2020/8/12 10:06
 */
public class TestThread{

    private static int value = 0;
    
    private static Object object = new Object();
    
    public static  void main(String[] args){
        //  奇数线程
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (value<100){
                    synchronized (object){
                        if(value%2==0){
                            continue;
                        }
                        value = ++value;
                        System.out.println("偶数："+value);
                        object.notify();
                        try {
                            object.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }).start();

        //  偶数线程
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (value<100){
                    synchronized (object){
                        if(value%2!=0){
                            continue;
                        }
                        value = ++value;
                        System.out.println("奇数："+value);
                        object.notify();
                        try {
                            object.wait();
                        } catch (InterruptedException e) {

                            e.printStackTrace();
                        }
                    }
                }
            }
        }).start();
    }

}

