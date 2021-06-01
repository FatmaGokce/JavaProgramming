package day_08_casting_scanner;
import java.util.Scanner;//ctrl + shift + I

public class ScannerIntro {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);//created new object
        System.out.print("Enter your name: ");
        String name = scan.next();
        System.out.println("Nice to meet you " + name);

    }
}
