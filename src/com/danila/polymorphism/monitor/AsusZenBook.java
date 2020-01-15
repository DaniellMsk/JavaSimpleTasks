package com.danila.polymorphism.monitor;

import com.danila.oop.computer.HDD;
import com.danila.oop.computer.RAM;

public class AsusZenBook extends Asus implements Computable {
    public AsusZenBook(HDD hdd, RAM ram, String name) {
        super(hdd, ram, name);
    }

    @Override
    public void computerOn() {
        System.out.println("Включился по-Асусовски (ЗенБук)");
    }

    @Override
    public void computerOff() {
        System.out.println("Выключился по-Асусовски (ЗенБук)");
    }
}
