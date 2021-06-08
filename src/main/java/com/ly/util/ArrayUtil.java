package com.ly.util;


//自定义数组工具类 p202
public class ArrayUtil {

    //求最大值
    public int getMax(int[] arr){
        int max = 0;
        for(int i =0;i<arr.length;i++){
            if (arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }

}
