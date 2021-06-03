package com.ly.entity;

import java.util.Scanner;

public class Food {
    String name;


    public void foodname(){
        Scanner input = new Scanner(System.in);
        String s=input.next();
        this.name = s;
    }
}
