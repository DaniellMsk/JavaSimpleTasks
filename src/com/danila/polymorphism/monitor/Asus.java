package com.danila.polymorphism.monitor;

import com.danila.oop.computer.HDD;
import com.danila.oop.computer.RAM;

public abstract class Asus extends Notebook {

    public Asus(HDD hdd, RAM ram, String name) {
        super(hdd, ram, name);
    }
}
