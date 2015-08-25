package com.yxy.sjms.observer2;

import java.util.Observable;

/**
 * Created by syyanxiangyu on 2015/1/19.
 */
public class NBAObserver implements java.util.Observer {
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("NBAObserver ------  update"+arg);
    }
}
