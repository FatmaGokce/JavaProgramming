package day_38_method;
/**
 * import all static methods. so that you can just call by method name, without classname
 */
//import static day_38_method.StringUtils.*;

public class StringUtilTest {
    public static void main(String[] args) {
        String userName = "";
        if (StringUtils.isNullOrEmpty(userName)) {
            System.out.println("FAIL: UserNAme cannot be null or empty");
        }
            System.out.println("isPalindrome(\"civic\") = " + StringUtils.isPalindrome("civic"));
            System.out.println("isPalindrome(kayak) = " + StringUtils.isPalindrome("kayak"));

            //if we do import the class, we don't need to call class name before method name
            System.out.println("isPalindrome(Cybertek) = " + StringUtils.isPalindrome("Cybertek"));

            String word = "sunday";
            String revWord = StringUtils.reverse(word);
        System.out.println("word = " + word);
        System.out.println("revWord = " + revWord);
        //second way
        System.out.println("StringUtils.reverse(\"java\") = " + StringUtils.reverse("java"));
    }
}
