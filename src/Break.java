import java.util.Scanner;

public class Break {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i <= 5; i++) {
            System.out.println("Enter a positive number (negative to stop):");
            int number = scanner.nextInt();

            if (number < 0) {
                System.out.println("Negative number detected. Stopping the loop.");
                break; // Exit loop
            }

            System.out.println("You entered: " + number);
        }

        scanner.close();
    }
}
