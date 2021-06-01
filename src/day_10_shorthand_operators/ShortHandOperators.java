package day_10_shorthand_operators;

public class ShortHandOperators {
    public static void main(String[] args) {
        int cars = 10;
        System.out.println("cars in parking a lot = " + cars);
        cars += 2;
        System.out.println("cars in parking a lot = " + cars);
        //6 cars left the parking lot
        cars -= 6;
        System.out.println("cars in the parking lot = " + cars);

        int electricCars = 13;
        System.out.println("electricCars in the parking lot = " + electricCars);
        cars += electricCars;
        System.out.println("cars in the parking lot = " + cars);

        String word = "Java";
        System.out.println("word = " + word);

        word += " Programming";// word = word + " Programming";
        System.out.println("word = " + word);
        //add "is fun"
        word += " is fun";
        System.out.println("word = " + word);

        String selenium = " but \"selenium\" is more fun.";
        word += selenium;
        System.out.println("word = " + word);
        word += 12345;//add 12345 to word
        System.out.println("word = " + word);

        char letter = 'A';
        System.out.println("letter = " + letter);
        letter += 3;
        System.out.println("letter = " + letter);//it shows 'D'
        //add 4 to letter
        letter += 4;
        System.out.println("letter = " + letter);

        double parkingFee = 7.50;
        System.out.println("parkingFee = " + parkingFee);
        parkingFee *= 0.5;//early bird fee is 50 off
        System.out.println("Early bird parkingFee = " + parkingFee);

        //weekend parking is free
        parkingFee -= parkingFee;
        System.out.println("Weekend parkingFee = " + parkingFee);
    }
}
