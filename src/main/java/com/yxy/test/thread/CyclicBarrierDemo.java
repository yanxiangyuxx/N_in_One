package com.yxy.test.thread;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * Created by syyanxiangyu on 2015/7/30.
 */
public class CyclicBarrierDemo {

    public static void main(String[] args){

        Go go = new Go();
        CyclicBarrier cyclicBarrier = new CyclicBarrier(2,go);
        Prepare one = new PrepareOne(cyclicBarrier);
        Prepare two = new PrepareTwo(cyclicBarrier);

        Thread thread1= new Thread(one);
        Thread thread2= new Thread(two);


        thread1.start();
        thread2.start();
    }
}

abstract class Prepare implements Runnable{
    protected CyclicBarrier cyclicBarrier;

    public Prepare(CyclicBarrier cyclicBarrier) {
        this.cyclicBarrier = cyclicBarrier;
    }
}


class PrepareOne extends  Prepare{

    public PrepareOne(CyclicBarrier cyclicBarrier) {
        super(cyclicBarrier);
    }

    public void run() {
        try {
            System.out.println("准备1");
            cyclicBarrier.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (BrokenBarrierException e) {
            e.printStackTrace();
        }
    }
}

class PrepareTwo extends Prepare{

    public PrepareTwo(CyclicBarrier cyclicBarrier) {
        super(cyclicBarrier);
    }

    public void run() {
        try {
            System.out.println("准备2");
            cyclicBarrier.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (BrokenBarrierException e) {
            e.printStackTrace();
        }
    }
}

class Go implements Runnable{

    public void run() {
        System.out.println("gogogo");
    }
}