package be.intecbrussel;

public class Rectangle {
    private int length;
    private int height;
    private final int MAX_SIZE = 1000;

    public Rectangle(int length, int height) throws InvalidSizeException{
        try {
            setLength(length);
        } catch (InvalidSizeException invalidSizeException) {
            System.out.println("EXCEPTION IN CONSTRUCTOR: " + invalidSizeException.getMessage());
            throw invalidSizeException;
        }

        setHeight(height);
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) throws InvalidSizeException{
        if (length<0) {
            throw new NegativeLengthException();
        } else if (length > MAX_SIZE) {
            throw new InvalidSizeException("Length is bigger than Max Size");
        }
        this.length = length;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
