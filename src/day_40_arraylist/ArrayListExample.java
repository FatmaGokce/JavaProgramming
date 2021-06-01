package day_40_arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList <Integer> nums = new ArrayList<>();

        nums.add(5);
        nums.add(7);
        nums.add(11);

        System.out.println("nums.size() = " + nums.size());
        //reading from arraylist
        System.out.println("index 0= " + nums.get(0));
        System.out.println("index 1= " + nums.get(1));
        System.out.println("index 2= " + nums.get(2));

        System.out.println(nums);//print all values in same line

        nums.remove(2);//remove element from arraylist >> 11
        System.out.println(nums);


    }
}
