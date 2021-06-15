package com.ly.p354;



//独立的调用者，尽量只调用，造的时候用工厂
public class SimpleFactoryTest {
    public static void main(String[] args) {
            Car1 car = CarFactory.getCar("奥迪");
            car.run();
    }
}



//将car做接口其实并不合适，它更应该为一个抽象父类，但是为了理解使用它作为父类
interface Car1{
    void run();
}
class Audi1 implements Car1{

    @Override
    public void run() {
        System.out.println("奥迪跑");
    }
}

class BYD1 implements Car1{

    @Override
    public void run() {
        System.out.println("比亚迪跑");
    }
}

class CarFactory{
    //方式一
    public static Car1 getCar(String name){
        if(name.equals("奥迪")){
            return new Audi1();
        }else if (name.equals("比亚迪")){
            return new BYD1();
        }
        return null;
    }

    //方式二
    public static Car1 getAudi(){
        return new Audi1();
    }
    public static Car1 getBYD(){
        return new BYD1();
    }


}