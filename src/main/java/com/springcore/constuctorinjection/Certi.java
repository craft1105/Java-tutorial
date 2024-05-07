package com.springcore.constuctorinjection;

public class Certi {
    public String name;

    public Certi(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Certi{" +
                "name='" + name + '\'' +
                '}';
    }
}
