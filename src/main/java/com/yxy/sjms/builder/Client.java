package com.yxy.sjms.builder;

/**
 * Created by syyanxiangyu on 2014/12/22.
 */
public class Client {

//    public static void main(String[] arg){
//        List<String> s = new ArrayList<String>();
//
//        s.add("start");
//        s.add("stop");
//        BenzCarBuilder benzCarBuilder = new BenzCarBuilder();
//
//        CarModel benz =benzCarBuilder.getBenzModel();
//        benz.setSequence(s);
//        benz.run();
//
//    }


    public static void main(String[] arg){
        Director director = new Director();
        director.getCarBenzA().run();
        director.getCarBenzB().run();
        director.getCarBMWA().run();
        director.getCarBMWB().run();
    }
}
