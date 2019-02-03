package Lesson6.HomeWork6;

public class Geometry {

    public static void main(String[] args) {

        Point point1 = new Point(0,5);
        Point point2 = new Point(-2,6);

        point1.print();
        point2.print();

        point1.distance();
        point2.distance();

        System.out.println("Площадь прямоугольника: " + new Rectangle().RectangleArea(point1, point2));

        System.out.println("Расстояние между заданными точками: " + new Rectangle().DISTANCE(point1, point2));


    }
}
