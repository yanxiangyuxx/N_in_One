package com.yxy.sjms.decorator;

/**
 * Created by syyanxiangyu on 14-12-9.
 */
public class BigTrouser extends Finery {


    public void bigTrouserShow(){
        System.out.println("bigTrouser");
    }

    @Override
    public void show() {
        bigTrouserShow();
        super.show();
    }
}
