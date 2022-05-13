package be.intecbrussel;

public class NegativeLengthException extends InvalidSizeException{
    public NegativeLengthException() {
        this("Length cannot be negative");
    }

    public NegativeLengthException(String message) {
        super(message);
    }
}
