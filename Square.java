public class Square {
    public static void main(String[] args) {
        int test = 101;
        boolean result = false;
        if(test == 1) {
            result = true;
        } else if (test > Integer.MAX_VALUE) {
                result = false;
            } else {
                for (int i = 2; i * i <= test; i++) {
                    int perfectSquare = i * i;
                    System.out.println(perfectSquare);
                    System.out.println(test);
                    if (test == perfectSquare ) {
                        result = true;
                        break;
                    }
                }
            }
        if(result) {
            System.out.println("It is a perfect square");
        } else {
            System.out.println("Not a perfect square");
        }
    }
}
