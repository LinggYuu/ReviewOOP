package com.ly.service;
//�ɱ�����β�
public class p207 {

    public static void main(String[] args) {
        p207 ap = new p207();
        ap.show();
        ap.show("hello");
        ap.show("sdas","dqwd","wwd");
        ap.show(new String[]{"dsa","dwqd","wwq"});
    }

    public void show(int i){

    }

//    public void show(String s){
//
//    }

    //�ɱ�����β�,ʵ�ʲ��������û��Ҳ�У����С���Ҫ��ʽ���ͷ���
    public void show(String ...strs){
//        System.out.println("�ɱ�");
//        for(int i =0;i<strs.length;i++){
//            System.out.println(strs[i]);
//        }
        System.out.println(strs.length);
        System.out.println(strs);

    }
}
