package com.danila.polymorphism.monitor;

import com.danila.oop.computer.HDD;
import com.danila.oop.computer.RAM;

import java.util.Random;

public class RunDevices {
    public static void main(String[] args) {

        HDD hdd = new HDD("Toshiba", 512);
        RAM ram = new RAM("Seagate", 1024);
        Computer computer = new ToshibaNB(hdd, ram, "Asus");

        Monitor monitor = new Monitor();

        monitor.connectDevice(computer.getName());
        monitor.connectDevice(ram.getName());
        monitor.connectDevice(hdd.getName());

        monitor.diagnose();

        Random random = new Random();

        int randomNotebook = random.nextInt(4);

        Computable myNotebook = null;

        switch (randomNotebook) {
            case 0:
                myNotebook = new ToshibaNB(hdd, ram, "НБ");
                break;
            case 1:
                myNotebook = new ToshibaSatellite(hdd, ram, "Сателлит");
                break;
            case 2:
                myNotebook = new AsusVivoBook(hdd, ram, "ВивоБук");
                break;
            case 3:
                myNotebook = new AsusZenBook(hdd, ram, "ЗенБук");
                break;
            default:
                System.out.println("Ноутбука нет");
        }

        if (myNotebook != null){
            myNotebook.computerOn();
            myNotebook.computerOff();
        }
    }
}
