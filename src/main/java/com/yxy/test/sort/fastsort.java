package com.yxy.test.sort;

/**
 * Created by syyanxiangyu on 2015/7/15.
 */
public class fastsort {

    public static void main(String[] args){
        int a[]={1,3,15,134,123,2,67,7,6,8,9};
        quick_sort(a);
    }

    public static int[] quick_sort(int[] arr) {
        qsort(arr, 0, arr.length - 1);
        for(int i=0;i < arr.length; i ++){

            System.out.print(arr[i]+",");
        }
        return arr;
    }

    private static void qsort(int[] arr, int low, int high) {
        int pivot;
        if (low < high) {
            pivot = partition(arr, low, high);
            qsort(arr, low, pivot);
            qsort(arr, pivot + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivotkey;
        pivotkey = arr[low];//ѡ��pivot���˴������Ż�
        while (low < high) {
            while (low < high && arr[high] >= pivotkey) {
                high--;
            }
            int t1 = arr[high];
            arr[high] = arr[low];
            arr[low] = t1;
            while (low < high && arr[low] <= pivotkey) {
                low++;
            }
            int t2 = arr[high];
            arr[high] = arr[low];
            arr[low] = t2;
        }
        return low;
    }
}
