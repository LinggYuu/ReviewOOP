package com.ly.service;


//�����βεĴ��ݻ��ƣ�ֵ����

//1.�βΣ���������ʱС�����ڵĲ���
//2.ʵ�Σ����÷���ʱʵ�ʴ��ݸ��βε�ֵ

//ֵ���ݻ���:
//��������ǻ�����������,��ʱʵ�θ����βε���ʵ����ʵ�洢������ֵ
//���������������������,��ʱ��p210

//����Ϊ:�����������͵Ĵ����ڶ�֮��,һ����ʵ�ʵĸ���.�����������͵Ĵ�����ջ�е�ָ��,һ����ָ���Ե�


public class p209 {
    public static void main(String[] args) {

        int[] arr = {1,4};
        new p209().swap(arr[0],arr[1]);
        System.out.println(arr[0]+","+arr[1]);
        new p209().swap(arr);
        System.out.println(arr[0]+","+arr[1]);
    }

    public void swap(int a ,int b){
        int t = a;
        a = b;
        b = t;
    }
// ��������˴���

    public void swap(int[] arr){
        int t =arr[0];
        arr[0]= arr[1];
        arr[1]= t;

    }


}
