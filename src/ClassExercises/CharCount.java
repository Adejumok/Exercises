package ClassExercises;

public class CharCount {

    public static void main(String[] args) {
        charCount("abcdabcdabca",'d');
    }

    private static void charCount(String word, char theChar){
        int countChar = 0;

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == theChar){
                countChar++;
            }
        }
        System.out.println(theChar+" appeared "+countChar+" times.");
    }
}
