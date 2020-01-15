package com.danila.polymorphism.monitor;

import com.danila.oop.computer.HDD;
import com.danila.oop.computer.RAM;

public abstract class Notebook extends Computer {

    public Notebook(HDD hdd, RAM ram, String name) {
        super(hdd, ram, name);
    }

    @Override
    public void on() {
        System.out.println("Крышка открыта");
        super.on();
    }
}
