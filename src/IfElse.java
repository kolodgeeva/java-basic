import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input your score:");
        int score = scanner.nextInt();

        if (score >= 80 && score < 90) {
            System.out.println("Grade: B");
            System.out.println("Well done");
        }

    }
}
