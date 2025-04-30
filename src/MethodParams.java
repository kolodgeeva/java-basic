import java.util.Scanner;

public class MethodParams {
    public static void main(String[] args) {
//        greet("Mariana");
//
//        String name = "Alice";
//        greet(name);
//
//        Scanner scanner = new Scanner(System.in);
//
//        String userName = scanner.nextLine();
//        greet(userName);

        int result = add(10, 2);
        System.out.println(result);
    }

    public static void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }

    public static int add(int a, int b) {
        int result = a + b;
        return result;
    }
}
