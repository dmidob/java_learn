package lesson03.conditions;
/*
Task 3 (LuckyTicket)
Определить, является ли билетик ticket счастливым. Номер билетика - целое 6-значное число.
Счастливый - это такой билетик, у которого сумма старших 3-х цифр и младших 3-х цифр совпадают.
Ограничения: ticket = 0 … 999999.
boolean isLuckyTicket(int ticket)
Входные аргументы int ticket
Тип результата boolean
*/

public class LuckyTicket {
    public static final String ERROR_MESSAGE_FOR_WRONG_TICKET_NUMBER_INPUT = "Ticket number should be positive 6 digits number";

    public static void main (String[] args) {
        System.out.println(isLuckyTicket(157931));
    }

    public static boolean isLuckyTicket(int ticket){
        if (ticket > 999999 || ticket < 100000) {
            throw new IllegalArgumentException(ERROR_MESSAGE_FOR_WRONG_TICKET_NUMBER_INPUT);
        }
        return calculateSumOfFirstThreeDigits(ticket) == calculateSumOfSecondThreeDigits(ticket);
    }

    public static int calculateSumOfFirstThreeDigits(int sixDigitsNumber){
        return getIntAt(sixDigitsNumber, 1) + getIntAt(sixDigitsNumber, 2) + getIntAt(sixDigitsNumber, 3);
    }

    public static int calculateSumOfSecondThreeDigits(int sixDigitsNumber){
        return getIntAt(sixDigitsNumber, 4) + getIntAt(sixDigitsNumber, 5) + getIntAt(sixDigitsNumber, 6);
    }

    private static int getIntAt (int number, int index){
        return Integer.parseInt(Integer.toString(number).substring(index-1, index));
    }










    public static boolean isTicketNumberCorrect(int ticket){
        return (100000 <= ticket && ticket <= 999999);
    }
}
