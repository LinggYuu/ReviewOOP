package com.ly.p341;

public class AbstractTest {
    public static void main(String[] args) {
        Student a = new Student("ling",12,1);
        System.out.println(a);
        Person as = new Student("ling",2,2);
        System.out.println(as);
//        Person ss = new Person("s",2);  abstract����new��

    }
}


abstract class Person{
    String name;
    int age;

    public Person(){
        System.out.println("���˸�wucan��");
    }
    public Person(String name, int age) {
        this.name = name;
        this.age = age;

        System.out.println("���˸���");
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
        System.out.println("���˸�ѧ��");
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
        System.out.println("ѧ����Ե�");
    }

    @Override
    public void walk() {
        System.out.println("ѧ����·");
    }
}

class Teacher extends Person{

    public Teacher(String name, int age) {
        super(name, age);
        System.out.println("���˸���ʦ");
    }

    @Override
    public void eat() {
        System.out.println("��ʦ�ٳԵ�");
    }

    @Override
    public void walk() {
        System.out.println("��ʦ��·");
    }
}