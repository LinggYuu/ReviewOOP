package com.ly.service;


//方法形参的传递机制：值传递

//1.形参：方法定义时小括号内的参数
//2.实参：调用方法时实际传递给形参的值

//值传递机制:
//如果参数是基本数据类型,此时实参赋给形参的是实参真实存储的数据值
//如果参数是引用数据类型,此时看p210

//自认为:基本数据类型的传递在堆之中,一般是实际的复制.引用数据类型的传递在栈中的指向,一般是指向性的


public class p209 {
    public static void main(String[] args) {

        int[] arr = {1,4};
        new p209().swap(arr[0],arr[1]);
        System.out.println(arr[0]+","+arr[1]);
        new p209().swap(arr);
        System.out.println(arr[0]+","+arr[1]);
    }

    public void swap(int a ,int b){
        int t = a;
        a = b;
        b = t;
    }
// 上面的试了打咩

    public void swap(int[] arr){
        int t =arr[0];
        arr[0]= arr[1];
        arr[1]= t;

    }


}
