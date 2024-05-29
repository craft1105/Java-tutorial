package com.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext ob=new ClassPathXmlApplicationContext("stereo.xml");
        Student student = ob.getBean("obj",Student.class);
        System.out.println( student.getCity());
        System.out.println( student.getAddress());
    }
}
