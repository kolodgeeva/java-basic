public class AccessArrays {

    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50, 60};

        System.out.println("numbers length: " + numbers.length);

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }

        for (int number: numbers) {
            System.out.println("Element: " + number);
        }
    }
}
