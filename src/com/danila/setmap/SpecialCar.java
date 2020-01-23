package com.danila.setmap;

import java.util.Objects;

public class SpecialCar extends Car {

    private String function;

    public SpecialCar(String mark, String model, int year, String color, String fuel, String function) {
        super(mark, model, year, color, fuel);
        this.function = function;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SpecialCar that = (SpecialCar) o;
        return Objects.equals(function, that.function);
    }

    @Override
    public int hashCode() {
        return 23 * function.length() + (function.length() > 3 ? function.charAt(1) : 18);
    }

    @Override
    public String toString() {
        return "SpecialCar{" +
                "function='" + function + '\'' +
                '}';
    }
}
