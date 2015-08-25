package com.yxy.sjms.builder;

import java.util.List;

/**
 * Created by syyanxiangyu on 2014/12/22.
 */
public abstract class CarBuilder {

    public abstract CarModel getCarModel();

    public abstract void setSequence(List<String> sequence);
}
