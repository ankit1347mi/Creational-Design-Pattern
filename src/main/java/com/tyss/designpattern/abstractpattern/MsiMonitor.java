package com.tyss.designpattern.abstractpattern;

public class MsiMonitor implements Monitor{
    @Override
    public void assemble() {
        System.out.println("From MSI MONITOR");
    }
}
