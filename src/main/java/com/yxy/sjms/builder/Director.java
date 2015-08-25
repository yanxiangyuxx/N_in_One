package com.yxy.sjms.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by syyanxiangyu on 2014/12/22.
 */
public class Director {

    private List<String> s = new ArrayList<String>();
    private BenzCarBuilder benzCarBuilder = new BenzCarBuilder();
    private BMWCarBuilder bmwCarBuilder = new BMWCarBuilder();


    public CarModel getCarBenzA(){
        s.clear();
        s.add("start");
        s.add("stop");
        this.benzCarBuilder.setSequence(s);
        return this.benzCarBuilder.getCarModel();
    }

    public CarModel getCarBenzB(){
        s.clear();
        s.add("start");
        s.add("alarm");
        s.add("stop");
        this.benzCarBuilder.setSequence(s);
        return this.benzCarBuilder.getCarModel();
    }

    public CarModel getCarBMWA(){
        s.clear();
        s.add("start");
        s.add("engineBoom");
        this.bmwCarBuilder.setSequence(s);
        return this.bmwCarBuilder.getCarModel();
    }

    public CarModel getCarBMWB(){
        s.clear();
        s.add("start");
        s.add("engineBoom");
        s.add("alarm");
        s.add("stop");
        this.bmwCarBuilder.setSequence(s);
        return this.bmwCarBuilder.getCarModel();
    }
}
