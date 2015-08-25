package com.yxy.sjms.decorator3;

/**
 * Created by syyanxiangyu on 14-12-12.
 */
public class Decorator extends Person {

    private Person person;

    public Decorator(Person person) {
        this.person = person;
    }

    @Override
    public void show() {
        this.person.show();
    }
}
