package day_31_arrays;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = {-5, 23, 123, 654, 2344, 12345, 14421};
        System.out.println(Arrays.binarySearch(nums, 23));
        System.out.println(Arrays.binarySearch(nums, 2344));
        System.out.println(Arrays.binarySearch(nums, 85));
        System.out.println(Arrays.binarySearch(nums, 124));
        System.out.println(Arrays.binarySearch(nums, 700));

        //check if number 12345 is among numbers in array
        if (Arrays.binarySearch(nums, 12345) >= 0) {
            System.out.println("12345 is present in array");
        }else {
            System.out.println("12345 is not present");
        }
    }
}
