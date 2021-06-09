package com.ly.service;

public class p224 {

    public static void main(String[] args) {
        Person  a = new Person(1,22);
        System.out.println(a.age);
        Person aa = new Person();
    }


}

class Person{


    public Person(){
        System.out.println("dddddd");
    }

    public Person(int id, int age) {
        this.id = id;
        this.age = age;
    }

    int id;
    int age;

}