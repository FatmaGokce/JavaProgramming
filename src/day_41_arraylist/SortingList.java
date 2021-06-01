package day_41_arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingList {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<Integer>();
        nums.add(120);
        nums.add(3); nums.add(1);
        System.out.println("before sort = " + nums);

        Collections.sort(nums);//for ArrayList to sort
        System.out.println("after sort = " + nums);

    }
}
