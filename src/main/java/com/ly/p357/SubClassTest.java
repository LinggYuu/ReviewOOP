package com.ly.p357;

//���Խӿ�jdk8������

public class SubClassTest {
    public static void main(String[] args) {
        SubClass s  = new SubClass();
        CompareA.method1();
        //�ӿڵľ�̬����ʵ�����ò�����ֻ�ܽӿ��Լ���
        s.method2();
    }
}

class SubClass implements CompareA{

}