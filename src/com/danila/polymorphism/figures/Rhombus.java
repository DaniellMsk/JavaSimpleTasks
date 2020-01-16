package com.danila.polymorphism.figures;

public class Rhombus extends Quadrangle implements Diagonalable, Heightable {
    private int angle;

    public Rhombus(String name, int length, int width, int angle) {
        super(name, length, width);
        this.angle = angle;
    }

    @Override
    public double diagonal() {
        return getLength() * (Math.sqrt(2 - 2 * Math.cos(180 - angle)));
    }

    @Override
    public double height() {
        return getLength() * Math.sin(angle);
    }

    @Override
    public double getPerimeter() {
        return getLength() * 4;
    }

    @Override
    public double getSquare() {
        return getLength() * 2 * Math.sin(angle);
    }

    @Override
    public String toString() {
        return getName() + " Длина стороны " + getLength() + " Угол " + angle;
    }
}
