public class AlternateCase {

    public static void main(String[] args) {
        System.out.println(alternateCase("heLlo WoRld"));
    }

    public static String alternateCase(String s) {
        char[] newS = s.toCharArray();

        for (int i = 0; i < newS.length; i++) {
            if (Character.isUpperCase(newS[i])) {
                newS[i] = Character.toLowerCase(newS[i]);
            } else {
                newS[i] = Character.toUpperCase(newS[i]);
            }
        }

        return new String(newS);
    }
}
