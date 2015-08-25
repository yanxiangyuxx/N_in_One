package com.yxy.sjms.decorator3;

/**
 * Created by syyanxiangyu on 14-12-12.
 */
public class Main {

    public static void main(String arg[]){
        Person person;
        person = new Yanxiangyu();
        person = new Tshirt(person);
        person = new Tie(person);
        person.show();
    }
}
