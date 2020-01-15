package com.danila.polymorphism.monitor;

import com.danila.oop.computer.HDD;
import com.danila.oop.computer.RAM;

public abstract class Toshiba extends Notebook {
    public Toshiba(HDD hdd, RAM ram, String name) {
        super(hdd, ram, name);
    }
}
