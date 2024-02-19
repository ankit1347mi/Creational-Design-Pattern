package com.tyss.designpattern.factory;

public class Restaurant {

    public Burger orderBurger(String request) {
        BurgerFactory factory = new BurgerFactory();
        Burger burger = factory.createBurger(request);
        burger.prepare();
        return burger;
    }
}
