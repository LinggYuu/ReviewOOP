package com.ly.service;


//·â×°ÓëÒþ²Ø

public class p219 {

    public static void main(String[] args) {
        animal a = new animal();
        a.name="Ð¡°×";
        a.age=18;
        a.setLegs(23);
        System.out.println(a.getLegs());
        a.eat(2);
        a.eat(3);
    }


}


class animal{
    String name;
    int age;
    private int legs;

    public void eat(int num){
        System.out.println("³Ô³Ô³Ô");
        if(num<3) hide();

    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public int getLegs() {
        return legs;
    }

    private void hide(){
        System.out.println("Ã»³Ô±¥:(");
    }

}