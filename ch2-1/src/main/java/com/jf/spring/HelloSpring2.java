package com.jf.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpring2 {

    public void print(){
        System.out.println("Spring2被调用了!");
    }

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        HelloSpring bean = (HelloSpring)context.getBean("helloBean");
        bean.print();
        HelloSpring helloSpring = new HelloSpring();
    }
}
