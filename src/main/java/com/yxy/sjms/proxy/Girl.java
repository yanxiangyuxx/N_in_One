package com.yxy.sjms.proxy;

/**
 * Created by syyanxiangyu on 2014/12/17.
 */
public class Girl {

    private String name;

    public Girl(String name) {
        this.name = name;
    }

    public static void main(String[] args){

        Boy boy = new Boy();
        Proxy proxy= new Proxy(boy);

        proxy.sendFlower();
        proxy.sendDoll();
        proxy.sendChocolate();

        BadBoy badBoy = new BadBoy();
        proxy = new Proxy(badBoy);
        proxy.sendFlower();
        proxy.sendDoll();
        proxy.sendChocolate();
    }
}
