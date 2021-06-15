package com.ly.p349;

//接口的使用
//    1.接口使用上满足多态性
//    2.接口实际上是一种规范，这里是USB的规范，限制了类
public class USBTest {


    public static void main(String[] args) {

        Computer1 com = new Computer1();
        //1.创建接口的非匿名实现类的非匿名对象
        Flash flash = new Flash();
        com.transferData(flash);

        //2.创建了接口的非匿名实现类的匿名对象
        com.transferData(new Printer());

        //3.创建接口的匿名实现类的非匿名对象
        USB phone = new USB() {
            @Override
            public void start() {
                System.out.println("手机开启工作");
            }

            @Override
            public void stop() {
                System.out.println("手机结束工作");
            }
        };
        com.transferData(phone);


        //4.创建接口的匿名实现类的匿名对象
        com.transferData(new USB() {
            @Override
            public void start() {
                System.out.println("匿名设备开启工作");
            }

            @Override
            public void stop() {
                System.out.println("匿名设备结束工作");
            }
        });



    }
}

abstract class ComputerObject{
    //电脑传输数据借助一个外部的设备
    public void transferData(USB usb){
         usb.start();
         transfer();
         usb.stop();
    }
    abstract void transfer();
}

class Computer1 extends ComputerObject{

    @Override
    void transfer() {
        System.out.println("电脑1具体传输数据...");
    }
}



interface USB{
    //常量：定义了长、宽、最大最小的传输速度等
    void start();
    void stop();
}

class Flash implements USB{


    @Override
    public void start() {
        System.out.println("U盘开启工作");
    }

    @Override
    public void stop() {
        System.out.println("U盘结束工作");
    }
}


class Printer implements USB{

    @Override
    public void start() {
        System.out.println("打印机开启工作");
    }

    @Override
    public void stop() {
        System.out.println("打印机结束工作");
    }
}