package com.yxy.test.integerTest;

/**
 * Created by 58 on 2016/6/16.
 */
public class integerAndIntCompare {

    public static void main(String[] args) {
        Integer a = new Integer(1);
        Integer b = new Integer(1);
        int c=1;
        Integer d = 1;
        Integer e = 1;

        Integer f = 128;
        Integer g = 128;
        Integer h = new Integer(128);
        int i = 128;
        System.out.println("a==b:"+(a==b));
        System.out.println("a==c:"+(a==c));
        System.out.println("a==e:"+(a==e));
        System.out.println("c==e:"+(c==e));
        System.out.println("d==e:"+(d==e));
        System.out.println("f==g:"+(f==g));
        System.out.println("h==i:"+(h==i));
    }

//    结果：
//    a==b:false
//    a==c:true
//    a==e:false
//    c==e:true
//    d==e:true
//    f==g:false
//    h==i:true


//    ①无论如何，Integer与new Integer不会相等。不会经历拆箱过程，i3的引用指向堆，而i4指向专门存放他的内存（常量池），他们的内存地址不一样，所以为false
//    ②两个都是非new出来的Integer，如果数在-128到127之间，则是true,否则为false
//    java在编译Integer i2 = 128的时候,被翻译成-> Integer i2 = Integer.valueOf(128);而valueOf()函数会对-128到127之间的数进行缓存
//    ③两个都是new出来的,都为false
//    ④int和integer(无论new否)比，都为true，因为会把Integer自动拆箱为int再去比
}
