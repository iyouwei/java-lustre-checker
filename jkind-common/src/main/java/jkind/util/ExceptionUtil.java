package jkind.util;

public class ExceptionUtil {

    public static void error(String message) {
        try {
            throw new Exception(message);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
