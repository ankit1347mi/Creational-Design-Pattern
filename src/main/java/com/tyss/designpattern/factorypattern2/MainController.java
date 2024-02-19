package com.tyss.designpattern.factorypattern2;

import com.tyss.designpattern.abstractpattern.*;
import com.tyss.designpattern.factory.Burger;

public class MainController {
    public static void main(String[] args) {

        // Restaurant restaurant = new VeggieBurgerRestaurant();
        //  Burger burger = restaurant.orderBurger();
        //burger.prepare();

        Company company = new MsiManufacturer();
        Gpu gpu = company.createGpu();
        Monitor monitor = company.createMonitor();
        System.out.println(gpu + "   " + monitor);

        Company company1 = new AsusManufacturer();
        Gpu gpu1 = company1.createGpu();
        Monitor monitor1 = company1.createMonitor();
        System.out.println(gpu1 + "    " + monitor1);
    }
}
