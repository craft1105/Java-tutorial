package com.springcore.stereotype;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component("obj")
public class Student {
 @Value("farhan sarwar")
    private String studentName;
    @Value("Karachi")
    private String city;

    public List<String> getAddress() {
        return Address;
    }

    public void setAddress(List<String> address) {
        Address = address;
    }

    @Value("#{temp}")
    private List<String> Address;

    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", city='" + city + '\'' +
                '}';
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }


}
