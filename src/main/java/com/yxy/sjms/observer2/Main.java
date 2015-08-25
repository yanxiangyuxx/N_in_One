package com.yxy.sjms.observer2;


/**
 * Created by syyanxiangyu on 2015/1/19.
 */
public class Main {


    public static void main(String[] args){
        NBAObserver nbaObserver = new NBAObserver();
        StockObserver stockObserver = new StockObserver();
        Boss boss = new Boss();
        boss.addObserver(nbaObserver);
        boss.addObserver(stockObserver);

        boss.moving();

        boss.notifyObservers("come back");


        boss.moving();
        boss.notifyObservers("go out");


    }


}
