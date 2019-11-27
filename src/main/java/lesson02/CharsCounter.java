package lesson02;

/*
Посчитать, сколько раз символ ch встречается в строке s.
 */

public class CharsCounter {

    public static void main (String[] args) {
        System.out.println(countChars("There are 2 chars 'r' in this text", 'r'));
        countCharsWithOutputMessage("Some text for test", 'S');
        countCharsWithOutputMessage(" ", ' ');
        countCharsWithOutputMessage("101010", '2');
    }

    private static int countChars (String inputString, char charToFind){
        int countOfCharToFind = 0;
        for (int i = 0; i < inputString.length(); i++) {
            if (inputString.charAt(i) == charToFind){
                countOfCharToFind++;
            }
        }
        return countOfCharToFind;
    }

    //alternative method for chars counter with beautiful output
    private static void countCharsWithOutputMessage (String inputString, char charToFind){
        int countOfCharToFind = 0;
        for (int i = 0; i < inputString.length(); i++) {
            if (inputString.charAt(i) == charToFind){
                countOfCharToFind++;
            }
        }
        if (countOfCharToFind == 0) {
            System.out.println("There is no any '"+ charToFind + "' char in '" + inputString + "' string");
        } else {
            System.out.println("Char '" + charToFind + "' in '" + inputString + "' string is present "
                    + countOfCharToFind + " time(s)");
        }
    }
}
