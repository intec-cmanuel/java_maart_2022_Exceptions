package be.intecbrussel;

import java.util.Scanner;

public class OrDemo {
    private static Scanner scanner;

    public static void main(String[] args) {
        System.out.println(printAndReturn(false) && printAndReturn(true));
    }

    public static boolean printAndReturn(boolean b) {

        if (scanner != null && scanner.hasNext()) {

        }

        System.out.println("Hello");
        return b;
    }
}
