package day_39_wrapper_classes;

public class ParseString {
    public static void main(String[] args) {
        //string convert to integer
        String total = "345";
        int count = Integer.parseInt(total);
        System.out.println("count = " + count);

        String strPrice = "32.75";// string >> double
        double price = Double.parseDouble(strPrice);
        if (price > 100){
            System.out.println("expensive");
        }
        String sentence = "I wrote 100 lines of code";
        //split by space, parse index 2 to int
        String[] splitVersion = sentence.split(" ");
        int linesOfCode = Integer.parseInt(splitVersion[2]);
        System.out.println("linesOfCode = " + linesOfCode);

    }
}
