package com.danila.polymorphism.monitor;

import com.danila.oop.computer.HDD;
import com.danila.oop.computer.RAM;

public class ToshibaSatellite extends Toshiba implements Computable {

    public ToshibaSatellite(HDD hdd, RAM ram, String name) {
        super(hdd, ram, name);
    }

    @Override
    public void computerOn() {
        System.out.println("Включился по-Тошибовски (Сателлит)");
    }

    @Override
    public void computerOff() {
        System.out.println("Выключился по-Тошибовски (Сателлит)");
    }
}
