package com.ly.p341;

public class AbstractTest {
    public static void main(String[] args) {
        Student a = new Student("ling",12,1);
        System.out.println(a);
        Person as = new Student("ling",2,2);
        System.out.println(as);
//        Person ss = new Person("s",2);  abstract后不能new了

    }
}

abstract class Creature{
    public abstract void breath();
}


abstract class Person extends Creature{
    String name;
    int age;

    public Person(){
        System.out.println("造了个wucan人");
    }
    public Person(String name, int age) {
        this.name = name;
        this.age = age;

        System.out.println("造了个人");
    }

    public abstract void eat();

    public abstract void walk();
}



class Student extends Person{

    int id;
    public Student(String name, int age,int id) {
        super(name,age);
        this.id = id;
        System.out.println("造了个学生");
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id=" + id +
                '}';
    }

    @Override
    public void eat() {
        System.out.println("学生多吃点");
    }

    @Override
    public void walk() {
        System.out.println("学生走路");
    }

    @Override
    public void breath() {
        System.out.println("学生呼吸");
    }
}

class Teacher extends Person{

    public Teacher(String name, int age) {
        super(name, age);
        System.out.println("造了个老师");
    }

    @Override
    public void eat() {
        System.out.println("老师少吃点");
    }

    @Override
    public void walk() {
        System.out.println("老师走路");
    }

    @Override
    public void breath() {
        System.out.println("老师呼吸");
    }
}