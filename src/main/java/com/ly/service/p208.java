package com.ly.service;


//ֵ����
public class p208 {
    public static void main(String[] args) {

        System.out.println("***********������������***********");
        int m =10;
        int n =m;

        System.out.println("m="+m+",n="+n);
        n=20;
        System.out.println("m="+m+",n="+n);

        System.out.println("***********������������***********");


        order o1 = new order();
        o1.id=22;
        order o2 = o1;//��ֵ��o1 o2��ֵַ��ͬ����ָ��ѿռ���ͬһ������ʵ��
        System.out.println(o1.id);
        System.out.println(o2.id);
        o2.id=33;
        //o1��o2ָ����һ�����������ǵ�ַ
        System.out.println(o1.id);
        System.out.println(o2.id);

    }

}


class order{
    int id;
}
