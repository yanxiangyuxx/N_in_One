package com.yxy.sjms.singleton;

/**
 * Created by syyanxiangyu on 2015/8/25.
 */
public class Singleton {
    private static Singleton sin;


    public static Singleton init(){

        if (sin==null){

            synchronized (Singleton.class){

                if(sin==null){
                    sin = new Singleton();
                }
            }
        }
        return sin;
    }

}
