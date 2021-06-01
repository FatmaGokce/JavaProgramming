package Exercises;

import java.util.Scanner;

public class HouseOccupantsSwitch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String typeHouse = "Tree House, " +"Mobile Home, "+ "Apartment, "+"Town House, "+"Villa, "+ "Mansion";
        System.out.println(typeHouse);
        System.out.print("Enter the type of house :");
        typeHouse = scan.nextLine();
        int maxOccupants = 0;

        switch (typeHouse){
            case "Tree House":
                maxOccupants = 1;
                break;
            case "Mobile Home":
                maxOccupants = 2;
                break;
            case "Apartment":
                maxOccupants = 4;
                break;
            case "Town House":
                maxOccupants = 6;
                break;
            case "Villa":
                maxOccupants = 8;
                break;
            case "Mansion":
                maxOccupants = 10;
                break;
            default:
                System.out.println("Invalid House Type");
        }
        System.out.println("Max Occupants for a " + typeHouse + " is " + maxOccupants + " occupants");
    }
}
