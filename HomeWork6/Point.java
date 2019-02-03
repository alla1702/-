package Lesson6.HomeWork6;

public class Point {

    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public void print() {
        System.out.println("x: " + x + ", y: " + y);
    }

    public void setX(double x1) {
        x = x1;
    }

    public double getX() {
        return x;
    }

    public void setY(double y1) {
        y = y1;
    }

    public double getY() {
        return y;
    }

    void distance() {
        double D = Math.sqrt(x * x + y * y);
        System.out.println("Расстояние от нулевой координаты до точки: " + D);
    }
}

