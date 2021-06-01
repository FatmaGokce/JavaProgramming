package interview_coding_tasks;

import java.util.Scanner;

public class FrequencyOfCharacters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();
        String result = "";

        for (int i = 0; i < word.length() -2 ; i++){
            if (word.charAt(i)+"" == word.charAt(i+1)+""){
                System.out.println(word.charAt(i)+"");

            }
        }
    }
}
