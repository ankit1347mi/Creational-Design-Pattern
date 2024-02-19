package com.tyss.designpattern.builderpattern;

public class BuilderMain {
    public static void main(String[] args) {
        Car car = new CarBuilder().id(12).model("Fortuner").brand("Toyota").color("white").build();
        System.out.println(car);
    }
}
