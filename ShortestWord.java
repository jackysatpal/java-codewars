public class ShortestWord {

    public static void main(String[] args) {
        System.out.println(findShort("bitcoin take over world maybe knows perhaps"));
    }

    public static int findShort(String s) {
        String[] arr = s.split(" ");
        int min = arr[0].length();

        for (String i : arr) {
            min = Math.min(min, i.length());
        }

        return min;
    }
}
