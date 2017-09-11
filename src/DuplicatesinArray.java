/**
 * Created by Badri on 7/21/17.
 */

import java.util.*;

class DuplicatesinArray
{

    void printRepeat(int arr[], int size){

        List<Integer> res = new ArrayList<>();

            for (int i = 0 ;i<size; i++){

                int index =  Math.abs(arr[i])-1;

//                if( arr[index] < 0){
//                   res.add(index+1);
//                }else{
//                    arr[index] = -arr[index];
//                }

                if( arr[index] > 0){
                    arr[index] = -arr[index];
                }else{
                 res.add(index+1);
                }
            }

        System.out.println(res);

    }

    /* Driver program to test the above function */
    public static void main(String[] args)
    {
        DuplicatesinArray duplicate = new DuplicatesinArray();
        //int arr[] = {4, 2, 4, 5, 2, 3, 1};
        int arr[] = {4, 3, 2, 7, 8, 2,3, 1};
        //int arr[] = {1,1,2,3};
        int arr_size = arr.length;
        duplicate.printRepeat(arr, arr_size);
    }
}

// This code has been contributed by Mayank Jaiswal

