public class mostFrequentItemCount {

    public static int arrayMostElementCount(int[] collection) {
        int most = 0;

        for (int index: collection) {
            int count = 0;

            for (int element: collection) {
                if (index == element) {
                    count++;
                }
            }

            if (count > most) {
                most = count;
            }
        }

        return most;
    }

    public static void main(String[] args) {
        int [] newArray = {3, -1, -1, -1, 2, 3, -1, 3, -1, 2, 4, 9, 3};
        System.out.println(arrayMostElementCount(newArray));
    }
}
