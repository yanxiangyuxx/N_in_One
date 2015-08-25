package com.yxy.sjms.template;

/**
 * Created by syyanxiangyu on 2014/12/19.
 */
public class HummerH1 extends HummerModel {

    private boolean alarmFlag;

    @Override
    protected void start() {
        System.out.println("H1 启动");
    }

    @Override
    protected void stop() {
        System.out.println("H1 停止");
    }

    @Override
    protected void alarm() {
        System.out.println("H1 鸣哔");
    }

    @Override
    protected void engineBoom() {
        System.out.println("H1 发出轰轰声");
    }

    @Override
    protected boolean isAlarm() {
        return alarmFlag;
    }



    public boolean isAlarmFlag() {
        return alarmFlag;
    }

    public void setAlarmFlag(boolean alarmFlag) {
        this.alarmFlag = alarmFlag;
    }
}
