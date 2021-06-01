package array_practice_1;

public class ShortestAndLongestStringArray {
    public static void main(String[] args) {
        String[] word = {"python", "java", "C++", " C#", "selenium", "cucumber", "m", "gjhfhgfhgfdgfkl"};
        String shortest = "";
        String longest = "";
        int longestCount = word[0].length();
        int shortestCount = word[0].length();

        for (int i = 0; i < word.length; i++){
            if (word[i].length() > longestCount){
                longest = word[i];
            }
            if (word[i].length() < shortestCount){
                shortest = word[i];
            }
        }
        System.out.println("shortest String = " + shortest);
        System.out.println("longest String = " + longest);
    }
}
