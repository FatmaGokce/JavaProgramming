package Exercises;

import java.util.ArrayList;
import java.util.Scanner;

//import jdk.nashorn.api.tree.ForInLoopTree;

class Main {

    //create your method below
    public static ArrayList<String> removeAll(ArrayList<String> wordList, String targetWord){

        for (int i = 0; i < wordList.size(); i++) {
            if (wordList.get(i).equals(targetWord)) {
                wordList.remove(i);
                i--;
            }
        }
        return wordList;
    }




    // Do not touch below


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        String target = in.next();
        ArrayList<String> list = new ArrayList<>();
        for(int i=0; i < size; i++) {
            list.add(in.next());
        }

        System.out.println(removeAll(list, target));

    }



}