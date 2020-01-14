package utils.errorhandling;

public class ExceptionHandling {
    public static void IllegalArgumentException(int exitCode) {
        System.out.println("Illegal argument exception");
        System.exit(exitCode);
    }

}
