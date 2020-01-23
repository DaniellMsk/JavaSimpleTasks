package com.danila.setmap;

public class Cargo extends Car {
    private int capacity;

    public Cargo(String mark, String model, int year, String color, String fuel, int capacity) {
        super(mark, model, year, color, fuel);
        this.capacity = capacity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cargo cargo = (Cargo) o;
        return capacity == cargo.capacity;
    }

    @Override
    public int hashCode() {
        return 19 * capacity;
    }

    @Override
    public String toString() {
        return "Cargo{" +
                "capacity=" + capacity +
                '}';
    }
}
