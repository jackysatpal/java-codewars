import java.util.ArrayList;

public class WordSearch {

    public static void main(String[] args) {
        String[] arr = {"lemonade", "limeade", "Yoo-Hoo", "root beer", "grapeade ", "water", "Mr. Pibb"};
        String[] output = new String[arr.length];
        output = findWord("ade", arr);

        for (String element : output) {
            System.out.println(element);
        }
    }

    public static String[] findWord(String str, String[] arr) {
        ArrayList<String> output = new ArrayList<String>();

        for (String individualElement : arr) {
            if (individualElement.toLowerCase().contains(str.toLowerCase())) {
                output.add(individualElement);
            }
        }

        if (output.isEmpty()) {
            return new String[]{"Empty"};
        } else {
            return output.toArray(new String[0]);
        }
    }
}
