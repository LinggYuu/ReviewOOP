package com.ly.service;




////方法形参的传递机制：值传递
//引用数据类型:
//    如果参数是基本数据类型,此时实参赋给形参的是实参真实存储的数据值
//    如果参数是引用数据类型,此时实参赋给形参的是实参存储数据的地址值



public class p210 {

    public static void main(String[] args) {

        Data data = new Data();
        data.m=10;
        data.n=20;
        System.out.println("m="+data.m+",n="+data.n);
        //交换m和n
        new p210().swap(data);
        System.out.println("m="+data.m+",n="+data.n);
    }

    public void swap(Data data){
        int t = data.m;
        data.m = data.n;
        data.n = t;
    }

}


class Data{
    int m;
    int n;
}