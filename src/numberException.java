public class numberException extends Exception {
    public numberException() {
    }

    public numberException(String message) {
        super (message);
    }

    public numberException(String message, Throwable cause) {
        super (message, cause);
    }

    public numberException(Throwable cause) {
        super (cause);
    }

    public numberException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super (message, cause, enableSuppression, writableStackTrace);
    }
}
