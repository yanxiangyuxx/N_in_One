package com.yxy.sjms.decorator;

/**
 * Created by syyanxiangyu on 14-12-9.
 */
public class Person {

    protected String name;

    public Person(){

    }

    public Person(String name) {
        this.name = name;
    }

    public void show(){
        System.out.println("装扮的" + name);
    }
}
