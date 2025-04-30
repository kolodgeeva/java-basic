public class Operators {

    public static void main(String[] args) {
        System.out.println(5 > 3);
        System.out.println(3 < 5);
        System.out.println(5 >= 6);
        System.out.println(6 <= 4);
        System.out.println(6 == 6);
        System.out.println(6 != 6);

        int a = 3;
        int b = 5;
        System.out.println("a < b:" + (a < b));

        // && and
        // || or
        // ! not

        System.out.println(
                (5 < 3) && (6 > 3)
        );

        boolean isValid = true;
        System.out.println("isValid before: " + isValid);

        isValid = !isValid;
        System.out.println("isValid after:" + isValid);


        int age = 17;
        boolean hasLicense = true;

        if (age > 18 && hasLicense) {
            System.out.println("You can drive");
        }

        if (age < 18 || !hasLicense) {
            System.out.println("You cannot drive");
        }
    }
}
