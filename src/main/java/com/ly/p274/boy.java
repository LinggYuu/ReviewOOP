package com.ly.p274;

public class boy extends Person{
    int length;
    int id;//在内存中会有2个id一个是父类的一个是子类的
    public boy() {
        System.out.println("造了个男孩");
    }

    public boy(int length, int id, String name) {
        super(id,name);
        this.length = length;
        this.id = id;
        System.out.println("造了个男孩2，他的id为："+this.id+"他祖先id为："+super.id);
    }

    public static void main(String[] args) {
        boy a = new boy(18,2,"ly");
    }
}
