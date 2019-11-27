package lesson02;

public class PalindromeChecker {
    public static void main (String[] args) {
        System.out.println(isPalindrome("12345 6 7 6 54321"));
    }

    private static boolean isPalindrome (String inputString){
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
