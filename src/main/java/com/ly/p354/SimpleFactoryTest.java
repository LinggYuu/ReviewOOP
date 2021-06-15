package com.ly.p354;



//�����ĵ����ߣ�����ֻ���ã����ʱ���ù���
public class SimpleFactoryTest {
    public static void main(String[] args) {
            Car1 car = CarFactory.getCar("�µ�");
            car.run();
    }
}



//��car���ӿ���ʵ�������ʣ�����Ӧ��Ϊһ�������࣬����Ϊ�����ʹ������Ϊ����
interface Car1{
    void run();
}
class Audi1 implements Car1{

    @Override
    public void run() {
        System.out.println("�µ���");
    }
}

class BYD1 implements Car1{

    @Override
    public void run() {
        System.out.println("���ǵ���");
    }
}

class CarFactory{
    //��ʽһ
    public static Car1 getCar(String name){
        if(name.equals("�µ�")){
            return new Audi1();
        }else if (name.equals("���ǵ�")){
            return new BYD1();
        }
        return null;
    }

    //��ʽ��
    public static Car1 getAudi(){
        return new Audi1();
    }
    public static Car1 getBYD(){
        return new BYD1();
    }


}