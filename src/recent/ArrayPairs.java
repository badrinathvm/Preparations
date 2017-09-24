package recent;

import java.util.Arrays;

/**
 * Created by Badri on 9/21/17.
 */
public class ArrayPairs {

    public static void main(String[] args) {
        int nums [] = {2, 4, 7, 5, 9, 10, -1};
        printArrayPairs(nums,9);
    }

    abstract static class Test{

    }

    public static int printArrayPairs(int[] nums, int key,int a) {

        return 0;
    }


    public static void printArrayPairs(int[] nums, int key){

        if(nums.length<2){
            return;
        }

        Arrays.sort(nums);

        int left = 0 , right = nums.length-1;

        while(left < right){
            int sum = nums[left] + nums[right];

            if(sum == key){
                System.out.printf("(%d, %d) %n", nums[left], nums[right]);
                left = left + 1;
                right = right - 1;
            }else if ( sum < key){
                left = left + 1;
            }else if (sum > key){
                right = right - 1;
            }
        }

    }
}
