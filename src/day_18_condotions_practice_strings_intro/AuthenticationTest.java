package day_18_condotions_practice_strings_intro;

import java.sql.SQLOutput;

public class AuthenticationTest {
    public static void main(String[] args) {
        int expLast4SSNpinCode = 1234;
        int expPinCode = 4321;

        int last4SSN = 1234;
        int pinCode = 4421;

        if (last4SSN == expLast4SSNpinCode && pinCode == expPinCode) {
            System.out.println("Authentication Successful");
        }else {
            System.out.println("Authentication Unsuccessful");
            if (last4SSN != expLast4SSNpinCode) {
                System.out.println("Last 4 SSN number is incorrect");
            }
            if (expLast4SSNpinCode != pinCode) {
                System.out.println("PinCode is incorrect");
            }
        }
    }
}
