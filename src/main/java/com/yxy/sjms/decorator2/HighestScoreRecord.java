package com.yxy.sjms.decorator2;

/**
 * Created by syyanxiangyu on 14-12-10.
 */
public class HighestScoreRecord extends Decorator {


    public HighestScoreRecord(SchoolRecord schoolRecord) {
        super(schoolRecord);
    }


    public void syaHigestScore(){
        System.out.println("最高分61");
    }

    @Override
    public void report() {
        syaHigestScore();
        super.report();
    }

    @Override
    public void sign() {
        super.sign();
    }
}
