package com.danila.polymorphism.figures;

public class Square extends Quadrangle implements Diagonalable {
    public Square(String name, int length, int width) {
        super(name, length, width);
    }

    @Override
    public double diagonal() {
        return Math.sqrt(Math.pow(getLength(), 2) + Math.pow(getLength(), 2));
    }

    @Override
    public double getPerimeter() {
        return getLength() * 4;
    }

    @Override
    public double getSquare() {
        return Math.pow(getLength(), 2);
    }

    @Override
    public String toString() {
        return getName() + " Длина стороны " + getLength();
    }
}
