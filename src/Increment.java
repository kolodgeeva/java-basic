public class Increment {
    public static void main(String[] args) {

        // ++
        // --

        int x = 5;
        x++;

        System.out.println(x);

        x--;
        System.out.println(x);

        int a = 5;
        int b;

        b = --a;
        System.out.println("a: " + a + ", b: " + b);

        int y = x++ + ++x;



    }
}
