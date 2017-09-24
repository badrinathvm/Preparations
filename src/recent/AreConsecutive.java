package recent;

import java.util.Arrays;

//http://www.geeksforgeeks.org/check-if-array-elements-are-consecutive/

/**
 * Created by Badri on 9/23/17.
 */
public class AreConsecutive {

    public static void main(String[] args) {
        int nums [] ={5,6,4,2,3,1};

        System.out.println(AreConsecutive.areConsecutive(nums));

        System.out.println(AreConsecutive.altAreConsecutive(nums));
    }

    public static boolean areConsecutive(int [] nums){

        boolean success = false;
        Arrays.sort(nums);

        for(int i =0; i<nums.length-1;i++){
            if( (nums[i+1] - nums[i]) == 1 ){
                success = true;
            }
        }

        return success;

    }

    public static boolean altAreConsecutive(int [] nums){

        //get minmum from arrays
        int min = getMin(nums);
        int max = getMax(nums);


        /* max - min + 1 is equal to n,  then only check all elements */
        if( max - min + 1 == nums.length){

            /* Create a temp array to hold visited flag of all elements. */

            boolean visited[] = new boolean[nums.length];

            for ( int i =0;i<nums.length;i++){

                 /* If we see an element again, then return false */
                if(visited[nums[i] - min] != false){
                    return false;
                }

                /* If visited first time, then mark the element as visited */
                visited[nums[i]-min] = true;
            }

            return true;
        }


        return false;

    }

    public static int getMin(int[] nums){
        int min = nums[0];
        for( int i : nums){
            if(i<min){
                min = i;
            }
        }

        return min;
    }

    public static int getMax(int[] nums){
        int max = nums[0];
        for( int i : nums){
            if(i>max){
                max = i;
            }
        }

        return max;
    }


}
