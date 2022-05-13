package be.intecbrussel;

public class InvalidSizeException extends Exception {
    public InvalidSizeException() {
        this("The size was not correct.");
    }

    public InvalidSizeException(String message) {
        super(message);
    }
}
