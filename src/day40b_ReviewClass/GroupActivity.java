package day40b_ReviewClass;

public class GroupActivity {

    public static String mergeString(String one, String two){
        String merge= "";
        String bigger ="";
        int minLength= 0;

        if(one.length()> two.length()){
            bigger=one;
            minLength=two.length();

        }else{
            bigger=two;
            minLength = one.length();
        }
        for (int i = 0; i < minLength; i++) {
            merge+= one.charAt(i)+""+two.charAt(i);

        }
        merge+= bigger.substring( minLength);
        return merge;
    }

    public static void main(String[] args) {
        System.out.println(mergeString("abc","defgh" ));
    }
}


/**
 public static String mergeStrings(String one, String two) {
 String newStr = "";
 for(int i = 0, num1 =0, num2 = 0; i < one.length()+two.length(); i++){
 if(num1 < one.length()){
 newStr += one.charAt(num1++);
 }
 if(num2 < two.length()){
 newStr += two.charAt(num2++);
 }
 }
 return newStr;
 }
 **/