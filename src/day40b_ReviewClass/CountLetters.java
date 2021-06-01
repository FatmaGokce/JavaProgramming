package day40b_ReviewClass;

/**
 [Count Letters]
 Create a method that will accept a String and
 print how many times each characters is found in the String
 Ex:
 Input: "apple tree"
 Output:
 a - 1
 p - 2
 l - 1
 e - 3
 - 1  (space char)
 t - 1
 r - 1
 */
public class CountLetters {
    public static void main(String[] args) {
            countLetters("apple tree");
            //String str = "apple tree";
            //countLetters(str);
    }

    public static void countLetters(String str){
        String checked = "";

        for (int i = 0; i < str.length(); i++) {
            char eachLetter = str.charAt(i);
            int count = 0;

            if (checked.contains(eachLetter+"")){
                continue;
            }

            for (int j = 0; j < str.length(); j++) {
                char eachOtherLetter = str.charAt(j);

                if (eachLetter == eachOtherLetter){
                    count++;
                }
            }

            System.out.println(eachLetter + " - " + count);
            checked += eachLetter + "";
        }
    }
}
/**
 2. yol(many programmers don't like to use continue, you can use that method
 instead of above metdoh)
 if (!checked.contains(eachLetter+"")){

    for (int j = 0; j < str.length(); j++) {
    char eachOtherLetter = str.charAt(j);

        if (eachLetter == eachOtherLetter){
        count++;
        }
    }

    System.out.println(eachLetter + " - " + count);
    checked += eachLetter + "";
 }
 */
