package com.yxy.sjms.decorator2;

/**
 * Created by syyanxiangyu on 14-12-10.
 */
public class MySchoolRecord extends SchoolRecord {
    @Override
    public void report() {
        System.out.println("数学60 语文70 英语50");
    }

    @Override
    public void sign() {
        System.out.println("签字");
    }
}
