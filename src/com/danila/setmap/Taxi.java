package com.danila.setmap;

public class Taxi extends Car {
    private int passangers;

    public Taxi(String mark, String model, int year, String color, String fuel, int passangers) {
        super(mark, model, year, color, fuel);
        this.passangers = passangers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Taxi taxi = (Taxi) o;
        return passangers == taxi.passangers;
    }

    @Override
    public int hashCode() {
        return 17 * passangers;
    }

    @Override
    public String toString() {
        return "Taxi{" +
                "passangers=" + passangers +
                '}';
    }
}
