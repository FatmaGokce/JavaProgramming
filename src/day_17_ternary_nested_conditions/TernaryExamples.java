package day_17_ternary_nested_conditions;

public class TernaryExamples {
    public static void main(String[] args) {
        int score = 75;
        String quality = "good";
        
        String result = (score > 60)? "true" : "false";

        int x = (quality.equals("good"))? 100 : 0;

        char grade = (score > 60)? 'A' :'B';

        String evenOdd = (score % 2 == 0)? "even" : "odd";

        System.out.println("result = " + result);
        System.out.println("x = " + x);
        System.out.println("grade = " + grade);
        System.out.println("evenOdd = " + evenOdd);
        System.out.println("");

        //WITH IF/ELSE STATEMENTS

        if(score > 60) {
            result = "true";
        }else {
            result = "false";
        }
        System.out.println("result = " + result);
    }
}
