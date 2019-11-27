package lesson02;
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
        System.out.println(isPalindromeChecking("12345 6 7 6 54321"));
    }

    private static boolean isPalindromeChecking (String inputString){
        boolean isPalindrome = false;
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
