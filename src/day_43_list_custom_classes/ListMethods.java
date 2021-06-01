package day_43_list_custom_classes;

import day_41_arraylist.ArraysAsList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class ListMethods {
    public static List<String> getDays(){
        List<String> days = new ArrayList<>(Arrays.asList
                ("Monday", "Tuesday", "Wednesday", "Thursday",
                        "Friday", "Saturday", "Sunday"));
        return days;
    }
    public static List<Integer> getRandomNumbers(int size){
        List <Integer> nums = new ArrayList<>();
        Random random = new Random();//new random object

        for(int i=1; i <= size; i++){

            nums.add(random.nextInt(101));// generate random number 0-100
                                          // limit number and add to list
        }

        return nums;
    }
    public static void main(String[] args) {
        System.out.println(getDays());
        System.out.println("getDays().size() = " + getDays().size());
        System.out.println("getDays().get(0) = " + getDays().get(0));
        List<String> dayNames = getDays();
        System.out.println("dayNames = " + dayNames);

        dayNames.add("java day");
        //removeIf method - java 8 - > accepts lambda- and easy to remove without loop
        dayNames.removeIf(day -> day.length() == 6);
        System.out.println("day name after removeIf = " + dayNames);

        System.out.println(getRandomNumbers(10));
        List<Integer> nums = getRandomNumbers(100);
        System.out.println("nums.size() = " + nums.size());
        System.out.println("nums = " + nums);
        nums.removeIf(n -> n < 90);//remove nums less than 90
        System.out.println("After removeIf nums = " + nums);
    }
}
