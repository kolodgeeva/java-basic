public class AssignmentOperators {

    public static void main(String[] args) {

        int number = 10;


        int x = 5;
        int y = x + 3;
        System.out.println(y);

        x += 5; // x = x + 5
        System.out.println(x);

        x -= 3; // x = x - 3
        System.out.println(x);

        x *= 2;
        System.out.println(x);

        x /= 2;
        System.out.println(x);

        x %= 2;
        System.out.println(x);

        // do not use
        x += (y * 2) / 2;

        int a = 0;
        a += 5;
        System.out.println(a);


    }
}
