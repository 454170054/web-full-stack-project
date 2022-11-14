package com.jf;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BMW {

    private String name;

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BMW bmw = (BMW) context.getBean("bmw");
        System.out.println(bmw);
    }
}
