package com.ly.service;
//可变个数形参
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

    //可变个数形参,实际参数填几个（没有也行）都行。需要格式类型符合
    public void show(String ...strs){
//        System.out.println("可变");
//        for(int i =0;i<strs.length;i++){
//            System.out.println(strs[i]);
//        }
        System.out.println(strs.length);
        System.out.println(strs);

    }
}
