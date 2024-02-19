package com.tyss.designpattern.factory;

public class BeefBurger implements Burger{
    @Override
    public void prepare() {
        System.out.println("From Beef Burger");
    }
}
