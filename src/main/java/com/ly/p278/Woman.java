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


class Man extends Person{

}


class test{
    public static void main(String[] args) {
        Person ap = new Woman();
//        ap.Shopping();  无法调用子类特有的方法
//        ap.isBeautiful; 和属性
//        Man man = (Man)ap; 转男的失败，因为它在声明时就是个女的

        System.out.println(ap instanceof Woman);
        System.out.println(ap instanceof Man);
        System.out.println(ap instanceof Person);
        System.out.println("*****************************************");
        Woman woman = (Woman)ap;//转女的成功

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
