package com.yxy.sjms.strategy;

/**
 * Created by syyanxiangyu on 14-12-9.
 */
public class CashContext {

    private CashSuper cashSuper;

    public CashContext(CashSuper cashSuper) {
        this.cashSuper = cashSuper;
    }

    public double getResult(){
        return cashSuper.acceptCash();
    }



}






