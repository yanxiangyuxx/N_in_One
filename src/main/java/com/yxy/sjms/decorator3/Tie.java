package com.yxy.sjms.decorator3;

/**
 * Created by syyanxiangyu on 14-12-12.
 */
public class Tie extends Decorator {

    public Tie(Person person) {
        super(person);
    }

    public void  showTie(){
        System.out.println("tie");
    }

    @Override
    public void show() {
        this.showTie();
        super.show();
    }
}
