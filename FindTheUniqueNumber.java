import java.util.Arrays;

public class FindTheUniqueNumber {

    public static void main(String[] args) {
        System.out.println(findUnique(new double[]{0, 1, 1}));
    }

    public static double findUnique(double[] arr) {
        Arrays.sort(arr);

        return arr[0] == arr[1] ? arr[arr.length - 1] : arr[0];

    }
}
