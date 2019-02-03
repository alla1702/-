package Lesson5;

import java.util.Scanner;

public class Lesson5Task1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите слово: ");
        String value = scanner.next();
        char[] ARRAY = value.toCharArray();

        if (isPalindrom(ARRAY)) {
            System.out.println("Введенное слово палиндром!!!");
        } else System.out.println("Введенное слово не является палиндромом!!!");
    }

    public static boolean isPalindrom(char[] value) {
        int i1 = 0;
        int i2 = value.length - 1;
        while (i2 > i1) {
            if (value[i1] != value[i2]) {
                return false;
            }
            ++i1;
            --i2;
        }
        return true;
    }
}
