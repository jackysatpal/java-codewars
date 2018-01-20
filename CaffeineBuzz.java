public class CaffeineBuzz {

    public static void main(String[] args) {
        System.out.println(caffeineBuzz(1));
        System.out.println(caffeineBuzz(3));
        System.out.println(caffeineBuzz(6));
        System.out.println(caffeineBuzz(12));
    }

    public static String caffeineBuzz(int n) {
        String message = "mocha_missing!";

        if (n != 0) {
            if (n % 3 == 0) {
                message = "Java";
            }
            if (n % 12 == 0) {
                message = "Coffee";
            }
            if (n % 2 == 0) {
                message += "Script";
            }
        }

        return message;

    }
}
