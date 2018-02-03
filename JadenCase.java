public class JadenCase {

    public static void main(String[] args) {
        System.out.println(toJadenCase("How can mirrors be real if our eyes aren't real"));
    }

    public static String toJadenCase(String phrase) {
        if (phrase.isEmpty() || phrase == null) {
            return null;
        }

        char[] characterPhrase = phrase.toCharArray();
        characterPhrase[0] = Character.toUpperCase(characterPhrase[0]);

        for(int i = 0; i < characterPhrase.length; i++) {
            if ((characterPhrase[i] == ' ')) {
                characterPhrase[i + 1] = Character.toUpperCase(characterPhrase[i + 1]);
            }
        }

        return new String(characterPhrase);
    }
}
