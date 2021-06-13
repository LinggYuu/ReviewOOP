package com.ly.p314;

public class StaticTest {

    private static Chinese c= new Chinese("yazan",23);

    public static void Fun(){
        System.out.println("尼玛");
    }


    public static void main(String[] args) {
        StaticTest.Fun();
        Fun();
        Chinese c1 = new Chinese("lingyu",22);
        System.out.println(Chinese.getGuoji());
        System.out.println(c1.nation);
        c1.nation = "北欧";
        System.out.println(Chinese.getGuoji());
        Chinese.show();
        c1.show();
        System.out.println(c.getName());
        c1.eat();
    }



}


class Chinese{


    public static void show(){
        System.out.println("I'M 拆尼斯");
    }



    static String nation = "中国";
    String name;
    int age;

    public Chinese(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static String getGuoji() {
        return nation;
    }

    public static void setGuoji(String guoji) {
        Chinese.nation = guoji;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void eat(){
        show();
        System.out.println();
    }
}
