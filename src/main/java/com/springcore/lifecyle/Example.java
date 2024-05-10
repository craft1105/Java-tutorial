package com.springcore.lifecyle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Example {
    private String subject;

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Example{" +
                "subject='" + subject + '\'' +
                '}';
    }

    public Example() {
        super();
    }

    //  init and destroy method

@PostConstruct
    public void start(){
        System.out.println("init method");
    }
@PreDestroy
    public void end(){
        System.out.println("destroy  method");
    }
}
