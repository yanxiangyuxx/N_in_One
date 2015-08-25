package com.yxy.sjms.decorator2;

/**
 * Created by syyanxiangyu on 14-12-10.
 */
public class RankingRecord extends Decorator {


    public RankingRecord(SchoolRecord schoolRecord) {
        super(schoolRecord);
    }


    public void sayRanking(){
        System.out.println("排名第十");
    }
    @Override
    public void report() {
        System.out.println("排名第十");
        super.report();
    }

    @Override
    public void sign() {
        super.sign();
    }
}
