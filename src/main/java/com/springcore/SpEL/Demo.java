package com.springcore.SpEL;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {
@Value("#{22+4}")
    private int x ;
    @Value("#{12}")
    private int y;

    @Override
    public String toString() {
        return "Student{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }



    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }
}
