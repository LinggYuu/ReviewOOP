package com.ly.p359;

public class InnerClassTest {
    public static void main(String[] args) {
        Person ap = new Person();
        ap.name = "����";
        ap.age = Integer.parseInt("8");

        ap.eat();

//      ����Brainʵ��(��̬��Ա�ڲ���)��
        Person.Brain brain = new Person.Brain();
        brain.Size = 200;
        brain.show();

//      ����Dickʵ��(�Ǿ�̬��Ա�ڲ���)
        Person.Dick dick = ap.new Dick();
        dick.show1();
    }
}



class Person{
    static String nation = "CHINESE";
    String name;
    int age;
    int length;

    //��Ա�ڲ���
    static class Brain{
        int Size;
        String Bname;
        public void show(){
            System.out.println("�������������"+nation+"��");
        }

    }
    class Dick{
        int length;
        public void show1(){
            System.out.println("��ֻJJ������"+name+"��");
            System.out.println("����Ϊ��"+length);
            System.out.println("�˵ĳ���Ϊ��"+Person.this.length);
            eat();//�൱��Person.this.eat();�����ⲿ�������

        }
    }


    public Person(){
        //�ֲ��ڲ���
        class CC{}
    }

    public void method(){
        //�ֲ��ڲ���
        class AA{ }
    }

    {
        //�ֲ��ڲ���
        class BB{ }
    }
    public void eat(){
        System.out.println(this.name+"�Է�");
    }

}