package com.ly.p331;

public class Test {
    public static void main(String[] args) {
        Order o = new Order();
        System.out.println(o.id);
    }
}
class Order{
    int id =3;
    {
        id = 4;
    }
}
