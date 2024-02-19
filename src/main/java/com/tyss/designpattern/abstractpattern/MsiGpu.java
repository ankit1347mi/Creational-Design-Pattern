package com.tyss.designpattern.abstractpattern;

public class MsiGpu implements Gpu{
    @Override
    public void assemble() {
        System.out.println("From MSI GPU");
    }
}
