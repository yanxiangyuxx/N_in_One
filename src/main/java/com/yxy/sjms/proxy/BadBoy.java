package com.yxy.sjms.proxy;

/**
 * Created by syyanxiangyu on 2014/12/17.
 */
public class BadBoy implements SendGift {
    @Override
    public void sendFlower() {
        System.out.println("BadBoy sendFlower");

    }

    @Override
    public void sendDoll() {
        System.out.println("BadBoy sendDoll");
    }

    @Override
    public void sendChocolate() {
        System.out.println("BadBoy sendChocolate");
    }
}
