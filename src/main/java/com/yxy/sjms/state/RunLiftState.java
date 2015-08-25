package com.yxy.sjms.state;

/**
 * Created by syyanxiangyu on 2015/1/30.
 */
public class RunLiftState extends LiftState {

    @Override
    public void run() {
        System.out.println("电梯开始运行");
    }

    @Override
    public void stop() {
        super.context.setLiftState(context.STOP);
        super.context.stop();
    }

    @Override
    public void open() {

    }

    @Override
    public void close() {

    }
}
