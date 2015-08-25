package com.yxy.sjms.singleton;

/**
 * Created by syyanxiangyu on 2015/8/25.
 */
public class Singeton2 {

    private static Singeton2 sin = new Singeton2();

    private Singeton2(){

    }
    public Singeton2 getInstance(){
        return sin;
    }


}
