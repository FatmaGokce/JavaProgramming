package day_43_list_custom_classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MethodsWithListReturn {
    /**
     getIntegerList
     no params
     return List<Integer>
        Loop from  0 - 1000_000
        and add to arraylist then return it
     */
    public static List<Integer> getIntegerList(){
        List<Integer> nums = new ArrayList<>();
        for (int i = 0; i <= 1000_000; i++) {
            nums.add(i);
        }
        return nums;
    }
    /**
     getIntegerArray
     no params
     return int[]
     Loop from  0 - 1000_000
     and add to int[] then return it
     */
    public static int[] getIntegerArray(){
        int[] nums = new int[1000001];
        for (int i = 0; i <= 1_000_000; i++) {
            nums[i] = i;
        }
        return nums;
    }

    public static void main(String[] args) {
        //1 second = 1_000_000_000 nano seconds
        long start = System.nanoTime();
        List<Integer> milnums = getIntegerList();
        long end = System.nanoTime();
        //System.out.println(milnums);
        System.out.println("ArrayList Time = " + (end - start));

        long startArray = System.nanoTime();
        int[] milArray = getIntegerArray();
        long endArray = System.nanoTime();
        //System.out.println(Arrays.toString(milArray));

        System.out.println("Array Time = " + (endArray - startArray));
    }
}
