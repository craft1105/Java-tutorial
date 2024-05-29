package com.springcore.javaConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration// to tell this is configration file
@ComponentScan(basePackages = "com.springcore.javaConfig") // to tell the the pakage location
public class Javaconfig {
@Bean
    public student getstudent(){
        student student = new student();
        return student;
    }
}
