package com.ly.service;

//匿名对象

public class p201 {
    public static void main(String[] args) {
//        Phone p = new Phone();
//        System.out.println(p);
//        p.sendEmail();
//        p.playGame();
//        System.out.println("---------------");
//
////      每次new都会造一个对象，匿名对象适合一次性
//        System.out.println(new Phone());
//        System.out.println(new Phone());
//        System.out.println("---------------");
//        new Phone().price=999;
//        //不会显示999
//        new Phone().showPrice();
        PhoneFactory factory = new PhoneFactory();
        //匿名对象作为具体材料给方法
        factory.show(new Phone());

    }
}

class PhoneFactory{
    //形参为一个类类型
    public void show(Phone phone){
        phone.sendEmail();
        phone.playGame();
    }
}





class Phone{
    double price;
    public void sendEmail(){
        System.out.println("发送邮件");
    }
    public void playGame(){
        System.out.println("玩游戏");
    }
    public void showPrice(){
        System.out.println("价格为："+this.price);
    }

}