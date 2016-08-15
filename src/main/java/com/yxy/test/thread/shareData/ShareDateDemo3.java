package com.yxy.test.thread.shareData;

/**
 * Created by 58 on 2016/8/8.
 */
public class ShareDateDemo3 {
    private static boolean ready;
    private static int number;

    private static class ReadThread extends Thread{
        @Override
        public void run() {
            while (!ready){
                Thread.yield();
            }
            System.out.println(number);
        }
    }
    public static void main(String[] args) throws Exception{
        Thread thread = new ReadThread();
        thread.start();
        number =42;
        ready =true;
    }

}
