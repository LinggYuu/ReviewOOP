package com.ly.p293;

public class EqualsTest {
    public static void main(String[] args) {
        int i =1;
        int j =1;
        double k =1.0;
        System.out.println(i==j);
        System.out.println(k==j);//自动类型提升了
        A a1 = new A();
        A a2 = new A();
        A a3 = a2;
        System.out.println(a1.equals(a2));
        System.out.println(a1==a2);
        System.out.println(a3.equals(a2));
        System.out.println(a3==a2);
    }

}
class A{
    int id;

}
