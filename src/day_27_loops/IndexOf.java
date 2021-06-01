package day_27_loops;

public class IndexOf {
    public static void main(String[] args) {
        String word = "github";
        char letter = 'i';
        int index = -1;

        for (int i = 0; i < word.length(); i++) {

            if (word.charAt(i) == letter) {
                index = word.indexOf(letter);//index = n; we can use
                System.out.println(letter + " is found at index " + index);
                break;//exit the for loop
            }
        }
        if(index == -1){
            System.out.println(letter + " is not present ");
        }
    }
}
