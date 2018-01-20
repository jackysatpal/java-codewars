import java.util.Arrays;

public class BrokenSequence {

    public static void main(String[] args) {
        System.out.println(findMissingSequence("2 1 4 3 a"));
    }

    public static int findMissingSequence(String s) {

        if (s.isEmpty()) {
            return 0;
        }

        String[] numbers = s.split(" ");
        int[] missingNumber = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            if (!(numbers[i].matches("\\d+$"))) {
                return 1;
            }
            missingNumber[i] = Integer.parseInt(numbers[i]);
        }

        Arrays.sort(missingNumber);

        for (int i = 1; i <= missingNumber.length; i++) {
            if (missingNumber[i - 1] != i) {
                return i;
            }
        }

        return 0;
    }
}
