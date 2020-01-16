package com.danila.polymorphism.figures;

public class Rectangle extends Quadrangle implements Diagonalable {
    public Rectangle(String name, int length, int width) {
        super(name, length, width);
    }

    @Override
    public double getPerimeter() {
        return (getLength() + getWidth()) * 2;
    }

    @Override
    public double getSquare() {
        return getWidth() * getLength();
    }

    @Override
    public double diagonal() {
        return Math.sqrt(Math.pow(getLength(), 2) + Math.pow(getLength(), 2));
    }

    @Override
    public String toString() {
        return getName() + " Длина " + getLength() + " Ширина " + getWidth();
    }
}
