package com.ly.p349;

//�ӿڵ�ʹ��
//    1.�ӿ�ʹ���������̬��
//    2.�ӿ�ʵ������һ�ֹ淶��������USB�Ĺ淶����������
public class USBTest {


    public static void main(String[] args) {

        Computer1 com = new Computer1();
        //1.�����ӿڵķ�����ʵ����ķ���������
        Flash flash = new Flash();
        com.transferData(flash);

        //2.�����˽ӿڵķ�����ʵ�������������
        com.transferData(new Printer());

        //3.�����ӿڵ�����ʵ����ķ���������
        USB phone = new USB() {
            @Override
            public void start() {
                System.out.println("�ֻ���������");
            }

            @Override
            public void stop() {
                System.out.println("�ֻ���������");
            }
        };
        com.transferData(phone);


        //4.�����ӿڵ�����ʵ�������������
        com.transferData(new USB() {
            @Override
            public void start() {
                System.out.println("�����豸��������");
            }

            @Override
            public void stop() {
                System.out.println("�����豸��������");
            }
        });



    }
}

abstract class ComputerObject{
    //���Դ������ݽ���һ���ⲿ���豸
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
        System.out.println("����1���崫������...");
    }
}



interface USB{
    //�����������˳����������С�Ĵ����ٶȵ�
    void start();
    void stop();
}

class Flash implements USB{


    @Override
    public void start() {
        System.out.println("U�̿�������");
    }

    @Override
    public void stop() {
        System.out.println("U�̽�������");
    }
}


class Printer implements USB{

    @Override
    public void start() {
        System.out.println("��ӡ����������");
    }

    @Override
    public void stop() {
        System.out.println("��ӡ����������");
    }
}