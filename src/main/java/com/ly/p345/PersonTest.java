package com.ly.p345;

//�β�ֱ��newһ�� ��������

//���������������

public class PersonTest {

    public static void main(String[] args) {
        PersonTest.method(new Student());
        Person a = new Student();
        a.eat();
//        PersonTest.method1(new Person());��ΪPerson�Ǹ�����������new����
        PersonTest.method1(new Student());
        PersonTest.method1(a);//����������������Ķ���
        method1(new Student());//���������������Ķ���

        //������һ����������Ķ���p
        Person p = new Person() {
            @Override
            void eat() {
                System.out.println("��le��");
            }
        };//�����࣬new���ǳ��������������
        p.eat();

    }


    public static void method1(Person person){
        person.eat();
    }

    public static void method(Student student){

    }

}

abstract class  Person{
    String name;
    int age;
    abstract void eat();
}

class Student extends Person{
    int id;

    @Override
    void eat() {
        System.out.println("ѧ���Է�");
    }
}


