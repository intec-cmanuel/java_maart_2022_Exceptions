package be.intecbrussel;

public class App {
    public static void main(String[] args) {
        MyLovelyScanner scanner = new MyLovelyScanner();

        int number = 0;
        number = scanner.askInteger();

        System.out.println("The integer is: " + number);
    }
}
