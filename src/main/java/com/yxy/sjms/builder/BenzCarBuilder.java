package com.yxy.sjms.builder;

import java.util.List;

/**
 * Created by syyanxiangyu on 2014/12/22.
 */
public class BenzCarBuilder extends CarBuilder {

    private BenzModel benzModel = new BenzModel();


    public BenzModel getBenzModel() {
        return benzModel;
    }

    @Override
    public CarModel getCarModel() {
        return this.benzModel;
    }

    @Override
    public void setSequence(List<String> sequence) {

        this.benzModel.setSequence(sequence);

    }
}
