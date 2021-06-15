package com.ly.p349;

public class InterfaceTest {
    public static void main(String[] args) {
        int minSpeed = Flyable.MIN_SPEED;
        System.out.println(minSpeed);
    }
}



interface Flyable{
    //�ӿ��еĳ�������public static final��,���㲻дҲ��public static final��
    public static final int MAX_SPEED = 7900;
    int MIN_SPEED = 1;//��ʵ��public static final MIN_SPEED=1;


    //�ӿ��еķ�������public abstract��,���㲻дҲ��public abstract��
    public abstract void fly();
    void stop();//    ��ʵpublic abstract void stop();

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
        System.out.println("�ɻ���");
    }

    @Override
    public void stop() {
        System.out.println("�ɻ�ֹͣ");
    }

}


class Bullet extends Object implements Flyable,Attackable{

    @Override
    public void fly() {
        System.out.println("���ӵ���");
    }

    @Override
    public void stop() {
        System.out.println("�ӵ������Һ�ͣ������");
    }

    @Override
    public void attack() {
        System.out.println("�ӵ����Ҵ���");
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