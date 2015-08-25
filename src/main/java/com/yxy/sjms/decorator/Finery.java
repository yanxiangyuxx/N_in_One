package com.yxy.sjms.decorator;

/**
 * Created by syyanxiangyu on 14-12-9.
 */
public class Finery extends Person {

    protected  Person person;

    public void dressUp(Person person){
        this.person = person;
    }
    @Override
    public void show() {
        person.show();
    }
}
