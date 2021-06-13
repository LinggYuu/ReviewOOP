package com.ly.p323;

public class SingletonTest {
    public static void main(String[] args) {
        Bank2 b1 = Bank2.getInstance();
        Bank2 b2 = Bank2.getInstance();
        boolean b = b1.equals(b2);
        System.out.println(b);
    }
}


//����ʽ���ڵ���getInstance����ǰ���Ѿ������instance��
class Bank{
    //1.˽�л���������Ŀ���ǲ�������������
    private Bank(){

    }

    //2.�ڲ�������Ķ���Ҫ��ö���Ҳ����Ϊ��̬��
    private static Bank instance = new Bank();


    //�ṩ�����ľ�̬������������Ķ���
    public static Bank getInstance(){
        return instance;
    }
}

//����ʽ��ɶʱ���ã�ɶʱ����
class Bank2{

    //1.˽�л���Ĺ�����
    private Bank2(){}

    //2.������ǰ��Ķ���ҲҪ����Ϊstatic  û�г�ʼ��
    private static Bank2 instance = null;

    //3.����������̬����
    public static Bank2 getInstance(){
//        instance = new Bank2(); ������ôд������д�Ļ�ÿ�ζ���һ���µ�
        if(instance == null){//˵����û�г�ʼ��
            instance = new Bank2();
        }
        return instance;
    }


}