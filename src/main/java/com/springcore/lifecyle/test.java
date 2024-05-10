package com.springcore.lifecyle;

import com.springcore.ref.A;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("samconfig.xml");
        context.registerShutdownHook();
//        samosa temp= (samosa)context.getBean("samo");
//        temp.setPrice(56);
//        System.out.println(temp.toString());

//        Pepsi temp= (Pepsi)context.getBean("pep");
//        System.out.println(temp);

        Example todo=(Example)context.getBean("ex");
        System.out.println(todo.toString());

    }
}
