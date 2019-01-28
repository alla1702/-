package Lesson3;

import java.util.Scanner;

public class HomeWork3Task3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество дней N: ");

        int N = scanner.nextInt();
        double middle = 0;
        double sum = 0;
        double maxValue = Double.MIN_VALUE;

        for (int i = 0; i < N; i++) {
            System.out.println("Введите значения осадков: ");
            double value = scanner.nextInt();
            sum += value;
            middle = sum / N;
            if (value > maxValue) {
                maxValue = value;
            }
        }
        System.out.println("Сумма осадков: " + sum);
        System.out.println("Среднее количество осадков: " + middle);
        System.out.println("Максимальное количество осадков: " + maxValue);

    }


}


