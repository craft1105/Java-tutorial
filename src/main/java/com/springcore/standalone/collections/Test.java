package com.springcore.standalone.collections;

import com.springcore.lifecyle.Example;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("standalone.xml");
        Person todo=(Person)context.getBean("person1");
        System.out.println(todo.toString());
        System.out.println(todo.getFriends().getClass().getName());
        System.out.println("---------------------------");
        Person tody=(Person)context.getBean("person2");
        System.out.println(todo.toString());
        System.out.println(todo.getFriends().getClass().getName());
        System.out.println("---------------------------");
        Person toy=(Person)context.getBean("structure");
        System.out.println(toy.toString());
    }
}
