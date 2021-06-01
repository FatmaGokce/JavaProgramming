package Exercises;

import java.util.Scanner;

public class MorningOrNight {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the time :");
        int time = in.nextInt();

        if (time >24){
            System.out.println("Invalid time!");
        }else {
            String dayTime = (time >= 0 && time <= 11) ? "morning" : "Night";
            System.out.println(dayTime);
        }
        //ternary way
        String morningOrNight = time > 0 && time <= 12 ? "Morning" : "Night";
        System.out.println(morningOrNight);
    }
}
