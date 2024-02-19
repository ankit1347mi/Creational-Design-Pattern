package com.tyss.designpattern.abstractpattern;

public abstract class Company {

    public abstract Gpu createGpu();

    public abstract Monitor createMonitor();

    public Gpu assembleGpu() {
        Gpu gpu = createGpu();
        gpu.assemble();
        return gpu;
    }
}
