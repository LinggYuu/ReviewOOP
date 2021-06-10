package com.ly.p278;

public class Person {
    String name;
    int age;
    int id = 1;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
    public void eat(){
        System.out.println("人吃东西");
    }
    public void sleep(){
        System.out.println("人睡觉");
    }
    public void shit(){
        System.out.println("人拉屎");
    }

}
