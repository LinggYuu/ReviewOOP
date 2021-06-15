package com.ly.p354;


//��������ģʽ
//����Ҳ���˽ӿ�

public class FactoryMethodTest {
    public static void main(String[] args) {
        CarFactory2 carFactory2 = new BYDFactory();
        Car car = carFactory2.getCar();
        car.run();
    }
}

interface Car2{
    void run();
}

class Audi2 implements Car2{

    @Override
    public void run() {
        System.out.println("�µ���");
    }
}

class BYD2 implements Car2{

    @Override
    public void run() {
        System.out.println("���ǵ���");
    }
}


interface CarFactory2{
    Car getCar();
}

class AudiFactory implements CarFactory2{

    @Override
    public Car getCar() {
        return new Audi();
    }
}
class BYDFactory implements CarFactory2{

    @Override
    public Car getCar() {
        return new BYD();
    }
}
