public class Printer {
    public static void main(String[] args) {
        System.out.print("hello from the same line");
        System.out.println("New line");
        System.out.println("New line 2");

        int number = 42;
        System.out.println("number = " + number);

        double price = 19.99;
        int quantity = 3;
        System.out.printf("The total price for %d items is $%.4f%n%n%n", quantity, price * quantity);
    }
}
