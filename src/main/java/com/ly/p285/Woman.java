package com.ly.p285;

public class Woman extends Person {
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
        System.out.println("这个女人吃太多了");
    }

    @Override
    public void sleep() {
        System.out.println("女人睡觉");
    }

    public void Shopping(){
        System.out.println("买买买");
    }
}


class test{
    public static void main(String[] args) {
        Woman woman = new Woman();
        woman.eat(9);
        Person ap = new Woman();
        ap.sleep();
        ap.shit();
        ((Woman) ap).Shopping();
        ((Woman) ap).isBeautiful=true;
        System.out.println(ap.id);
        System.out.println( ((Woman) ap).id);
    }
}
