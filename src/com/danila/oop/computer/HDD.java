package com.danila.oop.computer;

public class HDD {
    private String name;
    private int memory;

    public HDD(String name, int memory) {
        this.name = name;
        this.memory = memory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }
}
