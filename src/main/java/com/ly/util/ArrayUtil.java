package com.ly.util;


//�Զ������鹤���� p202
public class ArrayUtil {

    //�����ֵ
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
