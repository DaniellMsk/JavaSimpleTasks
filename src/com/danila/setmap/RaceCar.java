package com.danila.setmap;

public class RaceCar extends Car {
    private int maxSpeed;

    public RaceCar(String mark, String model, int year, String color, String fuel, int maxSpeed) {
        super(mark, model, year, color, fuel);
        this.maxSpeed = maxSpeed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RaceCar raceCar = (RaceCar) o;
        return maxSpeed == raceCar.maxSpeed;
    }

    @Override
    public int hashCode() {
        return 13 * maxSpeed;
    }

    @Override
    public String toString() {
        return "RaceCar{" +
                "maxSpeed=" + maxSpeed +
                '}';
    }
}
