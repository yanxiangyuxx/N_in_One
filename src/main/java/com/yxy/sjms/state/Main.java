package com.yxy.sjms.state;

/**
 * Created by syyanxiangyu on 2015/1/30.
 */
public class Main {

    public static void main(String[] args){

        Context context = new Context(new StopLiftState());

        context.open();
        context.close();
        context.run();
        context.stop();
    }
}
