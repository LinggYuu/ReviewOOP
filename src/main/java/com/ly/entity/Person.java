package com.ly.entity;




public class Person {
    String name;
    int age;
    boolean isMale;
    static int HP = 100;

    Food food = new Food();
    public Person(String name, int age, boolean isMale) {
        this.name = name;
        this.age = age;
        this.isMale = isMale;
    }

    public void eat(){
        System.out.println(this.name+"����ɶ");
        food.foodname();
        System.out.println(name+"����"+food.name);
    }
    public void sleep(){
        System.out.println("��Ҫ˯��");
    }

}