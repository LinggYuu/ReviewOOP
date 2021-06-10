package com.ly.p273test;

import com.ly.service.p273;


//不同包下的非子类
public class Order2 {
    public static void main(String[] args) {
        p273 a = new p273();
        a.order4=4;
        a.m4();
        Order2 s = new Order2();
        s.show(new p273());
    }

    public void show(p273 aa){
        aa.order4=3;
        aa.m4();
    }

}
