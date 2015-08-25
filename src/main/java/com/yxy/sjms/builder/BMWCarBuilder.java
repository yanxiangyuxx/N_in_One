package com.yxy.sjms.builder;

import java.util.List;

/**
 * Created by syyanxiangyu on 2014/12/22.
 */
public class BMWCarBuilder extends CarBuilder {

    private BMWModel bmwModel = new BMWModel();


    public BMWModel getBmwModel() {
        return bmwModel;
    }

    @Override
    public CarModel getCarModel() {
        return this.bmwModel;
    }

    @Override
    public void setSequence(List<String> sequence) {

        this.bmwModel.setSequence(sequence);
    }
}
