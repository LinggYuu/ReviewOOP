package com.ly.p278;

public class Woman extends Person{

    boolean isBeautiful;
    int id =2;


    public void eat(int id) {
        if(id>10){
            this.eat();
        }else{
            super.eat();
        }
    }

    @Override
    public void eat() {
        System.out.println("���Ů�˳�̫����");
    }

    @Override
    public void sleep() {
        System.out.println("Ů��˯��");
    }

    public void Shopping(){
        System.out.println("������");
    }

}


class Man extends Person{

}


class test{
    public static void main(String[] args) {
        Person ap = new Woman();
//        ap.Shopping();  �޷������������еķ���
//        ap.isBeautiful; ������
//        Man man = (Man)ap; ת�е�ʧ�ܣ���Ϊ��������ʱ���Ǹ�Ů��

        System.out.println(ap instanceof Woman);
        System.out.println(ap instanceof Man);
        System.out.println(ap instanceof Person);
        System.out.println("*****************************************");
        Woman woman = (Woman)ap;//תŮ�ĳɹ�

        System.out.println(ap instanceof Woman);
        System.out.println(ap instanceof Man);
        System.out.println(ap instanceof Person);
        System.out.println(ap instanceof Object);
        woman.Shopping();


//        Woman woman = null;
//        boolean t = ap instanceof Man;
//        System.out.println(t);

    }
}
