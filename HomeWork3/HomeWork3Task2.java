package Lesson3;

import java.util.Scanner;

public class HomeWork3Task2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int fn = fibonachi(n);
        System.out.println(fn);

        if (n <= 0) {System.out.println("Отрицательное число!");}

      }

        public static int fibonachi(int n){

            if (n == 0) {
                return 0;
            }
            if (n == 1) {
                return 1;
            } else {
                return (fibonachi(n - 1) + fibonachi(n - 2));
            }
        }

    }

