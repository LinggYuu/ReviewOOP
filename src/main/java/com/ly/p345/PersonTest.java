package com.ly.p345;

//形参直接new一个 匿名对象

//抽象类的匿名子类

public class PersonTest {

    public static void main(String[] args) {
        PersonTest.method(new Student());
        Person a = new Student();
        a.eat();
//        PersonTest.method1(new Person());因为Person是个抽象类所以new不了
        PersonTest.method1(new Student());
        PersonTest.method1(a);//非匿名的类非匿名的对象
        method1(new Student());//非匿名的类匿名的对象

        //创建了一个匿名子类的对象：p
        Person p = new Person() {
            @Override
            void eat() {
                System.out.println("吃le饭");
            }
        };//匿名类，new的是抽象类的匿名子类
        p.eat();

    }


    public static void method1(Person person){
        person.eat();
    }

    public static void method(Student student){

    }

}

abstract class  Person{
    String name;
    int age;
    abstract void eat();
}

class Student extends Person{
    int id;

    @Override
    void eat() {
        System.out.println("学生吃饭");
    }
}


