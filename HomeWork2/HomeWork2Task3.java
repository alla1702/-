package Lesson2;

import java.util.Scanner;

public class HomeWork2Task3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Решение квадратного уравнения: a*x*x + b*x + c = 0");
        System.out.println("Введите а:");
        double a = scanner.nextDouble();
        System.out.println("Введите b:");
        double b = scanner.nextDouble();
        System.out.println("Введите c:");
        double c = scanner.nextDouble();

        double D = discriminant(a, b, c);
        isPositive(D, a, b);
        isZero(D, a, b);
    }


    public static double discriminant(double A, double B, double C) {
        double D = B * B - 4 * A * C;
        return D;
    }

    public static void isPositive(double Discrim, double A, double B) {
        if (Discrim > 0) {
            double x1 = ((-B + Math.sqrt(Discrim)) / (2 * A));
            System.out.println("x1: " + x1);
            double x2 = ((-B - Math.sqrt(Discrim)) / (2 * A));
            System.out.println("x2: " + x2);}
        return;
    }


    public static void isZero(double Discrim, double A, double B) {
        if (Discrim == 0) {
            double x = (-B) / (2 * A);
            System.out.println("x: " + x);
        } else System.out.println("Дискриминант меньше нуля: корней в уравнении нет");
        return;
    }
}






