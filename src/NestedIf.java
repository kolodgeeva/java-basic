import java.util.Scanner;

public class NestedIf {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String correctUsername = "admin";
        String correctPassword = "1234";

        System.out.println("Enter username:");

        String username = scanner.nextLine();

        // ==
        if (username.equals(correctUsername)) {
            System.out.println("Enter password:");

            String password = scanner.nextLine();

            if (password.equals(correctPassword)) {
                System.out.println("Login successful!");
            } else {
                System.out.println("Incorrect password!");
            }
        } else {
            System.out.println("Incorrect username!");
        }

        scanner.close();
    }
}
