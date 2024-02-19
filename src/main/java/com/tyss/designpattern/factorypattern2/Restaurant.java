package com.tyss.designpattern.factorypattern2;

import com.tyss.designpattern.factory.Burger;

public abstract class Restaurant {

    public abstract Burger createBurger();

    public Burger orderBurger() {
        Burger burger = createBurger();
        burger.prepare();
        return burger;
    }

}
