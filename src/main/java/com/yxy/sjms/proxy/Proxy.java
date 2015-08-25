package com.yxy.sjms.proxy;

/**
 * Created by syyanxiangyu on 2014/12/17.
 */
public class Proxy implements SendGift {
    
    private SendGift sendGiftMan;

    public Proxy(SendGift sendGiftMan) {
        this.sendGiftMan = sendGiftMan;
    }

    @Override
    public void sendFlower() {
        sendGiftMan.sendFlower();
    }

    @Override
    public void sendDoll() {
        sendGiftMan.sendDoll();
    }

    @Override
    public void sendChocolate() {
        sendGiftMan.sendChocolate();
    }
}
