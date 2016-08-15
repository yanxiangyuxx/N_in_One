package com.yxy.test.string;


import java.util.Arrays;

/**
 * Created by syyanxiangyu on 2015/2/7.
 */
public class StringTest {

    public static void main(String[] args){
//        String[] strings = "2,3,4,".split(",");
//
//        System.out.println(strings);

        System.out.println(createSizeString(1024).getBytes().length);
    }

    //char 2个字节    英文时只占用低8位 只用一个字节  中文是占用2个字节
    public static String createSizeString(int size){

        char c[] = new char[size];
        Arrays.fill(c, 'f');
        return new String(c);
    }
}
