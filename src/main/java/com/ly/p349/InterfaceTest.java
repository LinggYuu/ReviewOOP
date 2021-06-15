package com.ly.p349;

public class InterfaceTest {
    public static void main(String[] args) {
        int minSpeed = Flyable.MIN_SPEED;
        System.out.println(minSpeed);
    }
}



interface Flyable{
    //接口中的常量都是public static final的,就算不写也是public static final的
    public static final int MAX_SPEED = 7900;
    int MIN_SPEED = 1;//其实是public static final MIN_SPEED=1;


    //接口中的方法都是public abstract的,就算不写也是public abstract的
    public abstract void fly();
    void stop();//    其实public abstract void stop();

}

interface Attackable{
    void attack();
}


abstract class kite implements Flyable{
    @Override
    public void fly() {

    }
    public abstract void stop();
}

class plane implements Flyable{

    @Override
    public void fly() {
        System.out.println("飞机飞");
    }

    @Override
    public void stop() {
        System.out.println("飞机停止");
    }

}


class Bullet extends Object implements Flyable,Attackable{

    @Override
    public void fly() {
        System.out.println("让子弹飞");
    }

    @Override
    public void stop() {
        System.out.println("子弹射中我后停了下来");
    }

    @Override
    public void attack() {
        System.out.println("子弹把我打死");
    }
}

class BBBullet extends Bullet{

}

interface AA{
    void method1();
}

interface BB{
    void method2();
}

interface CC extends AA,BB{
    void method3();
}

class DD implements CC{

    @Override
    public void method1() {

    }

    @Override
    public void method2() {

    }

    @Override
    public void method3() {

    }
}