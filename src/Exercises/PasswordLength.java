package Exercises;

import java.util.Scanner;

public class PasswordLength {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String userName = "fatma1";
        String password = "345";
        int lenPassword = password.length();
        if(lenPassword >= 5){
            if(password.contains(userName)){
                System.out.println("Invalid password, username should not be in it");
                password = "password";
                System.out.println("Your default password is " + "\"" +password + "\"");
            }else{
                System.out.println("Valid password");
            }
        }else{
            System.out.println("Password cannot be less than 5 characters");
        }

    }
}

