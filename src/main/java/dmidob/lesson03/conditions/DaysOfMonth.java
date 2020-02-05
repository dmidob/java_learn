package dmidob.lesson03.conditions;
/*
Task 4 (DaysOfMonth)
Определить, сколько дней в месяце в не високосный год. Не использовать классы из стандартной библиотеки.
Использовать конструкцию switch-case.
Ограничения: month = 1 … 12.
int daysOfMonth(int month)
Входные аргументы int month
Тип результата int
 */

public class DaysOfMonth {
    public static final String ERROR_MESSAGE_WRONG_MONTH_INPUT = "Number of month should be between 1 and 12";

    public static void main (String[] args) {
        System.out.println(daysOfMonth(13));
    }

    public static int daysOfMonth(int month){
        int amountOfDays = 0;
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                amountOfDays = 31;
                break;
            case 2:
                amountOfDays = 28;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                amountOfDays = 30;
                break;
            default:
                throw new IllegalArgumentException(ERROR_MESSAGE_WRONG_MONTH_INPUT);
        }
        return amountOfDays;
    }
}
