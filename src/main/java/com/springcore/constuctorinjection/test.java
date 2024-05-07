package com.springcore.constuctorinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ciconfig.xml");
        Person temp= (Person)context.getBean("person");
        System.out.println(temp);

          Addition ddi=(Addition)context.getBean("addi");
        ddi.dosum();
        ddi.subtraction();
        System.out.println(ddi);
    }
}
