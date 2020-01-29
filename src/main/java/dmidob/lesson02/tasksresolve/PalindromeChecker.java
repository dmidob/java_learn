package dmidob.lesson02.tasksresolve;
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
    private static final String STRING_FOR_PALINDROME_CHECK = "123454321";
    public static void main (String[] args) {
        System.out.println(isPalindrome(STRING_FOR_PALINDROME_CHECK));
    }

    static boolean isPalindrome (String inputString){
        int i = 0;
        while (i < inputString.length()) {
            if (inputString.charAt(i) != inputString.charAt(inputString.length() - i - 1)){
                return false;
            }
            i++;
        }
        return true;
    }
}
