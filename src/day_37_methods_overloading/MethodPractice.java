package day_37_methods_overloading;

public class MethodPractice {
    public static void main(String[] args) {
        System.out.println(repeatString("java", 4, '~'));
        System.out.println(repeatString("bye", 5, '-'));
    }

    public static String repeatString(String word, int times, char delimeter){
        String result = "";
        for (int i = 0; i < times; i++) {
            result += (word + delimeter);
        }
        return result.substring(0,result.length()-1);
    }
    /*
    take care of last delimeter
    String result = "";
       for (int i = 0; i < times; i++){
            if (i == times){
            result += word;
           }else if {
            result += word + delimeter;
           }
        }
        return result;
     */
}
