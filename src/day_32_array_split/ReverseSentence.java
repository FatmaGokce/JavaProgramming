package day_32_array_split;

public class ReverseSentence {
    public static void main(String[] args) {
        String sentence = "today is java array class";
        String[] words = sentence.split(" ");
        //print words array in reverse order
        String reversed = "";

        for (int i = words.length-1; i >= 0; i--){
            //System.out.println(words[i]+ " ");
            reversed += words[i] + " ";
        }
        System.out.println("sentence = " + sentence);
        System.out.println("reversed = " + reversed.trim());
    }
}
