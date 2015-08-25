package com.yxy.test.thread.shareData;

/**
 * Created by syyanxiangyu on 2015/7/30.
 */
public class ShareDataDemo {


    public static void main(String[] args){

        Ticket t = new Ticket();
        Thread thread1 = new Thread(t);
        Thread thread2 = new Thread(t);

        thread1.start();
        thread2.start();
    }
}

class Ticket implements Runnable{

    private int num = 10;
    public synchronized void run() {
        while (num>0){
            num--;
            System.out.println("当前数量:" + num);
        }
    }
}