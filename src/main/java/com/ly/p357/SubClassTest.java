package com.ly.p357;

//测试接口jdk8新特性

public class SubClassTest {
    public static void main(String[] args) {
        SubClass s  = new SubClass();
        CompareA.method1();
        //接口的静态方法实现类拿不到，只能接口自己用
        s.method2();
    }
}

class SubClass implements CompareA{

}