package com.ly.p357;

//接口 java8新特性
//除了定义全局常量和抽象方法之外，还可以定义静态方法、默认方法

public class IterfaceJava8Test {
    public static void main(String[] args) {
        CompareA.method1();
        CompareA compareA = new B();
        compareA.method3();
    }
}


interface CompareA{

//    静态方法

    public static void method1(){
        System.out.println("method1");
    }

//    默认方法，实现类里这是一个普通的非静态的方法

    public default void method2(){
        System.out.println("method2");
    }

    //省略了public，其实还是public的
    default void method3(){
        System.out.println("method3");
    }
}

class B implements CompareA{

}