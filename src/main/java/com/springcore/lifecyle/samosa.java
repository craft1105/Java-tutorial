package com.springcore.lifecyle;

public class samosa {
    private int price;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        System.out.println("Setting price");
        this.price = price;
    }

    public samosa() {
        super();
    }

    @Override
    public String toString() {
        return "samosa{" +
                "price=" + price +
                '}';
    }

    public void init(){
        System.out.println("Inside init method");
    }
    public void destroy(){
        System.out.println("this is destroy method ");
    }
}
