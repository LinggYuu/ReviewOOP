package com.ly.p354;

//�޹���ģʽ

public class NoFactoryTest {

    public static void main(String[] args) {
        Car a = new Audi();
        Car b = new BYD();
        a.run();
        b.run();
    }


}


//��car���ӿ���ʵ�������ʣ�����Ӧ��Ϊһ�������࣬����Ϊ�����ʹ������Ϊ����
interface Car{
    void run();
}

class Audi implements Car{

    @Override
    public void run() {
        System.out.println("�µ���");
    }
}

class BYD implements Car{

    @Override
    public void run() {
        System.out.println("���ǵ���");
    }
}

