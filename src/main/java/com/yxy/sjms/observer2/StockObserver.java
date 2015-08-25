package com.yxy.sjms.observer2;


import java.util.Observable;
import java.util.Observer;

/**
 * Created by syyanxiangyu on 2015/1/19.
 */
public class StockObserver implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("StockObserver ---- update" + arg);
    }
}
