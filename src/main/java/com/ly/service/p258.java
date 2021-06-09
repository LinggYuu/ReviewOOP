package com.ly.service;

public class p258 {
    public static void main(String[] args) {
        aman s = new aman();
        s.sleep(2);
        s.setAge(12);
        System.out.println(s.getAge());
        s.Cname="ÁèÓî";

    }
}

class aman extends man{
    @Override
    public void sleep() {
        super.sleep();
    }
    public void sleep(int id){
        if(id>10){
            System.out.println("Ë¯¹»ÁË");

        }
        else{
            super.sleep();

        }
    }
}

class Creature{
    String Cname;


}


class man extends Creature{
    private String name;
    private int age;
    String major;

    public man() {
    }

    public man(String name, int age, String major) {
        this.name = name;
        this.age = age;
        this.major = major;
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

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void sleep(){
        System.out.println("Ë¯¾õ");
        study();
    }
    private void study(){
        System.out.println("Ñ§Ï°");
    }
}
