package com.danila.polymorphism.figures;

public class Triangle extends Figure {
    private int base;
    private int height;
    private int partOfBase;

    public Triangle(String name, int base, int height, int partOfBase) {
        super(name);
        this.base = base;
        this.height = height;
        this.partOfBase = partOfBase;
    }

    @Override
    public double getPerimeter() {
        return Math.sqrt(Math.pow(partOfBase, 2) + Math.pow(height, 2))
                + Math.sqrt(Math.pow(base - partOfBase, 2) + Math.pow(height, 2)) + height;
    }

    @Override
    public double getSquare() {
        return base * height;
    }

    @Override
    public String toString() {
        return getName() + " Основание " + base + " Высота " + height + " Расстояние от угла до высоты " + partOfBase;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
