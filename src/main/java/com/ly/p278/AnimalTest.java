package com.ly.p278;



//��̬�Ծ���

import java.sql.Connection;

public class AnimalTest {
    public static void main(String[] args) {
        AnimalTest t = new AnimalTest();
        Dog dog = new Dog();
        t.fun(dog);//Animal animal = new Dog();
        t.fun(new Cat());
    }
    public void fun(Animal animal){
        //��Ϊ��������Animal���͵�,�ڱ�����ֻ�ܵ���Animal�ķ���,ʵ�����е�������ķ���
        animal.eat();
        animal.shout();
    }

//    //���û�ж�̬��,����Ҫд����fun����
//    public void fun(Dog dog){dog.eat();dog.shout();}
//    public void fun(Cat cat){cat.eat();cat.shout();}
    //��̬�Խ�Լ�˴�����,�����˽ӿ�?
}


class Animal{
    public void eat(){
        System.out.println("�����");
    }
    public void shout(){
        System.out.println("�����");
    }
}

class Dog extends Animal{
    @Override
    public void eat() {
        System.out.println("����");
    }

    @Override
    public void shout() {
        System.out.println("����");
    }
}

class Cat extends Animal{
    @Override
    public void eat() {
        System.out.println("è��");
    }

    @Override
    public void shout() {
        System.out.println("è��");
    }
}


//����2
class Method{
    public void method(Object o){ }
}

//����3:sql
class Driver{
    public void doData(Connection conn){}
    //��ʱ����ʵ��ֻ����conn���������,����ʱ�ɵ���Connection�����ķ���,ִ��ʱִ�е��Ǿ�����������д�ķ���
}


