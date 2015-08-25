package com.yxy.sjms.decorator;

/**
 * Created by syyanxiangyu on 14-12-9.
 */
public class Tshirt extends Finery {


    public void showTshirt(){
        System.out.println("T-shirt");
    }

    @Override
    public void show() {
        showTshirt();
        super.show();
    }
}
