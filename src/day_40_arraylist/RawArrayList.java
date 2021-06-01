package day_40_arraylist;

import java.util.*;

public class RawArrayList {
    public static void main(String[] args) {
        //declare raw ArrayList
        ArrayList list1 = new ArrayList();//1. way
        List list2 = new ArrayList();//polymorhism methos for declare 2.way

        //add values
        list1.add("java");
        list1.add("apples");
        list1.add("coffee");
        list1.add(1234);
        list1.add(15.2);
        list1.add(true);
        list1.add("wooden spoon");

        System.out.println(list1);
    }
}
