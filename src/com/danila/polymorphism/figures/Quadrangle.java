package com.danila.polymorphism.figures;

public abstract class Quadrangle extends Figure {
    private int length;
    private int width;

    public Quadrangle(String name, int length, int width) {
        super(name);
        this.length = length;
        this.width = width;
    }

    public abstract double getPerimeter();
    public abstract double getSquare();

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}
