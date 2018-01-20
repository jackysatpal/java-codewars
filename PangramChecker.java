public class PangramChecker {

    public static void main(String[] args) {
        System.out.println(check("The brown fox jumps over the lazy dog"));
    }

    public static boolean check(String sentence) {
        //sentence = sentence.toLowerCase();
        //return sentence.matches("^([a-z]+)$");
        for (char i = 'a'; i <= 'z'; i++) {
            if (!(sentence.toLowerCase().contains("" + i))) {
                return false;
            }
        }
        return true;
    }
}
