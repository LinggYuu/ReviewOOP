package com.ly.p323;

public class SingletonTest {
    public static void main(String[] args) {
        Bank2 b1 = Bank2.getInstance();
        Bank2 b2 = Bank2.getInstance();
        boolean b = b1.equals(b2);
        System.out.println(b);
    }
}


//饿汉式，在调用getInstance方法前就已经有这个instance了
class Bank{
    //1.私有化构造器，目的是不让类外边造对象
    private Bank(){

    }

    //2.内部创建类的对象，要求该对象也声明为静态的
    private static Bank instance = new Bank();


    //提供公共的静态方法，返回类的对象
    public static Bank getInstance(){
        return instance;
    }
}

//懒汉式，啥时候用，啥时候造
class Bank2{

    //1.私有化类的构造器
    private Bank2(){}

    //2.声明当前类的对象，也要声明为static  没有初始化
    private static Bank2 instance = null;

    //3.声明公共静态方法
    public static Bank2 getInstance(){
//        instance = new Bank2(); 不能这么写，这样写的话每次都是一个新的
        if(instance == null){//说明还没有初始化
            instance = new Bank2();
        }
        return instance;
    }


}