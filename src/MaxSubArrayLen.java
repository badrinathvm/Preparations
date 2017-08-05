/**
 * Created by Badri on 8/5/17.
 */

import java.util.*;

public class MaxSubArrayLen {

    public static void main(String[] args) {
        //int nums[] = {1,-1,5,-2,3};
        int nums[] = {11,15,6,8,9,10};

        System.out.println(MaxSubArrayLen.maxSubArrayLen(nums,14));
    }


    public static int maxSubArrayLen(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        int max = 0;

        int sum=0;
        for(int i=0; i<nums.length; i++){
            sum += nums[i];

            if(sum==k){
                max = Math.max(max, i+1);
            }

            int diff = sum-k;

            if(map.containsKey(diff)){
                max = Math.max(max, i-map.get(diff));
            }

            if(!map.containsKey(sum)){
                map.put(sum, i);
            }
        }


        return max;
    }
}
