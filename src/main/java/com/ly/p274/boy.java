package com.ly.p274;

public class boy extends Person{
    int length;
    int id;//���ڴ��л���2��idһ���Ǹ����һ���������
    public boy() {
        System.out.println("���˸��к�");
    }

    public boy(int length, int id, String name) {
        super(id,name);
        this.length = length;
        this.id = id;
        System.out.println("���˸��к�2������idΪ��"+this.id+"������idΪ��"+super.id);
    }

    public static void main(String[] args) {
        boy a = new boy(18,2,"ly");
    }
}
