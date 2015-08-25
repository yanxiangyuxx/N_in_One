package com.yxy.sjms.strategy;

/**
 * Created by syyanxiangyu on 14-12-9.
 */
public class CashReturn extends CashSuper {
    @Override
    public double acceptCash() {
        return 3;
    }
}
