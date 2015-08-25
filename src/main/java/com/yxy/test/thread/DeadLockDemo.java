package com.yxy.test.thread;

/**
 * Created by syyanxiangyu on 2015/7/30.
 */
public class DeadLockDemo {

    public static void main(String[] args){

        new MyThread(true).start();
        new MyThread(false).start();
    }
}

class MyThread extends Thread{

    private boolean flag =false;
    private Integer data1 = 1;
    private Integer data2 = 2;

    public MyThread(boolean flag) {
        this.flag = flag;
    }

    @Override
    public void run() {

        try {
            if(flag){
               synchronized (data1){
                   Thread.sleep(10000);
                   System.out.println("true data1");
               }
                synchronized (data2){
                    System.out.println("true data2");
                }
            }else {

                synchronized (data2){
                    Thread.sleep(10000);
                    System.out.println("false data2");
                }
                synchronized (data1){
                    System.out.println("false data1");
                }
            }
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}