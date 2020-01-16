package com.danila.polymorphism.figures;

 public class TestFigures {

    public interface Testable {

    }

    public class Testos {

    }

    public static void main(String[] args) {
        Figure figure = new Square("Фигура1",8, 8);

        System.out.println(figure.getName() + " " + figure.getSquare());
        System.out.println(figure.toString());
        System.out.println(ShapeUtils.isRectangle(figure));
        System.out.println(ShapeUtils.isTriangle(figure));

        Heightable heightable = new Parallelogram("Параллелограмм", 8, 4 ,1);
        System.out.println(heightable.height());
        System.out.println(heightable.toString());
        System.out.println(ShapeUtils.isTriangle((Figure) heightable));
        System.out.println(ShapeUtils.isRectangle((Figure) heightable));
        System.out.println(((Figure) heightable).getSquare());

    }
}