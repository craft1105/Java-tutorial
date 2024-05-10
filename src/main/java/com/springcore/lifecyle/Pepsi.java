package com.springcore.lifecyle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Pepsi implements InitializingBean ,DisposableBean{
    private int price;

    public int getPrice() {
        return price;
    }

    public Pepsi() {
        super();
    }

    @Override
    public String toString() {
        return "Pepsi{" +
                "price=" + price +
                '}';
    }

    public void setPrice(int price) {
        System.out.println("intial");
        this.price = price;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("runing init method ");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("runing destroy method ");
    }
}
