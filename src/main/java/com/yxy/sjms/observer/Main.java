package com.yxy.sjms.observer;

/**
 * Created by syyanxiangyu on 2014/12/26.
 */
public class Main {

    public static void main(String[] arg){
        StockObserver stockObserver = new StockObserver();
        NBAObserver nbaObserver = new NBAObserver();
        Boss boss = new Boss();
        boss.attach(stockObserver);
        boss.attach(nbaObserver);

        boss.notifyObserver();
    }
}
