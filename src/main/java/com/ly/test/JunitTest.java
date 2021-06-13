package com.ly.test;

import com.ly.p299.Person;
import org.junit.Test;

public class JunitTest {

    int num = 3;
    @Test
    public void test(){
        Person a = new Person(1,"sss");

        System.out.println(a.getClass().getName());
        System.out.println(num);

    }

}
