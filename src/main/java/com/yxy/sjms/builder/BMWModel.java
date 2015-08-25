package com.yxy.sjms.builder;

/**
 * Created by syyanxiangyu on 2014/12/22.
 */
public class BMWModel extends CarModel {
    @Override
    public void start() {
        System.out.println("BMW start");
    }

    @Override
    public void stop() {
        System.out.println("BMW stop");
    }

    @Override
    public void alarm() {
        System.out.println("BMW alarm");
    }

    @Override
    public void engineBoom() {
        System.out.println("BMW engineBoom");
    }
}
