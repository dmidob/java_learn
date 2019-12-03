package lesson02.tasksresolve;
/*
Task 3 (CharsCounter)
Посчитать, сколько раз символ ch встречается в строке s.
Ограничения: нет.
int countChars(String s, char ch)
Входные аргументы: String s, char ch
Тип результата: int
 */

public class CharsCounter {

    public static void main (String[] args) {
        countChars("Some text for test", 'S');

        /*System.out.println(countChars("There are 2 chars 'r' in this text", 'r'));
        countCharsWithOutputMessage("Some text for test", 'S');
        countCharsWithOutputMessage(" ", ' ');
        countCharsWithOutputMessage("101010", '2');*/
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

        /*//вынести в отдельный метод
        private static int temp1() {
            if (countOfCharToFind == 0) {
                System.out.println("There is no any '" + charToFind + "' char in '" + inputString + "' string");
            } else {
                System.out.println("Char '" + charToFind + "' in '" + inputString + "' string is present "
                        + countOfCharToFind + " time(s)");
            }
        }*/
    }
}
