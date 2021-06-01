package day_26_loops;

public class CountMatches {
    public static void main(String[] args) {
        String word = "apple";
        char letter = 'p';
        int count = 0;

        for (int i = 0; i < word.length(); i++) {
            if (letter == word.charAt(i)) {
                count++;
            }
        }
        System.out.print("There are "+ count +" "+ letter + " in " + word);
    }
}
