package com.yxy.sjms.observer2;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by syyanxiangyu on 2015/1/19.
 */
public class Boss extends Observable {

    public void moving(){
        this.setChanged();
    }


    @Override
    public synchronized void addObserver(Observer o) {
        super.addObserver(o);
    }

    @Override
    public synchronized void deleteObserver(Observer o) {
        super.deleteObserver(o);
    }

    @Override
    public void notifyObservers() {
        super.notifyObservers();
    }

    @Override
    public void notifyObservers(Object arg) {
        super.notifyObservers(arg);
    }
}
