package com.ly.service;

//��������

public class p201 {
    public static void main(String[] args) {
//        Phone p = new Phone();
//        System.out.println(p);
//        p.sendEmail();
//        p.playGame();
//        System.out.println("---------------");
//
////      ÿ��new������һ���������������ʺ�һ����
//        System.out.println(new Phone());
//        System.out.println(new Phone());
//        System.out.println("---------------");
//        new Phone().price=999;
//        //������ʾ999
//        new Phone().showPrice();
        PhoneFactory factory = new PhoneFactory();
        //����������Ϊ������ϸ�����
        factory.show(new Phone());

    }
}

class PhoneFactory{
    //�β�Ϊһ��������
    public void show(Phone phone){
        phone.sendEmail();
        phone.playGame();
    }
}





class Phone{
    double price;
    public void sendEmail(){
        System.out.println("�����ʼ�");
    }
    public void playGame(){
        System.out.println("����Ϸ");
    }
    public void showPrice(){
        System.out.println("�۸�Ϊ��"+this.price);
    }

}