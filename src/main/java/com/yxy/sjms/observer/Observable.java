package com.yxy.sjms.observer;

/**
 * Created by syyanxiangyu on 2014/12/24.
 */
public interface Observable {


    public void attach(Observer observer);

    public void detach(Observer observer);

    public void notifyObserver();


}
