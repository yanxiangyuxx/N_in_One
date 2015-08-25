package com.yxy.sjms.state;

/**
 * Created by syyanxiangyu on 2015/1/30.
 */
public class StopLiftState extends LiftState {

    @Override
    public void run() {

        super.context.setLiftState(context.RUN);
        super.context.run();
    }

    @Override
    public void stop() {
        System.out.println("电梯停止运行");
    }

    @Override
    public void open() {
        super.context.setLiftState(context.OPEN);
        super.context.open();
    }

    @Override
    public void close() {
        System.out.println("电梯门关闭");
    }
}
