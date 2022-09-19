package com.jf;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloBean {
    public HelloBean(){
        System.out.println("已完成Bean的构造器实例化");
    }


    private String hello;

    public void setHello(String hello) {
        this.hello = hello;
    }

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//        HelloBean helloBean = (HelloBean)context.getBean("helloBean");
        HelloBean bean1 = (HelloBean) context.getBean("helloBean1");
        System.out.println(bean1.hello);
    }
}
