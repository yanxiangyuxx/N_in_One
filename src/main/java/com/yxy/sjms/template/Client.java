package com.yxy.sjms.template;

/**
 * Created by syyanxiangyu on 2014/12/19.
 */
public class Client {


    public static void main(String[] arg){
        HummerH1 hummerH1 = new HummerH1();
        HummerH2 hummerH2 = new HummerH2();
        hummerH1.setAlarmFlag(true);
        hummerH1.run();
        hummerH2.run();
    }
}
