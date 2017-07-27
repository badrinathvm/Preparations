/**
 * Created by Badri on 7/26/17.
 */

import java.util.*;


public class MinMoves{

    public static void main(String[] args) {
        int num[] = {2,1,3};
        System.out.println(MinMoves.minMoves2(num));

    }

    public static int minMoves2(int[] nums) {
        int result = 0;
        int min = nums[0];

        for (int i = 1; i < nums.length; i++)
        {
            if (nums[i] >= min)
                result += nums[i] - min;
            else
            {
                result += (min - nums[i]) * i;
                min = nums[i];
            }
        }
        return result;
    }
}
