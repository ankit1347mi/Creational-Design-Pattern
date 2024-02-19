package com.tyss.designpattern.factorypattern2;

import com.tyss.designpattern.factory.BeefBurger;
import com.tyss.designpattern.factory.Burger;

public class BeefBurgerRestaurant extends Restaurant{
    @Override
    public Burger createBurger() {
        return new BeefBurger();
    }
}
