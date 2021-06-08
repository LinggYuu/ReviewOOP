package com.ly.service;


//重载overload
//与返回值无关，需要参数列不同
public class p203 {

    public int getSum(){
        System.out.println("得到和");
        return 1;
    }
    public int getSum(int a , int b){

        System.out.println(a+"+"+b+"="+a+b);
        return  a+b;
    }
    public void getSum(int a, int b,int c){
        System.out.println(a+b+c);
    }
}
class test{
    public static void main(String[] args) {
        p203 ap = new p203();
        ap.getSum();
        ap.getSum(3,5);
        ap.getSum(3,5,6);
    }


}