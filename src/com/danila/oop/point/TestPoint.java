package com.danila.oop.point;

public class TestPoint {
    public static void main(String[] args) {
        Point point1 = new Point(5,2);
        Point point2 = new Point(3,3);

        Rectange rectange = new Rectange(point1, point2);

        System.out.println("Расстояние " + point1.distance(4,5));
        System.out.println("Площадь " + rectange.area());
        System.out.println("Диагональ " + rectange.diagonal());
    }
}
