package com.springcore.SpEL;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("SpEL.xml");
        Demo xd = context.getBean("demo", Demo.class);
        System.out.println(xd);
    }
}
