package com.ly.service;

public class p270 {
    public static void main(String[] args) {
        fruit a = new fruit(3);
        a.taste();
        a.taste(123);

    }

}

class food{
    private int id;

    public food(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void taste(int id){
        if(id>10) {
            System.out.println("�óԵ�һ��");
        }else {
            System.out.println("û��ô�ó�");
        }
    }


    public void taste(){
        System.out.println("ʳ��ó�");
    }
}

class fruit extends food{

    public fruit(int id) {
        super(id);
    }

    @Override
    public void taste() {
        super.taste();
        System.out.println("ˮ���ó�");
    }

    @Override
    public void taste(int id) {
        if(id>10) {
            System.out.println("�úó԰�");
        }else {
            System.out.println("û��ô�ó�");
        }

    }
}