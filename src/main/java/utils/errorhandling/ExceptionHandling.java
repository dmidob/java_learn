package utils.errorhandling;

public class ExceptionHandling {
    public static void IllegalArgumentException(int errorCode) {
        System.out.println("Illegal argument exception");
        System.exit(errorCode);
    }

}
