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
}
