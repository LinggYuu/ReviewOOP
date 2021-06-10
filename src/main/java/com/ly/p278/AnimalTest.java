package com.ly.p278;



//多态性举例

import java.sql.Connection;

public class AnimalTest {
    public static void main(String[] args) {
        AnimalTest t = new AnimalTest();
        Dog dog = new Dog();
        t.fun(dog);//Animal animal = new Dog();
        t.fun(new Cat());
    }
    public void fun(Animal animal){
        //因为声明的是Animal类型的,在编译期只能调用Animal的方法,实际运行的是子类的方法
        animal.eat();
        animal.shout();
    }

//    //如果没有多态性,则需要写两个fun方法
//    public void fun(Dog dog){dog.eat();dog.shout();}
//    public void fun(Cat cat){cat.eat();cat.shout();}
    //多态性节约了代码量,减少了接口?
}


class Animal{
    public void eat(){
        System.out.println("动物吃");
    }
    public void shout(){
        System.out.println("动物叫");
    }
}

class Dog extends Animal{
    @Override
    public void eat() {
        System.out.println("狗吃");
    }

    @Override
    public void shout() {
        System.out.println("狗叫");
    }
}

class Cat extends Animal{
    @Override
    public void eat() {
        System.out.println("猫吃");
    }

    @Override
    public void shout() {
        System.out.println("猫叫");
    }
}


//举例2
class Method{
    public void method(Object o){ }
}

//举例3:sql
class Driver{
    public void doData(Connection conn){}
    //此时传的实参只需是conn的子类就行,编译时可调用Connection声明的方法,执行时执行的是具体子类中重写的方法
}


