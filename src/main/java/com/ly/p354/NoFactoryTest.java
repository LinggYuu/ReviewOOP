package com.ly.p354;

//无工厂模式

public class NoFactoryTest {

    public static void main(String[] args) {
        Car a = new Audi();
        Car b = new BYD();
        a.run();
        b.run();
    }


}


//将car做接口其实并不合适，它更应该为一个抽象父类，但是为了理解使用它作为父类
interface Car{
    void run();
}

class Audi implements Car{

    @Override
    public void run() {
        System.out.println("奥迪跑");
    }
}

class BYD implements Car{

    @Override
    public void run() {
        System.out.println("比亚迪跑");
    }
}

