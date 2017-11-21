public class FirstNonConsecutive {
    public static void main(String[] args) {
        int[] testArray = {1,2,3,4,6,7};
        System.out.println(testArray.length);
        for(int index = 1; index < testArray.length; index++) {
            if((testArray[index]-testArray[index-1]) > 1) {
                System.out.println(testArray[index] + " is non consecutive number");
                break;
            }
        }
    }
}
