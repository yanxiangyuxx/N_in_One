package com.yxy.sjms.factory;

/**
 * Created by syyanxiangyu on 14-12-8.
 */
public abstract class Operation {

    public double num1;
    public double num2;

    public abstract double getResult(double num1, double num2);

    public abstract double getResult();


    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }
}
