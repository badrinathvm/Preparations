package recent;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Badri on 9/23/17.
 */
public class DuplicateWithinkIndices {

    public boolean duplicate(int arr[],int k){
        Set<Integer> visited = new HashSet<Integer>();
        for(int i=0; i < arr.length; i++){
            if(visited.contains(arr[i])){
                return true;
            }
            if(i >= k){
                visited.remove(arr[i-k]);
            }
            visited.add(arr[i]);
        }
        return false;
    }

    public static void main(String args[]){
        int arr[] = {1,2,3,11,2,5,6};

        DuplicateWithinkIndices dk = new DuplicateWithinkIndices();
        System.out.println(dk.duplicate(arr, 3));

        int arr1 [] = {1, 2, 3, 4, 1, 2, 3, 4};
        DuplicateWithinkIndices dk1 = new DuplicateWithinkIndices();
        System.out.println(dk1.duplicate(arr1, 4));
    }
}
