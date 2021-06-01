package day_41_arraylist;

import java.util.ArrayList;

public class CitiesList {
    public static void main(String[] args) {
        //declare arraylist
        ArrayList<String> cities = new ArrayList<>();
        //add cities to arraylist -> add methods
        cities.add("Washington DC");//index 0
        cities.add("New York");//1
        cities.add("Vienna");//2
        cities.add("Adana");//3
        cities.add("LA");//4
        //add Ashgabat to first index
        cities.add(0, "Ashgabat");
        //print all values in the same line
        System.out.println(cities);
        //print first and last city
        System.out.println("first city = " + cities.get(0));
        System.out.println("last city = " + cities.get(5));
        //or
        System.out.println("last city = " + cities.get(cities.size()-1));
        //count of items
        System.out.println("count of items = " + cities.size());

        int size = cities.size();
        System.out.println("there are "+ size+"cities in the list");

        //for loop and print all values in same line
        for (int i = 0; i < cities.size(); i++) {
            System.out.print(cities.get(i)+" ");
        }
        System.out.println();
        //foreach loop
        for (String city : cities ){
            System.out.print(city + " ");
        }
        System.out.println();
        //delete item from arraylist
        cities.remove(3);//remove using index
        cities.remove("New York");//remove using object/value

        System.out.println("After remove= " + cities);

        //delete all items
        cities.clear();
        System.out.println("after clear = "+ cities);

        if (cities.isEmpty()){
            System.out.println("List is empty");
        }

    }
}
