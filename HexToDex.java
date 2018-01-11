public class HexToDex {

    public int hexToDex(String userInput) {
        return Integer.parseInt(userInput, 16);
    }

    public static void main(String[] args) {
        String testInput = "AB";
        System.out.println(testInput);
    }
}
