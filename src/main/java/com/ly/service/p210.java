package com.ly.service;




////�����βεĴ��ݻ��ƣ�ֵ����
//������������:
//    ��������ǻ�����������,��ʱʵ�θ����βε���ʵ����ʵ�洢������ֵ
//    ���������������������,��ʱʵ�θ����βε���ʵ�δ洢���ݵĵ�ֵַ



public class p210 {

    public static void main(String[] args) {

        Data data = new Data();
        data.m=10;
        data.n=20;
        System.out.println("m="+data.m+",n="+data.n);
        //����m��n
        new p210().swap(data);
        System.out.println("m="+data.m+",n="+data.n);
    }

    public void swap(Data data){
        int t = data.m;
        data.m = data.n;
        data.n = t;
    }

}


class Data{
    int m;
    int n;
}