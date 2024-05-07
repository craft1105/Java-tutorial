package com.springcore.constuctorinjection;

public class Person {
    private String name;
    private int personid;

    private Certi certi;
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", personid=" + personid +
                "  Certi"+ certi +
                '}';
    }

    public Person(String name, int personid ,Certi certi){
        this.name=name;
        this.personid=personid;
        this.certi= certi;
    }
}
