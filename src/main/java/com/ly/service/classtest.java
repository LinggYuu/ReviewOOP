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




//�ͻ���
class customer{
    //����
    String name;
    int age;
    boolean isMale;
    //����
    public void eat(){
        System.out.println("�ͻ��Է�");
    }
    public void sleep(int hour){
        System.out.println("��Ϣ"+hour);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        sleep(10);
        return name;
    }
    public String getNation(String nation){
        String info = "�ҵĹ�����"+nation;
        return info;
    }
}
