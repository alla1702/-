package Lesson6.HomeWork6;

public class Rectangle {

    public static double RectangleArea (Point point1, Point point2) {
        double dx = point1.getX() - point2.getX();
        double dy = point1.getY() - point2.getY();
        double S = Math.abs(dx) * Math.abs(dy);
        return S;
    }

    public static double DISTANCE (Point point1, Point point2) {
        double dx = point1.getX() - point2.getX();
        double dy = point1.getY() - point2.getY();
        double dis = Math.sqrt(dx * dx + dy * dy);
        return dis;
    }

}
