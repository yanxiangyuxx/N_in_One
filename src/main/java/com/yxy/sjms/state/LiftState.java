package com.yxy.sjms.state;

/**
 * Created by syyanxiangyu on 2015/1/30.
 */
public abstract class LiftState {

    protected Context context = new Context();

    public void setContext(LiftState liftState) {
        context.setLiftState(liftState);
    }

    public abstract void run();

    public abstract void stop();

    public abstract void open();

    public abstract void close();

}
