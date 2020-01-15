package com.danila.polymorphism.monitor;

import com.danila.oop.computer.HDD;
import com.danila.oop.computer.RAM;

public class AsusVivoBook extends Asus implements Computable {
    public AsusVivoBook(HDD hdd, RAM ram, String name) {
        super(hdd, ram, name);
    }

    @Override
    public void computerOn() {
        System.out.println("Включился по-Асусовски (ВивоБук)");
    }

    @Override
    public void computerOff() {
        System.out.println("Выключился по-Асусовски (ВивоБук)");
    }
}
