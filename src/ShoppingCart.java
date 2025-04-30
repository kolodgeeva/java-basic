import java.util.Scanner;

public class ShoppingCart {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of items:");

        int itemCount = scanner.nextInt();
        double total = 0;
        for (int i = 0; i < itemCount; i++) {
            System.out.println("Enter price of item " + i + ":");
            double price = scanner.nextDouble();
            total += price;
        }

        System.out.println("Total price: $" + total);
        scanner.close();
    }
}
