package com.ly.service;

public class classtest {

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

    public String getName() {
        return name;
    }
    public String getNation(String nation){
        String info = "�ҵĹ�����"+nation;
        return info;
    }
}
