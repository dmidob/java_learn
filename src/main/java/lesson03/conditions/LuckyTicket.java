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

import utils.errorhandling.ExceptionHandling;

public class LuckyTicket {
    public static void main (String[] args) {
        System.out.println(isLuckyTicket(123321));
    }

    public static boolean isLuckyTicket(int ticket){
        int firstPartOfTicketNumber = ticket / 100000 + ticket % 100000 / 10000 + ticket % 10000 / 1000;
        int secondPartOfTicketNumber = ticket % 1000 / 100 + ticket % 100 / 10 + ticket % 10;
        if (!isTicketNumberCorrect(ticket)) {
            ExceptionHandling.IllegalArgumentException(-1);
        }
        return firstPartOfTicketNumber == secondPartOfTicketNumber;
    }

    public static boolean isTicketNumberCorrect(int ticket){
        return (100000 <= ticket && ticket <= 999999);
    }
}
