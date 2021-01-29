package com.yp.sevice.impl;

import com.yp.sevice.ISupport;

public class KFC implements ISupport {
    private String name;
    private int price;

    @Override
    public String toString() {
        return "KFC{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public void support() {
        System.out.println("汉堡包");
    }
}
