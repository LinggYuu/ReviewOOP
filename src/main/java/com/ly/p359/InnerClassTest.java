package com.ly.p359;

public class InnerClassTest {
    public static void main(String[] args) {
        Person ap = new Person();
        ap.name = "凌宇";
        ap.age = Integer.parseInt("8");

        ap.eat();

//      创建Brain实例(静态成员内部类)；
        Person.Brain brain = new Person.Brain();
        brain.Size = 200;
        brain.show();

//      创建Dick实例(非静态成员内部类)
        Person.Dick dick = ap.new Dick();
        dick.show1();
    }
}



class Person{
    static String nation = "CHINESE";
    String name;
    int age;
    int length;

    //成员内部类
    static class Brain{
        int Size;
        String Bname;
        public void show(){
            System.out.println("这个人脑是属于"+nation+"的");
        }

    }
    class Dick{
        int length;
        public void show1(){
            System.out.println("这只JJ是属于"+name+"的");
            System.out.println("长度为："+length);
            System.out.println("人的长度为："+Person.this.length);
            eat();//相当于Person.this.eat();调用外部类的属性

        }
    }


    public Person(){
        //局部内部类
        class CC{}
    }

    public void method(){
        //局部内部类
        class AA{ }
    }

    {
        //局部内部类
        class BB{ }
    }
    public void eat(){
        System.out.println(this.name+"吃饭");
    }

}