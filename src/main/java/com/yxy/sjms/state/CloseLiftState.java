package com.yxy.sjms.state;

/**
 * Created by syyanxiangyu on 2015/1/30.
 */
public class CloseLiftState extends LiftState {

    @Override
    public void run() {
        super.context.setLiftState(context.RUN);
        super.context.run();
    }

    @Override
    public void stop() {
        super.context.setLiftState(context.STOP);
        super.context.stop();
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
