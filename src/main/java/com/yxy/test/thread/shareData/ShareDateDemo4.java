package com.yxy.test.thread.shareData;

/**
 * Created by 58 on 2016/8/10.
 */
public class ShareDateDemo4 {

    private static int j=0;
    private static ShareDateDemo3 dateDemo3;
    
    public static void main(String args[]) throws InterruptedException {

        for(int i =0;i<10;i++){

            new Thread(new Runnable() {
                @Override
                public void run() {
                    synchronized (ShareDateDemo4.class){

                        j++;
                    }
//                    System.out.println(j);
                }
            }).start();
        }
//
        Thread.sleep(1000);
        System.out.print(j);
    }
}
