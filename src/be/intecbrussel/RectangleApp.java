package be.intecbrussel;

import java.util.InputMismatchException;

public class RectangleApp {
    public static void main(String[] args) {
//        try {
//            Rectangle rectangle = new Rectangle(2000, 98);
//            System.out.println(rectangle.getHeight());
//            System.out.println(rectangle.getLength());
//        } catch (NegativeLengthException negativeLengthException) {
//            System.out.println("Incorrect length: " + negativeLengthException.getMessage());
//        } catch (InvalidSizeException invalidSizeException) {
//            System.out.println("Something went wrong: " + invalidSizeException.getMessage());
////            invalidSizeException.printStackTrace();
//        }

        try {
            Rectangle rectangle = new Rectangle(200, 98);
            System.out.println(rectangle.getHeight());
            System.out.println(rectangle.getLength());
        } catch (InputMismatchException | InvalidSizeException exception) {
            System.out.println("Everythings on fire");
            exception.printStackTrace();
        } finally {
            System.out.println("FINALLY");
        }


    }

}
