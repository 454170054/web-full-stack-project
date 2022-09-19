package com.jf;

import lombok.Data;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Data
public class BMW {

    private String name;



    public static void main(String[] args) {
        ClassPathXmlApplicationContext bmw = new ClassPathXmlApplicationContext("applicationContext.xml");
        BMW bmw1 = (BMW) bmw.getBean("bmw");
        System.out.println(bmw1);
    }
}
