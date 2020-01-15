package com.danila.polymorphism.monitor;

import com.danila.oop.computer.HDD;
import com.danila.oop.computer.RAM;

public abstract class Computer {
    private String name;

    private HDD hdd;
    private RAM ram;

    public Computer(HDD hdd, RAM ram, String name) {
        this.hdd = hdd;
        this.ram = ram;
        this.name = name;
    }

    public HDD getHdd() {
        return hdd;
    }

    public void setHdd(HDD hdd) {
        this.hdd = hdd;
    }

    public RAM getRam() {
        return ram;
    }

    public void setRam(RAM ram) {
        this.ram = ram;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void on(){
        System.out.println("Я включился с параметрами: ram - " + this.ram.getMemory() + ", hdd - " + this.hdd.getMemory());
    }

    public void off(){
        System.out.println("Я выключился");
    }
}
