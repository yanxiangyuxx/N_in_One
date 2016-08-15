package com.yxy.test.charTest;

/**
 * Created by 58 on 2016/6/30.
 */
public class CharTest {

    /**
     * char到底占了多少字节？
     由于英文字母比较特殊，源自于8位（1字节）的ASCII码。于是在unicode中使用低8位（1字节）就可以表示，高8位不使用也无所谓；--------存储到内存中就只使用了1字节
     但汉字就使用了完整的16位unicode；--------存储到内存中就使用了2字节

     * @param args
     */
    public static void main(String[] args){
        char c1 ='a';
        char c2 ='中';

        System.out.println(Character.charCount(c1));
        System.out.println(Character.charCount(c2));

    }
}
