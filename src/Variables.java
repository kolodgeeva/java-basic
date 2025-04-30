public class Variables {

    public static void main(String[] args) {

        // <target_type> variableName = (<target_type>) value;

        double myDouble = 9.78;
        int myInt = (int) myDouble; // Explicit casting

        System.out.println(myInt);

        long myLong = 3565675678678687L;
        int smallInt = (int) myLong;

        System.out.println(smallInt);

        int number1 = 10;
        double number2 = 3.5;

        double result = number1 + number2;
        System.out.println(result);

        String input = "42";
        int intValue = Integer.parseInt(input);

        System.out.println(intValue);




    }
}
