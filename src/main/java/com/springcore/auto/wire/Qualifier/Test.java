package com.springcore.auto.wire.Qualifier;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context =new ClassPathXmlApplicationContext("Qualifierautoconfig.xml");
      Emp emp1= context.getBean("emp", Emp.class);
        System.out.println(emp1);
    }
}
