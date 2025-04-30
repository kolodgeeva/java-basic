import java.util.Scanner;

public class SwitchChar {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        char letter = scanner.nextLine().charAt(0);

        switch (letter) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("Vowel");
                break;
            default:
                System.out.println("Consonant");
        }

    }
}
