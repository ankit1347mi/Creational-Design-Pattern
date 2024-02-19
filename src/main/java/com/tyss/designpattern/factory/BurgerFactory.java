package com.tyss.designpattern.factory;

public class BurgerFactory {
    public Burger createBurger(String request) {
        Burger burger = null;
        if ("BEEF".equals(request)) {
            burger = new BeefBurger();
        } else if ("VEG".equals(request)) {
            burger = new VeggieBurger();
        }
        return burger;
    }
}
