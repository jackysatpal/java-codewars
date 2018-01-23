public class NameArrayCapping {

    public static void main(String[] args) {
        String[] strings = {"KARLY", "DANIEL", "KELSEY"};
        strings = capMe(strings);
        for (String s : strings) {
            System.out.println(s);
        }

    }

    public static String[] capMe(String[] strings) {
        if (strings.length == 0) {
            return strings;
        }

        for (int i = 0; i < strings.length; i++) {
            strings[i] = Character.toUpperCase(strings[i].charAt(0)) + strings[i].substring(1).toLowerCase();
        }

        return strings;
    }
}
