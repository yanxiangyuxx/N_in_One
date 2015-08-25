package com.yxy.sjms.state;

/**
 * Created by syyanxiangyu on 2015/1/30.
 */
public class OpenLiftState extends LiftState {

    @Override
    public void run() {

    }

    @Override
    public void stop() {

    }

    @Override
    public void open() {
        System.out.println("电梯门开启");
    }

    @Override
    public void close() {
        super.context.setLiftState(context.CLOSE);
        super.context.close();
    }
}
