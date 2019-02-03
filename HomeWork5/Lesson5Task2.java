package Lesson5;

import java.util.Scanner;

public class Lesson5Task2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите римские цифры (от 1 до 3999): ");
        String value = scanner.next();
        String value1 = value.toUpperCase();
        char[] ARRAYRome = value1.toCharArray();
        System.out.println(ARRAYRome);
        int Size = value1.length();
        int[] ARRAYNumber = new int[value1.length()];
        int Arabic = 0;

        for (int i = 0; i < Size; i++) {
            switch (ARRAYRome[i]) {
                case 'I':
                    ARRAYNumber[i] = 1;
                    break;
                case 'V':
                    ARRAYNumber[i] = 5;
                    break;
                case 'X':
                    ARRAYNumber[i] = 10;
                    break;
                case 'L':
                    ARRAYNumber[i] = 50;
                    break;
                case 'C':
                    ARRAYNumber[i] = 100;
                    break;
                case 'D':
                    ARRAYNumber[i] = 500;
                    break;
                case 'M':
                    ARRAYNumber[i] = 1000;
                    break;
                default:
                    System.out.println("Ошибка! Проверьте правильность ввода цифр!");
                    i = Size;
            }
        }

        for (int i = Size - 1; i > 0; i--) {
            if (ARRAYNumber[i] > ARRAYNumber[i - 1]) {
                ARRAYNumber[i - 1] = -ARRAYNumber[i - 1];
            }
        }

        for (int i = 0; i < Size; i++) {
            Arabic += ARRAYNumber[i];
        }

        System.out.println(Arabic);
    }
}






