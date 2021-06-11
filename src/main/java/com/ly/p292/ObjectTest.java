package com.ly.p292;

public class ObjectTest {

    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        Person ap = new Person();
        System.out.println(new Object().getClass().equals(ap.getClass().getSuperclass()));
        int i = ap.hashCode();
        Class aClass = ap.getClass();
        Person o1 = (Person)aClass.newInstance();
        System.out.println(o1);
        Class personClass = Person.class;
        Person o = (Person) personClass.newInstance();
        System.out.println(o);
        System.out.println(ap);
    }

}

class Person{

}
