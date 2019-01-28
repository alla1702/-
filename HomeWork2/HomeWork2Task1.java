package Lesson2;

import java.util.Scanner;

public class HomeWork2Task1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите дату: ");
        int date = scanner.nextInt();
        System.out.println("Введите месяц: ");
        int month = scanner.nextInt();
        System.out.println("Введите год: ");
        int year = scanner.nextInt();
        int firstDay = 1;
        int firstMonth = 1;
        int nextDay = date + 1;
        int nextMonth = month + 1;
        int nextYear = year + 1;


        if ((date > 0 && date < 31) && (month == 1 || month == 3 || month == 5
                || month == 7 || month == 8 || month == 10 || month == 12)) {
            System.out.println(nextDay + "." + month + "." + year);
            //Даты от 0 до 31(не включая); месяцы: 1 - Январь, 3 - Март, 5 - Май, 7 - Июль,
            // 8 - Август, 10 - Октябрь, 12 - Декабрь; год - любой
        } else if ((date > 0 && date < 30) && (month == 4 || month == 6 || month == 9 || month == 11)) {
            System.out.println(nextDay + "." + month + "." + year);
            //Даты от 0 до 30(не включая); месяцы: 4 - Апрель, 6 - Июль, 9 - Сентябрь, 11 - Ноябрь; год - любой
        } else if ((year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) && month == 2 && (date > 0 && date < 29)) {
            System.out.println(nextDay + "." + month + "." + year);
            //Даты от 0 до 29(не включая); месяц: 2 - Февраль; год - високосный
        } else if (month == 2 && (date > 0 && date < 28)) {
            System.out.println(nextDay + "." + month + "." + year);
            //Даты от 0 до 28(не включая); месяц: 2 - Февраль; год - не високосный
        } else  if ((date == 31) && (month == 1 || month == 3 || month == 5
                || month == 7 || month == 8 || month == 10)) {
            System.out.println(firstDay + "." + nextMonth + "." + year);
            //31 число; месяцы: 1 - Январь, 3 - Март, 5 - Май, 7 - Июль,
            // 8 - Август, 10 - Октябрь; год - любой
        } else if ((date == 30) && (month == 4 || month == 6 || month == 9 || month == 11)) {
            System.out.println(firstDay + "." + nextMonth + "." + year);
            //31 число; месяцы: 4 - Апрель, 6 - Июль, 9 - Сентябрь, 11 - Ноябрь; год - любой
        } else if (date == 31 && month == 12) {
            System.out.println(firstDay + "." + firstMonth + "." + nextYear);
            //31 число; месяц 12 - Декабрь; год - любой
        } else if ((year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) && month == 2 && (date == 29)) {
            System.out.println(firstDay + "." + nextMonth + "." + year);
            //29 число; месяц: 2 - Февраль; год - високосный
        } else if ((year % 400 != 0 || (year % 4 != 0 && year % 100 == 0)) && month == 2 && (date == 28)) {
            System.out.println(firstDay + "." + nextMonth + "." + year);
            //28 число; месяц: 2 - Февраль; год - високосный
        } else System.out.println("Неверно введена дата!");

    }
}

