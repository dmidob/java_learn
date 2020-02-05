package dmidob.lesson03.conditions;
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
    public static final String ERROR_MESSAGE_FOR_WRONG_TICKET_NUMBER_INPUT = "Ticket number should be between 0...999999";

    public static void main (String[] args) {
        System.out.println(isLuckyTicket(157931));
    }

    public static boolean isLuckyTicket(int ticket){
        String firstThreeDigits = castNumberToSixDigitsString(ticket).substring(0,3);
        String secondThreeDigits = castNumberToSixDigitsString(ticket).substring(3,6);
        return getSumOfThreeDigitsOfNumber(firstThreeDigits) == getSumOfThreeDigitsOfNumber(secondThreeDigits);
    }

    static String castNumberToSixDigitsString (int number){
        if (0 > number || number > 999999) {
            throw new IllegalArgumentException(ERROR_MESSAGE_FOR_WRONG_TICKET_NUMBER_INPUT);
        }
        String sixDigitsNumber = Integer.toString(number);
        while (sixDigitsNumber.length() < 6){
            sixDigitsNumber = "0".concat(sixDigitsNumber);
        }
        return sixDigitsNumber;
    }

    static int getSumOfThreeDigitsOfNumber(String ticketNumber){
        int sumOfThreeNumberDigits = 0;
        for (int i = 0; i <= 2; i++) {
            sumOfThreeNumberDigits += Character.getNumericValue(ticketNumber.charAt(i));
        }
        return sumOfThreeNumberDigits;
    }

}
