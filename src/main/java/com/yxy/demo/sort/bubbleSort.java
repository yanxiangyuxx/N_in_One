package com.yxy.demo.sort;

/**
 * Created by syyanxiangyu on 2015/7/16.
 */
public class bubbleSort {



    public static void main(String[] args){
        int a[] = {2,3,8,66,87,54,22,35};
        for(int i = 0; i<a.length   ; i++){
            for(int j = i+1 ; j<a.length; j ++){
                if (a[i]>a[j]){
                    int t =a[i];
                    a[i]=a[j];
                    a[j]=t;
                }

            }

        }

        for(int i =0; i< a.length ; i ++){
            System.out.print(a[i]+",");
        }
    }
}
