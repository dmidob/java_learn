package lesson02.tasksresolve;
/*
Task 4 (PalindromeChecker)
Определить, является ли строка палиндромом. Палиндром - строка, которая с двух сторон читается одинаково.
Создавать новые строки запрещено.
Ограничения: нет.
boolean isPalindrome(String s)
Входные аргументы: String s
Тип результата: boolean
*/

public class PalindromeChecker {
    private static final String STRING_FOR_PALINDROM_CHECK = "123454321";
    public static void main (String[] args) {
        System.out.println(isPalindrome(STRING_FOR_PALINDROM_CHECK));
    }

    private static boolean isPalindrome (String inputString){
        boolean isPalindrome = true;
        int i = 0;
        while (i < inputString.length()) {
            if (inputString.charAt(i) != inputString.charAt(inputString.length() - i - 1)){
                isPalindrome = false;
                break;
            }
            i++;
        }
        return isPalindrome;
    }
}
