package com.ly.service;



//this关键字


public class p231 {

    public static void main(String[] args) {
        Student s = new Student(8,12);
        s.setAge(18);
        s.setId(2);
    }


}


class Student{
    private int id;
    private int age;


    //构造器的互调，通过this()
    public Student(){
        System.out.println("空参构造");
    }

    public Student(int id) {

        this();
        this.id = id;
        System.out.println("一参构造");
    }

    public Student(int id, int age) {
        //this(id)中，id是Student(int id, int age)中的id，
        // 然后去使用Student(int id)方法
        this(id);
//        this.id = id;
        this.age = age;
    }


    public int getId() {
        return id;
    }

    //this指实例化的对象，真实的那个
    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}