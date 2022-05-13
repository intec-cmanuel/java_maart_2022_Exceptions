package be.intecbrussel;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MyLovelyScanner {
    private Scanner scanner;

    public MyLovelyScanner() {
        this.scanner = new Scanner(System.in);
    }

    public int askInteger() {
        int result = 0;

        try {
            result = scanner.nextInt();
        } catch (InputMismatchException inputMismatchException) {
//            scanner.nextLine();
            System.out.println("That was not an integer, try again");
            result = askInteger();
        }

        return result;
    }
}
