/**
 * Custom runtime exception thrown when a user is found to be underage.
 * This is an unchecked exception, extending {@link RuntimeException}.
 */
public class UnderAgeException extends RuntimeException {

    /**
     * Constructs a new UnderAgeException with the specified detail message.
     *
     * @param message the detail message
     */
    public UnderAgeException(String message) {
        super(message);
    }

    /**
     * Constructs a new UnderAgeException with no detail message.
     */
    public UnderAgeException() {
        super();
    }
}
