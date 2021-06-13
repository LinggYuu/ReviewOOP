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


abstract class Person{
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
class ss{
    public abstract void sss(){

    }
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
}