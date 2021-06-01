package day_42_arrayList;

import java.util.*;

public class CollectionsUtil {
    public static void main(String[] args) {
        List<Character> letters = new ArrayList<>();
        letters.addAll(Arrays.asList('j', 'a', 'v', 'a', 'i', 's', 'f', 'u', 'n'));
        System.out.println("size = " + letters.size());
        System.out.println(letters);

        Collections.reverse(letters);
        System.out.println("reversed = "+letters);

        System.out.println(Collections.frequency(letters, 'a'));

        int vCount = Collections.frequency(letters, 'v');
        System.out.println("v Count = " + vCount);

        System.out.println("Max char = "+ Collections.max(letters));
        System.out.println("Max char = "+ Collections.min(letters));

        Collections.reverse(letters);

        Collections.replaceAll(letters, 'a', 'u');
        Collections.replaceAll(letters, 'i', 'j');
        System.out.println("after replaceAll = " + letters);

        Collections.sort(letters);
        System.out.println("After Sort = " + letters);

        List<Integer> nums = Arrays.asList(23,1,43,5,234,7,-9,0,1,5,5,5,5,5);

        System.out.println("nums = "+ nums);
        Collections.reverse(nums);
        System.out.println("after reverse nums = " + nums);

        int max = Collections.max(nums);
        int min = Collections.min(nums);

        System.out.println("min = " + min);
        System.out.println("max = " + max);

        System.out.println("Frequency of 5 = "+Collections.frequency(nums,5));

        Collections.replaceAll(nums, 5, 50);
        System.out.println("after replaceAll nums = " + nums);

        Collections.sort(nums, Collections.reverseOrder());
        System.out.println("after reverse order sort = " + nums);
    }
}
