public class GpsSpeed {

    public static void main(String[] args) {
        double[] arr = {0.0, 0.19, 0.5, 0.75, 1.0, 1.25, 1.5, 1.75, 2.0, 2.25};

        System.out.println(gps(15, arr));
    }

    public static int gps(int s, double[] x) {
        if (x.length <= 1) {
            return 0;
        }

        double max = 0;

        for (int i = 0; i < x.length - 1; i++) {
            max = Math.max(x[i + 1] - x[i], max);
        }

        return (int) Math.floor((max * 3600) / s);
    }
}
