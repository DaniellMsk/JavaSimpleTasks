package com.danila.polymorphism.monitor;

import com.danila.oop.computer.HDD;
import com.danila.oop.computer.RAM;

public class ToshibaNB extends Toshiba implements Computable {
    public ToshibaNB(HDD hdd, RAM ram, String name) {
        super(hdd, ram, name);
    }

    @Override
    public void computerOn() {
        System.out.println("Включился по-Тошибовски (НБ)");
    }

    @Override
    public void computerOff() {
        System.out.println("Выключился по-Тошибовски (НБ)");
    }
}
