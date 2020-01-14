package lesson03.conditions;
/*
Task 4 (DaysOfMonth)
Определить, сколько дней в месяце в не високосный год. Не использовать классы из стандартной библиотеки.
Использовать конструкцию switch-case.
Ограничения: month = 1 … 12.
int daysOfMonth(int month)
Входные аргументы int month
Тип результата int
 */

import utils.errorhandling.ExceptionHandling;

public class DaysOfMonth {
    public static void main (String[] args) {
        System.out.println(daysOfMonth(13));
    }

    public static int daysOfMonth(int month){
        int amountOfDays = 0;
        switch (month) {
            case 1:
                amountOfDays = 31;
                break;
            case 2:
                amountOfDays = 28;
                break;
            case 3:
                amountOfDays = 31;
                break;
            case 4:
                amountOfDays = 30;
                break;
            case 5:
                amountOfDays = 31;
                break;
            case 6:
                amountOfDays = 30;
                break;
            case 7:
                amountOfDays = 31;
                break;
            case 8:
                amountOfDays = 31;
                break;
            case 9:
                amountOfDays = 30;
                break;
            case 10:
                amountOfDays = 31;
                break;
            case 11:
                amountOfDays = 30;
                break;
            case 12:
                amountOfDays = 31;
                break;
            default:
                ExceptionHandling.IllegalArgumentException(-1);
        }
        return amountOfDays;
    }
}
