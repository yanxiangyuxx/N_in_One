package com.yxy.sjms.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by syyanxiangyu on 2014/12/22.
 */
public abstract class CarModel {

    public List<String> sequence = new ArrayList<String>();

    public abstract void start();
    public abstract void stop();
    public abstract void alarm();
    public abstract void engineBoom();

    final public void run(){
        if(sequence!=null){
            for (String s : sequence){

                if(s.equals("start")){
                    this.start();

                }else if (s.equals("stop")){
                    this.stop();

                }else if (s.equals("alarm")){

                    this.alarm();
                }else if (s.equals("engineBoom")){
                    this.engineBoom();
                }
            }
        }
    }

    public List<String> getSequence() {
        return sequence;
    }

    public void setSequence(List<String> sequence) {
        this.sequence = sequence;
    }
}
