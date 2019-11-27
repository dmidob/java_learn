package lesson02;

public class EvensRangePrinter {

    public static void main (String[] args)  {
        printEvensRange(ConsoleInput.inputNumberFromConsole("Please input first number: "),
                ConsoleInput.inputNumberFromConsole("Please input last number: "));
    }

    private static void printEvensRange (int firstNumber, int lastNumber){
        if (firstNumber < lastNumber){
            for (int i = firstNumber; i <= lastNumber; i++) {
                if (i % 2 == 0) {
                    System.out.print(i + " ");
                }
            }
        }
    }
}
