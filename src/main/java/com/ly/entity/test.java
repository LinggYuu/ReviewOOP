package com.ly.entity;



public class test {
    public static void main(String[] args) {
        Person ap = new Person("yazan",22,true);
//        ap.eat();
        Person ap2 = new Person("lingyu",22,false);
//        ap2.eat();
        System.out.println(ap.name+"��HPΪ:"+ Person.HP);
        Person.HP -=20;
        System.out.println(ap2.name+"��HPΪ:"+Person.HP);
        System.out.println("hhhh");
    }
}
