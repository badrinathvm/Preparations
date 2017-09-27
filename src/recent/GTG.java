package recent;

/**
 * Created by Badri on 9/23/17.
 */


//http://www.geeksforgeeks.org/sliding-window-maximum-maximum-of-all-subarrays-of-size-k/


public class GTG {

    public static void main(String[] args) {
        int nums[] = {1,2,3,1,4,5,2,3,6};
        GTG.gtg(nums, 3);
    }

    public static void gtg(int[] nums, int k){
        int max;
        // this is for three times
        for (int i =0 ; i<=nums.length-k; i++){
            max = nums[i];

            //compare elements till k times
            for ( int j = 1; j<k;j++){
                if( nums[i+j] > max){
                    max = nums[i+j];
                }
            }

            System.out.println(max + " ");

        }

    }
}

