import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number;

        do {
            System.out.println("Enter a positive number:");
            number = scanner.nextInt();
        } while (number <= 0);

        System.out.println("You entered: " + number);
        scanner.close();

        // while - check condition before loop
        // do-while - at least one run without checking condition

    }
}
