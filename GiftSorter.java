import java.util.Arrays;

public class GiftSorter {

    public static void main(String[] args) {
        System.out.println(sortGiftCode("zyxwvutsrqponmlkjihgfedcba"));
    }

    public static String sortGiftCode(String code) {
        char[] arr = code.toCharArray();
        Arrays.sort(arr);
        return new String(arr);
    }
}
