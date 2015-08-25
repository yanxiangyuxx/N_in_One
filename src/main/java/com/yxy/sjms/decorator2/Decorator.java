package com.yxy.sjms.decorator2;

/**
 * Created by syyanxiangyu on 14-12-10.
 */
public class Decorator extends SchoolRecord {

    private SchoolRecord schoolRecord;

    public Decorator(SchoolRecord schoolRecord) {
        this.schoolRecord = schoolRecord;
    }

    @Override
    public void report() {
        this.schoolRecord.report();
    }

    @Override
    public void sign() {
        this.schoolRecord.report();
    }
}
