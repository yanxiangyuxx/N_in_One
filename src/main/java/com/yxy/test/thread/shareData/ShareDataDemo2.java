package com.yxy.test.thread.shareData;

/**
 * Created by syyanxiangyu on 2015/7/30.
 */
public class ShareDataDemo2 {

    public static void main(String[] args){
        MyData myData = new MyData();
        myData.setJ(100);
        new Thread(new AddRunnable(myData)).start();
        new Thread(new AddRunnable(myData)).start();
        new Thread(new DecRunnable(myData)).start();
        new Thread(new DecRunnable(myData)).start();


    }
}

class MyData{
    int j = 0;

    public synchronized void add (){
        j ++;
        System.out.println("线程"+Thread.currentThread().getName()+"执行加操作， j："+j);
    }

    public synchronized void dec(){
        j --;
        System.out.println("线程"+Thread.currentThread().getName()+"执行减操作， j："+j);
    }

    public int getJ() {
        return j;
    }

    public void setJ(int j) {
        this.j = j;
    }
}

class AddRunnable implements Runnable{

    MyData myData;

    public AddRunnable(MyData myData) {
        this.myData = myData;
    }

    public void run() {
        myData.add();
    }
}

class DecRunnable implements Runnable{

    MyData myData;

    public DecRunnable(MyData myData) {
        this.myData = myData;
    }

    public void run() {
        myData.dec();
    }
}