public class Without2 {

    public static void main(String[] args) {
        System.out.println(without2("hi"));
    }

    public static String without2(String str) {

        String beginning = str.substring(0, 2);
        String end = str.substring(str.length() - 2);

        if (beginning.equals(end)) {
            return str.substring(2);
        }

        return str;
    }
}
