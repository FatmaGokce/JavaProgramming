package Exercises;

public class ReplaceCertainCharacters {
    public static void main(String[] args) {
        String sentence = "Java class is fun";
        int num = 3;

        switch(num) {
            case 1:
                System.out.println(sentence.replace('a', 'e'));
                break;
            case 2:
                System.out.println(sentence.replace('s','r'));
                break;
            case 3:
                System.out.println(sentence.replace('o','z'));
                break;
        }
    }
}
