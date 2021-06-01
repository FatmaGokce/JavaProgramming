package array_practice_1;

public class MaxMinNumberFromArray {
    public static void main(String[] args) {
        int[] num = {15, 21, 45, 65, 120, 47, 3, 95};

        int max = num[0];
        int min = num[0];
        for (int i = 0; i < num.length; i++){
            if (num[i] > max) {
                max = num[i];
            }
        }
        System.out.println("max = " + max);

        for (int i = 0; i < num.length; i++){
            if (num[i] < min){
                min = num[i];
            }
        }
        System.out.println("min = " + min);
    }
}
