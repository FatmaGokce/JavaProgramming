package day_31_arrays;

import java.util.Arrays;
import java.util.Collections;

public class ArraysUtil {
    public static void main(String[] args) {
        int[] nums = {100, 5, 1, 7, 0, -4, 44, 33};
        System.out.println(Arrays.toString(nums));

        //sort the array
        Arrays.sort(nums);
        //print after sorting
        System.out.println(Arrays.toString(nums));

        //find max value of array
        System.out.println("Min value = " + nums[0]);
        System.out.println("Max value = " + nums[nums.length-1]);

        String[] words = {"Java", "C#", "C++", "Kotlin", "Python", "Ruby", "Assembly"};
        System.out.println(Arrays.toString(words));
        System.out.println(String.join(", ", words));
        //sort words in alphabetic and ASCII order
        Arrays.sort(words);
        System.out.println(Arrays.toString(words));

        //sort words in reverse order
        Arrays.sort(words, Collections.reverseOrder());
        System.out.println(Arrays.toString(words));

    }
}
