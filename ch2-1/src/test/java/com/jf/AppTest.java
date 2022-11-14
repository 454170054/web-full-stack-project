package com.jf;


import com.jf.spring.HelloSpring;
import com.jf.spring.HelloSpring2;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Unit test for simple App.
 */
public class AppTest
{

    @Test
    public void testHelloSpring(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        HelloSpring bean = (HelloSpring)context.getBean("helloBean");
        bean.print();
    }

    @Test
    public void testHelloSpring2(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        HelloSpring2 bean = (HelloSpring2)context.getBean("helloSpring2");
        bean.print();
    }
}
