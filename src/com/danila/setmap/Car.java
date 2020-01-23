package com.danila.setmap;

public abstract class Car {
    private String mark;
    private String model;
    private int year;
    private String color;
    private String fuel;

    public Car(String mark, String model, int year, String color, String fuel) {
        this.mark = mark;
        this.model = model;
        this.year = year;
        this.color = color;
        this.fuel = fuel;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }
}
