public class SwitchString {
    public static void main(String[] args) {

        String fruit = "test";

        switch (fruit) {
            case "Apple":
                System.out.println("Apples are red and green");
                break;
            case "Banana":
                System.out.println("Bananas are yellow");
                break;
            default:
                System.out.println("Unknown fruit");
        }

    }
}
