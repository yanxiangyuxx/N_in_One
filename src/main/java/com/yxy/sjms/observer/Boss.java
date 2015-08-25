package com.yxy.sjms.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by syyanxiangyu on 2014/12/24.
 */
public class Boss implements Observable {

    private List<Observer> observers = new ArrayList<Observer>();

    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }


    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver() {

        for(Observer o : observers){
            o.update();
        }

    }
}
