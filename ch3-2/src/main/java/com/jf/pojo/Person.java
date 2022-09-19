package com.jf.pojo;

import lombok.Data;
import lombok.ToString;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

@Data
@ToString
public class Person {

    private String name;

    private int age;

    private List<String> list;


    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Person person = (Person) applicationContext.getBean("person");
        System.out.println(person);
    }
}
