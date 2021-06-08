package com.ly.service;

public class classtest {

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

    public String getName() {
        return name;
    }
    public String getNation(String nation){
        String info = "我的国籍："+nation;
        return info;
    }
}
