/**
 * Created by Badri on 8/5/17.
 */
import java.util.*;

public class MissingRanges {

    public static List<String> findMissingRanges(int[] nums, int lower, int upper) {
        List<String> result = new ArrayList<String>();
        int start = lower - 1;
        for (int i = 0; i <= nums.length; i++) {
            int end = (i == nums.length) ? upper + 1 : nums[i];
            if (start + 2 <= end) {
                result.add(getItem(start + 1, end - 1));
            }
            start = end;
        }
        return result;
    }

    private static String getItem(int start, int end) {
        return (start == end) ? String.valueOf(start) : start + "->" + end;
    }


    public static void main(String[] args) {
        int[] nums = new int[]{0, 1, 3, 50, 75};
        List<String> result = findMissingRanges(nums, 0, 99);
        for (String s : result) {
            System.out.println(s);
        }
    }

}

