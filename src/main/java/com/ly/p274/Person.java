package com.ly.p274;

public class Person {
    int id;
    String name;

    public Person() {
        System.out.println("���˸���1");
    }

    public Person(int id, String name) {
        this.id = ++id;
        this.name = name;
        System.out.println("���˸���2,����idΪ��"+this.id);
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
