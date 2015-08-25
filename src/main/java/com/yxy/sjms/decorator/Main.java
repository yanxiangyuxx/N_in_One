package com.yxy.sjms.decorator;

/**
 * Created by syyanxiangyu on 14-12-9.
 */
public class Main {

    public static void main(String arg[]){
        Person person =new Person("yanxiangyu");
        Tshirt tshirt = new Tshirt();
        BigTrouser bigTrouser = new BigTrouser();
        tshirt.dressUp(person);
        bigTrouser.dressUp(tshirt);
        bigTrouser.show();
    }
}
