package com.danila.polymorphism.figures;

public class ShapeUtils {
    public static boolean isTriangle(Figure figure) {
        return figure instanceof Triangle;
    }

    public static boolean isRectangle(Figure figure) {
        return figure instanceof Rectangle || figure instanceof Square;
    }
}
