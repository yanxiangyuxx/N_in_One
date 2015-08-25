package com.yxy.sjms.template;

/**
 * Created by syyanxiangyu on 2014/12/19.
 */
public class HummerH2 extends HummerModel {
    @Override
    protected void start() {
        System.out.println("H2 启动");
    }

    @Override
    protected void stop() {
        System.out.println("H2 停止");
    }

    @Override
    protected void alarm() {
        System.out.println("H2 鸣哔");
    }

    @Override
    protected void engineBoom() {
        System.out.println("H2 发出轰轰声");
    }

    @Override
    protected boolean isAlarm() {
        return false;
    }


}
