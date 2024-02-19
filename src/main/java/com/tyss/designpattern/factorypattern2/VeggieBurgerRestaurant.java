package com.tyss.designpattern.factorypattern2;

import com.tyss.designpattern.factory.Burger;
import com.tyss.designpattern.factory.VeggieBurger;

public class VeggieBurgerRestaurant extends Restaurant {
    @Override
    public Burger createBurger() {
        return new VeggieBurger();
    }
}
