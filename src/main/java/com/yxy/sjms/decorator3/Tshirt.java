package com.yxy.sjms.decorator3;

/**
 * Created by syyanxiangyu on 14-12-12.
 */
public class Tshirt extends Decorator {

    public Tshirt(Person person) {
        super(person);
    }
    public void showTshirt(){
        System.out.println("T-shirt");
    }

    @Override
    public void show() {
        showTshirt();
        super.show();
    }
}
