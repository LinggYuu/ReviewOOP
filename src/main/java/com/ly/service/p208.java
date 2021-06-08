package com.ly.service;


//值传递
public class p208 {
    public static void main(String[] args) {

        System.out.println("***********基本数据类型***********");
        int m =10;
        int n =m;

        System.out.println("m="+m+",n="+n);
        n=20;
        System.out.println("m="+m+",n="+n);

        System.out.println("***********引用数据类型***********");


        order o1 = new order();
        o1.id=22;
        order o2 = o1;//赋值后，o1 o2地址值相同，都指向堆空间中同一个对象实体
        System.out.println(o1.id);
        System.out.println(o2.id);
        o2.id=33;
        //o1和o2指向了一个。。传的是地址
        System.out.println(o1.id);
        System.out.println(o2.id);

    }

}


class order{
    int id;
}
