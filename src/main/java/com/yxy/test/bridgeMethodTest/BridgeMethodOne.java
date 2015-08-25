package com.yxy.test.bridgeMethodTest;

/**
 * Created by syyanxiangyu on 2015/8/24.
 */
public class BridgeMethodOne {

    public static class BMOne {
        public Object getT(){
            return new Object();
        }
    }

    public static class BMTwo extends BMOne {
        public String getT() {
            return "123";
        }


    }

    public static void main(String[] args){
        BMTwo bmTwo = new BMTwo();
        System.out.println(bmTwo.getT());
    }
}
