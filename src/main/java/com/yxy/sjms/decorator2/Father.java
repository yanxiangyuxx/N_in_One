package com.yxy.sjms.decorator2;

/**
 * Created by syyanxiangyu on 14-12-10.
 */
public class Father {

    public static void main(String arg[]){
        SchoolRecord sr;
        sr = new MySchoolRecord();
        sr = new HighestScoreRecord(sr);
        sr = new RankingRecord(sr);

        sr.report();



    }
}
