package com.ly.service;



//this�ؼ���


public class p231 {

    public static void main(String[] args) {
        Student s = new Student(8,12);
        s.setAge(18);
        s.setId(2);
    }


}


class Student{
    private int id;
    private int age;


    //�������Ļ�����ͨ��this()
    public Student(){
        System.out.println("�ղι���");
    }

    public Student(int id) {

        this();
        this.id = id;
        System.out.println("һ�ι���");
    }

    public Student(int id, int age) {
        //this(id)�У�id��Student(int id, int age)�е�id��
        // Ȼ��ȥʹ��Student(int id)����
        this(id);
//        this.id = id;
        this.age = age;
    }


    public int getId() {
        return id;
    }

    //thisָʵ�����Ķ�����ʵ���Ǹ�
    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}