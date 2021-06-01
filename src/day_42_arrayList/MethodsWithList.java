package day_42_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MethodsWithList {
    public static void main(String[] args) {
        printStrList(Arrays.asList("java", "c++", "c#")); //short way
        //long way
        List<String> words = new ArrayList<>();
        words.add("java"); words.add("html"); words.add("selenium");
        words.add("a"); words.add("input"); words.add("title");
        printStrList(words);

        List<Integer> nums = Arrays.asList(23,54,23,542,15,487,54,26);
        int sum = sumIntegerList(nums);
        System.out.println(sum);
        System.out.println(sumIntegerList(Arrays.asList(15, 14, 5, 87, 46)));

    }
    public static void printStrList(List<String> strings){
        for (String each : strings){
            System.out.print(each + " ");
        }
        System.out.println();
    }
    public static int sumIntegerList(List<Integer> integerList){
        int sum = 0;
        for (int each : integerList){
            sum += each;
        }
        return sum;
    }
}
