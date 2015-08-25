package com.yxy.sjms.template;

/**
 * Created by syyanxiangyu on 2014/12/19.
 */
public abstract class HummerModel {

    protected abstract void start();

    protected abstract void stop();

    protected abstract void alarm();

    protected abstract void engineBoom();

    final public void run(){

        start();

        engineBoom();

        if(isAlarm()){

            alarm();
        }

        stop();
    }

    protected boolean isAlarm(){
        return true;
    };

}
