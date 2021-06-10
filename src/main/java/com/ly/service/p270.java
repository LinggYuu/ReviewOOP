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
            System.out.println("好吃得一批");
        }else {
            System.out.println("没那么好吃");
        }
    }


    public void taste(){
        System.out.println("食物好吃");
    }
}

class fruit extends food{

    public fruit(int id) {
        super(id);
    }

    @Override
    public void taste() {
        super.taste();
        System.out.println("水果好吃");
    }

    @Override
    public void taste(int id) {
        if(id>10) {
            System.out.println("好好吃啊");
        }else {
            System.out.println("没那么好吃");
        }

    }
}