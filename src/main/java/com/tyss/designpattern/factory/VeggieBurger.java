package com.tyss.designpattern.factory;

public class VeggieBurger implements Burger{
    @Override
    public void prepare() {
        System.out.println("From Veggie Burger");
    }
}
