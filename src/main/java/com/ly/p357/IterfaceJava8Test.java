package com.ly.p357;

//�ӿ� java8������
//���˶���ȫ�ֳ����ͳ��󷽷�֮�⣬�����Զ��徲̬������Ĭ�Ϸ���

public class IterfaceJava8Test {
    public static void main(String[] args) {
        CompareA.method1();
        CompareA compareA = new B();
        compareA.method3();
    }
}


interface CompareA{

//    ��̬����

    public static void method1(){
        System.out.println("method1");
    }

//    Ĭ�Ϸ�����ʵ����������һ����ͨ�ķǾ�̬�ķ���

    public default void method2(){
        System.out.println("method2");
    }

    //ʡ����public����ʵ����public��
    default void method3(){
        System.out.println("method3");
    }
}

class B implements CompareA{

}