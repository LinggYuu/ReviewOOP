package com.ly.service;

public class classtest {


    public static void main(String[] args) {
//        customer a = new customer();
//        String name =    a.getName();
//        System.out.println(name);
        customer b = new customer();
        b.name="sd";
        String name = b.getName();
        System.out.println(name);
    }

}




//客户类
class customer{
    //属性
    String name;
    int age;
    boolean isMale;
    //方法
    public void eat(){
        System.out.println("客户吃饭");
    }
    public void sleep(int hour){
        System.out.println("休息"+hour);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        sleep(10);
        return name;
    }
    public String getNation(String nation){
        String info = "我的国籍："+nation;
        return info;
    }
}
