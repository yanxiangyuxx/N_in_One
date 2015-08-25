package com.yxy.test.recursion;

/**
 * 使用Java代码求数列：1，1，2，3，5，8......第40位的数
 * Created by syyanxiangyu on 2015/7/30.
 */
public class recursionDemo {

    public static void main(String[] args) {
        System.out.println(f(6));
    }

    public static int f(int n ) {
        if (1== n || 2 == n)
            return 1;
        else
            return f(n-1) + f(n-2);
    }


}
