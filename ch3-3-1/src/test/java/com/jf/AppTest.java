package com.jf;

import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    @Test
    public void test(){
        ClassPathXmlApplicationContext bmw = new ClassPathXmlApplicationContext("applicationContext.xml");
        BMW bmw1 = (BMW) bmw.getBean("bmw");
        System.out.println(bmw1);
    }

}
