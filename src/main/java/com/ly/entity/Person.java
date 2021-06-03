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
        System.out.println(this.name+"吃了啥");
        food.foodname();
        System.out.println(name+"吃了"+food.name);
    }
    public void sleep(){
        System.out.println("我要睡了");
    }

}