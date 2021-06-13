package com.ly.p303;

import org.junit.Test;

public class WrapperTest {

    @Test
    public void test1(){
        int num =1;
        Integer num1 = new Integer(num);
        System.out.println(num1.toString());

        Integer num2 = new Integer("123");
        System.out.println(num2);

        Float f1 = new Float(12.3f);
        Float f2 = new Float("12.3");
        boolean b = f1.equals(f2);
        System.out.println(b);

        //上面想转什么包装类型  参数就得是什么结构
        //下面如果非Boolean类型的true(True,TRue,tRue都行，忽略大小写)，全为false
        //现在都用自动装箱与拆箱了，不用new xxx  和 xxxValue了，偶尔会用

        Boolean b1 = new Boolean(true);
        Boolean b2 = new Boolean("true");
        Boolean b3 = new Boolean("true123");
        System.out.println(b1+","+b2+","+b3);


        Float f12 = new Float(12.3);
        float f122 = f12.floatValue();
        System.out.println(f122+3);
    }

    @Test
    //这里在method方法调用
    public void test3(){
        int num = 3;
        method(num);
    }
    public void method(Object obj){
        System.out.println(obj);
    }

    @Test
    public void test4(){
        float f1 = 2.3f;
        Float F2 = f1;
        System.out.println(F2.getClass().getName());
        String s1 = String.valueOf(f1);
        String name = s1.getClass().getName();
        System.out.println(name);
    }
    @Test
    public void test5(){
        String s1 ="12.3";
        Float v = Float.parseFloat(s1);
        System.out.println(v);
    }
}
