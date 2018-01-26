public class SumOfNNumbers {

    public static void main(String[] args) {
        int[] arr = sumOfN(-4);
        for (int i : arr) {
            System.out.println(i);
        }
    }

    public static int[] sumOfN(int n) {
        int[] arr = new int[Math.abs(n) + 1];
        int sum = 0;

        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i - 1] + ((n > 0) ? i : -i);
        }

        return arr;

    }
}
