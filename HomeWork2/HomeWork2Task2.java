package Lesson2;

import java.util.Scanner;

public class HomeWork2Task2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размеры первого дома: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("Введите размеры второго дома: ");
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        System.out.println("Введите размеры участка: ");
        int e = scanner.nextInt();
        int f = scanner.nextInt();

        int resultMax = findMaxValue(a, b);
        int resultMin = findMinValue(a, b);
        System.out.println("Размеры первого дома a x b: " + resultMax +"x" + resultMin);

        int resultMax1 = findMaxValue1(c, d);
        int resultMin1 = findMinValue1(c, d);
        System.out.println("Размеры второго дома с x d: " + resultMax1 +"x" + resultMin1);

        int resultMax2 = findMaxValue2(e, f);
        int resultMin2 = findMinValue2(e, f);
        System.out.println("Размеры участка e x f: " + resultMax2 +"x" + resultMin2);

        if (((resultMax2 >= resultMax1) && (resultMax2 >= resultMax) && (resultMax2 > 0)) &&
        ((resultMin2 >= resultMin1) && (resultMin2 >= resultMin) && (resultMin2 > 0))) {
            System.out.println("Каждый из домов помещается на участке e x f");
        } else System.out.println("Дома не помещаются на участке e x f");
    }


    public static int findMaxValue(int firstValue, int secondValue) {
        int resultMax = firstValue;
        if (firstValue < secondValue) {
            resultMax = secondValue;
        }
        return resultMax;}


    public static int findMinValue(int firstValue3, int secondValue3) {
        int resultMin = firstValue3;
        if (firstValue3 > secondValue3) {
            resultMin = secondValue3;
        }
        return resultMin;}


    public static int findMaxValue1(int firstValue1, int secondValue1) {
        int resultMax1 = firstValue1;
        if (firstValue1 < secondValue1) {
            resultMax1 = secondValue1;
        }
        return resultMax1;}


    public static int findMinValue1(int firstValue4, int secondValue4) {
        int resultMin1 = firstValue4;
        if (firstValue4 > secondValue4) {
            resultMin1 = secondValue4;
        }
        return resultMin1;}


    public static int findMaxValue2(int firstValue2, int secondValue2) {
        int resultMax2 = firstValue2;
        if (firstValue2 < secondValue2) {
            resultMax2 = secondValue2;
        }
        return resultMax2;}


    public static int findMinValue2(int firstValue5, int secondValue5) {
        int resultMin2 = firstValue5;
        if (firstValue5 > secondValue5) {
            resultMin2 = secondValue5;
        }
        return resultMin2;}
}

