package com.yxy.sjms.strategy;

/**
 * Created by syyanxiangyu on 2014/12/17.
 */
public class Main {

    public static void main(String[] args){

        CashContext cashContext = new CashContext(new CashNoraml());


        System.out.print(cashContext.getResult());


    }
}
