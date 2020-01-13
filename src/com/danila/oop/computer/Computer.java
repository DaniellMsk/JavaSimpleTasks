package com.danila.oop.computer;

public class Computer {
    private HDD hdd;
    private RAM ram;

    public Computer(HDD hdd, RAM ram) {
        this.hdd = hdd;
        this.ram = ram;
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

    public void on(){
        System.out.println("Я включился с параметрами: ram - " + this.ram.getMemory() + ", hdd - " + this.hdd.getMemory());
    }

    public void off(){
        System.out.println("Я выключился");
    }
}
