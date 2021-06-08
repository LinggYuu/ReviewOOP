package com.ly;

import com.ly.util.ArrayUtil;





public class OOP {

    public static void main(String[] args) {
        int[] arr ={2,3,4,1123,3213,43233,2,123,124,1312,32423,212,2312,221312,12};
        ArrayUtil util = new ArrayUtil();
        int max = util.getMax(arr);
        System.out.println(max);
        Array aa =new Array();
        aa.a= new int[]{3, 4,42,321,22,3321,4311};

        System.out.println(util.getMax(aa.a));
    }
}

class Array{
    int[] a;
}