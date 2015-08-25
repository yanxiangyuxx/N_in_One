package com.yxy.sjms.state;

/**
 * Created by syyanxiangyu on 2015/1/30.
 */
public class Context {

    public static final LiftState OPEN = new OpenLiftState();
    public static final LiftState CLOSE = new CloseLiftState();
    public static final LiftState RUN = new RunLiftState();
    public static final LiftState STOP = new StopLiftState();


    private LiftState liftState;

    public Context(){
    }

    public Context(LiftState liftState) {
        this.liftState = liftState;
    }

    public void run(){
        liftState.run();
    }

    public void stop(){
        liftState.stop();
    }

    public void open(){
        liftState.open();
    }

    public void close(){
        liftState.close();
    }


    public LiftState getLiftState() {
        return liftState;
    }

    public void setLiftState(LiftState liftState) {
        this.liftState = liftState;
    }
}
