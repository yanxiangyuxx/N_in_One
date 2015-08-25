package com.yxy.sjms.factory;

/**
 * Created by syyanxiangyu on 14-12-8.
 */
public class SubOperation extends Operation {
    @Override
    public double getResult(double num1, double num2) {
        return num1 - num2;
    }

    @Override
    public double getResult() {
        return super.getNum1()-super.getNum2();
    }
}
