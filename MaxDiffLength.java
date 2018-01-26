public class MaxDiffLength {

    public static void main(String[] args) {
        String[] s1 = new String[]{"hoqq", "bbllkw", "oox", "ejjuyyy", "plmiis", "xxxzgpsssa", "xxwwkktt", "znnnnfqknaz", "qqquuhii", "dvvvwz"};
        String[] s2 = new String[]{"cccooommaaqqoxii", "gggqaffhhh", "tttoowwwmmww"};

        System.out.println(maxDiffLength(s1, s2));
    }

    public static int maxDiffLength(String[] s1, String[] s2) {
            if (s1.length == 0 || s2.length == 0) {
                return -1;
            }

            int maxS1 = 0, minS1 = s1[0].length();
            int maxS2 = 0, minS2 = s2[0].length();

            for (String s : s1) {
                maxS1 = Math.max(maxS1, s.length());
                minS1 = Math.min(minS1, s.length());
            }

            for (String s : s2) {
                maxS2 = Math.max(maxS2, s.length());
                minS2 = Math.min(minS2, s.length());
            }

            return Math.max(Math.abs(maxS1 - minS2), Math.abs(maxS2 - minS1));
    }

}
