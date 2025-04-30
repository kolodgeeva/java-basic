import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Please input value for index " + i);
            numbers[i] = scanner.nextInt();
        }

        int max = numbers[0]; // assume first element is max

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i]; // update max if a larger number is found
            }
        }

        System.out.println("The largest number is: " + max);

    }
}
