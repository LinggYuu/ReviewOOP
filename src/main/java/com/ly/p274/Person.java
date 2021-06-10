package com.ly.p274;

public class Person {
    int id;
    String name;

    public Person() {
        System.out.println("造了个人1");
    }

    public Person(int id, String name) {
        this.id = ++id;
        this.name = name;
        System.out.println("造了个人2,它的id为："+this.id);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
