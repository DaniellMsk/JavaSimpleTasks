package com.danila.oop.point;

public class Rectange {
    private Point a;
    private Point b;

    public Rectange(Point a, Point b) {
        this.a = a;
        this.b = b;
    }

    public int area() {
        return Math.abs((a.getX() - b.getX()) * (a.getY() - b.getY()));
    }

    public double diagonal() {
        return Math.abs(Math.sqrt(Math.pow((a.getX() - b.getX()), 2) + Math.pow((a.getY() - b.getY()), 2)));
    }
}
