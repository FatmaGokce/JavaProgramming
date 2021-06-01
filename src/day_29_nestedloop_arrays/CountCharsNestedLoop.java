package day_29_nestedloop_arrays;
/*
String word = "java";

OUTER 0 - LENGTH {
    //char outerChar = word.charAt(OUTER);
    int count = 0;
    INNER 0 TO LENGTH {
        //char innerChar = word.charAt(INNER);

        IF outerChar == innerChar
            count++;

     }
     PRINT outerChar + "=" + count
}
-----------
j=1
a=2
v=1
a=2
 */
public class CountCharsNestedLoop {
    public static void main(String[] args) {
        //0123
        String word = "java";

        for(int outer = 0; outer < word.length(); outer++) {
            System.out.println("outer: " + word.charAt(outer));
            int count = 0; //reset count to 0
            for(int inner = 0; inner < word.length(); inner++) {
                //System.out.println(word.charAt(inner));
                if(word.charAt(outer) == word.charAt(inner)) {
                    count++;
                }
            }
            System.out.println(word.charAt(outer) +"="+count);
        }
    }
}
