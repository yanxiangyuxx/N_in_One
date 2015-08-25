package com.yxy.test.thread;

import java.util.concurrent.CountDownLatch;

/**
 * Created by syyanxiangyu on 2015/7/30.
 */
public class CountDownLatchDemo {


    public static void main(String[] args){
        CountDownLatch countDownLatch = new CountDownLatch(2);
        Loading loadingHead = new LoadingHead(countDownLatch);
        Loading loadingBody = new LoadingBody(countDownLatch);
        Start start = new Start();


        Thread thread1 = new Thread(loadingHead);
        Thread thread2 = new Thread(loadingBody);
        Thread thread3 = new Thread(start);
        thread1.start();
        thread2.start();
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread3.start();
    }

}

abstract class Loading implements Runnable{
    protected CountDownLatch countDownLatch;

    public Loading(CountDownLatch countDownLatch) {
        this.countDownLatch = countDownLatch;
    }
}

class LoadingHead extends Loading{


    public LoadingHead(CountDownLatch countDownLatch) {
        super(countDownLatch);
    }

    @Override
    public void run() {
        System.out.println("我来组成头部");
        countDownLatch.countDown();
    }
}

class LoadingBody extends Loading{

    public LoadingBody(CountDownLatch countDownLatch) {
        super(countDownLatch);
    }

    @Override
    public void run() {
        System.out.println("我来组成身体");
        countDownLatch.countDown();
    }
}

class Start implements Runnable{

    public void run() {
        System.out.println("组装完成，启动");
    }
}

