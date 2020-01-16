package com.danila.polymorphism.figures;

public abstract class Figure {
    private String name;

    public String getName() {
        return name;
    }

    public abstract double getPerimeter();
    public abstract double getSquare();

    public void setName(String name) {
        this.name = name;
    }

    public Figure(String name) {
        this.name = name;
    }
}
