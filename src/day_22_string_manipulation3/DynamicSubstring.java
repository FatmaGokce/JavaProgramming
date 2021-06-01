package day_22_string_manipulation3;

public class DynamicSubstring {
    public static void main(String[] args) {
        String result = "result count:12345";
        System.out.println(result.substring(13));
        System.out.println(result.substring(13,18));

        //find the index of :
        System.out.println(result.indexOf(":"));//12
        int colonIndex = result.indexOf(":");
        System.out.println(result.substring(colonIndex+1));

        System.out.println(result.substring(result.indexOf(":")+1));

        String today = "i coded [java] today";
        /** find indexOf [
         *  find indexOf ]
         * provide them as start, end index for substring
         * to print java
         */
        int start = today.indexOf("[");
        int end = today.indexOf("]");
        System.out.println(today.substring(start+1,end));

        System.out.println(today.substring(today.indexOf("[")+1,today.indexOf("]")));

    }
}
