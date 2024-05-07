package com.springcore.constuctorinjection;

public class Addition {
    private int A;
    private int B;

    @Override
    public String toString() {
        return "Addition{" +
                "A=" + A +
                ", B=" + B +
                '}';
    }

    public Addition(int A, int B){
        this.A=A;
        this.B=B;
        System.out.println("constructor : int ,int ");
    }
    public Addition(double A,double B){
        this.A=(int)A;
        this.B=(int)B;
        System.out.println("constructor : double ,double ");
    }
    public void subtraction(){
        System.out.println("please subscribe");
    }
    public void dosum(){
        System.out.println("sum is = "+(this.A+this.B));
    }
}
