public class Accumul {

    public static void main(String[] args) {
        System.out.println(accum("NyffsGeyylB"));
    }

    public static String accum(String s) {
        String result = "";
        char hypen = '-';

        for (int i = 0; i < s.length(); i++) {
            char element = s.charAt(i);

            for (int j = i; j >= 0; j--) {
                if (j == i) {
                    result += Character.toUpperCase(element);
                } else {
                    result += Character.toLowerCase(element);
                }

            }

            if (i != (s.length() - 1)) {
                result += hypen;
            }

        }

        return result;
    }
}
