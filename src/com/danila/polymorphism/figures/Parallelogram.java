package com.danila.polymorphism.figures;

public class Parallelogram extends Quadrangle implements Diagonalable, Heightable {
    private int angle;

    public Parallelogram(String name, int length, int width, int angle) {
        super(name, length, width);
        this.angle = angle;
    }

    @Override
    public double diagonal() {
        return Math.sqrt(Math.pow(super.getLength(), 2) + Math.pow(super.getWidth(), 2) - 2 * super.getLength() * super.getWidth() * Math.cos(angle));
    }

    @Override
    public double height() {
        return getWidth() * Math.sin(angle);
    }

    @Override
    public double getPerimeter() {
        return getLength() + getWidth();
    }

    @Override
    public double getSquare() {
        return getLength() * getWidth() * Math.sin(angle);
    }

    @Override
    public String toString() {
        return getName() + " Длина " + getLength() + " Ширина " + getWidth() + " Угол " + angle;
    }
}
