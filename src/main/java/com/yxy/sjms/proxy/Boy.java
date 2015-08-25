package com.yxy.sjms.proxy;

/**
 * Created by syyanxiangyu on 2014/12/17.
 */
public class Boy implements SendGift {



    @Override
    public void sendFlower() {
        System.out.println("boy sendFlower");

    }

    @Override
    public void sendDoll() {
        System.out.println("boy sendDoll");
    }

    @Override
    public void sendChocolate() {
        System.out.println("boy sendChocolate");
    }
}
