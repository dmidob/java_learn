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
    public static void main (String[] args) {
        System.out.println(isPalindrome("12345 6 7 6 54321"));
    }

    private static boolean isPalindrome (String inputString){
        boolean isPalindrome = false; //TODO to rename (isNotPalindrome)
        int i = 0;
        while (i < inputString.length()) {
            if (inputString.charAt(i) == inputString.charAt(inputString.length() - i - 1)){
                isPalindrome = true;
                i++;
            }else {
                isPalindrome = false;
                break;
            }
        }
        return isPalindrome;
    }
}
