package com.springcore.injectcollection;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("injectingcollectionconfig.xml");
        animal temp= (animal)context.getBean("address1");
        System.out.println(temp.toString());
    }
}
