package Lesson3;

import java.util.Scanner;

public class HomeWork3Task1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int value = scanner.nextInt();

        if (value <= 0) {System.out.println("Отрицательное число!");}
        int n0 = 1;
        if (value > 0) {System.out.println(n0 + " ");}
        int n1 = 1;
        if (value > 0) {System.out.println(n1 + " ");}
        int n2 = 2;


        for (int i = 1; i < value; i++) {

            if (value > n2) {
                System.out.println(n2 + " ");
                n2 = n0 + n1;
                n0 = n1;
                n1 = n2;
            }

        }
    }
}
