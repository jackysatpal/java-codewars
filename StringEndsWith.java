public class StringEndsWith {

    public static void main(String[] args) {
        System.out.println(solution("abcabc", "bc"));
    }

    public static boolean solution(String str, String ending) {
        if (str.length() >= ending.length()) {
            int index = str.lastIndexOf(ending);

            System.out.println("index: " +index);
            System.out.println("length: " + (str.length() - ending.length()));

            if (index == str.length() - ending.length()) {
                return true;
            }
        }

        return false;

    }
}
