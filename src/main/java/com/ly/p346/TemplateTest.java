package com.ly.p346;


//抽象类的应用：模板方法的设计模式,把不确定的抽象了（必须重写），确定的不抽象

import java.sql.SQLOutput;

public class TemplateTest {
    public static void main(String[] args) {
        Template t = new SubTemplate();
        t.spendTime();
    }
}

abstract class Template{
    //得出某段代码的执行时间
    public void spendTime(){
        //当前时间
        long start = System.currentTimeMillis();
        //code部分就是不确定的那部分，其余的整体计算部分是确定的
        this.code();

        long end  =System.currentTimeMillis();
        System.out.println("此方法执行时间为："+(end-start));
    }
    //code部分就是不确定的那部分
    public abstract void code();

}


class SubTemplate extends Template{

    @Override
    public void code() {
        for(int i = 2;i<= 10000;i++){
            boolean isFlag = true;//每次进入循环都重置了
            for (int j = 2;j<=Math.sqrt(i);j++){
                if(i%j ==0){
                    isFlag = false;
                    break;
                }
            }
            if(isFlag){
                System.out.println(i);
            }
        }

    }
}
